package com.gsanches.wiki.controllers;

import com.gsanches.wiki.domain.CreateMonster;
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
    public ResponseEntity<MonsterDto> createMonster(@RequestBody CreateMonster monsterDto) {
        //Remember to adjust the MonsterService, and there make throw there
        //Also remember of making the validations! (add here, and on the DTOs

        Monster newMonster = monsterService.createMonster(monsterDto);
        MonsterDto newMonsterDto = monsterMapper.toMonsterDto(newMonster);

        return ResponseEntity.ok(newMonsterDto);

    }

    @GetMapping
    public ResponseEntity<List<MonsterDto>> getAllMonsters(){
        List<Monster> monsters = monsterService.getAllMonsters();
        List<MonsterDto> monstersDto = monsters
                .stream()
                .map(monsterMapper::toMonsterDto)
                .toList();

        return ResponseEntity.ok(monstersDto);
    }


    @GetMapping(path = "/{id}")
    public ResponseEntity<MonsterDto> getOneMonster(
            @PathVariable("id") UUID id){
        Monster monster = monsterService.getMonsterById(id);
        MonsterDto monsterDto = monsterMapper.toMonsterDto(monster);

        return ResponseEntity.ok(monsterDto);
    }

//    Ambiguous name! (this and the getOneMonster!)
//    @GetMapping(path = "/{name}")
//    public ResponseEntity<List<MonsterDto>> findMonstersByName(@PathVariable("name") String name){
//        List<Monster> monsters = monsterService.getMonstersByName(name);
//        List<MonsterDto> monstersDtos = monsters
//                .stream()
//                .map(monsterMapper::toDto)
//                .toList();
//
//        return ResponseEntity.ok(monstersDtos);
//    }



    @PutMapping(path = "/{id}")
    public ResponseEntity<MonsterDto> updateMonster(
        @PathVariable("id") UUID id,
        @RequestBody MonsterDto monsterDto
        ){

        Monster monster = monsterService.updateMonster(id, monsterDto);
        MonsterDto newMonsterDto = monsterMapper.toMonsterDto(monster);

        return ResponseEntity.ok(newMonsterDto);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deleteMonster(
            @PathVariable("id") UUID id){

        monsterService.deleteMonster(id);

        return ResponseEntity.noContent().build();
    }


}
