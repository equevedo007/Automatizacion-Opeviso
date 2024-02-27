package com.itsolutioncompany.opeviso.actions.usuario;

import com.itsolutioncompany.opeviso.pageobject.usuario.RegistrodeUsuario;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.steps.UIInteractions;

public class RegistrodeUsuarioAction extends UIInteractions {

    @Steps
    RegistrodeUsuario registrodeUsuario;
    public void SeleccionarTipoDocumento(String TipoDocumento){
        registrodeUsuario.SelecionarTipoDocumento(TipoDocumento);
    }
}
