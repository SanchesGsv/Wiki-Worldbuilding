package com.gsanches.wiki.domain.entities;

import com.gsanches.wiki.domain.SkillType;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
//    private  sprite

    private Integer lvl;

    private Integer spConsume;

    private SkillType type;


    // Cooldown
    //...




}
