package com.jam.desafios.desafio08.controller;

import com.jam.desafios.desafio08.dto.GenericDto;
import com.jam.desafios.desafio08.entity.GenericEntity;
import com.jam.desafios.desafio08.service.GenericService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class GenericController <T extends GenericEntity, DTO extends GenericDto<T>, ID> {

    private final GenericService<T, DTO, ID> service;

    protected GenericController(GenericService<T, DTO, ID> service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public T getById(@PathVariable ID id) {

        return service.getById(id);
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<T> getAll() {

        return service.getAll();
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public T create(@RequestBody DTO createDto) {

        return service.create(createDto);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public T update(@PathVariable ID id, @RequestBody DTO updateDto) {

        return service.update(id, updateDto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable ID id) {

        service.delete(id);
    }
}
