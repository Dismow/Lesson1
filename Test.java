package Lesson1;

public class Test {
    public static void main(String[] args) {
        Sword<Iron> sword = new Sword<>();
        Iron steel = new Iron();
        sword.setMaterial(steel);
        System.out.println(sword.checkProtection());
    }
}
