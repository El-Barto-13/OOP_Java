package OOP_HW2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements MarketBehavior, QueueBehavior {

    int size;

    String name;

    private int fill;

    private void setFill() {
        this.fill = 0;
    }

    private Queue<String> marketqueue = new LinkedList<>();

    List<String> stock = new ArrayList<>();

    Market() {                //Дефолтная иницализация

    }

    Market(String name, int size) {          //Параметризированная инициализация
        this.name = name;
        this.size = size;
    }


    void greetings () {
        System.out.println("Добро пожаловать в наш превосходный магазин кондитерских изделий и выпечки -  " + name);
    }

    /**
     * Этот метод имитирует выдачу продукта указанному человеку и выводит его из очереди
     */
    void giveProduct(String Person, List<String> product, String productName) {
        if (product.contains(productName)) {
            System.out.println("Уважаемый Покупатель " + Person + " вот ваш товар  " + productName);
            product.remove(productName);
            removePerson(Person);
        } else System.out.println("Такого товара нет в наличии, попробуйте подобрать другой");
    }

    /**
     * Этот метод проверки полон ли магазин
     */
    private boolean isMarketFull() {
        return fill == size;
    }


    @Override
    public void getIn() {
        if (!isMarketFull()) {
            fill += 1;
        } else {
            System.out.println("Извините, на данный момент в торговой точке нет места, приходите позже!");
        }
        update();
    }

    @Override
    public void getOut() {
        if (fill > 0) {
            fill -= 1;
        }
        update();
    }

    @Override
    public void update() {
        System.out.println("На данный момент в магазине " + fill + " клиент");
    }

    @Override
    public void checkQueueStatus() {
        System.out.println("На данный момент в очереди " + marketqueue.size() + " клиент");
    }

    @Override
    public void putPerson(String person) {
        if (!isMarketFull()) {
            marketqueue.add((String) person);
        } else {
            System.out.println("Дождитесь пожалуйста, своей очереди!");
        }
        checkQueueStatus();
    }

    @Override
    public void removePerson(String person) {
        if (fill != 0) {
            marketqueue.remove(person);
            System.out.println("До встречи Amigo!");
        }
        checkQueueStatus();
    }
}