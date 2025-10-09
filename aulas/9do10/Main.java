

public class Main {
    public static void main(String[] args) {
        Conta c=new Conta("Jamires",123,10);
        Conta c2= new Conta(123,25);
        Conta c3= new Conta("Felipe");
        Conta c4=new Conta(555);
        System.out.println(c.num);
        System.out.println(c.titular);
        System.out.println(c2.num);
        System.out.println(c3.titular);
        System.out.println(c4.num);
    }
}