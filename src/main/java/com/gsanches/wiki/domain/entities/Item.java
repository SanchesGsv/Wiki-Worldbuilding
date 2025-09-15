package com.gsanches.wiki.domain.entities;

import com.gsanches.wiki.domain.enums.ItemType;
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
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;
    private String description;

    private ItemType type;

    private Integer sellPrice;
    private Integer buyPrice;

//    private List<Monster> monsters

}
