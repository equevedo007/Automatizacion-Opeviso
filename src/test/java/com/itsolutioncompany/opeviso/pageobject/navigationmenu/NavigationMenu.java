package com.itsolutioncompany.opeviso.pageobject.navigationmenu;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.screenplay.ui.Button;
import org.openqa.selenium.support.FindBy;

public class NavigationMenu extends UIInteractions {

    @FindBy(xpath = "//button[contains(text(),'Registrar')]")
    WebElementFacade ButtonRegistar;

   public void selectMenu(String Menu){

       $("//span[contains(text(),'"+Menu+"')]").click();
   }
    public void selectButtonRegistar(){
        ButtonRegistar.click();

    }

    public void selectSubMenu(String SubMenu){
        $("//a[contains(@href, '/"+SubMenu+"')]").click();

    }


}
