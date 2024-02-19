package com.gk.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gk.entities.Banque;

@Repository
public interface BanqueRepository extends CrudRepository<Banque, Integer>{

}
