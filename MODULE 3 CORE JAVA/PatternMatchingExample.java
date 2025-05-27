public class PatternMatchingExample {
    public static void main(String[] args) {
        Object obj = 123; 
        String result = switch (obj) {
            case Integer i -> "Integer with value: " + i;
            case String s -> "String with value: " + s;
            case Double d -> "Double with value: " + d;
            default -> "Unknown type";
        };

        System.out.println(result);
    }
}

