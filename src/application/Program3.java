package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order1;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program3 {

	/*
	 * Ler os dados de um pedido com N items(N fornecido pelo usu�rio). Depois,
	 * mostrar um sum�rio do pedido.
	 */

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter client data:");
		System.out.print("Name:");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());

		Client client = new Client(name, email, birthDate);

		System.out.println("Enter order data: ");
		System.out.print("Status:");
		OrderStatus status = OrderStatus.valueOf(sc.next());

		Order1 order = new Order1(new Date(), status, client);

		System.out.print("How many items to this order? ");
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			System.out.println("Enter #" + i + " item data: ");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price:");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity:");
			int quantity = sc.nextInt();

			Product product = new Product(productName, productPrice);

			OrderItem it = new OrderItem(quantity, productPrice, product);

			order.addItem(it);

		}

		System.out.println();
		System.out.println(order);

		sc.close();
	}

}