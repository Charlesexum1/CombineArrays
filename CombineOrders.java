import java.util.Scanner;
import java.util.Scanner;
public class CombineOrders {
	
	private static int[] firstOrder = new int[5];
	private static int[] secondOrder = new int[5];
	private static int[] totalOrder = new int[5];
	
	private void placeOrder() {
		Scanner keys = new Scanner(System.in);
		System.out.println("Place the first order (5)");
		for (int x = 0; x < totalOrder.length; x++) {
			firstOrder[x] = keys.nextInt();
			}
		System.out.println("place the second order (5)");
		for (int x = 0; x < totalOrder.length; x++) {
			secondOrder[x] = keys.nextInt();
			}		
		}
	private void pushOrder() {
		for (int x = 0; x < totalOrder.length; x++) {
			totalOrder[x] += firstOrder[x];
			totalOrder[x] += secondOrder[x];
			}
		}
	public static void main(String[] args) {
		CombineOrders demo = new CombineOrders();
		demo.placeOrder();
		demo.pushOrder();
		System.out.println(totalOrder[1]);
		}	
	
	}
