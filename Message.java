public class Message<T,U> {
    T object1;
    U object2;

    Message(T object1, U object2){
        this.object1 = object1;
        this.object2 = object2;
    }

    @Override
    public String toString() {
        return "Message{" +
                "object1=" + object1 +
                ", object2=" + object2 +
                '}';
    }
}
