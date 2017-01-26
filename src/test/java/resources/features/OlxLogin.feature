# language: pt

Funcionalidade: Validar login do usuario
  Como um usuario previamente cadastrado, eu acesso a tela de login do site OLX

  Cenario: Acessar tela de login
    Dado que eu esteja na tela inicial "http://www.olx.com.br/"
    E exista o campo Minha conta no inicio da pagina
    Quando eu clico no botao Minha conta
    Entao sou direcionado para a tela de login "https://www3.olx.com.br/account/form_login"

  Cenario: Logar no sistema
    Dado que na tela de login, os campos email e senha estejam visiveis
    Quando eu preencho o "desafioolxqa@gmail.com" valido
    E preencho a "12344321" valida
    E Pressiono o botao Entrar
    Entao eu sou direcionado para tela incial do usuario OLX