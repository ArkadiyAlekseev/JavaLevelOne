package ru.geekbrains.JavaLevelOne.git;

import java.util.Arrays;

public class J1Homework2 {
    public static void main(String[] args) {

        // ЗАДАНИЕ 1.НАЧАЛО. Задать целочисленный массив, состоящий из элементов 0 и 1.
        int[] zeroone = {0, 1, 1, 1, 0, 1, 0, 0, 1, 0};
        int lengthOne = zeroone.length;
        homeworkOne(lengthOne, zeroone);
        //проверка
        System.out.println("ЗАДАНИЕ 1(проверка):\n Целочисленный массив {0, 1, 1, 1, 0, 1, 0, 0, 1, 0}.\n Результат работы метода: \n " + Arrays.toString(zeroone));


        // ЗАДАНИЕ 2. НАЧАЛО. Задать пустой целочисленный массив размером 8.
        int[] filling = new int[8];
        homeworkTwo(filling);
        System.out.println("ЗАДАНИЕ 2(проверка):\n Пустой целочисленный массив размером 8  {0, 0, 0, 0, 0, 0, 0, 0}.\n Результат работы метода:\n " + Arrays.toString(filling));


        //ЗАДАНИЕ 3. НАЧАЛО. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ].
        int[] sixbytwo = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int lengthThree = sixbytwo.length;
        homeworkThree(lengthThree, sixbytwo);
        System.out.println("ЗАДАНИЕ 3(проверка):\n Массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ].\n Результат работы метода:\n " + Arrays.toString(sixbytwo));


        //ЗАДАНИЕ 4. НАЧАЛО. Задать одномерный массив.
        int[] minmax = {2, 3, 6, 4, 8, 4, 8, 8, 9, 2};
        int lengthFour = minmax.length;
        homeworkFourmax(lengthFour, minmax);
        homeworkFourmin(lengthFour, minmax);


        //ЗАДАНИЕ 5. НАЧАЛО. Создать квадратный двумерный целочисленный массив(количество строк и столбцов одинаковое).
        int[][] diagonal = new int[10][10];
        System.out.println("ЗАДАНИЕ 5(проверка):");//проверка
        homeworkFive(diagonal);


        //ЗАДАНИЕ 6. НАЧАЛО. Написать метод, в который передается
        // не пустой одномерный целочисленный массив,
        //    метод должен вернуть true если в массиве есть место,
        //    в котором сумма левой и правой части массива равны.
        //    Примеры: checkBalance([1, 1, 1, || 2, 1]) → true,
        //    checkBalance ([2, 1, 1, 2, 1]) → false,
        //    checkBalance ([10, 1, 2, 3, 4]) → true.
        //    Абстрактная граница показана символами ||, эти символы в массив не входят.*/
        int[] checkBalanceOne = {10, 1, 2, 3, 4};
        // System.out.println(Arrays.toString(checkBalanceOne));//проверка
        int length = checkBalanceOne.length;
        // System.out.println(length);//проверка
        int[] begincheck = new int[length];//пустой массив под заполнение суммы слева
        homeworkSixOne(length, checkBalanceOne, begincheck);
        // System.out.println(Arrays.toString(begincheck));//проверка
        int[] endcheck = new int[length];//пустой массив под заполнение суммы справа
        homeworkSixTwo(length, checkBalanceOne, endcheck);
        // System.out.println(Arrays.toString(endcheck));//проверка
        boolean[] resultmasiv = new boolean[length];//пустой массив для выявления совпадений сумм справа и слева
        homeworkSixThree(length, resultmasiv, begincheck, endcheck);
        System.out.println("ЗАДАНИЕ 6(проверка)равенства суммы левой и правой части массива{10, 1, 2, 3, 4}:\n" + Arrays.toString(resultmasiv));//проверка


        // ЗАДАНИЕ 7. НАЧАЛО. Написать метод, которому на вход подаётся одномерный массив
        //и число n (может быть положительным, или отрицательным),
        //при этом метод должен циклически сместить все элементы массива на n позиций.*/
        int[] massivSeven = {2, 3, 6, 4, 8, 4, 8, 8, 9, 1};
        System.out.println("ЗАДАНИЕ 7: входящий массив:\n" + Arrays.toString(massivSeven));// проверка
        int lengthSeven = massivSeven.length;
        int n = -2;
        int[] sevenhelper = new int[lengthSeven];//пустой массив для пятнашек
        homeworkSevenOne(massivSeven, lengthSeven, n, sevenhelper);//заполняем пустой массив
        homeworkSevenTwo(massivSeven, lengthSeven, sevenhelper);//присваиваем значение пустого массива входящему массиву
        System.out.println("исходящий массив при сдвиге на " + n + " шагов влево:\n" + Arrays.toString(massivSeven));//проверка


        /* ЗАДАНИЕ 8. НАЧАЛО. Написать метод, которому на вход подаётся одномерный массив
        и число n (может быть положительным, или отрицательным),
        при этом метод должен циклически сместить все элементы массива на n позиций.Не пользоваться вспомогательным массивом при решении задачи .*/
        int[] massivEight = {2, 3, 6, 4, 8};
        System.out.println("ЗАДАНИЕ 8: входящий массив:\n" + Arrays.toString(massivEight));// проверка
        int lengthEight = massivEight.length;
        int nTwo = 5;
        homeworkEight(massivEight, lengthEight, nTwo);
        System.out.println("исходящий массив при сдвиге на " + nTwo + " шагов влево:\n" + Arrays.toString(massivEight));//проверка
        // К сожалению 8 задание не выполнено, массив постоянно пропускает одну ячецку (не понял, как найти буфер, который мог бы перезаписываться после каждого цикла, а не во время).
    }

