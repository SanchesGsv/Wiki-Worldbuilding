package com.gsanches.wiki.domain.entities;


import com.gsanches.wiki.domain.enums.*;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

public class Monster {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    //image / 3D
    //sounds

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
    //spawn related (location of the maps, the qnt, time spawn)
    private Completion completion;

    private HashMap<UUID, Float> dropIdAndChances = new HashMap<>(); //Use the UUID of the item
    //Use the UUID of the item for doesn't have same keys (because of the HashSet!)


    //Basic attributes
    //maybe here put the basic attribute like strength, agility, ...!
    private Integer basicStrength;
    private Integer basicAgility;
    private Integer basicIntelligence;

    private Integer basicDexterity;
    private Integer basicLucky;



}
