package com.gsanches.wiki.mappers;

import com.gsanches.wiki.domain.dtos.SkillDto;
import com.gsanches.wiki.domain.entities.Skill;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SkillMapper {

    SkillDto toDto(Skill skill);
    Skill fromDto(SkillDto skillDto);
}
