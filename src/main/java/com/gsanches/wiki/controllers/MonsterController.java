package com.gsanches.wiki.controllers;

import com.gsanches.wiki.domain.dtos.MonsterDto;
import com.gsanches.wiki.domain.entities.Monster;
import com.gsanches.wiki.services.MonsterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/monster")
@RequiredArgsConstructor
public class MonsterController {

    private final MonsterService monsterService;

    public ResponseEntity<Monster> createMonster(@RequestBody MonsterDto monsterDto) {
        //Remember to adjust the MonsterService, and there make throw there
        //Also remember of making the validations! (add here, and on the DTOs

        Monster newMonster = monsterService.createMonster(monsterDto);

        return ResponseEntity.ok(newMonster);

    }




}
