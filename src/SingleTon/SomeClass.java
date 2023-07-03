package SingleTon;

public class SomeClass {
    public static void main (String[] args) {
        Singleton s1 = Singleton.getInstance();
       // Singleton s = new Singleton(); // private한 생성자 이므로.
        Singleton s2 = Singleton.getInstance();

        s1.doSomething();
        s2.doSomething();




    }
}
