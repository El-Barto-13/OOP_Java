package OOP_HW2;

import java.util.ArrayList;

public class HW2 {
    public static void main(String[] args) {
        Market market = new Market("Магазинчик Боба", 10);
        market.stock = new ArrayList<>();
        market.stock.add(0, "Торталетки");
        market.stock.add(0, "Пирожулики");
        market.stock.add(0, "Кексики");
        market.greetings();
        market.getIn();
        market.putPerson("Покупатель");
        market.giveProduct("Покупатель", market.stock, "Торталетки");
        market.getOut();
    }
}
