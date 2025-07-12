@Service
public class AsyncBatchProcessor {

    @Autowired
    private WorkflowContextService workflowContextService;

    @Async("paymentExecutor")
    public CompletableFuture<List<PaymentResponse>> processBatchAsync(
        List<ZellePaymentMQ> batch,
        RouteServiceInfo routeServiceInfo,
        String batchId,
        List<PaymentStatus> validationFailedPaymentStatus
    ) {
        routeServiceInfo.setZellePaymentMQ(batch);
        PaymentResponse response = workflowContextService.ZelleprocessPayment(routeServiceInfo, batchId, new PaymentResponse());

        if (Objects.nonNull(response.getPaymentResponse())) {
            response.getPaymentResponse().getPaymentStatus().addAll(validationFailedPaymentStatus);
        }

        return CompletableFuture.completedFuture(Collections.singletonList(response));
    }
}
