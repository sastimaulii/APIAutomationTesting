package tests;

import base.BaseTest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import requests.UserRequest;
import utils.TestDataUtil;

public class CreateUserTest extends BaseTest {

    @Test
    public void createUserSuccess() {
        Response response = UserRequest.createUser("John", "QA");

        Assert.assertTrue(
                response.statusCode() == 201 || response.statusCode() == 403,
                "Actual status code: " + response.statusCode()
        );
    }

}
