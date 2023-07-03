package Factory;
// 참고한 블로그 주소 https://jdm.kr/blog/180
public class Factory_pattern_main {

    public static void main(String[] args) {
        //
        Notebook_Factory nf = new Origin_Factory();
        Notebook lg = nf.create_Notebook("Gram");
        Notebook samsung = nf.create_Notebook("Galaxy");
        Notebook msi = nf.create_Notebook("Msi");

        System.out.println(lg.getModelName());
        System.out.println(samsung.getModelName());
        System.out.println(msi.getModelName());

        Notebook_Factory nf1 = new Upgrade_Factory();
        Notebook next_lg = nf1.create_Notebook("Factory.Gram");
        Notebook next_samsung = nf1.create_Notebook("Factory.Galaxy");
        Notebook next_msi = nf1.create_Notebook("Factory.Msi");

        System.out.println(next_lg.getModelName());
        System.out.println(next_samsung.getModelName());
        System.out.println(next_msi.getModelName());
    }
}
