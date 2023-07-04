package TemplateMethod;

public class ConcreteClass extends AbstractClass{

    @Override
    void stepOne() {
        System.out.println("추상 클래스를 구현한 클래스에서 단계 1의 함수를 오버라이딩");
    }

    @Override
    void stepThree() {
        System.out.println("추상 클래스를 구현한 클래스에서 단계 3의 함수를 오버라이딩");
    }
}
