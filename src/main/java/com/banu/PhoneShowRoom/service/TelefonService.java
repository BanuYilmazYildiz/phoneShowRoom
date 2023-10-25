package com.banu.PhoneShowRoom.service;

import com.banu.PhoneShowRoom.dto.request.SaveTelefonRequestDto;
import com.banu.PhoneShowRoom.dto.response.FindAllTelefonResponseDto;
import com.banu.PhoneShowRoom.mapper.TelefonMapper;
import com.banu.PhoneShowRoom.repository.TelefonRepository;
import com.banu.PhoneShowRoom.repository.entity.Telefon;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TelefonService {

    private final TelefonRepository repository;

    public void save(SaveTelefonRequestDto dto) {
        Telefon telefon = TelefonMapper.INSTANCE.telefonFromDto(dto);
        repository.save(telefon);
    }

    public List<FindAllTelefonResponseDto> findAllPhones() {
       List<Telefon> telefonList =repository.findAll();
       List<FindAllTelefonResponseDto> dto = TelefonMapper.INSTANCE.dtoListFromTelefon(telefonList);
       return dto;
    }
}
