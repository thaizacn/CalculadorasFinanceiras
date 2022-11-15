package com.projeto.sonhe.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CalculadoraProdutosRequest {
	
	private Double valorGastoComProducao;
	private Integer quantidadeProduzida;
	private Double gastoComLocomocao;
	private Double gastoComFrete;
	private Integer lucroDesejado;

}
