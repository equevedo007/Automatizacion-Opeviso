package com.itsolutioncompany.opeviso.pageobject.login;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends UIInteractions {

    @FindBy(xpath = "//input[@name ='u']")
    WebElementFacade inpuntLoginUsuario;

    @FindBy(xpath = "//input[@name ='c']")
    WebElementFacade inpuntLoginClave;

    @FindBy(xpath = "//button[@type='submit']")
    WebElementFacade btnIngresar;

    @FindBy(xpath = "//h1[@class='page-header']")
    WebElementFacade MensajeDeBienvenida;

    @Step
    public void ingresarUsuario(String usuario ){
        inpuntLoginUsuario.type(usuario);
    }
    @Step
    public void ingresarClave(String clave ){
        inpuntLoginClave.type(clave);
    }
    @Step
    public void ingresar( ){
        btnIngresar.click();
    }
    @Step
    public String MensajeDeBienvenida(){
        return MensajeDeBienvenida.getText();
    }
}
