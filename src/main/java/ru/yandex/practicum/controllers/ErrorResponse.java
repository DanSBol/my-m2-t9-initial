package ru.yandex.practicum.controllers;

import lombok.Data;

@Data
public class ErrorResponse {
    private final String error;
    private final String description;
}