package com.pklinventaris.InventarisKantor.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pklinventaris.InventarisKantor.Model.InventarisItem;

@Repository
public interface InventarisItemRepository extends JpaRepository<InventarisItem, Integer> {

    List<InventarisItem> findByName(String name);
}
