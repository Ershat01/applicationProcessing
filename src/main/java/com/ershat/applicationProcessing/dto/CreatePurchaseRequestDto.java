package com.ershat.applicationProcessing.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.math.BigDecimal;
import lombok.Data;


@Data
public class CreatePurchaseRequestDto {
    @NotBlank(message = "Название не может быть пустым")
    private String title;
    
    @NotNull(message = "Сумма обязательна")
    @Positive(message = "Сумма должна быть положительной")
    private BigDecimal amount;
}