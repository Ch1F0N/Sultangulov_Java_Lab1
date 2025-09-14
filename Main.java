import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Test lab1Method = new Test();
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Меню заданий:\n" +
                        "=======МЕТОДЫ=======\n" +
                        "1. Сумма знаков\n" +
                        "2. Есть ли позитив\n" +
                        "3. Большая буква\n" +
                        "4. Делитель\n" +
                        "5. Многократный вызов\n" +
                        "=======УСЛОВИЕ=======\n" +
                        "6. Безопасное деление\n" +
                        "7. Строка сравнения\n" +
                        "8. Тройная сумма\n" +
                        "9. Возраст\n" +
                        "10. Вывод дней недели\n" +
                        "========ЦИКЛЫ========\n" +
                        "11. Числа наоборот\n" +
                        "12. Степень числа\n" +
                        "13. Одинаковость\n" +
                        "14. Левый треугольник\n" +
                        "15. Угадайка\n" +
                        "=======МАССИВЫ=======\n" +
                        "16. Поиск последнего значения\n" +
                        "17. Добавление в массив\n" +
                        "18. Реверс\n" +
                        "19. Объединение\n" +
                        "20. Удалить негатив\n" +
                        "=====================\n" +
                        "0. Выход\n");

                System.out.print("Выберите задание из меню, которое хотите запустить: ");
                int task_menu = scanner.nextInt();
                System.out.println();

                if (task_menu == 0) {
                    break;
                }

                switch (task_menu) {
                    case 1:
                        // Сумма знаков
                        System.out.println("Складываем последние 2 цифры числа 'x' между собой!");
                        System.out.print("Введите целое число x (Знаков в числе должно быть не менее двух): ");
                        int userNum1 = scanner.nextInt();
                        String strUserNum = Integer.toString(userNum1);

                        if (strUserNum.length() < 2) {
                            System.out.println("Число x должно состоять как минимум из двух знаков!");
                            break;
                        }

                        System.out.println("Сумма двух последних чисел вашего числа " + userNum1 + ": " + lab1Method.sumLastNums(userNum1));
                        System.out.println();
                        break;

                    case 2:
                        // Есть ли позитив
                        System.out.println("Определяем, является ли число положительным или нет! (true/false)");
                        System.out.print("Введите целое число x: ");
                        int userNum2 = scanner.nextInt();
                        System.out.println("Ответ: " + lab1Method.isPositive(userNum2));
                        System.out.println();
                        break;

                    case 3:
                        // Большая буква
                        System.out.println("Определяем, является ли буква заглавной или нет! (true/false)");
                        System.out.print("Введите букву: ");
                        char letter = scanner.next().charAt(0);
                        System.out.println("Ответ: " + lab1Method.isUpperCase(letter));
                        System.out.println();
                        break;

                    case 4:
                        // Делитель
                        System.out.println("Определяем, делится ли одно число на другое нацело или нет! (true/false)");
                        System.out.println("Введите целые числа a и b через Enter: ");
                        System.out.print("a: ");
                        int firstNum4 = scanner.nextInt();
                        System.out.print("b: ");
                        int secondNum4 = scanner.nextInt();
                        System.out.println("Ответ: " + lab1Method.isDivisor(firstNum4, secondNum4));
                        System.out.println();
                        break;

                    case 5:
                        // Многократный вызов
                        System.out.println("Складываем последние цифры 5 чисел между собой!");
                        System.out.println("Введите целые числа a и b через Enter: ");
                        int i = 1;
                        System.out.println(i + ")");
                        i += 1;
                        System.out.print("a: ");
                        int firstNum5 = scanner.nextInt();
                        System.out.print("b: ");
                        int secondNum5 = scanner.nextInt();
                        int result = lab1Method.lastNumSum(firstNum5, secondNum5);
                        System.out.println("Ответ: " + result);
                        while (i != 5) {
                            System.out.println(i + ")");
                            System.out.print("Введите ещё одно число: ");
                            secondNum5 = scanner.nextInt();
                            System.out.println("Ответ: " + lab1Method.lastNumSum(result, secondNum5));
                            result = lab1Method.lastNumSum(result, secondNum5);
                            i += 1;
                        }
                        System.out.println();
                        break;

                    case 6:
                        // Безопасное деление
                        System.out.println("Делим два числа между собой!");
                        System.out.println("Введите целые числа x и y через Enter: ");
                        System.out.print("x: ");
                        int firstNum6 = scanner.nextInt();
                        System.out.print("y: ");
                        int secondNum6 = scanner.nextInt();
                        System.out.println("Ответ: " + lab1Method.safeDiv(firstNum6, secondNum6));
                        System.out.println();
                        break;

                    case 7:
                        // Строка сравнения
                        System.out.println("Сравниваем два числа между собой!");
                        System.out.println("Введите целые числа x и y через Enter: ");
                        System.out.print("x: ");
                        int firstNum7 = scanner.nextInt();
                        System.out.print("y: ");
                        int secondNum7 = scanner.nextInt();
                        System.out.println("Ответ: " + lab1Method.makeDecision(firstNum7, secondNum7));
                        System.out.println();
                        break;

                    case 8:
                        // Тройная сумма
                        System.out.println("Определяем, получится ли сложив два числа получить третье! (true/false)");
                        System.out.println("Введите целые числа x, y и z через Enter: ");
                        System.out.print("x: ");
                        int firstNum8 = scanner.nextInt();
                        System.out.print("y: ");
                        int secondNum8 = scanner.nextInt();
                        System.out.print("z: ");
                        int thirdNum8 = scanner.nextInt();
                        System.out.println("Ответ: " + lab1Method.sum3(firstNum8, secondNum8, thirdNum8));
                        System.out.println();
                        break;

                    case 9:
                        // Возраст
                        System.out.println("Определяем какое слово (год/года/лет) будет стоять после вашего числа!");
                        System.out.print("Введите целое число x: ");
                        int userAge = scanner.nextInt();
                        System.out.println("Ответ: " + lab1Method.age(userAge));
                        System.out.println();
                        break;

                    case 10:
                        // Вывод дней недели
                        System.out.println("Выводим названия дней недели!");
                        System.out.print("Введите день недели: ");
                        scanner.nextLine();
                        String week = scanner.nextLine();
                        System.out.println("Ответ: ");
                        lab1Method.printDays(week);
                        System.out.println();
                        break;

                    case 11:
                        // Числа наоборот
                        System.out.println("Выводим строки от числа x до 0!");
                        System.out.print("Введите число x: ");
                        int reverseNum = scanner.nextInt();
                        System.out.println("Ответ: ");
                        lab1Method.reverseListNums(reverseNum);
                        System.out.println();
                        break;

                    case 12:
                        // Степень числа
                        System.out.println("Возводим число 'x' в степень 'y'!");
                        System.out.print("Введите число x: ");
                        int normal = scanner.nextInt();
                        System.out.print("Введите число y: ");
                        int exponent = scanner.nextInt();
                        System.out.println("Ответ: " + lab1Method.pow(normal, exponent));
                        System.out.println();
                        break;

                    case 13:
                        // Одинаковость
                        System.out.println("Определяем, все ли цифры в числе 'x' одинаковые! (true/false)");
                        System.out.print("Введите число x: ");
                        int same = scanner.nextInt();
                        System.out.println("Ответ: " + lab1Method.equalNum(same));
                        System.out.println();
                        break;

                    case 14:
                        // Левый треугольник
                        System.out.println("Строим треугольник из звёздочек!");
                        System.out.print("Введите число x: ");
                        int triangle = scanner.nextInt();
                        System.out.println("Ответ: ");
                        lab1Method.leftTriangle(triangle);
                        System.out.println();
                        break;

                    case 15:
                        // Угадайка
                        System.out.println("Играем в угадайку!");
                        lab1Method.guessGame();
                        System.out.println();
                        break;

                    case 16:
                        // Поиск последнего значения
                        System.out.println("Находим последний индекс вхождения числа 'x' в массив!");
                        System.out.print("Введите длину массива: ");
                        int userLenght16 = scanner.nextInt();
                        int[] userArray16 = new int[userLenght16];

                        System.out.print("Введите элементы массива через пробел: ");
                        for (int el = 0; el < userLenght16; el++) {
                            userArray16[el] = scanner.nextInt();
                        }

                        System.out.println("Исходный массив: " + Arrays.toString(userArray16));

                        System.out.print("Введите число x: ");
                        int userNum16 = scanner.nextInt();
                        System.out.println("Индекс вашего числа в массиве: " + lab1Method.findLast(userArray16, userNum16));
                        System.out.println();
                        break;

                    case 17:
                        // Добавление в массив
                        System.out.println("Вставляем ваше число 'x' на выбранное вами место в массиве!");
                        System.out.print("Введите длину массива: ");
                        int userLenght17 = scanner.nextInt();
                        int[] userArray17 = new int[userLenght17];

                        System.out.print("Введите элементы массива через пробел: ");
                        for (int el = 0; el < userLenght17; el++) {
                            userArray17[el] = scanner.nextInt();
                        }

                        System.out.println("Исходный массив: " + Arrays.toString(userArray17));

                        System.out.print("Введите число x: ");
                        int userNum17 = scanner.nextInt();

                        System.out.print("Введите индекс числа в массиве на месте которого будет стоять число 'x': ");
                        int pos = scanner.nextInt();
                        System.out.println("Новый массив с заменой числа: " + Arrays.toString(lab1Method.add(userArray17, userNum17, pos)));
                        System.out.println();
                        break;

                    case 18:
                        // Реверс
                        System.out.println("Делаем ваш массив задом наперёд!");
                        System.out.print("Введите длину массива: ");
                        int userLenght18 = scanner.nextInt();
                        int[] userArray18 = new int[userLenght18];

                        System.out.print("Введите элементы массива через пробел: ");
                        for (int el = 0; el < userLenght18; el++) {
                            userArray18[el] = scanner.nextInt();
                        }

                        System.out.println("Исходный массив: " + Arrays.toString(userArray18));
                        System.out.print("Массив задом-наперёд: ");
                        lab1Method.reverse(userArray18);
                        System.out.println("\n");
                        break;

                    case 19:
                        // Объединение
                        System.out.println("Склеиваем два ваших массива в один!");
                        System.out.print("Введите длину массива: ");
                        int userLenght19 = scanner.nextInt();
                        int[] userArray19 = new int[userLenght19];
                        int[] userArray192 = new int[userLenght19];

                        System.out.print("Введите элементы первого массива через пробел: ");
                        for (int el = 0; el < userLenght19; el++) {
                            userArray19[el] = scanner.nextInt();
                        }

                        System.out.print("Введите элементы второго массива через пробел: ");
                        for (int el = 0; el < userLenght19; el++) {
                            userArray192[el] = scanner.nextInt();
                        }

                        System.out.println("Ваш новый массив: " + Arrays.toString(lab1Method.concat(userArray19, userArray192)));
                        System.out.println();
                        break;

                    case 20:
                        // Удалить негатив
                        System.out.println("Убираем отрицательные числа из вашего массива!");
                        System.out.print("Введите длину массива: ");
                        int userLenght20 = scanner.nextInt();
                        int[] userArray20 = new int[userLenght20];

                        System.out.print("Введите элементы массива через пробел: ");
                        for (int el = 0; el < userLenght20; el++) {
                            userArray20[el] = scanner.nextInt();
                        }

                        System.out.println("Исходный массив: " + Arrays.toString(userArray20));

                        System.out.println("Ваш новый массив: " + Arrays.toString(lab1Method.deleteNegative(userArray20)));
                        System.out.println();
                        break;
                }
            }

            catch(InputMismatchException e){
                System.out.println("Вы должны ввести только целое число!");
                System.out.println();
            }
        }
    }
}