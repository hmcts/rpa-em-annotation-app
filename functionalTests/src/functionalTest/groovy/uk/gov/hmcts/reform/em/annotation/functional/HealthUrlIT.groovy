package uk.gov.hmcts.reform.em.annotation.functional

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.test.context.junit4.SpringRunner

import static org.hamcrest.Matchers.equalTo

@RunWith(SpringRunner.class)
class HealthUrlIT extends BaseIT {

    @Test
    void "Check health"() {
        annotationProvider.givenAnnotationApiRequest()
            .expect()
            .body('status', equalTo('UP'))
            .body('diskSpace.status', equalTo('UP'))
            .body('db.status', equalTo('UP'))
            .when()
            .get('/health')
    }

}
