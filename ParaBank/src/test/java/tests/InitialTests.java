package tests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class InitialTests extends BaseTest {
    @Test
    public void successfulRegister() {
        landingPage.clickOnRegisterButton();
        String newUsername = variable.getUsername();
        String newPwd = variable.getPwd();
        String newFirstName = variable.getFirstName();
        String newLastName = variable.getLastName();
        String newAddress = variable.getAddress();
        String newZip = variable.getZip();
        String newCity = variable.getCity();
        String newState = variable.getState();
        String newSsn = variable.getSsn();
        String newPhone = variable.getPhone();
        registrationPage.successfullyEnterRegistrationInformation(newFirstName,newLastName,newAddress,newZip,newCity,newState,newSsn,newPhone,newUsername,newPwd);
        registrationPage.clickRegisterButton();
        welcomePage.verifyWelcomeMessage(newUsername);

    }

    @Test
    public void restAssuredBoii(){
        String idUsuario;
        String emailUsuario;

        Response response = given()
                .param("page", 1)
                .when()
                .get("https://reqres.in/api/users")
                .then()
                .log()
                .all()
                .extract().response();

        idUsuario = response.jsonPath().getString("data[1].id");
        emailUsuario = response.jsonPath().getString("data[1].email");

        Response response1 = given()
                .when()
                .get("https://reqres.in/api/users/" + idUsuario)
                .then()
                .log().all()
                .extract().response();

        Assert.assertEquals(emailUsuario,response1.jsonPath().getString("data.email"));

        System.out.println("El email inicial: " + emailUsuario + ", es el mismo que el email final: " + response1.jsonPath().getString("data.email"));
    }
}