    //ЗАДАНИЕ 1.ОКОНЧАНИЕ. Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0.
    private static void homeworkOne(int numbersone, int[] arr) {
        for (int i = 0; i < numbersone; i++)
            arr[i] = (arr[i] == 0) ? 1 : 0;
    }

    //ЗАДАНИЕ 2. ОКОНЧАНИЕ. Написать метод, который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22.
    private static void homeworkTwo(int[] arr) {
        for (int i = 0; i < 8; i++)
            arr[i] += 3 * i + 1;
    }

    //ЗАДАНИЕ 3. ОКОНЧАНИЕ. Написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2.
    private static void homeworkThree(int numbersthree, int[] arr) {
        for (int i = 0; i < numbersthree; i++)
            arr[i] *= (arr[i] < 6) ? 2 : 1;
    }

    //ЗАДАНИЕ 4. ОКОНЧАНИЕ. Написать методы поиска в нём минимального и максимального элемента/
    private static void homeworkFourmax(int numbersFour, int[] arr) {
        int max = arr[0];
        for (int i = 0; i < numbersFour; i++)
            max = (arr[i] > max) ? arr[i] : max;
        // проверка
        System.out.println("ЗАДАНИЕ 4(проверка max):\n Массив [ 2, 3, 6, 4, 8, 4, 8, 8, 9, 2 ].\n Результат работы метода:\n Максимальный элемент: " + max);
    }

    private static void homeworkFourmin(int numbersFour, int[] arr) {
        int min = arr[0];
        for (int i = 0; i < numbersFour; i++)
            min = (arr[i] < min) ? arr[i] : min;
        //проверка
        System.out.println(" Минимальный элемент: " + min);
    }

    //ЗАДАНИЕ 5. ОКОНЧАНИЕ. Заполнить его диагональные элементы единицами, используя цикл(ы).
    private static void homeworkFive(int[][] arr) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = (i == j) || (i + j == 10 - 1) ? 1 : arr[i][j];
                //проверка
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    //ЗАДАНИЕ 6. ОКОНЧАНИЕ.
    // метод вычисления суммы слева массива
    private static void homeworkSixOne(int length, int[] arr, int[] beginmassive) {
        beginmassive[0] = arr[0];//из-за формулы вывел 0 в отдельное выражение,
        for (int i = 1; i < length; i++) {
            beginmassive[i] = beginmassive[i - 1] + arr[i];
        }
    }

    // метод вычисления суммы справа массива
    private static void homeworkSixTwo(int length, int[] arr, int[] endmassive) {
        endmassive[length - 1] = arr[length - 1];//из-за формулы вывел length в отдельное выражение,
        for (int i = (length - 2); i > -1; i--) {
            endmassive[i] = endmassive[i + 1] + arr[i];
        }
    }

    // метод вычисления места в массиве в котором сумма левой и правой части массива равны
    // и возврата значения true/false.
    private static boolean[] homeworkSixThree(int length, boolean[] resultmasiv, int[] beginmassive, int[] endmassive) {
        for (int i = 0; i < length - 1; i++) {
            if (beginmassive[i] == endmassive[i + 1]) {
                resultmasiv[i] = (beginmassive[i] == endmassive[i + 1]);
            }
        }
        return resultmasiv;
    }

    //ЗАДАНИЕ 7. ОКОНЧАНИЕ
    private static void homeworkSevenOne(int[] arr, int numbersSeven, int a, int[] arr2) {
        for (int i = 0; i < numbersSeven; i++)
            if (i + a < numbersSeven && i + a >= 0) {
                arr2[i] = arr[i + a];
            } else if (i + a >= numbersSeven && i + a >= 0) {
                arr2[i] = arr[i - numbersSeven + a];
            } else if (i + a <= numbersSeven && i + a < 0) {
                arr2[i] = arr[i + numbersSeven + a];
            }
    }
    public static void homeworkSevenTwo(int[] arr, int numbersSeven, int[] arr2) {
        for (int i = 0; i < numbersSeven; i++)
            arr[i] = arr2[i];
    }

    //ЗАДАНИЕ 8. ОКОНЧАНИЕ
    private static void homeworkEight(int[] arr, int numbersEight, int a) {
        if (a > 0) {
            for (int j = 1; j <= a; j++)
                for (int i = numbersEight - 1; i >= 0; i--) {
                    arr[i] = (i > 0) ? arr[i - 1] : arr[numbersEight - 1];
                }
        } else if (a < 0) {
            for (int j = -1; j >= a; j--)
                for (int i = 0; i < numbersEight; i++) {
                    arr[i] = (i < numbersEight - 1) ? arr[i + 1] : arr[0];
                }
        }
    }
}


