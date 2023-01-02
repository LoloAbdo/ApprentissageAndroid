public class Main {
    public static void main(String[] args) {
        Phone iPhone = new Phone("Iphone 11", 5, 8, 8);

        System.out.println(iPhone.getName());

        iPhone.playMusic("Burning in love");
        iPhone.playMusic("If I can Dream");

        Phone Samsung = new Phone("Samsung s20", 16);
    }
}