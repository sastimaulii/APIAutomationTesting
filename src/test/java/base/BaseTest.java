package base;

import config.BaseUrl;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = BaseUrl.BASE_URL;
    }
}
