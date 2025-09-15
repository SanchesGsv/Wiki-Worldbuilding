package com.gsanches.wiki.domain.entities;

import com.gsanches.wiki.domain.enums.Element;
import com.gsanches.wiki.domain.enums.MonsterType;
import com.gsanches.wiki.domain.enums.MoodType;
import com.gsanches.wiki.domain.enums.Size;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// TODO: see the components here
public class BasicAttributes {

    // TODO: See if all of this information should be here, or change this to the Monster entity

    private UUID id; //Check if this is necessary!

    private Integer level;

    //Defensive
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

    private MoodType moodType; //Aggressive
    private MonsterType type; //normal, boss Change here and

    private List<Skill> skills = new ArrayList<>();


    //Others
    private Float movementSpeed;
    private Integer weightCapacity;



    //Basic attributes
    //maybe here put the basic attribute like strength, agility, ...!
    private Integer basicStrength;
    private Integer basicAgility;
    private Integer basicIntelligence;

    private Integer basicDexterity;
    private Integer basicLucky;



}
