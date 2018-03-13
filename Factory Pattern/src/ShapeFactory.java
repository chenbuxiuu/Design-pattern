
public class ShapeFactory {
    public static <T> T getClass(Class<? extends T> clazz) {
        T obj = null;

        try {
            obj = (T) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        } 

        return obj;
    }
}