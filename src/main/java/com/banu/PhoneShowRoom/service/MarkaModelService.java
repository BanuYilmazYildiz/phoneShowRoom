package com.banu.PhoneShowRoom.service;

import com.banu.PhoneShowRoom.dto.request.SaveMarkaModelRequestDto;
import com.banu.PhoneShowRoom.mapper.MarkaModelMapper;
import com.banu.PhoneShowRoom.repository.MarkaModelRepository;
import com.banu.PhoneShowRoom.repository.entity.MarkaModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MarkaModelService {

    private final MarkaModelRepository repository;


    public void save(SaveMarkaModelRequestDto dto) {
        MarkaModel markaModel = MarkaModelMapper.INSTANCE.markaModelFromDto(dto);
        repository.save(markaModel);
    }
}
