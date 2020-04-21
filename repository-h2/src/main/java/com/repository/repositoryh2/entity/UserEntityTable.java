package com.repository.repositoryh2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "userEntity")
@Table(name = "UserEntityTable")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })

@Getter
@Setter
/**
 * Entity class where User info will be stored.
 */
public class UserEntityTable {
	
	public UserEntityTable() {
		
	}

	/**
	 * Identifier of each client.
	 */
	@Id
	@SequenceGenerator(name = "user_entity_id_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_entity_id_seq")
	@JsonProperty("clientId")
	private Long clientId;

	/**
	 * client name.
	 */
	@Column
	@NotNull
	@NotEmpty
	@JsonProperty("nombre")
	private String nombre;

	/**
	 * client full name.
	 */
	@Column
	@NotNull
	@NotEmpty
	@JsonProperty("apellidos")
	private String apellidos;

	/**
	 * birthday client.
	 */
	@Column
	@NotNull
	@NotEmpty
	@JsonProperty("fecha_nacimiento")
	private String fechaNac;

	/**
	 * gender client.
	 */
	@Column
	@NotNull
	@NotEmpty
	@JsonProperty("sexo")
	private String sexo;

	/**
	 * account number client.
	 */
	@Column
	@NotNull
	@NotEmpty
	@JsonProperty("numero_cuenta")
	private String numCuenta;

	/**
	 * bank balance client.
	 */
	@Column
	@NotNull
	@NotEmpty
	@JsonProperty("saldo")
	private String saldo;
	
	/**
	 * type product client.
	 */
	@Column
	@NotNull
	@NotEmpty
	@JsonProperty("producto")
	private String producto;

}
