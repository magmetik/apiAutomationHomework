package homework;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class GetBookingsFilterByDepositPaid extends BaseUrl {

    BaseUrl BaseUrl = new BaseUrl();

    @Test
    public void bookingFilterByDepositPaid(){

        given()
                .log().all()
                .queryParams("depositpaid",true).
                when()
                .get(BaseUrl.baseUrl+"/booking").
                then()
                .statusCode(200)
                .log().all();
    }


}
