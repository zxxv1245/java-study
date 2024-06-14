package ref.ex;

public class ProductMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        orders[0] = createProductOrder("두부", 2000,2);
        orders[1] = createProductOrder("김치", 5000,1);
        orders[2] = createProductOrder("콜라", 1500,3);


//        ProductOrder order1 = createProductOrder("두부", 2000,2);
//        ProductOrder order2 = createProductOrder("김치", 5000,1);
//        ProductOrder order3 = createProductOrder("콜라", 1500,3);
//
//        ProductOrder[] orders = {order1,order2,order3};

        int totalAmount = getTotalAmount(orders);
        System.out.println("totalAmount = " + totalAmount);
    }

    static ProductOrder createProductOrder(String productName, int price, int quantity){
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        printProductOrder(productOrder);
        return productOrder;
    }

    static void printProductOrder(ProductOrder productOrder) {
        System.out.println(productOrder.productName + " " + productOrder.price + " " + productOrder.quantity);
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int sum = 0;
        for (ProductOrder order : orders) {
            sum += order.price * order.quantity;
        }
        return sum;
    }
}
