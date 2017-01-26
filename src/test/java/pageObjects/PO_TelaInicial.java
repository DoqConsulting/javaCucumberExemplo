package test.java.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PO_TelaInicial {

    public static final String CSSLINKLOGIN = "a[href=\"https://www3.olx.com.br/account/form_login\"]";

    @FindBy(css = CSSLINKLOGIN)
    protected WebElement BtnMinhaConta;

}
