package com.gsanches.wiki.domain.entities;


import com.gsanches.wiki.domain.Element;
import com.gsanches.wiki.domain.MonsterType;
import com.gsanches.wiki.domain.Size;
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
public class Monster {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    //image

    private MonsterType type;

    //location and also the number of location on each map

    //drops and the chance

    private Integer lvl;

    private Element element;
    private Size size;

    private Integer hp;

    private Double movementSpeed;

    //basic attributes


}
