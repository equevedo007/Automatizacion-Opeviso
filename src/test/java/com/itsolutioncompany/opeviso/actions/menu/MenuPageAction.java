package com.itsolutioncompany.opeviso.actions.menu;

import com.itsolutioncompany.opeviso.actions.login.LoginPageAction;
import com.itsolutioncompany.opeviso.pageobject.navigationmenu.NavigationMenu;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class MenuPageAction extends UIInteractions {
    LoginPageAction loginPageAction;
    NavigationMenu navigationMenu;

    @Step("Seleccionar Menu")
    public void SelecinarMenu(String SelecionarOpcionMenu){

        loginPageAction.LoginAction("root","root");
        navigationMenu.selectMenu(SelecionarOpcionMenu);

    }

    @Step("Seleccionar Sub-Menu")
    public void SelecinarSubMenu(String SelecionarOpcionSubMenu){

        navigationMenu.selectSubMenu(SelecionarOpcionSubMenu);

    }
    @Step("Seleccionar Boton Registar")
    public void SelecinarButtonRegistar(){
        navigationMenu.selectButtonRegistar();
    }
}
