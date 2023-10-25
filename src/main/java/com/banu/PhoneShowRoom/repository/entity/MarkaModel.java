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
@Table(name = "tbl_markaModel")
public class MarkaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String markaAdi;
    private String modelAdi;
    private State state;
}
