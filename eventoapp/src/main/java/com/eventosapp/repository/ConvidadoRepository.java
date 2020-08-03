package com.eventosapp.repository;

import com.eventoapp.models.Convidado;

import org.springframework.data.repository.CrudRepository;

public interface ConvidadoRepository extends CrudRepository<Convidado, String>{
    
}