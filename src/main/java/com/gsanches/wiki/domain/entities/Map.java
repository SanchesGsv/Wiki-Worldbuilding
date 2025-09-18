package com.gsanches.wiki.domain.entities;

import com.gsanches.wiki.domain.enums.MapType;
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

public class Map {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    private MapType type;

    //Location
    private Integer locationX;
    private Integer locationY;

    //...

}
