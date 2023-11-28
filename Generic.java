public class Generic {
    public static void main(String[] args) {
        // Sử dụng Box với kiểu Integer
        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(42);
        System.out.println("Integer Value: " + integerBox.getValue());

        // Sử dụng Box với kiểu String
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello, Generics!");
        System.out.println("String Value: " + stringBox.getValue());

        // Object <T,U>
        Message<Box<String>, Box<Integer>> message =
                new Message<>(stringBox, integerBox);

        System.out.println(message.toString());
        ;
    }
}
