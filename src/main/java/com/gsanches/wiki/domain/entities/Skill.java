package com.gsanches.wiki.domain.entities;

import com.gsanches.wiki.domain.enums.SkillType;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
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
//    private sprite

    private Integer lvl;

    private Integer spConsume;

    private SkillType type;

    private List<Monster> ownedBy;


    private List<String> formulas;
    //eg: magicalAttack = (magicAttack * 10) + (skillLvl * 2)
    //See how should be others things (such as the thing that doesn't is on the formula, for example dex, physicalAttack)

    //time while making the skill
    private Float makeSkillDelay;

    //time after the skill had been done
    private Float localDelay;
    private Float globalDelay;



}
