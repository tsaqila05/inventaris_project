package com.pklinventaris.InventarisKantor.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "inventaris_item")
@Getter
@Setter


public class InventarisItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nama_barang;
    private int jumlah;
    private String lokasi;
    
}
