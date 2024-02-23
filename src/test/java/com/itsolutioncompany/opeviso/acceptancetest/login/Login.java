package com.itsolutioncompany.opeviso.acceptancetest.login;

import com.itsolutioncompany.opeviso.actions.login.LoginPageAction;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityJUnit5Extension.class)
public class Login extends UIInteractions {

    @Steps
    LoginPageAction loginPageAction;
    @Test
    public void LoginTest(){
        loginPageAction.LoginAction("root","root");

    }



}
