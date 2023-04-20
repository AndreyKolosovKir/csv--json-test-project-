import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.sun.jdi.Type;

import java.util.List;

public class ListToJson<T> {
    public <T> String listToJson(List<T> list) {
        String json = null;

        for (T employee : list) {
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
//        Type listType = new TypeToken<List<T>>() {}.getType();
//        json = gson.toJson(list, listType);
            json = gson.toJson(employee);
        }

        return json;
    }
}
