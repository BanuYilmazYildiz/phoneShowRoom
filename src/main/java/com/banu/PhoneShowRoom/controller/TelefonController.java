package com.banu.PhoneShowRoom.controller;

import com.banu.PhoneShowRoom.dto.request.SaveMarkaModelRequestDto;
import com.banu.PhoneShowRoom.dto.request.SaveTelefonRequestDto;
import com.banu.PhoneShowRoom.dto.response.FindAllTelefonResponseDto;
import com.banu.PhoneShowRoom.service.TelefonService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.banu.PhoneShowRoom.constants.RestApi.*;

@RestController
@RequestMapping(TELEFON)
@RequiredArgsConstructor
public class TelefonController {

    private final TelefonService telefonService;


    @PostMapping(SAVE)
    public ResponseEntity<Void> saveTelefon(@RequestBody @Valid SaveTelefonRequestDto dto){
        telefonService.save(dto);
        return ResponseEntity.ok().build();
    }

    @GetMapping(FINDALL)
    public ResponseEntity<List<FindAllTelefonResponseDto>> findAllPhones(){
        return ResponseEntity.ok(telefonService.findAllPhones());
    }
}
