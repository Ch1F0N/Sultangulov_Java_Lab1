# Лабораторная работа №1 ЯП Java
**Султангулов Данил**

**Группа ИТ-9-2024 (2 курс)**

**Вариант №10 (Чётные номера задач)**

---

# Тема: Процедурное программирование

Сперва я создал в своей лабораторной работе меню со всеми задания от 1 до 20, а также разделил их все на категории, чтобы пользователю было удобно выбирать, какую именно из программ он хочет использовать:

```java
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
```

Если пользователь введёт номер, которого нет в меню, или введёт иные символы, то в терминале вылезет предупреждение о неверном вводе и меню запуститься заново, чтобы выйти из программы, пользователю достаточно ввести в терминал '0'. Для запуска конкретной программы, я решил использовать конструкцию swith-case.

---

## Задача 1 (Сумма знаков.):
> **Задача 1 заключается в том, чтобы в числе, которое вводит пользователь, складывались две последние цифры этого числа между собой и результат выводился обратно в терминал.**

Для выполнения этого задания я создал метод **public int sumLastNum(int x)**:
```java
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
```
Создаю 3 новые переменные.
```java
int i = 2;      // Переменная, которая отвечает за "шаги"
int y = 0;      // Переменная, которая хранит в себе последнюю цифру числа 'x'
int result = 0; // В эту переменную записываются результаты сложения последних цифр.
```
Запускаю цикл while, который работает до тех пор пока 'i' не станет равен нулю:
```java
while (i != 0) {      
  i -= 1;      // Каждый шаг отнимаем 1 от переменной 'i'
  y = x % 10;  // Получаем последнюю цифру от числа 'x'
  x /= 10;     // Из числа 'x' убираем последнюю цифру
  result += y; // Складываем переменную 'y' (последнюю цифру)
}
```
И возращаем полученный результат:
```java
return result;
```
---
**Реализуем пользовательский ввод**
```java
System.out.println("Складываем последние 2 цифры числа 'x' между собой!");
System.out.print("Введите целое число x (Знаков в числе должно быть не менее двух): ");
int userNum = scanner.nextInt();
String strUserNum = Integer.toString(userNum);

if (strUserNum.length() < 2) {
    System.out.println("Число x должно состоять как минимум из двух знаков!");
    break;
}
else {
    System.out.println("Сумма двух последних чисел вашего числа " + userNum + ": " + lab1Method.sumLastNums(userNum));
    System.out.println();
}
```
Проверяем, чтобы пользователь ввёл как минимум два знака, иначе возвращаем его в меню:
```java
if (strUserNum.length() < 2) {
    System.out.println("Число x должно состоять как минимум из двух знаков!");
    break;
}
```
Вызываем метод, если всё нормально:
```java
System.out.println("Сумма двух последних чисел вашего числа " + userNum + ": " + lab1Method.sumLastNums(userNum));
```

---

## Задача 2 (Есть ли позитив.):
> **Задача 2 заключается в том, чтобы программа выводила 'true', если пользователь ввёл положительное число.**

Для выполнения этого задания я создал метод **public boolean isPositive (int x)**:
```java
public boolean isPositive (int x) {
        return x > 0;
    }
```
Метод возвращает 'true', если число x > 0, т.е является положительным.

---

**Реализуем пользовательский ввод**
```java
System.out.println("Определяем, является ли число положительным или нет! (true/false)");
System.out.print("Введите целое число x: ");
userNum = scanner.nextInt();
System.out.println("Ответ: " + lab1Method.isPositive(userNum));
```

---

## Задача 3 (Большая буква.):
> **Задача 3 заключается в том, что необходимо реализовать метод таким образом, чтобы он принимал символ x и возвращал true, если это большая буква в диапазоне от ‘A’ до ‘Z’.**

Для выполнения этого задания я создал метод **public boolean isUpperCase (char x)**:
```java
public boolean isUpperCase (char x) {
    return 'A' <= x && x <= 'Z';
}
```
Метод возвращает 'true', если буква является заглавной и находится в диапозоне [A-Z]

---
**Реализуем пользовательский ввод**
```java
System.out.println("Определяем, является ли буква заглавной или нет! (true/false)");
System.out.print("Введите букву: ");
char letter = scanner.next().charAt(0);
System.out.println("Ответ: " + lab1Method.isUpperCase(letter));
```
---

## Задача 4 (Делитель.):
> **Задача 4 заключается в том, что необходимо реализовать метод таким образом, чтобы он возвращал true, если любое из принятых чисел делит другое нацело.**

Для выполнения этого задания я создал метод **public boolean isDivisor (int a, int b)**:
```java
public boolean isDivisor (int a, int b) {
    try {
        return a % b == 0 || b % a == 0;
    }
    catch (ArithmeticException e) {
        return false;
    }
}
```
Я использую конструктор try-catch, чтобы в случае деления на 0 ответ был просто false, а не ошибка.

