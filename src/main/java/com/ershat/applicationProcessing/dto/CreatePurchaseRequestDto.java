package com.ershat.applicationProcessing.dto;

import lombok.Data;
import java.math.BigDecimal ;


@Data
public class CreatePurchaseRequestDto {
    private String title;
    private BigDecimal amount;
}