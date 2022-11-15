package com.projeto.sonhe.service;

import com.projeto.sonhe.dto.CalculadoraMetodosRequest;
import com.projeto.sonhe.dto.CalculadoraMetodosResponse;
import com.projeto.sonhe.dto.CalculadoraProdutosRequest;
import com.projeto.sonhe.dto.CalculadoraProdutosResponse;

public interface CalculadoraService{
	
	CalculadoraMetodosResponse calculadoraMetodos (CalculadoraMetodosRequest calculadoraMetodosRequest);
	CalculadoraProdutosResponse calculadoraProdutos (CalculadoraProdutosRequest calculadoraProdutosRequest);
}
