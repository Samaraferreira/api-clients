package com.orangetalents.api.validation.annotations;

import com.orangetalents.api.validation.validations.UniqueCpfValidator;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = UniqueCpfValidator.class) // qual classe de validação iremos utilizar
@Target({ElementType.FIELD}) // sugere onde esta anotação pode ser usada
@Retention(RetentionPolicy.RUNTIME) // instrui o compilador a reter a anotação durante o tempo de execução
public @interface UniqueCpf {

    String message() default "CPF is already registered in the system";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}