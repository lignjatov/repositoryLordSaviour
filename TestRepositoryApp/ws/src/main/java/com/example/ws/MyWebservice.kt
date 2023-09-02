package ws

import com.example.core.entities.UserResponse
import hr.foi.air.core.entities.*
import retrofit.Call
import retrofit.http.GET
import retrofit.http.Query

interface MyWebservice {
    @GET("user/user.php")
    fun getUsers() : Call<List<UserResponse>>

    @GET("leaderboard/leaderboardAll.php")
    fun getLeaderboardAllCaller() : Call<List<LeaderboardAllResponse>>

    @GET("leaderboard/leaderboardPlanet.php")
    fun getLeaderboardPlanetCaller() : Call<List<LeaderboardPlanetResponse>>

    @GET("leaderboard/levelLeaderboard.php")
    fun getLeaderboardLevelCaller() : Call<List<LeaderboardLevelResponse>>

    @GET("user/user.php")
    fun getUserCaller() : Call<List<UserResponse>>

    @GET("store/itemsAll.php")
    fun getStoreCaller() : Call<List<StoreResponse>>


    //S parametrima
    @GET("leaderboard/leaderboardAll.php")
    fun getLeaderboardAllCaller(@Query("userId") userId: String?) : Call<List<LeaderboardAllResponse>>

    @GET("leaderboard/leaderboardPlanet.php")
    fun getLeaderboardPlanetCaller(@Query("userId") userId: String?) : Call<List<LeaderboardPlanetResponse>>

    @GET("leaderboard/levelLeaderboard.php")
    fun getLeaderboardLevelCaller(@Query("userId") userId: String?) : Call<List<LeaderboardLevelResponse>>

    @GET("store/userInventory.php")
    fun getInventoryCaller(@Query("userId") userId: String?) : Call<List<InventoryResponse>>



    /*

    //vraca leaderboard planeta
    @FormUrlEncoded
    @POST("leaderboardPlanet.php")
    fun getLeaderboardPlanetCaller(@Field("planetId") planetId: String) : Call<MyWebServiceResponse>

    //vraca leadreboard po levelu
    @FormUrlEncoded
    @POST("levelLeaderboard.php")
    fun getLeaderboardLevelCaller(@Field("levelId") levelId: String) : Call<MyWebServiceResponse>

    //vraca ukupne bodove po korisniku
    @FormUrlEncoded
    @POST("leaderboardUser.php")
    fun getLeaderboardUserCaller(@Field("userId") userId: String) : Call<MyWebServiceResponse>

    //vraca score korisnika po levelu
    @FormUrlEncoded
    @POST("levelUserScore.php")
    fun getLevelUserScoreCaller(@Field("userId") userId: String, @Field("levelId") levelId: String) : Call<MyWebServiceResponse>

    //varca score korisnika po planetu
    @FormUrlEncoded
    @POST("planetUserScore.php")
    fun getPlanetUserScoreCaller(@Field("planetId") planetId: String, @Field("userId") userId: String) : Call<MyWebServiceResponse>

    */

}