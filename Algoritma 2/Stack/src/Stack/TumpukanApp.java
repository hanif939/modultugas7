package Stack;

public class TumpukanApp {
    public static void main (String [] args){
        Tumpukan tumpukan=new Tumpukan(10);
        tumpukan.push(50);
        tumpukan.baca();
        tumpukan.push(100);
        tumpukan.baca();
        long nilai1=tumpukan.pop();
        System.out.println("nilai1 = "+nilai1);
        System.out.println(" ");
        tumpukan.push(60);
        tumpukan.baca();
        tumpukan.push(80);
        tumpukan.baca();
        System.out.println("nilai1 = "+nilai1);
        System.out.println(" ");
    }
}
