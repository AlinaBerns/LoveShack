package be.intecbrussel.Pearl.LoveSchack.mixables.vegetabels;

public class Spinache extends Vegetable{
    public Spinache(double pricePerPiece) {
        super(pricePerPiece);
    }

    @Override
    public void mix() {
        System.out.println("Spinache is Mashed and added");

    }
}
