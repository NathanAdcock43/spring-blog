package com.codeup.marco.adlister.daos;

import com.codeup.adlister.models.Ad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AdsRepository extends JpaRepository<Ad, Long> {
    @Query("from Ad as a where a.title like %:term% or a.description like %:term%")
    List<Ad> searchByTitle(@Param("term") String term);
}
