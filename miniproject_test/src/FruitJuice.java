public class FruitJuice extends Drink implements IMixable {
    private int discountPercent;
    public FruitJuice(String id, String name, double price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    public void mix() {
        System.out.println("Đang ép trái cây tươi");
    }

    @Override
    public double calculatePrice() {
        return price - (price * discountPercent/100);
    }
}