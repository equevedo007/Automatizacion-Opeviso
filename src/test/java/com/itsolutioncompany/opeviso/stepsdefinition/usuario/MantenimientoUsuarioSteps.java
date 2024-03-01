package com.itsolutioncompany.opeviso.stepsdefinition.usuario;

import com.itsolutioncompany.opeviso.actions.login.LoginPageAction;
import com.itsolutioncompany.opeviso.actions.menu.MenuPageAction;
import com.itsolutioncompany.opeviso.actions.usuario.RegistrodeUsuarioAction;
import com.itsolutioncompany.opeviso.pageobject.home.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;
import java.util.Map;
import static org.assertj.core.api.Assertions.assertThat;


public class MantenimientoUsuarioSteps {

    HomePage homePage;
    LoginPageAction loginPageAction;
    MenuPageAction menuPageAction;
    RegistrodeUsuarioAction registrodeUsuarioAction;

    @Given("ingreso al sistema con mis credenciales :")
    public void ingreso_al_sistema_con_mis_credenciales(DataTable dataTable1) {
        homePage.open();
        List<Map<String, String>> data1 = dataTable1.asMaps(String.class, String.class);
        Map<String,String> row = data1.get(0);
        String usuaio = row.get("usuario");
        String clave = row.get("clave");
        loginPageAction.LoginAction(usuaio,clave);


    }
    @When("Selecciona registrar usaurio")
    public void seleccionaRegistrarUsaurio(DataTable dataTable2) {
        List<Map<String, String>> data2 = dataTable2.asMaps(String.class, String.class);
        Map<String, String > row = data2.get(0);
        menuPageAction.SelecinarMenu(row.get("menu"));
        menuPageAction.SelecinarSubMenu(row.get("submenu"));
        menuPageAction.SelecinarButtonRegistar();
    }
    @When("registro usuario con perfil Administrador")
    public void registro_usuario_con_perfil_administrador(DataTable dataTable) {

        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        Map<String, String> row = data.get(0);

        registrodeUsuarioAction.IngresarDatosUsuario(row);

        registrodeUsuarioAction.SeleccionarGuardar();

    }
    @Then("Validar Mensaje de Confirmacion")
    public void validar_mensaje_de_confirmacion(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);

        Map<String,String> row =data.get(0);

        assertThat(row.get("Mensaje de Confirmacion")).isEqualTo("Se registro el usuario correctamente");


    }



}
