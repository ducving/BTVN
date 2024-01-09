package com.example.democuatrong.service.impl;

import com.example.democuatrong.model.Province;
import com.example.democuatrong.service.IProvinceService;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import java.util.Optional;
@Service
public class ProvinceService implements IProvinceService {
    private SessionFactory sessionFactory;
    private EntityManager entityManager;


    @Override
    public Iterable<Province> findAll() {
        return null;
    }

    @Override
    public Optional<Province> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(Province province) {

    }

    @Override
    public void remove(Long id) {

    }
}