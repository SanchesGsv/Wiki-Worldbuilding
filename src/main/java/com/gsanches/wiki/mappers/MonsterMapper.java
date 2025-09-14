package com.gsanches.wiki.mappers;

import com.gsanches.wiki.domain.dtos.MonsterDto;
import com.gsanches.wiki.domain.entities.Monster;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MonsterMapper {

    MonsterDto toDto(Monster monster);
    Monster fromDto(MonsterDto monsterDto);


}
