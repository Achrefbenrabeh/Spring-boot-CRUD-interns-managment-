package com.attijari.badge.models;


import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.jpa.repository.JpaRepository;


@RepositoryRestResource

public interface PersonneRepository extends JpaRepository<Personne, Long> { }