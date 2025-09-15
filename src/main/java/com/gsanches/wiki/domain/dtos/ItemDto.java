package com.gsanches.wiki.domain.dtos;

import com.gsanches.wiki.domain.entities.Monster;
import com.gsanches.wiki.domain.enums.ItemType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ItemDto {
    private UUID id;

    private String name;
    private String description;

    private ItemType type;

    private Integer sellPrice;
    private Integer buyPrice;


}
