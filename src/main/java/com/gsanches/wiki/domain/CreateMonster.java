package com.gsanches.wiki.domain;

import com.gsanches.wiki.domain.entities.Skill;
import com.gsanches.wiki.domain.enums.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateMonster {

    private String name;

    private Integer level;

    private Integer healthPoints;
    private Integer spiritualPoints;

    private Integer defense;
    private Integer magicDefense;

    private Integer dodge;

    private Element element;

    //Offensive
    private Integer physicalAttack;
    private Integer magicalAttack;

    private Integer attackSpeed;

    private Integer precision;
    private Integer critical;

    private Element attackElement;

    private Size size;

    private MoodType moodType;
    private MonsterType type;

    private List<Skill> skills = new ArrayList<>();

    //Others
    private Float movementSpeed;
    private Completion completion;

    private HashMap<UUID, Float> dropIdAndChances = new HashMap<>();


    //Basic attributes
    private Integer basicStrength;
    private Integer basicAgility;
    private Integer basicIntelligence;

    private Integer basicDexterity;
    private Integer basicLucky;
}
