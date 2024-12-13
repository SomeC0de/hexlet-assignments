package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.AllArgsConstructor;
import lombok.Value;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;

// BEGIN
@Value
@AllArgsConstructor
// END
class Car {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    // BEGIN
    public String serialize() {
        ObjectMapper om = new ObjectMapper();

        Map<String, Object> data = Map.of(
                "id", this.id,
                "brand", this.brand,
                "model", this.model,
                "color", this.color,
                "owner", this.owner);

        try {
            return om.writerWithDefaultPrettyPrinter().writeValueAsString(data);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static Car deserialize(String json) throws IOException {
        ObjectMapper om = new ObjectMapper();
        return  om.readValue(json, Car.class);
    }
    // END
}
