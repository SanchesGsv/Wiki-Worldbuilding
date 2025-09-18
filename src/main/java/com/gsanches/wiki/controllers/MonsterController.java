package com.gsanches.wiki.controllers;

import com.gsanches.wiki.domain.dtos.MonsterDto;
import com.gsanches.wiki.domain.entities.Monster;
import com.gsanches.wiki.mappers.MonsterMapper;
import com.gsanches.wiki.services.MonsterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/api/v1/monster")
@RequiredArgsConstructor
public class MonsterController {

    private final MonsterService monsterService;
    private final MonsterMapper monsterMapper;

    @PostMapping
    public ResponseEntity<MonsterDto> createMonster(@RequestBody MonsterDto monsterDto) {
        //Remember to adjust the MonsterService, and there make throw there
        //Also remember of making the validations! (add here, and on the DTOs

        Monster newMonster = monsterService.createMonster(monsterDto);
        MonsterDto newMonsterDto = monsterMapper.toDto(newMonster);

        return ResponseEntity.ok(newMonsterDto);

    }

    @GetMapping
    public ResponseEntity<List<MonsterDto>> getAllMonsters(){
        List<Monster> monsters = monsterService.getAllMonsters();
        List<MonsterDto> monstersDtos = monsters
                .stream()
                .map(monsterMapper::toDto)
                .toList();

        return ResponseEntity.ok(monstersDtos);
    }


    @GetMapping(path = "/{id}")
    public ResponseEntity<MonsterDto> getOneMonster(
            @PathVariable("id") UUID id){
        Monster monster = monsterService.getMonsterById(id);
        MonsterDto monsterDto = monsterMapper.toDto(monster);

        return ResponseEntity.ok(monsterDto);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<MonsterDto> updateMonster(
        @PathVariable("id") UUID id,
        @RequestBody MonsterDto monsterDto
        ){

        Monster monster = monsterService.updateMonster(id, monsterDto);
        MonsterDto newMonsterDto = monsterMapper.toDto(monster);

        return ResponseEntity.ok(newMonsterDto);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deleteMonster(
            @PathVariable("id") UUID id){

        monsterService.deleteMonster(id);

        return ResponseEntity.noContent().build();
    }


}
