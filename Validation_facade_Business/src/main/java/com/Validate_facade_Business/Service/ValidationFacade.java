package com.Validate_facade_Business.Service;
import org.springframework.stereotype.Service;

import com.Validation_facade_Business.Exceptions.ValidationException;

import org.springframework.stereotype.Service;

@Service
public class ValidationFacade {

    public void validateRequest(Object request) throws ValidationException {
        
        if (request == null) {
            throw new ValidationException("Request cannot be null.");
        }
        else {
        	System.out.println("Request is passed successfully");
        }
        try {
            String name = (String) request.getClass().getMethod("getName").invoke(request);
            if (name == null || name.trim().isEmpty()) {
                throw new ValidationException("Name must not be blank.");
            }
        } catch (Exception e) {
            throw new ValidationException("Error validating request.", e);
        }
    }
}
