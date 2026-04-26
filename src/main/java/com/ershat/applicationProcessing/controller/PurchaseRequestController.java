package com.ershat.applicationProcessing.controller;

import com.ershat.applicationProcessing.entity.PurchaseRequest;
import com.ershat.applicationProcessing.repository.PurchaseRequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/requests")
@RequiredArgsConstructor
public class PurchaseRequestController {

    private final PurchaseRequestRepository repository;

    @GetMapping
    public List<PurchaseRequest> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public PurchaseRequest create(@RequestBody PurchaseRequest request) {
        return repository.save(request);
    }
}