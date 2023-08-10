package com.desafioCliente.cliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafioCliente.cliente.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
