package com.banu.PhoneShowRoom.mapper;

import com.banu.PhoneShowRoom.dto.request.SaveMarkaModelRequestDto;
import com.banu.PhoneShowRoom.repository.entity.MarkaModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MarkaModelMapper {

    MarkaModelMapper INSTANCE = Mappers.getMapper(MarkaModelMapper.class);

    MarkaModel markaModelFromDto(final SaveMarkaModelRequestDto dto);

}
