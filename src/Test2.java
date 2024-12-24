public class Test2 {
    int power(int a, int b) {
        int result = 0;
        if (b < 0) {
            System.out.println("Степень не может быть отрицательной.");
        } else {
            result = 1;
            for (int i = 1; i <= b; i++) {
                result = result * a;
            }
        }
        return result;
    }

    public static void main(String[] args){
        Test2 obj = new Test2();
        System.out.println("Ваш ответ: " + obj.power(3,-3));
    }
}
