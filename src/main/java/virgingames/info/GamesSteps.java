package virgingames.info;


import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;
import virgingames.constants.EndPoints;

public class GamesSteps {

    // Enter reusable steps here

    @Step("Get all GBP data")
    public ValidatableResponse getAllPotsGBPData(){
        return SerenityRest.given().log().ifValidationFails()
                .when()
                .get(EndPoints.CURRENCYGBP)
                .then();
    }

    @Step("Get All EUR data")
    public ValidatableResponse getAllPotsEURData(){
        return SerenityRest.given().log().ifValidationFails()
                .when()
                .get(EndPoints.CURRENCYEUR)
                .then();
    }
}
