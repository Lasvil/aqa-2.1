import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class testPostman{
    @Test
    void testingPostman(){
        given()
                .baseUri("https://postman-echo.com")
                .body("I hate this homework. And i hate you too.") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("I hate this homework. And i hate you too."))
        ;
    }

}