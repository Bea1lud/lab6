class Main {
    public static void main(String[] args) {
        System.out.println("Это добавлено в ветке main");
        sayHello();

        int result = sum(5, 10);
        System.out.println("Сумма: " + result);
    }

    public static void sayHello() {
        System.out.println("Hello, Git!");
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}