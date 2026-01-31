package tests;

import base.BaseTest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import requests.UserRequest;
import utils.TestDataUtil;

public class NegativeTest extends BaseTest {

    @Test
    public void createUserWithoutName() {
        Response response = UserRequest.createUser("", "QA");

        Assert.assertTrue(
                response.statusCode() == 201 || response.statusCode() == 403,
                "Status code is " + response.statusCode()
        );
    }



    @Test
    public void getUserInvalidId() {
        Response response = UserRequest.getUserById(9999);

        Assert.assertTrue(
                response.statusCode() == 404 || response.statusCode() == 403,
                "Actual status code: " + response.statusCode()
        );
    }

}
