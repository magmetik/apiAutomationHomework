package homework;

import org.testng.annotations.*;
import static io.restassured.RestAssured.given;


public class MultipleGetBookingByBookingId extends BaseUrl {

    BaseUrl BaseUrl = new BaseUrl();

    @DataProvider(name = "dataProvider")
    public Object[][] dataProvider(){
        return new Object[][]{
                {7, 200},
                {3, 200},
                {5, 200},
                {6, 200}
        };
    }

    @Test(dataProvider =  "dataProvider")
    public void getBookingById(int bookingId, int statusCode){

        given()
                .log().all().
                when()
                .get(BaseUrl.baseUrl+"/booking/"+bookingId).
                then()
                .statusCode(statusCode)
                .log().all();
    }
}