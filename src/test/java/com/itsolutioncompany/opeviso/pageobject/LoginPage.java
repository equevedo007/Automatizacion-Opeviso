package com.itsolutioncompany.opeviso.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {

    @FindBy(xpath = "//input[@name ='u']")
    WebElementFacade inpuntLoginUsuario;

    @FindBy(xpath = "//input[@name ='c']")
    WebElementFacade inpuntLoginClave;

    @FindBy(xpath = "//button[@type='submit']")
    WebElementFacade btnIngresar;

    @FindBy(xpath = "//h1[@class='page-header']")
    WebElementFacade MensajeDeBienvenida;

    public void ingresarUsuario(String usuario ){
        inpuntLoginUsuario.type(usuario);
    }

    public void ingresarClave(String clave ){
        inpuntLoginClave.type(clave);
    }

    public void ingresar( ){
        btnIngresar.click();
    }

    public String MensajeDeBienvenida(){
        return MensajeDeBienvenida.getText();
    }
}
