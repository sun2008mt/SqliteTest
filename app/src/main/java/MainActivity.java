import android.arch.persistence.room.Room;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.sun.sqlitetest.R;
import com.sun.sqlitetest.dao.AppDatabase;
import com.sun.sqlitetest.entity.ParkingLot;
import com.sun.sqlitetest.service.MyClient;

import org.json.JSONObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Administrator on 2017/12/29.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AppDatabase db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "parkinglot").build();

        Call<JsonObject> call = MyClient.service().getParkingLots("027");
        call.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                if (response != null && response.body() != null) {
                    int code = response.body().get("code").getAsInt();

                    if (code == 0) {
                        JsonElement parkinglotData = response.body().get("data");
                        List<ParkingLot> parkingLots = new Gson().fromJson(parkinglotData, new TypeToken<List<ParkingLot>>() {}.getType());
                        db.parkingLotDao().insertAll(parkingLots.toArray(new ParkingLot[] {}));
                    }
                }
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {

            }
        });
    }
}
