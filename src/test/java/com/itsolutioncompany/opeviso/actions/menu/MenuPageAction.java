package com.itsolutioncompany.opeviso.actions.menu;


import com.itsolutioncompany.opeviso.pageobject.navigationmenu.NavigationMenu;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.steps.UIInteractions;

public class MenuPageAction extends UIInteractions {

    @Steps
    NavigationMenu navigationMenu;

    public void SelecinarMenu(String SelecionarOpcionMenu){
        navigationMenu.selectMenu(SelecionarOpcionMenu);
    }


    public void SelecinarSubMenu(String SelecionarOpcionSubMenu){
        navigationMenu.selectSubMenu(SelecionarOpcionSubMenu);
    }

    public void SelecinarButtonRegistar(){
        navigationMenu.selectButtonRegistar();
    }
}
