package TemplateMethod;

public abstract class AbstractClass {

    public void templateMethod(){
            stepOne();
            stepTwo();
            stepThree();
        }
        abstract void stepOne();

        void stepTwo () {
            System.out.println("추상 클래스 2단계 실행");
        }

        abstract void stepThree() ;

}
