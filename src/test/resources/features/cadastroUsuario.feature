# language: pt

  @cadastro_usuario
  Funcionalidade: Cadastro de Usuários
    Eu como visitante do sistema
    Quero me cadastrar
    Para fazer uma compra

    @cadastro-usuario-sucesso
    Cenario: Cadastro de usuário com sucesso
      Dado que estou no cadastro de usuarios
      E preencho todos os campos obrigatórios
      Quando clico em cadastrar usuário
      Então vejo mensagem de cadsastro com sucesso