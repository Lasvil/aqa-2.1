import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class testPostman{
    @Test
    void testingPostman(){
        given()
                .baseUri("https://postman-echo.com")
                .body("Hey F!") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("Hey F!"))
        ;
    }

}