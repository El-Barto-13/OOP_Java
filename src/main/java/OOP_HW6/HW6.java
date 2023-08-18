package OOP_HW6;

public class HW6 {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        InputReader inputReader = new InputReader();
        OrderFileWriter orderFileWriter = new OrderFileWriter();
        JsonSerializer jsonSerializer = new JsonSerializer();

        String clientName = inputReader.readInput("Имя клиента: ");
        String product = inputReader.readInput("Продукт: ");
        int qnt = Integer.parseInt(inputReader.readInput("Количество: "));
        int price = Integer.parseInt(inputReader.readInput("Цена: "));

        Order order = new Order(clientName, product, qnt, price);

        String jsonContent = jsonSerializer.serialize(order);
        orderFileWriter.writeToFile("order.json", jsonContent);
    }
}
