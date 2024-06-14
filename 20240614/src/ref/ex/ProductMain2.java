package ref.ex;

import java.util.Scanner;

public class ProductMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요 : ");
        int N = scanner.nextInt();

        ProductOrder[] orders = new ProductOrder[N];

        for (int i = 0; i < N; i++){
            scanner.nextLine();
            System.out.print("상품명 입력 : ");
            String productName = scanner.nextLine();
            System.out.print("상품 가격 입력 : ");
            int price = scanner.nextInt();
            System.out.print("상품 갯수 입력 : ");
            scanner.nextLine();
            int quantity = scanner.nextInt();
            orders[i] = createProductOrder(productName,price,quantity);

        }



//        ProductOrder order1 = createProductOrder("두부", 2000,2);
//        ProductOrder order2 = createProductOrder("김치", 5000,1);
//        ProductOrder order3 = createProductOrder("콜라", 1500,3);
//
//        ProductOrder[] orders = {order1,order2,order3};

        printProductOrder(orders);

        int totalAmount = getTotalAmount(orders);
        System.out.println("totalAmount = " + totalAmount);
    }

    static ProductOrder createProductOrder(String productName, int price, int quantity){
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;

        return productOrder;
    }

    static void printProductOrder(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println(order.productName + " " + order.price + " " + order.quantity);

        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int sum = 0;
        for (ProductOrder order : orders) {
            sum += order.price * order.quantity;
        }
        return sum;
    }
}
