package OOP_HW6;

public class JsonSerializer {

    public String serialize(Order order) {
        return "{" +
                "\"clientName\":\"" + order.getClientName() + "\"," +
                "\"product\":\"" + order.getProduct() + "\"," +
                "\"qnt\":" + order.getQnt() + "," +
                "\"price\":" + order.getPrice() +
                "}";
    }
}
