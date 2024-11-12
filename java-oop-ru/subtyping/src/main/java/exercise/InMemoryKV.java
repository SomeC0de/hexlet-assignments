package exercise;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;

// BEGIN
public class InMemoryKV implements KeyValueStorage {
    private HashMap<String, String> storage;

    public InMemoryKV() {
        storage = new HashMap<>();
    }

    public InMemoryKV(Map<String, String> input) {
        storage = new HashMap<>();

        for (Map.Entry<String, String> entry : input.entrySet()) {
            storage.put(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public void set(String key, String value) {
        Objects.requireNonNull(storage);
        storage.put(key, value);
    }
    @Override
    public void unset(String key) {
        Objects.requireNonNull(storage);

        if (storage.containsKey(key)) {
            storage.remove(key);
        }
    }

    @Override
    public String get(String key, String defaultValue) {
        Objects.requireNonNull(storage);
        Objects.requireNonNull(defaultValue);

        return storage.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        Map<String, String> storageCopy = new HashMap<>(storage);
        return storageCopy;
    }
}
// END
