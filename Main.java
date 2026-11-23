class Main {
    public static void main(String[] args) {
        System.out.println("Это добавлено в ветке main");
        sayHello();

        int result = sum(5, 10);
        System.out.println("Сумма: " + result);

        int product = multiply(5, 10);
        System.out.println("Произведение: " + product);

        int difference = subtract(10, 5);
        System.out.println("Разность: " + difference);
    }

    public static void sayHello() {
        System.out.println("Hello, Git!");
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }
}