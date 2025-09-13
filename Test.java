import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {
    // Метод, который возвращает результат сложения последних двух цифр числа "x"
    public int sumLastNums (int x) {
        int i = 2;
        int y = 0;
        int result = 0;
        while (i != 0) {
            i -= 1;
            y = x % 10;
            x /= 10;
            result += y;
        }
        return result;
    }

    // Метод, который возвращает true, если число положительное
    public boolean isPositive (int x) {
        return x > 0;
    }

    // Метод, который возвращает true, если буква заглавная
    public boolean isUpperCase (char x) {
        return Character.isUpperCase(x);
    }

    // Метод, который возвращает true, если любое из принятых чисел делит другое нацело
    public boolean isDivisor (int a, int b) {
        try {
            return a % b == 0 || b % a == 0;
        }
        catch (ArithmeticException e) {
            return false;
        }
    }

    // Метод, который складывает последние цифры чисел
    public int lastNumSum(int a, int b) {
        return a % 10 + b % 10;
    }

    // Метод, который возвращает деление x на y
    public double safeDiv (int x, int y) {
        if (y==0) {
            return y;
        }
        return (double) x / y;
    }

    // Метод, который сравнивает два числа между собой
    public String makeDecision (int x, int y) {
        if (x > y) {
            return x + ">" + y;
        }

        else if (x < y) {
            return x + "<" + y;
        }

        else {
            return x + "==" + y;
        }
    }

    // Метод, который возвращает true если из складывания любых двух чисел можно получить третье
    public boolean sum3 (int x, int y, int z) {
        return x + y == z || x + z == y || y + z == x;
    }

    // Метод, который возвращает строку с числом и одно из слов год/года/лет
    public String age (int x) {
        if (x % 10 == 1 & x != 11) {
            return x + " год";
        }

        else if (x % 10 == 2 || x % 10 == 3 || x % 10 == 4 & x != 12 & x != 13 & x != 14) {
            return x + " года";
        }

        else {
            return x + " лет";
        }
    }

    // Метод, который последовательно выводит дни недели после введённого пользователем, включительно
    public void printDays (String x) {
        switch (x) {
            case "понедельник": System.out.println("понедельник");
            case "вторник": System.out.println("вторник");
            case "среда": System.out.println("среда");
            case "четверг": System.out.println("четверг");
            case "пятница": System.out.println("пятница");
            case "суббота": System.out.println("суббота");
            case "воскресенье": System.out.println("воскресенье"); break;

            default:
                System.out.println("Это не день недели!");
                break;

        }
    }

    // Метод, который выводит числа от "x" до 0 включительно
    public String reverseListNums (int x) {
        for (int i = x; i >= 0; i--) {
            System.out.println(i);
        }
        return "";
    }

    // Метод, который возводит число 'x' в степень 'y' с помощью цикла
    public int pow (int x, int y) {
        int i = x;
        while (y > 1) {
            y -= 1;
            x *= i;
        }
        return x;
    }

    // Метод, который перебирает все цифры в числе 'x' и выводит true, если они одинаковые
    public boolean equalNum (int x) {
        int y = x % 10;
        int z = 0;
        while (x != 0) {
            z = x % 10;
            if (z == y) {
                x /= 10;
            }
            else {
                return false;
            }
        }
        return true;
    }

    // Метод, который строит треугольник из звёздочек с помощью цикла for
    public void leftTriangle (int x) {
        String star = "*";
        String repeats = null;
         for (int i = 1; i <= x; i++) {
             repeats = star.repeat(i);
             System.out.println(repeats);
         }
    }

    // Метод, который загадывает число от 0 до 9 и запускается заново до тех пор, пока пользователь не угадает число
    public void guessGame() {
        int user_try = 0;
        Random rand = new Random();
        int answer = rand.nextInt(0,10);
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Угадайте какая цифра от 0 до 9 была задана: ");
            int user_input = scanner.nextInt();

            if (user_input == answer) {
                user_try += 1;
                if (user_try % 10 == 1 & user_try != 11) {
                    System.out.println("Поздравляем, вы угадали число за " + user_try + " попытку!");
                    break;
                }

                else if (user_try % 10 == 2 || user_try % 10 == 3 || user_try % 10 == 4 & user_try != 12  & user_try != 13  & user_try != 14) {
                    System.out.println("Поздравляем, вы угадали число за " + user_try + " попытки!");
                    break;
                }

                else {
                    System.out.println("Поздравляем, вы угадали число за " + user_try + " попыток!");
                    break;
                }
            }

            else if (user_input > 9 || user_input < 0) {
                System.out.println("Вы ввели число, которого нет в выборе!");
            }

            else {
                System.out.println("Вы не угадали, попробуйте ещё раз!");
                user_try += 1;
            }
        }
    }

    // Метод, который находит последний индекс заданного числа в массиве
    public int findLast (int[] arr, int x) {
        int result = -1;
        for (int el = arr.length - 1; el > 0; el--) {
            if (arr[el] == x) {
                result = el;
                break;
            }
        }
        return result;
    }

    // Метод, который вставляет число 'x' на место заданного индекса pos
    public int[]add (int[] arr, int x, int pos) {
        arr[pos] = x;
        return arr;
    }

    // Метод, который переставляет элементы массива задом-наперёд
    public void reverse (int[] arr) {
        int [] new_arr = new int[arr.length];
        int el = 0;
        for (int rev_el = arr.length - 1; rev_el > -1; rev_el--) {
            new_arr[el] = arr[rev_el];
            el += 1;
        }
        System.out.print(Arrays.toString(new_arr));
    }

    // Метод, который склеивает два массива в один новый
    public int[] concat (int[] arr1,int[] arr2) {
        int index = 0;
        int [] both_arr = new int[arr1.length + arr2.length];

        for (int el : arr1) {
            both_arr[index] = el;
            index++;
        }

        for (int el : arr2) {
            both_arr[index] = el;
            index++;
        }
        return both_arr;
    }

    // Метод, который убирает из массива отрицательные числа
    public int[] deleteNegative (int[] arr) {
        int index = 0;
        int negative_count = 0;
        for (int el : arr) {
            if (el < 0) {
                negative_count += 1;
            }
        }
        int [] clear_arr = new int[arr.length - negative_count];
        for (int el : arr) {
            if (el > 0) {
                clear_arr[index] = el;
                index++;
            }
        }
        return clear_arr;
    }
}
