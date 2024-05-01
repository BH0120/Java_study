package classpath;

class Item {
    public void print() {
        System.out.println("Hello world");
    }
}
public class ClasspathDemo {
    public static void main(String[] args) {
        Item item = new Item();
        item.print();
    }
}
