package com.banu.PhoneShowRoom.controller;

import com.banu.PhoneShowRoom.dto.request.SaveMarkaModelRequestDto;
import com.banu.PhoneShowRoom.service.MarkaModelService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.banu.PhoneShowRoom.constants.RestApi.*;

@RestController
@RequestMapping(MARKAMODEL)
@RequiredArgsConstructor
public class MarkaModelController {

 private final MarkaModelService markaModelService;


 @PostMapping(SAVE)
  public ResponseEntity<Void> saveMarkaModel(@RequestBody @Valid SaveMarkaModelRequestDto dto){
  markaModelService.save(dto);
  return ResponseEntity.ok().build();
  }

}
