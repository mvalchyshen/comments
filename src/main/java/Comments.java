package main.java;

public class Comments {
    public static void main(String[] args) {
        System.out.println("Тут прога с комментариями");
        System.out.println("1. Таб\tуляция"); // \t — Символ табуляции. Напечатается несколько (обычно 4) пробела.
        System.out.println("2. My\nName\nIs\nMax"); // \n — Переход на новую строку. После этого символа весь текст будет печататься на следующей строке.
        System.out.println("3. He\'s name is Max"); // \' — Символ двойной кавычки;
        System.out.println("4. His nickanme is \"Azarn1k\""); // \” — Символ двойной кавычки;
        System.out.println("5. dividing \\"); //  \\ — Символ обратной косой черты ().
// текст без переноса строки
        System.out.print("6. ");
        System.out.print("Hello");
        System.out.print(" ");
        System.out.print("World!!");


        // Комментарий однострочный, который не видит комп. Таким образом пишем коротенький коммент
        /*
        Многострочный коммент
        Используется для написания длинных комментов.
        Хоть стихи пиши.
         */
        /**
         * Здесь описываем метод, классы и другие эл. кода.
         * Например, мы написали программу "Тут прога с комментариями"
         * @param args
         */
    }
}
