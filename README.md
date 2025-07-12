List<List<ZellePaymentMQ>> batches = splitIntoBatches(convertZellePaymentRequest, 10);
        List<CompletableFuture<List<PaymentResponse>>> futures = new ArrayList<>();

        for (List<ZellePaymentMQ> batch : batches) {
            CompletableFuture<List<PaymentResponse>> future =
                asyncBatchProcessor.processBatchAsync(batch, routeServiceInfo, batchID, new ArrayList<>(validationFailedPaymentStatus));
            futures.add(future);
        }

        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).join();

        List<PaymentResponse> allResponses = futures.stream()
            .flatMap(f -> f.join().stream())
            .collect(Collectors.toList());

        // You can aggregate `allResponses` or process them further here
        allResponses.forEach(response -> {
            LOGGER.info("Async batch response: {}", response);
        });

        validationFailedPaymentStatus.clear();
