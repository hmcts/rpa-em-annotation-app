package uk.gov.hmcts.reform.em.annotation.domain;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void testToString() {
        Point point = Point.builder()
            .pointX((long) 10)
            .pointY((long) 21)
            .build();
        Assert.assertEquals("[10,21]",point.toString());

    }
}
