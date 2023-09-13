package com.github.mrspock182;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Constraint(
        validatedBy = {CnpjValidator.class}
)
@Target({
        ElementType.METHOD,
        ElementType.FIELD,
        ElementType.ANNOTATION_TYPE,
        ElementType.CONSTRUCTOR,
        ElementType.PARAMETER,
        ElementType.TYPE_USE
})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repeatable(Cnpj.List.class)
public @interface Cnpj {
    String message() default "CNPJ inválido";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    @Target({
            ElementType.METHOD,
            ElementType.FIELD,
            ElementType.ANNOTATION_TYPE,
            ElementType.CONSTRUCTOR,
            ElementType.PARAMETER,
            ElementType.TYPE_USE})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @interface List {
        Cnpj[] value();
    }
}
