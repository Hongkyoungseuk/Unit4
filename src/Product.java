//_9
//TODO TestProduct가 작동될수 있게 Product를 완성하시오.
public class Product {
    String name;
    int number = 0;

    Product (String name) {
        this.name = name;
    }

    public void downLoad(int n) {
        // 개수(number)늘리기
        number = number + n;
    }
    public void upLoad(int n) {
        // 개수(number)줄이기
        number = number - n;
    }
    public String toString() {
        // 제품 줄력하기(예 : "의자 , 20개"
        return this.name;
    }
    
}