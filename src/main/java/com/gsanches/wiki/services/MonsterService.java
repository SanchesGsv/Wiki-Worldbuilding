package com.gsanches.wiki.services;

import com.gsanches.wiki.domain.CreateMonster;
import com.gsanches.wiki.domain.dtos.MonsterDto;
import com.gsanches.wiki.domain.entities.Monster;
import com.gsanches.wiki.domain.enums.Element;

import java.util.List;
import java.util.UUID;

public interface MonsterService {

    Monster createMonster(CreateMonster monsterDto);

    List<Monster> getAllMonsters();
    Monster getMonsterById(UUID id);

    List<Monster> getMonstersByName(String name);
//    List<Monster> getMonsterByElement(Element element);

    Monster updateMonster(UUID id, MonsterDto monsterDto);

    void deleteMonster(UUID id);




}
