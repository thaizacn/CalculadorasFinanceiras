package com.projeto.sonhe.service.impl;

import org.springframework.stereotype.Service;

import com.projeto.sonhe.dto.CalculadoraMetodosRequest;
import com.projeto.sonhe.dto.CalculadoraMetodosResponse;
import com.projeto.sonhe.dto.CalculadoraProdutosRequest;
import com.projeto.sonhe.dto.CalculadoraProdutosResponse;
import com.projeto.sonhe.service.CalculadoraService;

@Service
public class CalculadoraServiceImpl implements CalculadoraService{
	

	@Override
	public CalculadoraMetodosResponse calculadoraMetodos(CalculadoraMetodosRequest calculadoraMetodosRequest) {
		CalculadoraMetodosResponse calculadoraMetodosResponse = new CalculadoraMetodosResponse();
		Double valorBase = calculadoraMetodosRequest.getValorBase();
		
		calculadoraMetodosResponse.setEssencial(valorBase * 50 / 100);
		calculadoraMetodosResponse.setPoupanca(valorBase * 30 / 100);
		calculadoraMetodosResponse.setDesejos(valorBase * 20 / 100);
		
		return calculadoraMetodosResponse;
	}

	@Override
	public CalculadoraProdutosResponse calculadoraProdutos(CalculadoraProdutosRequest calculadoraProdutosRequest) {
		CalculadoraProdutosResponse calculadoraProdutosResponse = new CalculadoraProdutosResponse();
		if(!(calculadoraProdutosRequest.getGastoComLocomocao() == null)){
			calculadoraProdutosRequest.setValorGastoComProducao(
					calculadoraProdutosRequest.getValorGastoComProducao() 
					+ calculadoraProdutosRequest.getGastoComLocomocao());
		}
		if(!(calculadoraProdutosRequest.getGastoComFrete() == null)){
			calculadoraProdutosRequest.setValorGastoComProducao(
					calculadoraProdutosRequest.getValorGastoComProducao() 
					+ calculadoraProdutosRequest.getGastoComFrete());
		}

		//UNITÁRIO
		Double unitarioCusto = calculadoraProdutosRequest.getValorGastoComProducao() / calculadoraProdutosRequest.getQuantidadeProduzida();
		Double valorComLucroUnitario = unitarioCusto * calculadoraProdutosRequest.getLucroDesejado() / 100;
		Double valorUnitario = valorComLucroUnitario + unitarioCusto;

		//TOTAL
		Double valorComLucroTotal = calculadoraProdutosRequest.getValorGastoComProducao() * calculadoraProdutosRequest.getLucroDesejado() / 100;
		Double valorTotal = valorComLucroTotal + calculadoraProdutosRequest.getValorGastoComProducao();

		if(calculadoraProdutosRequest.getLucroDesejado() >= 1
				&& calculadoraProdutosRequest.getLucroDesejado() <= 20){
			//UNITÁRIO
			calculadoraProdutosResponse.setPrecoUnitarioMinimo(valorUnitario);
			calculadoraProdutosResponse.setPrecoUnitarioMedio((unitarioCusto * 30 / 100) + unitarioCusto);
			calculadoraProdutosResponse.setPrecoUnitarioMaximo((unitarioCusto * 60 / 100) + unitarioCusto);
			
			//TOTAL
			calculadoraProdutosResponse.setPrecoTotalMinimo(valorTotal);
			calculadoraProdutosResponse.setPrecoTotalMedio((calculadoraProdutosRequest.getValorGastoComProducao() * 30 / 100) 
					+ calculadoraProdutosRequest.getValorGastoComProducao());
			calculadoraProdutosResponse.setPrecoTotalMaximo((calculadoraProdutosRequest.getValorGastoComProducao() * 60 / 100) 
			+ calculadoraProdutosRequest.getValorGastoComProducao());
			return calculadoraProdutosResponse;
		} 

		if(calculadoraProdutosRequest.getLucroDesejado() > 20 
				&& calculadoraProdutosRequest.getLucroDesejado() <= 40){
			//UNITÁRIO
			calculadoraProdutosResponse.setPrecoUnitarioMinimo((unitarioCusto * 15 / 100) + unitarioCusto);
			calculadoraProdutosResponse.setPrecoUnitarioMedio(valorUnitario);
			calculadoraProdutosResponse.setPrecoUnitarioMaximo((unitarioCusto * 60 / 100) + unitarioCusto);
			
			//TOTAL
			calculadoraProdutosResponse.setPrecoTotalMinimo((calculadoraProdutosRequest.getValorGastoComProducao() * 15 / 100) 
			+ calculadoraProdutosRequest.getValorGastoComProducao());
			calculadoraProdutosResponse.setPrecoTotalMedio(valorTotal);
			calculadoraProdutosResponse.setPrecoTotalMaximo((calculadoraProdutosRequest.getValorGastoComProducao() * 60 / 100) 
					+ calculadoraProdutosRequest.getValorGastoComProducao());
			return calculadoraProdutosResponse;
		}

		if(calculadoraProdutosRequest.getLucroDesejado() > 40 
				&& calculadoraProdutosRequest.getLucroDesejado() <= 80){
			//UNITÁRIO
			calculadoraProdutosResponse.setPrecoUnitarioMinimo((unitarioCusto * 15 / 100) + unitarioCusto);
			calculadoraProdutosResponse.setPrecoUnitarioMedio((unitarioCusto * 30 / 100) + unitarioCusto);
			calculadoraProdutosResponse.setPrecoUnitarioMaximo(valorUnitario);
			
			//TOTAL
			calculadoraProdutosResponse.setPrecoTotalMinimo((calculadoraProdutosRequest.getValorGastoComProducao() * 15 / 100) 
			+ calculadoraProdutosRequest.getValorGastoComProducao());
			calculadoraProdutosResponse.setPrecoTotalMedio((calculadoraProdutosRequest.getValorGastoComProducao() * 30 / 100) 
					+ calculadoraProdutosRequest.getValorGastoComProducao());
			calculadoraProdutosResponse.setPrecoTotalMaximo(valorTotal);
			return calculadoraProdutosResponse;
		} 
		
		//exception
		return calculadoraProdutosResponse;
	}
	

}
