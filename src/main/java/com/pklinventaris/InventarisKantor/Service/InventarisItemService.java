package com.pklinventaris.InventarisKantor.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pklinventaris.InventarisKantor.Model.InventarisItem;
import com.pklinventaris.InventarisKantor.Repository.InventarisItemRepository;

@Service
public class InventarisItemService {

    private final InventarisItemRepository inventarisItemRepository;

    @Autowired
    public InventarisItemService(InventarisItemRepository inventarisItemRepository) {
        this.inventarisItemRepository = inventarisItemRepository;
    }

    public List<InventarisItem> findByNamaBarang(String nama_barang) {
        return inventarisItemRepository.findByName(nama_barang);
    }
    public InventarisItem tambahItem(InventarisItem item) {
        if (item.getNama_barang() == null || item.getNama_barang().isEmpty()) {
            throw new IllegalArgumentException("Nama barang tidak boleh kosong");
        }
        if (item.getJumlah() <= 0) {
            throw new IllegalArgumentException("Jumlah item tidak valid");
        }
        if (item.getLokasi() == null || item.getLokasi().isEmpty()) {
            throw new IllegalArgumentException("Lokasi tidak boleh kosong");
        }
        return inventarisItemRepository.save(item);
    }
}
