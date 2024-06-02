package org.example.schroniskozwierzat;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class DictionaryValidator implements ConstraintValidator<ValidateAnimalType, String> {
    @Override
    public boolean isValid(String employeeType, ConstraintValidatorContext constraintValidatorContext) {
        List<String> animalTypes = Arrays.asList("Pies,Kot");
        return animalTypes.contains(employeeType);
    }
}