package stepDefinitions;

import io.cucumber.java.en.Given;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HMC3 {
    @Given("kullanici HMC veri tabanina baglanir")
    public void kullanici_hmc_veri_tabanina_baglanir() throws SQLException {

    }
    @Given("kullanici {string} tablosundaki {string} verilerini alir")
    public void kullanici_tablosundaki_verilerini_alir(String table, String field) throws SQLException {

    }
}
