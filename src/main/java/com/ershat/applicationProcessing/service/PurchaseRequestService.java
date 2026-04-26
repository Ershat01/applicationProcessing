package com.ershat.applicationProcessing.service;

import com.ershat.applicationProcessing.dto.CreatePurchaseRequestDto;
import com.ershat.applicationProcessing.entity.PurchaseRequest;
import com.ershat.applicationProcessing.repository.PurchaseRequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.ershat.applicationProcessing.dto.UpdateStatusDto;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PurchaseRequestService {

    private final PurchaseRequestRepository repository;

    public List<PurchaseRequest> getAll() {
        return repository.findAll();
    }

    public PurchaseRequest create(CreatePurchaseRequestDto dto) {
        PurchaseRequest request = new PurchaseRequest();
        request.setTitle(dto.getTitle());
        request.setAmount(dto.getAmount());
        return repository.save(request);
    }

    public  PurchaseRequest updateStatus(Long id, UpdateStatusDto dto) {
        PurchaseRequest request = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Заявка не найдена " + id));
        request.setStatus(dto.status);
        return repository.save(request);
    }
}