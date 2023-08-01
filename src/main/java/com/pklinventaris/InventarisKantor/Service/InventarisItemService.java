package com.pklinventaris.InventarisKantor.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pklinventaris.InventarisKantor.Model.InventarisItem;
import com.pklinventaris.InventarisKantor.Repository.InventarisItemRepository;

@Service
public class InventarisItemService {

    private final InventarisItemRepository inventarisItemRepository;

    public InventarisItemService(InventarisItemRepository inventarisItemRepository) {
        this.inventarisItemRepository = inventarisItemRepository;
    }

    public List<InventarisItem> findByNamaBarang(String namaBarang) {
        return inventarisItemRepository.findByName(namaBarang);
    }
}
