package com.banu.PhoneShowRoom.dto.request;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

public class SaveTelefonRequestDto {

    @NotNull
    @NotBlank
    private String ekranBoyutu;

    @NotNull
    private Double fiyat;

    @NotNull
    private int adet;

    @NotNull
    private Long markaModelId;

}
