package com.banu.PhoneShowRoom.mapper;

import com.banu.PhoneShowRoom.dto.request.SaveTelefonRequestDto;
import com.banu.PhoneShowRoom.dto.response.FindAllTelefonResponseDto;
import com.banu.PhoneShowRoom.repository.entity.Telefon;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface TelefonMapper {
    TelefonMapper INSTANCE = Mappers.getMapper(TelefonMapper.class);

    Telefon telefonFromDto(final SaveTelefonRequestDto dto);

    List<FindAllTelefonResponseDto> dtoListFromTelefon(final List<Telefon> telefonList);
}
