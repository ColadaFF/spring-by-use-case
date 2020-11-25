package com.example.demo.utils;

public interface UseCase<INPUT extends ApplicationRequest, OUTPUT extends ApplicationResponse> {
    OUTPUT process(INPUT input);
}
