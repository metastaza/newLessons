/*
Надо выписать числа, кратные 5, но не кратные 10, при этом не учитывая сами переменные, вписываемые с консоли
И выписать эти числа, находящиеся от первой переменной и до второй переменной
 */

package newLessons;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // создаем сканнер для считывания с консоли

        int a = scanner.nextInt(); // создаем переменные, считываемые с консоли
        int b = scanner.nextInt(); //

        for(int i = a + 1; i < b; i++){ // создаем цикл, в него вписываем условия - создаем переменную, которая равна считываемой переменной и добавляем 1
                                        // чтобьы она не была равна самой переменной, следующие условие - если переменная меньше следующей считываемой переменной
                                        // то увеличиваем первую переменную постоянно на +1 до выолнения второго условия
            if(i % 5 == 0 && i % 10 != 0){  // создаем условный оператор, вписываем в него нашу итоговую переменную, заданную в цикле
                                            // выясняем остаток от деления переменной от пяти и приравнием к нулю
                                            // также если переменная кратна десяти но не равна нулю
                System.out.print(i + " ");  // выводим на экран
            }
        }
    }
}
