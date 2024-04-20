package com.Validation_facade_Business.Controller;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.Objects;

public class SampleRequest {

    @NotBlank(message = "Username must not be empty.")
    @Size(min = 3, max = 15, message = "Username must be between 3 and 15 characters long.")
    private String username;

    public SampleRequest() {
    }

    public SampleRequest(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SampleRequest that = (SampleRequest) o;
        return Objects.equals(username, that.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }

    @Override
    public String toString() {
        return "SampleRequest{" +
                "username='" + username + '\'' +
                '}';
    }
}
