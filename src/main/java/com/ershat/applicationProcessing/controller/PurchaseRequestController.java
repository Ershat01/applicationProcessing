package com.ershat.applicationProcessing.controller;

import com.ershat.applicationProcessing.dto.CreatePurchaseRequestDto;
import com.ershat.applicationProcessing.entity.PurchaseRequest;
import com.ershat.applicationProcessing.service.PurchaseRequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/requests")
@RequiredArgsConstructor
public class PurchaseRequestController {

    private final PurchaseRequestService service;

    @GetMapping
    public List<PurchaseRequest> getAll() {
        return service.getAll();
    }

    @PostMapping
    public PurchaseRequest create(@RequestBody CreatePurchaseRequestDto dto) {
        return service.create(dto);
    }
}