package test.java.interactions;

import test.java.pageObjects.PO_TelaLogin;

public class Int_TelaLogin extends PO_TelaLogin {

    public void pressionarLinkBuscar()
    {
        linkBuscar.click();
    }

    public void preencherEmail(String email)
    {

        textLogin.clear();
        textLogin.sendKeys(email);

    }

    public void preencherSenha(String senha)
    {

        textSenha.clear();
        textSenha.sendKeys(senha);

    }

    public void pressionarBotaoEntrar()
    {

        btnEntrar.click();

    }
}
