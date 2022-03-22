package com.jam.desafios.desafio08.repository;

import com.jam.desafios.desafio08.entity.GenericEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface GenericRepository <T extends GenericEntity, ID> extends JpaRepository<T, ID> {

    List<T> findAllByState(boolean state);

    Optional<T> findByIdAndState(ID id, boolean state);
}
