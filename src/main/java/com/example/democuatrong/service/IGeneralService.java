package com.example.democuatrong.service;

import com.example.democuatrong.model.Province;

import java.util.Optional;

public interface IGeneralService<T> {
    public Iterable<T> findAll();

    public Optional<T> findById(Long id);

    public void save(T t);

    public void remove(Long id);
}
