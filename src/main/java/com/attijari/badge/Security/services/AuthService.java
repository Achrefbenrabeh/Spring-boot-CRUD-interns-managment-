package com.attijari.badge.Security.services;
import com.attijari.badge.Security.dto.SignupRequest;
import com.attijari.badge.Security.entities.Customer;

public interface AuthService {
    Customer createCustomer(SignupRequest signupRequest);
}
