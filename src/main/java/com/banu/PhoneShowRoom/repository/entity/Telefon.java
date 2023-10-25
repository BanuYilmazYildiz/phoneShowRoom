package com.banu.PhoneShowRoom.repository.entity;

import com.banu.PhoneShowRoom.utility.enums.State;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tbl_telefon")
public class Telefon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ekranBoyutu;

    private Double fiyat;

    private int adet;

    private State state;

    private Long markaModelId;
}
