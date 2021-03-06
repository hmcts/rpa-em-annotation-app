package uk.gov.hmcts.reform.em.annotation.config.healthcheck;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.health.DiskSpaceHealthIndicator;
import org.springframework.boot.actuate.health.DiskSpaceHealthIndicatorProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class HealthCheckConfiguration {

    @Bean
    DiskSpaceHealthIndicator diskSpaceHealthIndicator(@Value("${health.disk.threshold}") long threshold) {
        DiskSpaceHealthIndicatorProperties diskSpaceHealthIndicatorProperties =
                new DiskSpaceHealthIndicatorProperties();
        diskSpaceHealthIndicatorProperties.setThreshold(threshold);
        return new DiskSpaceHealthIndicator(diskSpaceHealthIndicatorProperties);
    }

}
