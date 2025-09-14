package com.gsanches.wiki.mappers;

import com.gsanches.wiki.domain.dtos.MapDto;
import com.gsanches.wiki.domain.entities.Map;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MapMapper {

    MapDto toDto(Map map);
    Map fromDto(MapDto mapDto);
}
