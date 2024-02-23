Feature: Validar Ingreso al sistema

  Scenario: Ingresar al sistema
    Given usuario ingreso al pagina
    When ingreso al sistema con mis credenciales :
      | usuario | clave |
      | root    | root  |
    Then Validar Mensaje de Bienvenida