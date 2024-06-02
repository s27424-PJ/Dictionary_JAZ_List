package org.example.schroniskozwierzat;

import jakarta.validation.Constraint;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import jakarta.validation.Payload;

import java.util.Arrays;
import java.util.List;
import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = DictionaryValidator.class)
public @interface ValidateAnimalType {

    public String message() default "Invalid animaleType: It should be either Pies";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}