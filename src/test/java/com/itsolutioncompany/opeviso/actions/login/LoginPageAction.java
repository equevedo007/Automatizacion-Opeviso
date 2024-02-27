package com.itsolutioncompany.opeviso.actions.login;

import com.itsolutioncompany.opeviso.pageobject.home.HomePage;
import com.itsolutioncompany.opeviso.pageobject.login.LoginPage;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.steps.UIInteractions;


public class LoginPageAction  extends UIInteractions {

    @Steps
    LoginPage loginPageaction;

    public void LoginAction(String usuario, String clave){

        loginPageaction.ingresarUsuario(usuario);
        loginPageaction.ingresarClave(clave);
        loginPageaction.ingresar();

    }


}
