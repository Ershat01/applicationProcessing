package com.ershat.applicationProcessing.repository;

import com.ershat.applicationProcessing.entity.PurchaseRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRequestRepository extends JpaRepository<PurchaseRequest, Long> {
}