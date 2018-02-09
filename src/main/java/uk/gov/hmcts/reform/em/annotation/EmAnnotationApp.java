package uk.gov.hmcts.reform.em.annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableCircuitBreaker
@EnableHystrixDashboard
@SuppressWarnings("HideUtilityClassConstructor") // Spring needs a constructor, its not a utility class
public class EmAnnotationApp {

    public static void main(String[] args) {
        SpringApplication.run(EmAnnotationApp.class, args);
    }
}
