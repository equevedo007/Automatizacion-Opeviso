Feature: Validar Ingreso al sistema


  Scenario: Registrar Usuario
    Given ingreso al sistema con mis credenciales :
      | usuario | clave |
      | root    | root  |
    When Selecciona registrar usaurio
      | menu          | submenu |
      | Mantenimiento | usuario |
    And registro usuario con perfil Administrador
      | TipoDocumento | NumeroDocumento | Nombres        | ApellidoPaterno | ApellidoMaterno | CorreoElectronico                        | Direccion         | Celular   | Telefono  | Perfil        | Usuario  | Clave | Confirmarclave |
      | DNI           | 43532434        | Edinson Ismael | Quevedo         | Holguin         | edinson.quevedo@itsolutioncompany.com.pe | Jr. Los pinos 787 | 950457355 | 012343100 | Administrador | equevedo | 123   | 123            |
    Then Validar Mensaje de Confirmacion
      | Mensaje de Confirmacion              |
      | Se registro el usuario correctamente |

