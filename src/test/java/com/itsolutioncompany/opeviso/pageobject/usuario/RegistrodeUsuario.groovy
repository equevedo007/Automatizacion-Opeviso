package com.itsolutioncompany.opeviso.pageobject.usuario

import net.serenitybdd.core.steps.UIInteractions

class RegistrodeUsuario extends UIInteractions{



     void SelecionarTipoDocumento(String TipoDocumento){
     $("//select[@name='tipoDocumentoId']").select().byVisibleText(TipoDocumento);
    }

     void SelecionarPerfil(String TipoPerfil) {
         $("/html/body/ngb-modal-window/div/div/form/div[2]/div[10]/div/div/div/select").select().byVisibleText(TipoPerfil);
     }

    void ingresarNumeroDocumento(String NumeroDocumento){
        $("#numDocumento").type(NumeroDocumento);

    }
    void ingresarNombes(String Nombres){
        $("//input[@id='nom'][@name='nom']").type(Nombres);

    }

    void ingresarApellidoPaterno(String ApellidoPaterno){
        $("#aPat").type(ApellidoPaterno);

    }

    void ingresarApellidoMaterno(String ApellidoMaterno){
        $("#aMat").type(ApellidoMaterno);

    }

    void ingresarCorreo(String Correo){
        $("#ema").type(Correo);

    }
    void ingresarDireccion(String Direccion){
        $("#dir").type(Direccion);

    }
    void ingresarCelular(String Celular){
        $("#cel").type(Celular);

    }
    void ingresarTelefono(String Telefono){
        $("#tel").type(Telefono);

    }
    void ingresarNombreUsuario(String NombreUsuario){
        $("#nuUsuario").type(NombreUsuario);

    }
    void ingresarClaveUsaurio(String ClaveUsaurio){
        $("#cla").type(ClaveUsaurio);

    }
    void ingresarRepetirClaveUsaurio(String RepetirClaveUsaurio){
        $("#confirmClave").type(RepetirClaveUsaurio);

    }

    void SeleccionarGuardar(){
        $("//button[@type='submit']").click()
    }


}
