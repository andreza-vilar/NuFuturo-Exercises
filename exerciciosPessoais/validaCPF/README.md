# Validador de CPF em Clojure

## Descrição

Este projeto consiste em um programa escrito em Clojure que valida números de CPF (Cadastro de Pessoas Físicas) do Brasil. O CPF é um número de registro de pessoas físicas mantido pela Receita Federal do Brasil, composto por 11 dígitos.

## Estrutura do Projeto

O código principal está contido em duas funções:

### Função `validar-cpf`

A função `validar-cpf` recebe uma string contendo um número de CPF e valida se ele é válido. A validação inclui:

1. Remoção de todos os caracteres que não são dígitos.
2. Verificação se o CPF tem exatamente 11 dígitos.
3. Verificação se o CPF não tem todos os dígitos iguais.
4. Cálculo e verificação dos dois dígitos verificadores.

### Função `main`

A função `main` solicita que o usuário insira um número de CPF, chama a função `validar-cpf` para validar o CPF fornecido e exibe uma mensagem informando se o CPF é válido ou inválido.
