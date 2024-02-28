package com.itsolutioncompany.opeviso.pageobject.usuario


import net.serenitybdd.core.steps.UIInteractions

class RegistrodeUsuario extends UIInteractions{

     void SelecionarTipoDocumento(String TipoDocumento){
     $("//select[@name='tipoDocumentoId']").select().byVisibleText(TipoDocumento);

    }
}
