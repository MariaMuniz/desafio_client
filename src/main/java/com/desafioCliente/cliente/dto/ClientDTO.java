package com.desafioCliente.cliente.dto;

import java.time.LocalDate;

import com.desafioCliente.cliente.entities.Client;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class ClientDTO {
	private Long id;
	 @Size(min= 3, max =80, message= "Nome deve ter entre 3 e 80 caracteres" )

	@NotBlank(message= "Campo requerido")
	private String name;
	
	 @NotBlank(message= "Campo requerido")
	 @Size(min= 11, message = "cpf deve ter 11 números")
	private String cpf;
	 @Positive(message= "preço deve ser positivo")
	private Double income;
	 @Past(message= "a data deve estar no passado")
	private LocalDate birthDate;
	 @NotNull
	// @NotBlank(message= "Campo requerido")
	private Integer children;
	
	
	
	public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
		
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.income = income;
		this.birthDate = birthDate;
		this.children = children;
	}
	
	public ClientDTO(Client entity){
		id = entity.getId();
		name= entity.getName();
		cpf= entity.getCpf();
		income= entity.getIncome();
		birthDate= entity.getBirthDate();
		children= entity.getChildren();
		
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}


	public Double getIncome() {
		return income;
	}


	public LocalDate getBirthDate() {
		return birthDate;
	}

	public Integer getChildren() {
		return children;
	}

}
	
	

