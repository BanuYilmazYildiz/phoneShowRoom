package com.banu.PhoneShowRoom.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

public class FindAllTelefonResponseDto {

    private String ekranBoyutu;


    private Double fiyat;


    private int adet;


    private Long markaModelId;

}
