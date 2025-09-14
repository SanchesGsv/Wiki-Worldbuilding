package com.gsanches.wiki.mappers;

import com.gsanches.wiki.domain.dtos.ItemDto;
import com.gsanches.wiki.domain.entities.Item;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ItemMapper {

    Item fromDto(ItemDto itemDto);
    ItemDto toDto(Item item);
}
