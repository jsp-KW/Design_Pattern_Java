package SingleTon;

public class Singleton {
    private static Singleton instance; // 클래스 변수 instance 선언
    // 모든 인스턴스들이 공유하는 변수.

    private Singleton() {
        // 생성자는 private으로 선언하여 외부에서 객체생성을 막는다.
    }


    // 멀티 스레드 환경, 동시에 실행될 경우
    // double checked locking pattern

    public static Singleton getInstance() {
        // instance 가 생성되지 않은 경우
        if(instance ==null) {
            // 여러 Thread가 동시에 access하지 못하게
            synchronized (Singleton.class) {    // 다른 Thread가 이미 instance를 생성한 경우 현재 thread가 access할 때

                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance; // 이미 생성되있는 경우 instance를 반환
    }


    // 객체의 고유한 값 hashcode를 출력함으로써 같은 객체를 참조하고있다.
    // System.identityHashCode()는 hashCode()와 다르게 오버라이딩이 없기때문.

    public void doSomething() {
        System.out.println("Singleton instance hash code: " +System.identityHashCode(instance));
    }
}