Возвращаем true, если остаток от деления a на b или b на а был равен 0:
```java
return a % b == 0 || b % a == 0;
```

---
**Реализуем пользовательский ввод**
```java
System.out.println("Определяем, делится ли одно число на другое нацело или нет! (true/false)");
System.out.println("Введите целые числа a и b через Enter: ");
System.out.print("a: ");
int firstNum = scanner.nextInt();
System.out.print("b: ");
int secondNum = scanner.nextInt();
System.out.println("Ответ: " + lab1Method.isDivisor(firstChar, secondChar));
```
---

## Задача 5 (Многократный вызов.):
> **Задача 5 заключается в том, что необходимо реализовать метод таким образом, чтобы он считал сумму цифр двух чисел из разряда единиц. Таким методом нужно сложить подряд 5 чисел.**

Для выполнения этого задания я создал метод **public int lastNumSum(int a, int b)**:
```java
public int lastNumSum(int a, int b) {
    return a % 10 + b % 10;
}
```
Возвращаем результат складывания последней цифры числа 'a' и последней цифры числа 'b'.
```java
return a % 10 + b % 10;
```

---
**Реализуем пользовательский ввод**
```java
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
```
Запускаем цикл **while**, пока вспомогательная переменная 'i' не будет равна 5 ('i' увеличивается для нумерации действий, а также кол-ва запусков цикла):
```java
while (i != 5) {
    System.out.println(i + ")");
    System.out.print("Введите ещё одно число: ");
    secondNum5 = scanner.nextInt();
    System.out.println("Ответ: " + lab1Method.lastNumSum(result, secondNum5));
    result = lab1Method.lastNumSum(result, secondNum5);
    i += 1;
```

---


## Задача 6 (Безопасное деление.):
> **Задача 6 заключается в том, что нужно реализовать метод, который возвращает результат деления x на y, при этом избегая ошибки деления на 0.**

Для выполнения этого задания я создал метод **public double safeDiv (int x, int y)**:
```java
public double safeDiv (int x, int y) {
    if (y==0) {
        return y;
    }
    return (double) x / y;
}
```
Проверяю, равен ли y нулю, если это так, возвращаю 'y', т.е 0:
```java
if (y==0) {
        return y;
    }
```
Иначе возвращаю результат деления 'x' на 'y' с плавающей точкой:
```java
return (double) x / y;
```

---
**Реализуем пользовательский ввод**
```java
System.out.println("Делим два числа между собой!");
System.out.println("Введите целые числа x и y через Enter: ");
System.out.print("x: ");
int firstNum6 = scanner.nextInt();
System.out.print("y: ");
int secondNum6 = scanner.nextInt();
System.out.println("Ответ: " + lab1Method.safeDiv(firstNum6, secondNum6));
```
---

## Задача 7 (Строка сравнения.):
> **Задача 7 заключается в том, что метод должен сравнивать два числа между собой и выводить строку с правильно выставленным знаком (<, >, ==).**

Для выполнения этого задания я создал метод **public String makeDecision (int x, int y)**:
```java
public String makeDecision (int x, int y) {
    if (x > y) {
        return x + " > " + y;  // Если 'x' больше 'y' возвращаем строку 'x > y'
    }

    else if (x < y) {
        return x + " < " + y;  //
    }

    else {
        return x + " == " + y;  //
    }
}
```

---
**Реализуем пользовательский ввод**
```java
System.out.println("Сравниваем два числа между собой!");
System.out.println("Введите целые числа x и y через Enter: ");
System.out.print("x: ");
int firstNum7 = scanner.nextInt();
System.out.print("y: ");
int secondNum7 = scanner.nextInt();
System.out.println("Ответ: " + lab1Method.makeDecision(firstNum7, secondNum7));
```
---

## Задача 8 (Тройная сумма.):
> **Задача 8 заключается в том, чтобы метод возвращал 'true', если в результате сложения любых двух чисел можно получить третье.**

Для выполнения этого задания я создал метод **public boolean sum3 (int x, int y, int z)**:
```java
public boolean sum3 (int x, int y, int z) {
    return x + y == z || x + z == y || y + z == x;
}
```
Метод рассматривает 3 решения и если хоть одно из них подходит под условия - возвращается 'true'

---
**Реализуем пользовательский ввод**
```java
System.out.println("Определяем, получится ли сложив два числа получить третье! (true/false)");
System.out.println("Введите целые числа x, y и z через Enter: ");
System.out.print("x: ");
int firstNum8 = scanner.nextInt();
System.out.print("y: ");
int secondNum8 = scanner.nextInt();
System.out.print("z: ");
int thirdNum8 = scanner.nextInt();
System.out.println("Ответ: " + lab1Method.sum3(firstNum8, secondNum8, thirdNum8));
```
---

