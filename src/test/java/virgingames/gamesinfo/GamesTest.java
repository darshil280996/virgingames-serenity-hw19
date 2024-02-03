package virgingames.gamesinfo;


import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.Title;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import virgingames.info.GamesSteps;
import virgingames.testbase.TestBase;

import static org.hamcrest.Matchers.equalTo;

@RunWith(SerenityRunner.class)
public class GamesTest extends TestBase {

    @Steps
    GamesSteps gamesSteps;

    @Title("Verify jackpotId is Roxor Progressives")
    @Test
    public void test001() {
        ValidatableResponse response = gamesSteps.getAllPotsGBPData();
        response.statusCode(200).log().all();
        response.body("data.jackpotId", equalTo("Roxor Progressives"));
    }

    @Title("Verify pots 5th id is play-classic-wilds-progressive")
    @Test
    public void test002() {
        ValidatableResponse response = gamesSteps.getAllPotsGBPData();
        response.statusCode(200).log().all();
        response.body("data.pots[4].name", equalTo("play-classic-wilds-progressive"));
    }

    @Title("Verify currency is GBP")
    @Test
    public void test003() {
        ValidatableResponse response = gamesSteps.getAllPotsGBPData();
        response.statusCode(200).log().all();
        response.body("data.pots[0].currency", equalTo("GBP"));
    }

    @Title("Verify currency is EUR")
    @Test
    public void test004() {
        ValidatableResponse response = gamesSteps.getAllPotsEURData();
        response.statusCode(200).log().all();
        response.body("data.pots[0].currency", equalTo("EUR"));
    }


}
