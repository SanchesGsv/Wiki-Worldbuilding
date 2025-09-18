package com.gsanches.wiki.domain.dtos;

import com.gsanches.wiki.domain.enums.SkillType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SkillDto {
    private UUID id;

    private String name;
    private Integer lvl;

    private Integer spConsume;
    private SkillType type;

}
