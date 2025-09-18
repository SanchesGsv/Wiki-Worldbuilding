package com.gsanches.wiki.domain.dtos;

import com.gsanches.wiki.domain.entities.Monster;
import com.gsanches.wiki.domain.enums.ItemType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ItemDto {
    private UUID id;

    @NotBlank(message = "Name must be present")
    private String name;

    @NotBlank(message = "Description must be present")
    private String description;

    private ItemType type;

    @NotNull(message = "Sell price must be present")
    private Integer sellPrice;
    private Integer buyPrice;

    private HashMap<Monster, Float> droppedByAndChance = new HashMap<>();
}
