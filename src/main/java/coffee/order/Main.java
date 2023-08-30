package coffee.order;

public class Main {
    public static void main(String[] args) {

        CoffeeOrderBoard orderBoard = new CoffeeOrderBoard();

        orderBoard.add(new Order(1, "Alen"));
        orderBoard.add(new Order(2,"Yoda"));
        orderBoard.add(new Order(3, "Obi-van"));
        orderBoard.add(new Order(4, "John Snow"));

        orderBoard.draw();
        orderBoard.deliver();
        orderBoard.draw();
        orderBoard.deliver(2);
        orderBoard.draw();
    }
}