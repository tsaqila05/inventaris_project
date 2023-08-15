package com.pklinventaris.InventarisKantor.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pklinventaris.InventarisKantor.Model.InventarisItem;
import com.pklinventaris.InventarisKantor.Service.InventarisItemService;

@RestController
@RequestMapping("/api/inventaris")
public class InventarisItemController {

    private final InventarisItemService inventarisItemService;

    @Autowired
    public InventarisItemController(InventarisItemService inventarisItemService) {
        this.inventarisItemService = inventarisItemService;
    }

    @GetMapping("/nama/{namaBarang}")
    public ResponseEntity<List<InventarisItem>> findItemsByNamaBarang(@PathVariable String nama_barang) {
        List<InventarisItem> items = inventarisItemService.findByNamaBarang(nama_barang);
        return new ResponseEntity<>(items, HttpStatus.OK);
    }
    @PostMapping("/tambah")
    public ResponseEntity<InventarisItem> tambahItem(@RequestBody InventarisItem item) {
        InventarisItem newItem = inventarisItemService.tambahItem(item);
        return new ResponseEntity<>(newItem, HttpStatus.CREATED);
    }
}
