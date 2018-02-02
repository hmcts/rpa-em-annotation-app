package uk.gov.hmcts.reform.em.annotation.commandobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * Created by pawel on 16/06/2017.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnnotationFilterCommand {

    @NotNull
    private String name;

    @NotNull
    private String value;

}