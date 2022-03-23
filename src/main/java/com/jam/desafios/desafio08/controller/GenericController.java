package com.jam.desafios.desafio08.controller;

import com.jam.desafios.desafio08.dto.GenericDto;
import com.jam.desafios.desafio08.entity.GenericEntity;
import com.jam.desafios.desafio08.service.GenericService;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class GenericController <T extends GenericEntity, DTO extends GenericDto<T>, ID> {

    private final GenericService<T, DTO, ID> service;

    protected GenericController(GenericService<T, DTO, ID> service) {
        this.service = service;
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<T> getAll() {

        return service.getAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public T getById(@PathVariable ID id) {

        return service.getById(id);
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public T create(@RequestBody DTO createDto) {

        return service.create(createDto);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public T update(@PathVariable ID id, @RequestBody DTO updateDto) {

        return service.update(id, updateDto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public void delete(@PathVariable ID id) {

        service.delete(id);
    }
}
