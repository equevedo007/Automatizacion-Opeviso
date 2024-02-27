package com.itsolutioncompany.opeviso.actions.login;

import com.itsolutioncompany.opeviso.pageobject.home.HomePage;
import com.itsolutioncompany.opeviso.pageobject.login.LoginPage;
import net.serenitybdd.core.steps.UIInteractions;


public class LoginPageAction  extends UIInteractions {

    LoginPage loginPageaction;
    HomePage homePage;


    public void LoginAction(String usuario, String clave){
        homePage.open();
        loginPageaction.ingresarUsuario(usuario);
        loginPageaction.ingresarClave(clave);
        loginPageaction.ingresar();

    }


}
