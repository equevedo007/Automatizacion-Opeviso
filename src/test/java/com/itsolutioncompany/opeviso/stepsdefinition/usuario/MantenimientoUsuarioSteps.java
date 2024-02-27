package com.itsolutioncompany.opeviso.stepsdefinition.usuario;

import com.itsolutioncompany.opeviso.actions.menu.MenuPageAction;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;
import java.util.Map;


public class MantenimientoUsuarioSteps {
    MenuPageAction menuPageAction;
    @When("Selecciona registrar usaurio")
    public void seleccionaRegistrarUsaurio(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);

        Map<String, String > row = data.get(0);


        menuPageAction.SelecinarMenu(row.get("menu"));
        menuPageAction.SelecinarSubMenu(row.get("submenu"));
        menuPageAction.SelecinarButtonRegistar();

    }

    @When("registro usuario con perfil Administrador")
    public void registro_usuario_con_perfil_administrador(DataTable dataTable) {

        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        Map<String, String> row = data.get(0);

    }
    @Then("Validar Mensaje de Confirmacion")
    public void validar_mensaje_de_confirmacion(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);

        Map<String,String> row =data.get(0);


    }



}
