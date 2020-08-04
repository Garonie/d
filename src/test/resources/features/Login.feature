#language: pt
#encoding: UTF-8
Funcionalidade: Realizar Login

  @RealizarLogin
  Cenario: Fazer Login com usuario ja cadastrado
    Quando eu clicar no botao Sign in
    E preencher o campo email com "arnaldoribeirologin@gmail.com"
    E preencher o campo senha com "qwert"
    E clicar no botao signin
    Entao o sistema mostra o usuario logado
