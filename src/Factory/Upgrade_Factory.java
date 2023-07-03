package Factory;

public class Upgrade_Factory extends Notebook_Factory {
    @Override
    Notebook create_Notebook(String name) {
        try{
            Class<?> c = Class.forName(name);// 동적으로 클래스를 로드하기 위한 method, 해당 Class 객체를 반환
            Object obj  = c.newInstance(); // 클래스 객체 c를 이용하여 새로운 인스턴스 생성 메서드 호출하여 Object 타입의 변수에 저장
            return (Notebook) obj;
        }catch (Exception e) {
            return null;
        }
    }
}
