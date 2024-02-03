package virgingames.testbase;


import io.restassured.RestAssured;
import org.junit.BeforeClass;
import virgingames.constants.Path;
import virgingames.utils.PropertyReader;

public class TestBase {
   public static PropertyReader propertyReader;

   @BeforeClass
    public static void init(){
       propertyReader = PropertyReader.getInstance();
       RestAssured.baseURI = propertyReader.getProperty("baseUrl");
       RestAssured.basePath = Path.ROXOR;
   }
}
