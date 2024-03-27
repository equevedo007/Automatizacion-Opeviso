package com.itsolutioncompany.opeviso.steps;

import com.itsolutioncompany.opeviso.actions.UsuarioAction;
import com.itsolutioncompany.opeviso.pageobject.home.HomePage;
import com.itsolutioncompany.opeviso.pageobject.login.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.junit.CucumberSerenityRunner;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import org.junit.runner.RunWith;

import java.util.List;
import java.util.Map;
public class UsuarioDefault {
    HomePage homePage;
    UsuarioAction usuarioAction;
    @Given("usuario {string}")
    public void usuario(String string) {
        homePage.open();
    }

    @When("ingresos al sistema con mis credenciales:")
    public void ingresosAlSistemaConMisCredenciales(DataTable dataTable) {

        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);

        Map<String, String> Credenciales = data.get(0);

        String usuario = Credenciales.get("usuario");
        String Clave = Credenciales.get("clave");


        usuarioAction.ingresarUsuario(usuario);
        usuarioAction.ingresarClave(Clave);
        usuarioAction.ClickIngresar();

    }
}
