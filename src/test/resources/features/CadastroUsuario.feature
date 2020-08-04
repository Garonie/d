#language: pt
#encoding: UTF-8
Funcionalidade: Cadastrar usuario

  @UsuarioCorreto
  Cenario: Cadastrar usuario correto
    Quando eu clicar no botao Sign in
    E preencher o campo do email com o "arnaldorisdfsdfbeiro454566@gmail.com"
    E clicar no botao criar conta
    E marcar a caixa title com mr
    E preencher o campo primeiro nome com "Arnaldo"
    E preencher o campo segundo nome com "Ribeiro"
    E preencher o campo password com "qwert"
    E selecionar a dia do aniversario para "25"
    E selecionar o mes para "11" 
    E selecionar o ano para "1989"
    E prencher o campo endereco para "SQS 402 conjunto A"
    E preencher o campo cidade para "Nova York"
    E selecionar o campo estado para "Washington"
    E preencher o campo cep com "72161"
    E preencher o campo telefone celular com "61999582426"
    E preencher o email alternativo com "qwersdfsdftfdss@hotmail.com"
    E clicar no botao registrar
    Entao o site mostra a mensagem de erro

  @EmailInvalido
  Cenario: Cadastrar usuario correto
    Quando eu clicar no botao Sign in
    E preencher o campo do email com o "arnaldoribeiro12dfgsdsdf"
    E clicar no botao criar conta
    Entao o sistema mostra a mensagem email invalido

  @UsuarioJaCadastrado
  Cenario: Cadastrar usuario correto
    Quando eu clicar no botao Sign in
    E preencher o campo do email com o "arnaldoribeiro@gmail.com"
    E clicar no botao criar conta
    Entao o sistema mostra a mensagem usuario ja cadastrado

  @CadastroFaltandoCampos
  Cenario: Cadastrar usuario correto
    Quando eu clicar no botao Sign in
    E preencher o campo do email com o "arnaldoribeiro45556@gmail.com"
    E clicar no botao criar conta
    E marcar a caixa title com mr
    E preencher o campo primeiro nome com ""
    E preencher o campo segundo nome com "Ribeiro"
    E preencher o campo password com "qwert"
    E selecionar a dia do aniversario para "25"
    E selecionar o mes para "11"
    E selecionar o ano para "1989"
    E prencher o campo endereco para "SQS 402 conjunto A"
    E preencher o campo cidade para "Nova York"
    E selecionar o campo estado para "Washington"
    E preencher o campo cep com "72161"
    E preencher o campo telefone celular com "61999582426"
    E preencher o email alternativo com "qwertfdss@hotmail.com"
    E clicar no botao registrar
    Entao o sistema mostra a mensagem falta preencher campos

  @CadastroFaltandoCampos
  Cenario: Cadastrar usuario corret
    Quando eu clicar no botao Sign in
    E preencher o campo do email com o "arnaldoribeiro45556@gmail.com"
    E clicar no botao criar conta
    E marcar a caixa title com mr
    E preencher o campo primeiro nome com ""
    E preencher o campo segundo nome com "Ribeiro"
    E preencher o campo password com "qwert"
    E selecionar a dia do aniversario para "25"
    E selecionar o mes para "11"
    E selecionar o ano para "1989"
    E prencher o campo endereco para "SQS 402 conjunto A"
    E preencher o campo cidade para "Nova York"
    E selecionar o campo estado para "Washington"
    E preencher o campo cep com "72161"
    E preencher o campo telefone celular com "61999582426"
    E preencher o email alternativo com "qwertfdss@hotmail.com"
    E clicar no botao registrar
    Entao o sistema mostra a mensagem falta preencher campos
    
    @Cep
  Cenario: Cadastrar usuario correto
    Quando eu clicar no botao Sign in
    E preencher o campo do email com o "arnaldoribeiro4569@gmail.com"
    E clicar no botao criar conta
    E marcar a caixa title com mr
    E preencher o campo primeiro nome com "Arnaldo"
    E preencher o campo segundo nome com "Ribeiro"
    E preencher o campo password com "qwert"
    E selecionar a dia do aniversario para "25"
    E selecionar o mes para "11"
    E selecionar o ano para "1989"
    E prencher o campo endereco para "SQS 402 conjunto A"
    E preencher o campo cidade para "Nova York"
    E selecionar o campo estado para "Washington"
    E preencher o campo cep com "72161230"
    E preencher o campo telefone celular com "61999582426"
    E preencher o email alternativo com "qwertfdssdhkjsdhjs@hotmail.com"
    E clicar no botao registrar
    Entao o site mostra a mensagem de erro
