package com.repository.repositoryh2.models;

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
public class CustomerAccounst {

	/**
	 * account number client.
	 */
	@JsonProperty("numero_cuenta")
	private String numCuenta;

	/**
	 * bank balance client.
	 */
	@JsonProperty("saldo")
	private String saldo;
	
	/**
	 * type product client.
	 */
	@JsonProperty("producto")
	private String producto;
}
