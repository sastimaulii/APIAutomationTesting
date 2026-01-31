package requests;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UserRequest {

    public static Response getUserById(int id) {
        return given()
                .log().all()
                .when()
                .get("/users/" + id)
                .then()
                .log().all()
                .extract()
                .response();
    }

    public static Response createUser(String name, String job) {
        String body = "{ \"name\": \"" + name + "\", \"job\": \"" + job + "\" }";

        return given()
                .log().all()
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .post("/users")
                .then()
                .log().all()
                .extract()
                .response();
    }
}
