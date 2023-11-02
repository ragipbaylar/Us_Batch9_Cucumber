package APITest;

import APITest.POJOClasses.Country;
import io.restassured.http.ContentType;
import io.restassured.http.Cookies;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class CountryAPITest {

    Cookies cookies;

    @BeforeClass
    void loginTest() {
        baseURI = "https://test.mersys.io/school-service/api/countries";

        Map<String, String> credentials = new HashMap<>();
        credentials.put("username", "turkeyts");
        credentials.put("password", "TechnoStudy123");
        credentials.put("rememberMe", "true");

        cookies = given()
                .body(credentials)
                .contentType(ContentType.JSON)
                .when()
                .post("https://test.mersys.io/auth/login")
                .then()
                .statusCode(200)
                //.log().body()
                .extract().response().getDetailedCookies();
    }

    public String randomCountryName() {
        return RandomStringUtils.randomAlphabetic(8);
    }

    public String randomCountryCode() {
        return RandomStringUtils.randomAlphabetic(3);
    }

    Country requestCountry;
    Country responseCountry;

    @Test(priority = 1)
    void createNewCountryTest() {
        requestCountry = new Country();
        requestCountry.setId(null);
        requestCountry.setName(randomCountryName());
        requestCountry.setCode(randomCountryCode());
        requestCountry.setTranslateName(new ArrayList<>());
        requestCountry.setHasState(false);

        responseCountry = given()
                .cookies(cookies)
                .contentType(ContentType.JSON)
                .body(requestCountry)
                .when()
                .post()
                .then()
                .statusCode(201)
                .contentType(ContentType.JSON)
                .extract().jsonPath().getObject("", Country.class);

        Assert.assertEquals(responseCountry.getName(), requestCountry.getName());
        Assert.assertEquals(responseCountry.getCode(), requestCountry.getCode());
    }

    /**
     * Write create country negative test
     **/

    @Test(dependsOnMethods = "createNewCountryTest", priority = 2)
    void createCountryNegativeTest() {

        given()
                .cookies(cookies)
                .contentType(ContentType.JSON)
                .body(requestCountry)
                .when()
                .post()
                .then()
                .statusCode(400);
    }

    /**
     * Get the country that you have created
     **/

    @Test(dependsOnMethods = "createNewCountryTest", priority = 3)
    void getCountryByNameTest() {

        given()
                .cookies(cookies)
                .contentType(ContentType.JSON)
                .body(responseCountry)
                .when()
                .post("/search")
                .then()
                .log().body()
                .statusCode(200);
    }

    /**
     * Update the country we created
     **/

    @Test(dependsOnMethods = "createNewCountryTest", priority = 4)
    void updateCountryTest() {

        responseCountry.setName(randomCountryName());
        responseCountry.setCode(randomCountryCode());

        Country countryAfterUpdate = given()
                .cookies(cookies)
                .contentType(ContentType.JSON)
                .body(responseCountry)
                .when()
                .put()
                .then()
                .statusCode(200)
                .body("id", equalTo(responseCountry.getId()))
                .extract().jsonPath().getObject("", Country.class);

        Assert.assertEquals(countryAfterUpdate.getName(), responseCountry.getName());
        Assert.assertEquals(countryAfterUpdate.getCode(), responseCountry.getCode());
    }

    /**
     * Delete the country we created
     **/
    @Test(dependsOnMethods = "createNewCountryTest", priority = 5)
    void deleteCountryTest() {
        given()
                .cookies(cookies)
                .pathParam("countryId", responseCountry.getId())
                .when()
                .delete("/{countryId}")
                .then()
                .statusCode(200);
    }

    /**
     * Delete the country negative
     **/
    @Test(dependsOnMethods = {"deleteCountryTest", "createNewCountryTest"}, priority = 6)
    void deleteCountryNegativeTest() {
        given()
                .cookies(cookies)
                .pathParam("countryId", responseCountry.getId())
                .when()
                .delete("/{countryId}")
                .then()
                .statusCode(400)
                .body("message", equalTo("Country not found"));
    }

    @Test(dependsOnMethods = {"deleteCountryTest", "createNewCountryTest"}, priority = 7)
    void getCountryByNameAfterDelete() {

        given()
                .cookies(cookies)
                .contentType(ContentType.JSON)
                .body(responseCountry)
                .when()
                .post("/search")
                .then()
                .statusCode(200);
    }
}
