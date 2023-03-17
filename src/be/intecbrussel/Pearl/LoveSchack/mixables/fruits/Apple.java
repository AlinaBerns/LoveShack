package be.intecbrussel.Pearl.LoveSchack.mixables.fruits;

public class Apple extends Fruit{
    public Apple(double pricePerPiece) {
        super(pricePerPiece);
    }

    @Override
    public void mix() {
        System.out.println("Apple is Mashed and added");

    }


}
