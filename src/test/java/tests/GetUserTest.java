package tests;

import base.BaseTest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import requests.UserRequest;

public class GetUserTest extends BaseTest {

    @Test
    public void getUserValidId() {
        Response response = UserRequest.getUserById(2);

        Assert.assertTrue(
                response.statusCode() == 200 || response.statusCode() == 403,
                "Actual status code: " + response.statusCode()
        );
    }


    @Test
    public void getUserBoundaryId() {
        Response response = UserRequest.getUserById(0);

        Assert.assertTrue(
                response.statusCode() == 404 || response.statusCode() == 403,
                "Actual status code: " + response.statusCode()
        );
    }


}
