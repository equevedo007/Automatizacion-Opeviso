package com.itsolutioncompany.opeviso.stepsdefinition.login;

import com.itsolutioncompany.opeviso.actions.login.LoginPageAction;
import com.itsolutioncompany.opeviso.pageobject.HomePage;
import com.itsolutioncompany.opeviso.pageobject.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Map;

public class LoginSteps {

HomePage homePage;
LoginPageAction loginPageAction;
LoginPage loginPage;
    @Given("usuario ingreso al pagina")
    public void usuario_ingreso_al_pagina() {

       homePage.open();

    }
    @When("ingreso al sistema con mis credenciales :")
    public void ingreso_al_sistema_con_mis_credenciales(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        Map<String, String> row = data.get(0);
        String usuario = row.get("usuario");
        String calve = row.get("clave");
        loginPageAction.LoginAction(usuario,calve);
    }
    @Then("Validar Mensaje de Bienvenida")
    public void validar_mensaje_de_bienvenida() {
        assertThat(loginPage.MensajeDeBienvenida()).isEqualTo("Bienvenido Usuario ROOT Super Administrador");
    }
}
