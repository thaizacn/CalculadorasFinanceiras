package com.projeto.sonhe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.sonhe.dto.CalculadoraMetodosRequest;
import com.projeto.sonhe.dto.CalculadoraMetodosResponse;
import com.projeto.sonhe.dto.CalculadoraProdutosRequest;
import com.projeto.sonhe.dto.CalculadoraProdutosResponse;
import com.projeto.sonhe.service.CalculadoraService;

@RestController
@RequestMapping(value= "calculadora")
public class CalculatoraController {
	
	@Autowired
	CalculadoraService calculadoraService;
	
	CalculadoraMetodosRequest calculadoraMetodosRequest = new CalculadoraMetodosRequest();	
	
	CalculadoraProdutosRequest calculadoraProdutosRequest = new CalculadoraProdutosRequest();
	
	@GetMapping("/metodos")
	public CalculadoraMetodosResponse calculaMetodos(@RequestParam Double valorBase) {
		calculadoraMetodosRequest.setValorBase(valorBase);
	    return calculadoraService.calculadoraMetodos(calculadoraMetodosRequest);
	  }
	
	@GetMapping("/produtos")
	public CalculadoraProdutosResponse calculaProdutos(@RequestParam Double valorGastoComProducao, Integer quantidadeProduzida,
			Double gastoComLocomocao, Double gastoComFrete, Integer lucroDesejado) {
		calculadoraProdutosRequest.setValorGastoComProducao(valorGastoComProducao);
		calculadoraProdutosRequest.setQuantidadeProduzida(quantidadeProduzida);
		calculadoraProdutosRequest.setGastoComLocomocao(gastoComLocomocao);
		calculadoraProdutosRequest.setGastoComFrete(gastoComFrete);
		calculadoraProdutosRequest.setLucroDesejado(lucroDesejado);
	    return calculadoraService.calculadoraProdutos(calculadoraProdutosRequest);
	  }

}
