package com.itsolutioncompany.opeviso.actions.usuario;

import com.itsolutioncompany.opeviso.pageobject.usuario.RegistrodeUsuario;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.steps.UIInteractions;

import java.util.Map;

public class RegistrodeUsuarioAction extends UIInteractions {

    @Steps
    RegistrodeUsuario registrodeUsuario;
    public void SeleccionarTipoDocumento(String TipoDocumento){
        registrodeUsuario.SelecionarTipoDocumento(TipoDocumento);
    }

    public void IngresarDatosUsuario(Map<String, String> datos){

        registrodeUsuario.SelecionarTipoDocumento(datos.get("TipoDocumento"));
        registrodeUsuario.ingresarNumeroDocumento(datos.get("NumeroDocumento"));
        registrodeUsuario.ingresarNombes(datos.get("Nombres"));
        registrodeUsuario.ingresarApellidoPaterno(datos.get("ApellidoPaterno"));
        registrodeUsuario.ingresarApellidoMaterno(datos.get("ApellidoMaterno"));
        registrodeUsuario.ingresarCorreo(datos.get("CorreoElectronico"));
        registrodeUsuario.ingresarDireccion(datos.get("Direccion"));
        registrodeUsuario.ingresarCelular(datos.get("Celular"));
        registrodeUsuario.ingresarTelefono(datos.get("Telefono"));
        registrodeUsuario.SelecionarPerfil(datos.get("Perfil"));
        registrodeUsuario.ingresarNombreUsuario(datos.get("Usuario"));
        registrodeUsuario.ingresarClaveUsaurio(datos.get("Clave"));
        registrodeUsuario.ingresarRepetirClaveUsaurio(datos.get("Confirmarclave"));


    }

    public void SeleccionarPerfil(String TipoPerfil){
        registrodeUsuario.SelecionarPerfil(TipoPerfil);
    }

    public void SeleccionarGuardar(){
        registrodeUsuario.SeleccionarGuardar();
    }
}
