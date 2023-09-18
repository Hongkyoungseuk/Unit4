//_9
//TODO TestProduct가 작동될수 있게 Product를 완성하시오.
public class Product {
    String name;
    int number = 0;

    public static void downLoad() {
        //todo 개수(number)늘리기
        
    }
    public static void upLoad() {
        //todo 개수(number)줄이기

    }
    public static void toString() {
        //todo 제품 줄력하기(예 : "의자 , 20개"
    }
    
}

public class TestProduct {
    public static void main(String[] args) {
        Product lamp = new Product("Lamp 60 Watt");
        System.out.println("Before the loading: " + lamp);
        lamp.downLoad(1000);
        lamp.upLoad(100);
        System.out.println("After the loading: " + lamp);
    }   
}


