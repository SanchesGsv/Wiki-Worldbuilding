package com.gsanches.wiki.services.impl;

import com.gsanches.wiki.domain.dtos.MonsterDto;
import com.gsanches.wiki.domain.entities.Monster;
import com.gsanches.wiki.repositories.MonsterRepository;
import com.gsanches.wiki.services.MonsterService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;


@Service
@RequiredArgsConstructor
public class MonsterServiceImpl implements MonsterService {

    private final MonsterRepository monsterRepository;

    @Override
    public Monster createMonster(MonsterDto monsterDto) {
        //Remember of throw an exception if this fail!

        Monster newMonster = new Monster();
        BeanUtils.copyProperties(monsterDto, newMonster); //Use the builder instead, and remember to make a throw if something went wrong!

        return monsterRepository.save(newMonster);
    }

    @Override
    public List<Monster> getAllMonsters() {
        return monsterRepository.findAll();
    }

    @Override
    public Monster getMonsterById(UUID id) {
        return monsterRepository.findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }

    @Override
    @Transactional
    public Monster updateMonster(UUID id, MonsterDto monsterDto) {
        Monster monster = getMonsterById(id);

        BeanUtils.copyProperties(monsterDto, monster);

        return monster;
    }

    @Override
    public void deleteMonster(UUID id) {
        monsterRepository.deleteById(id);

    }


}
