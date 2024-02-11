#language: es

@text-execution
Característica: Dar de alta a usuario y agregar producto a carrito de compras
  Yo como cliente de Demoblaze
  Quiero darme de alta en la plataforma Demoblaze
  Para agregar productos al carrito de compras

  @text-execution @test-group @demoblaze-001
  Esquema del escenario: Dar de alta usuario ingresando valores correctos - OK
    Dado que estoy en la plataforma Demoblaze
    Y luego ingreso a Sign Up
    Cuando completo los campos requeridos de "<usuario>" "<password>"
    Entonces validar que alerta de registro
    Ejemplos:
      | usuario      | password |
      | prueba000008 | 12345    |
      | prueba000006 | 12345    |

  @text-execution @test-group @demoblaze-002
  Esquema del escenario: Login y logout con el usuario dado de alta - OK
    Dado que estoy en la plataforma Demoblaze
    Y luego ingreso a Log in
    Cuando ingreso los campos requeridos de "<usuario>" "<password>"
    Entonces validar inicio de sesion con "<usuario>"
    Y hago clic en Log out
    Ejemplos:
      | usuario      | password |
      | prueba000008 | 12345    |
      | prueba000006 | 12345    |

  @text-execution @test-group @demoblaze-003
  Esquema del escenario: Agregar productos al carrito - OK
    Dado que estoy en la plataforma Demoblaze
    Cuando agrego al carrito un "<producto>"
    Entonces validar que "<producto>" se haya agregado correctamente
    Ejemplos:
      | producto     |
      | Sony vaio i5 |
      | Sony vaio i7 |