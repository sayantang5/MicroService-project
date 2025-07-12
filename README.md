@Configuration
@EnableAsync
public class AsyncConfig {

    @Value("${payment.async.threadCount:5}")
    private int threadCount;

    @Bean(name = "paymentExecutor")
    public Executor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(threadCount);
        executor.setMaxPoolSize(threadCount);
        executor.setQueueCapacity(100);
        executor.setThreadNamePrefix("PaymentExecutor-");
        executor.initialize();
        return executor;
    }
}
