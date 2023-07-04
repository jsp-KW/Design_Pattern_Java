package TemplateMethod;

public class TemplateMethod_Pattern {
    public static void main(String[] args) {
        AbstractClass ab = new ConcreteClass(); // 추상클래스를 직접 인스턴스화할 수 없기에
        ab.templateMethod();
    }
}
