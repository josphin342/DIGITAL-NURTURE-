import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) {
        try {

            Class<?> clazz = Class.forName("java.util.ArrayList");
            Method[] methods = clazz.getDeclaredMethods();
            System.out.println("Methods in " + clazz.getName() + ":");
            for (Method method : methods) {
                System.out.println(method.getName());
            }

            Object instance = clazz.getDeclaredConstructor().newInstance();
            Method addMethod = clazz.getMethod("add", Object.class);
            addMethod.invoke(instance, "Hello Reflection");

            System.out.println("Instance after invocation: " + instance);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

