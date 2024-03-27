package com.itsolutioncompany.opeviso.actions;

import com.itsolutioncompany.opeviso.pageobject.login.LoginPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.thucydides.core.pages.PageObject;

public class UsuarioAction extends PageObject {

    @Steps
    LoginPage loginPage;

    @Step("Ingresa Usuario")
    public void ingresarUsuario(String usuario){
        loginPage.ingresarUsuario(usuario);

    }
    @Step("Ingresa Clave {0}")
    public void ingresarClave(String clave){
        loginPage.ingresarClave(clave);
    }
    @Step("Click en Ingresar {0}")
    public void ClickIngresar(){
        loginPage.ingresar();
    }
}
