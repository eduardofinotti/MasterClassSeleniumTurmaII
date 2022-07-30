# language: pt

  @login
  Funcionalidade: Login
    Eu como usuário do sistema
    Quero fazer login
    Para fazer uma compra na Americanas

    Contexto: Acessar aplicação
      Dado que estou na tela de login

    @login-sucesso
    Cenario: Login com sucesso
      E preencho o e-mail "finotti@gmail.com" e senha "1234567"
      Quando clico no botão de login
      Então sou logado com sucesso

    @login-falha
    Esquema do Cenario: Credencias inválidas
      E preencho o e-mail "<email>" e senha "<senha>"
      Quando clico no botão de login
      Então vejo mensagem "<mensagem>"

      Exemplos:
      | email             | senha      | mensagem         |
      | xxxxxx            | 1234567    | E-mail inválido.x|
      | finotti@gmail.com | .....      | Senha inválida.  |

