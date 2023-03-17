package be.intecbrussel.Pearl.LoveSchack.mixables.fruits;

public class Lemon extends Fruit{
    public Lemon(double pricePerPiece) {
        super(pricePerPiece);
    }

    @Override
    public void mix() {
        System.out.println("Lemon Is pressed and added");

    }

}
