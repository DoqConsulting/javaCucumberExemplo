package test.java.step_definitions.login;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import test.java.commonMethods.DriverInstanceWeb;
import test.java.commonMethods.*;
import test.java.interactions.*;
import static test.java.pageObjects.PO_TelaLogin.*;
import static test.java.pageObjects.PO_TelaInicial.*;

public class Step_OlxLogin extends DriverInstanceWeb {

    private WebDriver driver = instance();
    Sync sync = new Sync(driver);
    Int_TelaInicial paginaInicial = PageFactory.initElements(driver, Int_TelaInicial.class);
    Int_TelaLogin paginaLogin = PageFactory.initElements(driver, Int_TelaLogin.class);

    @Dado("^que eu esteja na tela inicial \"([^\"]*)\"$")
    public void acessarTelaInicial(String URL) throws Throwable {

        driver.navigate().to(URL);

    }

    @Dado("^exista o campo Minha conta no inicio da pagina$")
    public void exista_o_campo_Minha_conta_no_inicio_da_pagina() throws Throwable {

        sync.fluentWaitElementBy(By.cssSelector(CSSLINKLOGIN));

    }

    @Quando("^eu clico no botao Minha conta$")
    public void eu_clico_no_botao_Minha_conta() throws Throwable {

        paginaInicial.pressionarBtnMinhaConta();

    }

    @Entao("^sou direcionado para a tela de login \"([^\"]*)\"$")
    public void sou_direcionado_para_a_tela_de_login(String arg1) throws Throwable {

        sync.verificarPaginaAtualURL(arg1);

    }

    @Dado("^que na tela de login, os campos email e senha estejam visiveis$")
    public void que_na_tela_de_login_os_campos_email_e_senha_estejam_visiveis() throws Throwable {

        sync.fluentWaitElementBy(By.id(IDCAMPOLOGIN));
        sync.fluentWaitElementBy(By.id(IDCAMPOSENHA));

    }

    @Quando("^eu preencho o \"([^\"]*)\" valido$")
    public void eu_preencho_o_valido(String arg1) throws Throwable {

        paginaLogin.preencherEmail(arg1);

    }

    @Quando("^preencho a \"([^\"]*)\" valida$")
    public void preencho_a_valida(String arg1) throws Throwable {

        paginaLogin.preencherSenha(arg1);

    }

    @Quando("^Pressiono o botao Entrar$")
    public void pressiono_o_botao_Entrar() throws Throwable {

        sync.fluentWaitElementBy(By.id(IDBOTAOENTRAR));
        paginaLogin.pressionarBotaoEntrar();

    }

    @Entao("^eu sou direcionado para tela incial do usuario OLX$")
    public void eu_sou_direcionado_para_tela_incial_do_usuario_OLX() throws Throwable {

        sync.fluentWaitElementBy(By.xpath(XPATHUSUARIOLOGADO));
        driver.close();
        driver.quit();

    }
}
