package com.jam.desafios.desafio08.service;

import com.jam.desafios.desafio08.dto.GenericDto;
import com.jam.desafios.desafio08.entity.GenericEntity;
import com.jam.desafios.desafio08.repository.GenericRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;

public class GenericService <T extends GenericEntity, DTO extends GenericDto<T>, ID> {

    private final GenericRepository<T, ID> repository;

    protected GenericService(GenericRepository<T, ID> repository){
        this.repository = repository;
    }

    public T create(DTO createDto) {

        T entity = createDto.toEntity();

        return repository.save(entity);
    }

    public List<T> getAll() {

        return repository.findAllByState(true);
    }

    public T getById(ID id){

        return repository.findByIdAndState(id, true).orElseThrow(() -> new EntityNotFoundException());
    }

    public T update(ID id, DTO updateDto) {

        T entity = getById(id);

        entity.updateByDto(updateDto);

        return repository.save(entity);
    }

    public void delete(ID id) {

        T entity = getById(id);

        entity.setState(false);

        repository.save(entity);
    }
}
