package com.Validation_facade_Busness;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import javax.xml.bind.ValidationException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.Validation_facade_Busness.Controller.SampleRequest;
import com.Validation_facade_Busness.Exceptions.ValidationFacade;

@SpringBootTest
class ValidationFacadeBusnessApplicationTests {

	private final ValidationFacade validationFacade = new ValidationFacade();

	@Test
	public void testValidRequest() {

		SampleRequest request = new SampleRequest("username");

		assertDoesNotThrow(() -> validationFacade.validateRequest(request));
	}

	@Test
	public void testBlankUsername() {

		SampleRequest request = new SampleRequest("");

		Assertions.assertThrows(ValidationException.class, () -> validationFacade.validateRequest(request));
	}

	private void assertThrows(Class<ValidationException> class1, Object object) {

	}

	@Test
	public void testShortUsername() {

		SampleRequest request = new SampleRequest("ab");

		Assertions.assertThrows(ValidationException.class, () -> validationFacade.validateRequest(request));
	}

	@Test
	public void testLongUsername() {

		SampleRequest request = new SampleRequest("verylongusername");

		Assertions.assertThrows(ValidationException.class, () -> validationFacade.validateRequest(request));
	}

	@Test
	public void testInvalidEmail() {

		SampleRequest request = new SampleRequest("username");

		Assertions.assertThrows(ValidationException.class, () -> validationFacade.validateRequest(request));
	}
}
