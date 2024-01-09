package com.example.democuatrong.repository;

import com.example.democuatrong.model.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinceRepository extends JpaRepository<Province,Long> {
    List<Province> findAllByNameContaining(String name);
}
