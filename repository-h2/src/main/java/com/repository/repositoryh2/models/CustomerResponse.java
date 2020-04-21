package com.repository.repositoryh2.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerResponse {

	/**
	 * client name.
	 */
	@JsonProperty("nombre")
	private String nombre;

	/**
	 * client full name.
	 */
	@JsonProperty("apellidos")
	private String apellidos;

	/**
	 * birthday client.
	 */
	@JsonProperty("fecha_nacimiento")
	private String fechaNac;

	/**
	 * gender client.
	 */
	@JsonProperty("sexo")
	private String sexo;
	
	/**
	 * customer accounts.
	 */
	private List<CustomerAccounst> cuentas;
	
}
