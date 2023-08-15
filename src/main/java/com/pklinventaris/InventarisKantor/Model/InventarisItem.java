package com.pklinventaris.InventarisKantor.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class InventarisItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nama_barang;
    private int jumlah;
    private String lokasi;
    
    public InventarisItem(String nama_barang, int jumlah, String lokasi){
        this.nama_barang = nama_barang;
        this.jumlah = jumlah;
        this.lokasi = lokasi;
    }
}
