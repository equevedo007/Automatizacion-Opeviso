Feature: Mantenimiento de Usuario

  Scenario: Login Usuario
    Given usuario "Edinson"
    When ingresos al sistema con mis credenciales:
      | usuario | clave |
      | root    | root  |