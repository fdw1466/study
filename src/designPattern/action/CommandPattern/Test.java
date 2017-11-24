package designPattern.action.CommandPattern;

/**
 * 命令模式（行为型模式）
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Stock stock = new Stock();

		BuyStock buyStock = new BuyStock(stock);
		SellStock sellStock = new SellStock(stock);

		Broker broker = new Broker();
		broker.takeOrder(buyStock);
		broker.takeOrder(sellStock);

		broker.placeOrder();
	}
}
