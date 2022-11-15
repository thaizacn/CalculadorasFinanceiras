# 🚀 Projeto Sonhe

## ✨ Começando
Projeto Sonhe é a desburocratização do acesso a serviços de saúde financeira para trabalhadores informais, cujo objetivo é apoiar micro empreendimentos para que, junto conosco, prosperem cada vez mais. 

## ⚙️ Sobre a API 
Desenvolvemos dois endpoints pra lá de importantes para compor nossa jornada, são eles:

| Método | Descrição 
|---|---
| `GET` | Retorna a partir do valor digitado o cálculo para o método 50-30-20 
| `GET` | Retorna a partir do valor gasto com a produção de um produto o valor mínimo, médio e máximo para revenda (unitário e total) 

## 💾 Clonando o repositório

```git clone https://github.com/thaizacn/ProjetoSonhe-API.git```

Testando localmente:

```http://localhost:8080/swagger-ui/index.html#/calculatora-controller/```

## 🤔 Mas, como componho a chamada em mundo aberto?

# GET /calculadora/metodos/

Este método realiza o calculo do método 50-30-20, onde, a partir de um valor separa o que você deve destinar para gastos fixo, o quanto deve reservar para emergencias e quanto sobrará para você;

![image](https://user-images.githubusercontent.com/77704621/200193474-99484ffb-6edb-41dd-b9ca-be678c300ae3.png)

 E você obterá como retorno: 
 
![image](https://user-images.githubusercontent.com/77704621/200193598-030b1ddf-bc36-4ea3-9c17-4678038d25a0.png)

# GET /calculadora/produtos/

Este método realiza a precificação de um produto a partir do calculo do valor que foi gasto para produção, englobando locomoção e frete, porcentagem desejada de lucro  e a quantidade de produto produzida;

![image](https://user-images.githubusercontent.com/77704621/200193771-ad00a636-87ae-45ee-ade9-9d56a1352a13.png)

E você obterá como retorno: 

![image](https://user-images.githubusercontent.com/77704621/200193847-02107285-837b-43d7-a6c0-7b22b62eea89.png)


## 🛠️ Construído com

* [Maven](https://maven.apache.org/) - Gerente de Dependência
* [Java](https://www.java.com/pt-BR/) - Linguagem utilizada
* [SpringBoot](https://spring.io) - Framework 

## 🎁 Agradecimentos

Esse projeto foi desenvolvido visando integrar com o mobile por meio da linguagem Flutter, durante o Hackathon The Code Force, 2º edição.
Foi um prazer enorme poder participar desse desafio, somando conhecimentos, quebrando a cabeça e contribuindo para um futuro de inclusão e educação digna para todos, por meio de um Banco que pensa contínuamente em seus colaboradores e clientes. 

Essa API poderá ser consumida por qualquer um que, assim como nós, tenha o desejo genuíno por mudar o mundo. Nós conseguimos. Juntos.


---
⌨️ com ❤️ por equipe GirlChange
