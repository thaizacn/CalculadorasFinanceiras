package com.projeto.sonhe.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CalculadoraProdutosResponse {
	
	private Double precoTotalMinimo;
	private Double precoTotalMedio;
	private Double precoTotalMaximo;
	private Double precoUnitarioMinimo;
	private Double precoUnitarioMedio;
	private Double precoUnitarioMaximo;
	
}
