package org.Lektion_27_11_2023;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class UserApiIntegrationTest {
    @Test
    public void testApiFetchUser_ONE() {
        given().baseUri("https://jsonplaceholder.typicode.com")
                .when().get("/users/1")
                .then().assertThat().statusCode(200)
                .body("name", equalTo("Leanne Graham"))
                .body("address.street", equalTo("Kulas Light"))
                .body("website",equalTo("hildegard.org"));
    }
    @Test
    public void testApiFetchUser_TWO() {
        given().baseUri("https://jsonplaceholder.typicode.com")
                .when().get("/users/2")
                .then().assertThat().statusCode(200)
                .body("name", equalTo("Ervin Howell"))
                .body("email", equalTo("Shanna@melissa.tv"));
    }

    @Test
    public void testApiFetchPost() {
        given().baseUri("https://jsonplaceholder.typicode.com")
                .when().get("/posts/1")
                .then().assertThat().statusCode(200)
                .body("title",equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"));

    }

    @Test
    public void testApiFetchUser() {

        given().baseUri("https://jsonplaceholder.typicode.com").
                pathParam("userId","1")
                .when().get("/users/{userId}")
                .then().assertThat().statusCode(200);
    }

    @Test
    public void testApiQueryParam() {

        given().baseUri("https://jsonplaceholder.typicode.com").
                pathParam("userId","1")
                .when().get("/posts?userId={userId}")
                .then().assertThat().statusCode(200);
    }


}
