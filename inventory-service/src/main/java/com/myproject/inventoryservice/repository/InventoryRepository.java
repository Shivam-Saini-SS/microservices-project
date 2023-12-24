package com.myproject.inventoryservice.repository;

import com.myproject.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InventoryRepository extends JpaRepository<Inventory,Long> {
    List<Inventory> findBySkuCodeIn(List<String> skuCode);
}
