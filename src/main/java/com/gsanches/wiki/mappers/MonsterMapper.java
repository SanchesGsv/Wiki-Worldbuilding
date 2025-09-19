package com.gsanches.wiki.mappers;

import com.gsanches.wiki.domain.CreateMonster;
import com.gsanches.wiki.domain.dtos.MonsterDto;
import com.gsanches.wiki.domain.entities.Monster;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MonsterMapper {

    MonsterDto toMonsterDto(Monster monster);
    Monster fromMonsterDto(MonsterDto monsterDto);

    // TODO:
    //Add the CreateMonster toDto and fromDto, for use with the controller!!!
    //And also change on Mapper on the Controller

//    CreateMonster toDto(CreateMonster createMonster);
//    fromCreateMonster




}
