package com.jam.desafios.desafio08.repository;

import com.jam.desafios.desafio08.enums.Status;
import com.jam.desafios.desafio08.entity.GenericEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface GenericRepository <T extends GenericEntity, ID> extends JpaRepository<T, ID> {

    List<T> findAllByStatus(Status status);

    Optional<T> findByIdAndStatus(ID id, Status status);
}
