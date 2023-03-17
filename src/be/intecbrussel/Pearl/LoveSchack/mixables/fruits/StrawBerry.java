package be.intecbrussel.Pearl.LoveSchack.mixables.fruits;

public class StrawBerry extends Fruit{
    public StrawBerry(double pricePerPiece) {
        super(pricePerPiece);
    }

    @Override
    public void mix() {
        System.out.println("Strawberryis Mashed and added");

    }
}
