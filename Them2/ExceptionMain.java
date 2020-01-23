package Them2;

public class ExceptionMain extends Throwable {
    public static void main(String[] args) {
        String str = new String("10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0");
        String str1 = new String("10 a 1 2\n2 3 2 r\n5 6 7 c\n300 w 1 0");                         //для проверки на наличие символов
        String str2 = new String("10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0\n5 6 7 1");                //для проверки размера матрицы
        try {
            System.out.println(strToArr(str2));
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    public static int strToArr(String s) {                                                                  //task1
        String[] strArr = s.split("\n");
        if (strArr.length != 4) throw new ArrayIndexOutOfBoundsException("не равно 4x4");
        String[][] doubArr = {
                strArr[0].split(" "),
                strArr[1].split(" "),
                strArr[2].split(" "),
                strArr[3].split(" "),
        };


        int[][] intArr = new int[4][4];                                                                    //task2
        for (int i = 0; i < doubArr.length; i++) {
            for (int j = 0; j < doubArr[i].length; j++) {
                try {
                    intArr[i][j] = Integer.parseInt(doubArr[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayIndexOutOfBoundsException("В строке " + i + " столбце " + j + " находится символ");
                }
            }

        }

        for (int i = 0; i < doubArr.length; i++) {
            for (int j = 0; j < doubArr.length; j++) {
                System.out.print(intArr[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("=======");

        int summ = 0;
        int division;
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[i].length; j++) {
                summ += intArr[i][j];
            }
        }

        division = summ / 2;
        System.out.print("Результат расчета равен ");
        return division;

    }
}
