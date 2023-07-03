package Factory;

public class Origin_Factory extends Notebook_Factory{

    @Override
    Notebook create_Notebook(String name)  {
        switch (name) {
           case "Gram" : return new Gram();
            case "Msi" : return new Msi();
            case "Galaxy" : return new Galaxy();
        }
        return null; // 해당하는 객체를 생성하지 못하는 경우 예외처리

    }

}
