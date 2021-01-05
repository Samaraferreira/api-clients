package com.orangetalents.api.validation.validations;

import com.orangetalents.api.repositories.ClientRepository;
import com.orangetalents.api.validation.annotations.UniqueCpf;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class UniqueCpfValidator implements ConstraintValidator<UniqueCpf, String> {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public boolean isValid(String cpf, ConstraintValidatorContext constraintValidatorContext) {
        return !clientRepository.findByCpf(cpf).isPresent();
    }
}
