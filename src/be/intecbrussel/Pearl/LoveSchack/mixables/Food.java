package be.intecbrussel.Pearl.LoveSchack.mixables;

public abstract class Food implements Mixable{

    double pricePerPiece;

    public Food(double pricePerPiece) {
        this.pricePerPiece = pricePerPiece;
    }

    public double getPricePerPiece() {
        return pricePerPiece;
    }

    @Override
    public String toString() {
        return "Food{" +
                "pricePerPiece=" + pricePerPiece +
                '}';
    }
}
