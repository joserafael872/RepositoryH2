package com.repository.repositoryh2.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer {

	/**
	 * client name.
	 */
	@NotNull
	@NotEmpty
	@JsonProperty("nombre")
	private String nombre;

	/**
	 * client full name.
	 */
	@NotNull
	@NotEmpty
	@JsonProperty("apellidos")
	private String apellidos;

	/**
	 * birthday client.
	 */
	@NotNull
	@NotEmpty
	@JsonProperty("fecha_nacimiento")
	private String fechaNac;

	/**
	 * gender client.
	 */
	@NotNull
	@NotEmpty
	@JsonProperty("sexo")
	private String sexo;

	/**
	 * account number client.
	 */
	@NotNull
	@NotEmpty
	@JsonProperty("numero_cuenta")
	private String numCuenta;

	/**
	 * bank balance client.
	 */
	@NotNull
	@NotEmpty
	@JsonProperty("saldo")
	private String saldo;
	
	/**
	 * type product client.
	 */
	@NotNull
	@NotEmpty
	@JsonProperty("producto")
	private String producto;

}