## Задача 9 (Возраст.):
> **Задача 9 заключается в том, чтобы реализовать метод, который возвращает строку 'число + год/года/лет'.**

Для выполнения этого задания я создал метод **public String age (int x)**:
```java
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
```
Чтобы определить какое именно слово должно стоять после числа - отделяем последнюю цифру, также учитываем числа "исключения", например 11, после которого должно стоять слово 'лет', а не 'год'

---
**Реализуем пользовательский ввод**
```java
System.out.println("Определяем какое слово (год/года/лет) будет стоять после вашего числа!");
System.out.print("Введите целое число x: ");
int userAge = scanner.nextInt();
System.out.println("Ответ: " + lab1Method.age(userAge));
```
---

## Задача 10 (Вывод дней недели.):
> **Задача 10 заключается в том, чтобы реализовать метод, который будет выводить переданный в него день недели и все последующие.**

Для выполнения этого задания я создал метод **public void printDays (String x)**:
```java
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
```
Когда пользователь вводить названия для недели - запускаем нужный кейс и спускаемся ниже (выводим кейсы после него).

---
**Реализуем пользовательский ввод**
```java
System.out.println("Выводим названия дней недели!");
System.out.print("Введите день недели: ");
scanner.nextLine();
String week = scanner.nextLine();
System.out.println("Ответ: ");
lab1Method.printDays(week);
```
---

## Задача 11 (Числа наоборот.):
> **Задача 11 заключается в том, что.**

Для выполнения этого задания я создал метод **public String reverseListNums (int x)**:
```java
public String reverseListNums (int x) {
    for (int i = x; i >= 0; i--) {
        System.out.println(i);
    }
    return "";
}
```

---
**Реализуем пользовательский ввод**

---

## Задача 12 (Степень числа.):
> **Задача 12 заключается в том, что.**

Для выполнения этого задания я создал метод **public int pow (int x, int y)**:
```java
public int pow (int x, int y) {
    int i = x;
    while (y > 1) {
        y -= 1;
        x *= i;
    }
    return x;
}
```

---
**Реализуем пользовательский ввод**

---

## Задача 13 (Одинаковость.):
> **Задача 13 заключается в том, что.**

Для выполнения этого задания я создал метод **public boolean equalNum (int x)**:
```java
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
```

---
**Реализуем пользовательский ввод**

---

## Задача 14 (Левый треугольник.):
> **Задача 14 заключается в том, что.**

Для выполнения этого задания я создал метод **public void leftTriangle (int x)**:
```java
public void leftTriangle (int x) {
    String star = "*";
    String repeats = null;
     for (int i = 1; i <= x; i++) {
         repeats = star.repeat(i);
         System.out.println(repeats);
     }
}
```

---
**Реализуем пользовательский ввод**

---

## Задача 15 (Угадайка.):
> **Задача 15 заключается в том, что.**

Для выполнения этого задания я создал метод **public void guessGame()**:
```java
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
```

---
**Реализуем пользовательский ввод**

---

## Задача 16 (Поиск последнего значения.):
> **Задача 16 заключается в том, что.**

Для выполнения этого задания я создал метод **public int findLast (int[] arr, int x)**:
```java
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
```

---
**Реализуем пользовательский ввод**

---

## Задача 17 (Добавление в массив.):
> **Задача 17 заключается в том, что.**

Для выполнения этого задания я создал метод **public int[]add (int[] arr, int x, int pos)**:
```java
public int[]add (int[] arr, int x, int pos) {
    arr[pos] = x;
    return arr;
}
```

---
**Реализуем пользовательский ввод**

---

## Задача 18 (Реверс.):
> **Задача 18 заключается в том, что.**

Для выполнения этого задания я создал метод **public void reverse (int[] arr)**:
```java
public void reverse (int[] arr) {
    int [] new_arr = new int[arr.length];
    int el = 0;
    for (int rev_el = arr.length - 1; rev_el > -1; rev_el--) {
        new_arr[el] = arr[rev_el];
        el += 1;
    }
    System.out.print(Arrays.toString(new_arr));
}
```

---
**Реализуем пользовательский ввод**

---

## Задача 19 (Объединение.):
> **Задача 19 заключается в том, что.**

Для выполнения этого задания я создал метод **public int[] concat (int[] arr1,int[] arr2)**:
```java
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
```

---
**Реализуем пользовательский ввод**

---

## Задача 20 (Удалить негатив.):
> **Задача 20 заключается в том, что.**

Для выполнения этого задания я создал метод **public int[] deleteNegative (int[] arr)**:
```java
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
```

---
**Реализуем пользовательский ввод**
