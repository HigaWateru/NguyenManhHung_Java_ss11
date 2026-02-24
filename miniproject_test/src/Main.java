interface IMixable {
    void mix();
}

public class Main {
    public static void main(String[] args) {
        Drink[] drinks = new Drink[3];
        drinks[0] = new Coffee("c01", "Bạc Sỉu", 30000, true);
        drinks[1] = new FruitJuice("f01", "Nước cam", 40000, 10);
        drinks[2] = null;

        for(Drink drink : drinks) if(drink != null) {
            drink.displayInfo();
            System.out.println("Thành tiền: " + drink.calculatePrice());
            System.out.println();
        }
    }
}