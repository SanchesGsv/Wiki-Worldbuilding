package com.gsanches.wiki.repositories;

import com.gsanches.wiki.domain.entities.Monster;
import com.gsanches.wiki.domain.enums.Element;
import com.gsanches.wiki.domain.enums.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface MonsterRepository extends JpaRepository<Monster, UUID> {
    List<Monster> findAllByName(String name);
//    List<Monster> findAllBySize(Size size);
//    List<Monster> findAllByElement(Element element);

}
