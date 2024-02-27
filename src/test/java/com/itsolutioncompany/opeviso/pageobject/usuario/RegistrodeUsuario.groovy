package com.itsolutioncompany.opeviso.pageobject.usuario

import net.serenitybdd.core.pages.PageObject

class RegistrodeUsuario extends PageObject{

     void SelecionarTipoDocumento(String TipoDocumento){
     $("//select[@name='tipoDocumentoId']").select().byVisibleText(TipoDocumento);

    }
}
