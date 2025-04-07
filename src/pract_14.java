import java.util.Arrays;
import java.util.IllegalFormatCodePointException;
import java.util.Scanner;
public class pract_14 {

    public static void main(String[] args) {
        Scanner bob = new Scanner(System.in);
        int[][] twoDimArray = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int wow = bob.nextInt();
        int a = 2, b = 8;
        int MAX = twoDimArray[0][0];
        int MIN = twoDimArray[0][0];
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (twoDimArray[i][j] > MAX) {
                    MAX = twoDimArray[i][j];
                }
                sum++;
            }

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (twoDimArray[i][j] < MIN) {
                    MIN = twoDimArray[i][j];
                }
            }
        }

        /*for (int i=0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" "+twoDimArray[i][j] + " ");
            }
            System.out.println();
        }*/


        /*for (int i=0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (twoDimArray[i][j] < wow) {
                    twoDimArray[i][j] = wow;
                }
                System.out.print(" " + twoDimArray[i][j] + " ");
            }
            System.out.println();
        }*/



        /*for (int i=0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (x < twoDimArray[i][j] && twoDimArray[i][j] < y) {
                    twoDimArray[i][j] = 0;
                }
                System.out.print(" " + twoDimArray[i][j] + " ");
            }
            System.out.println();
        }*/

        /*for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (twoDimArray[i][j] < wow) {
                    twoDimArray[i][j] = twoDimArray[i][j] * 2;
                }
                System.out.print(" " + twoDimArray[i][j] + " ");
            }
            System.out.println();
        }*/

       /* for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (twoDimArray[i][j] > 0) {
                    twoDimArray[i][j] = twoDimArray[i][j] * -1;
                }
                System.out.print(" " + twoDimArray[i][j] + " ");
            }
            System.out.println();
        }*/



        /*for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (twoDimArray[i][j] == MAX) {
                    twoDimArray[i][j] = 0;
                }
                System.out.print(" " + twoDimArray[i][j] + " ");
            }
            System.out.println();
        }*/

        /*for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (twoDimArray[i][j] == MIN) {
                    twoDimArray[i][j] = 0;
                }
                System.out.print(" " + twoDimArray[i][j] + " ");
            }
            System.out.println();
        }*/
      //  поменять местами первый и последний элемент массивы
        int ai = twoDimArray[0].length, bi = twoDimArray.length;

        int swap = 0;
        /*swap = twoDimArray[0][0];
        twoDimArray[0][0] = twoDimArray[bi - 1][ai - 1];
        twoDimArray[bi - 1][ai - 1] = swap;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + twoDimArray[i][j] + " ");
            }
            System.out.println();
        }*/


        /*for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                swap = twoDimArray[0][0];
                twoDimArray[0][0] = MAX ;
                if(twoDimArray[0][0] == MAX){twoDimArray[i][j] = swap;}
                System.out.print(" " + twoDimArray[i][j] + " ");
            }
            System.out.println();
        }*/




            /*15 pract 1 zd*/
        int chopik = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
            chopik = chopik + twoDimArray[i][j];
            }
        System.out.println("сумма элементов масива = "+ chopik);
        }

        int sred = chopik / sum;
        System.out.println("среднее арифметическое элементов массива"+ sred);
        int wrem = 0;
        int sredotric = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (twoDimArray[i][j] < 0){
                wrem = wrem + twoDimArray[i][j];
                }
            }
        }
        sredotric = wrem / sum;
        System.out.println("среднее арифметическое отриц элементов массива = "+ chopik);

        int oritssum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (twoDimArray[i][j] / 2 !=0){
                    oritssum++;}
                else if(twoDimArray[i][j] > wow) {
                    System.out.println("строка:"+i + "столбец:"+j );
                }

            }
        }

        int chopikab= 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (twoDimArray[i][j] > a && b > twoDimArray[i][j]) {
                    chopikab = chopikab + twoDimArray[i][j];
                }
            }
        }


    }
}