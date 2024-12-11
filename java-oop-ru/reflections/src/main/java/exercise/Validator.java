package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

// BEGIN
public class Validator {
    public static List<String> validate(Object object) {
        return Arrays.stream(object.getClass().getDeclaredFields())
                .peek(f -> f.setAccessible(true))
                .filter(f -> f.isAnnotationPresent(NotNull.class))
                .filter(f -> getFieldValue(f, object) == null)
                .map(Objects::toString)
                .map(f -> f.substring(f.lastIndexOf(".") + 1))
                .collect(Collectors.toList());
    }

    private static Object getFieldValue(Field field, Object target) {
        try {
            return field.get(target);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
// END
