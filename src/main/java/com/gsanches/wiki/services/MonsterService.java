package com.gsanches.wiki.services;

import com.gsanches.wiki.domain.dtos.MonsterDto;
import com.gsanches.wiki.domain.entities.Monster;

public interface MonsterService {

    Monster createMonster(MonsterDto monsterDto);

    //Monster getMonsterByName(String name);
}
