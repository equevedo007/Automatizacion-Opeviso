package com.itsolutioncompany.opeviso.actions.login;

import com.itsolutioncompany.opeviso.pageobject.HomePage;
import com.itsolutioncompany.opeviso.pageobject.LoginPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import static org.assertj.core.api.Assertions.assertThat;

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
