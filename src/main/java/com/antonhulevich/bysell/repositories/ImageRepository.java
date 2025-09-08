package com.antonhulevich.bysell.repositories;

import com.antonhulevich.bysell.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image,Long> {
}
