package com.orangetalents.api.validation.validators;

import com.orangetalents.api.repositories.ClientRepository;
import com.orangetalents.api.validation.annotations.UniqueEmail;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class UniqueEmailValidator implements ConstraintValidator<UniqueEmail, String> {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        return !clientRepository.findByEmail(email).isPresent();
    }
}
