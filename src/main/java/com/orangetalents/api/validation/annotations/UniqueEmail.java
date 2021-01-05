package com.orangetalents.api.validation.annotations;

import com.orangetalents.api.validation.validations.UniqueEmailValidator;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = UniqueEmailValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueEmail {

    String message() default "E-mail is already registered in the system";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}