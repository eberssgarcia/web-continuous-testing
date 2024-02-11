#language: es

@test-execution
Característica: Buscar y registrar un vuelo de Paris a New York
  Yo como cliente de blazedemo
  Como buscar y registrar un vuelo
  Para ir de vacaciones

  @test-execution @group-blazedemo @blazedemo-001
  Esquema del escenario: Ingresar a Blazedemo para comprar pasaje
    Dado que el cliente ingresa a blazedemo
    Y selecciona "<origen>" y "<destino>"
    Y selecciona el vuelo con la aerolinea
#    Y selecciona el vuelo con la aerolinea "<aerolinea>"
    Cuando completa todos los inputs requeridos correctamente
      | name   | address   | city   | state   | zipCode   | cardType   | creditCardNumber   | month   | year   | nameOfCard   |
      | <name> | <address> | <city> | <state> | <zipCode> | <cardType> | <creditCardNumber> | <month> | <year> | <nameOfCard> |
    Entonces mostrar mensaje de compra exitoso: "Thank you for your purchase today!"
    Ejemplos:
      | origen    | destino  | aerolinea | name        | address   | city | state       | zipCode | cardType         | creditCardNumber | month | year | nameOfCard |
      | Boston    | London   | Lufthansa | Eber Garcia | Calle XXX | Lima | Santa Anita | 15007   | Visa             | 1234123412341234 | 12    | 2023 | bbva       |
      | Paris     | New York | Lufthansa | Eber Garcia | Calle XXX | Lima | Santa Anita | 15007   | American Express | 1234123412341234 | 12    | 2023 | bbva       |
      | San Diego | Berlin   | Lufthansa | Eber Garcia | Calle XXX | Lima | Santa Anita | 15007   | Diner's Club     | 1234123412341234 | 12    | 2023 | bbva       |