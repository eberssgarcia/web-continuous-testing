#language: es

@test-execution
Característica: Validar mensaje de error Git

  @test-execution @test-group @git-001
  Escenario: Validar mensaje de error en Git
    Dado que abro la pagina de git
    Cuando ingreso mis datos de usuario
    Entonces valido que el mensaje de error: "Incorrect username or password."