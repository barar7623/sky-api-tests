package utility;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;


public class Utility {

    private static Response articlesResponse;

    public static Response getSingleArticleById(long id){
        articlesResponse =
                given().contentType(ContentType.JSON).
                when().get("/articles/" + id).
                then().using().extract().response();
        return articlesResponse;
    }

    public static Response getListOfArticles(){
        articlesResponse =
                given().contentType(ContentType.JSON).
                when().get("/articles").
                then().using().extract().response();
        return articlesResponse;
    }

    public static Response postSingleArticles(){
         articlesResponse =
                given().contentType(ContentType.JSON).
                when().post("/articles/3").
                then().using().extract().response();
        return articlesResponse;
    }

    public static Response putSingleArticles(){
         articlesResponse =
                given().contentType(ContentType.JSON).
                when().put("/articles/3").
                then().using().extract().response();
        return articlesResponse;
    }

    public static Response deleteSingleArticles(){
         articlesResponse = when().delete("/articles/3").
                then().using().extract().response();
        return articlesResponse;
    }

    public static void pageNotFoundStatusCode(int statusCode){
        Assert.assertEquals(statusCode, articlesResponse.getStatusCode());
    }

    public static void getListOfArticlesStatusCode(int statusCode){
        Assert.assertEquals(statusCode,articlesResponse.getStatusCode());
    }

    public static void getSingleArticleStatusCode(int statusCode){
        Assert.assertEquals(statusCode,articlesResponse.getStatusCode());
    }

    public static void deleteOpsStatusCode(int statusCode){
        Assert.assertEquals(statusCode,articlesResponse.getStatusCode());
    }

    public static void verifyArticleResponse(long id){
        Assert.assertEquals(Long.toString(id), articlesResponse.path("id"));
    }

    public static void verifyListOfArticlesResponse(){
       int size =  articlesResponse.jsonPath().getList("id").size();
        Assert.assertEquals(size,5);
    }

    public static void pageNotFoundStatus(int statusCode){
        Assert.assertEquals(statusCode,articlesResponse.getStatusCode());
    }



}
