package ThreadLocal_多线程专属的变量;

public class ContentProcess {
    public void process(String content) {
        PerformanceTracker.startPhase();
        long ms = content.chars().reduce(Integer::sum).orElse(0);
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        PerformanceTracker.endPhase("ProcessContent");
    }
}
