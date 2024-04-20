package com.Validation_facade_Business.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Validate_facade_Business.Service.ValidationFacade;

@RestController
public class SampleController {

    private final ValidationFacade validationFacade;

    public SampleController(ValidationFacade validationFacade) {
        this.validationFacade = validationFacade;
    }

    @PostMapping("/api/sample")
    public ResponseEntity<String> validateSample(@RequestBody SampleRequest request) {
        validationFacade.validateRequest(request);
        return ResponseEntity.ok("Request is valid!");
    }
}
