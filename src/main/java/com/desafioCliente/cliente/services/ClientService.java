package com.desafioCliente.cliente.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.desafioCliente.cliente.dto.ClientDTO;
import com.desafioCliente.cliente.entities.Client;
import com.desafioCliente.cliente.repositories.ClientRepository;

@Service
public class ClientService {
	
	
	
	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {	
		Client client= repository.findById(id).get();	
		return new ClientDTO(client);
		
	}
	
	@Transactional(readOnly = true)
	public Page<ClientDTO>findAll(Pageable pageable) {
		Page<Client> result = repository.findAll(pageable);
		return result.map(x -> new ClientDTO(x));
	}
	
	@Transactional
	public ClientDTO insert(ClientDTO dto) {
		Client entity =new Client();
		entity.setName(dto.getName());
		entity.setCpf(dto.getCpf());
		entity.setIncome(dto.getIncome());
		entity.setBirthDate(dto.getBirthDate());
		entity.setChildren(dto.getChildren());
		return new ClientDTO(entity);
		
	}
}
