package com.gsanches.wiki.domain.dtos;

import com.gsanches.wiki.domain.enums.Element;
import com.gsanches.wiki.domain.enums.MonsterType;
import com.gsanches.wiki.domain.enums.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MonsterDto {
    private UUID id;

    private String name;
    private MonsterType type;
    private Integer lvl;

    private Element element;
    private Size size;
    private Integer hp;
    private Double movementSpeed;

}
