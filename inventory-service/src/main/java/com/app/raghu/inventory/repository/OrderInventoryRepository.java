package com.app.raghu.inventory.repository;

import com.app.raghu.inventory.entity.OrderInventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderInventoryRepository extends JpaRepository<OrderInventory, Integer> {
}
