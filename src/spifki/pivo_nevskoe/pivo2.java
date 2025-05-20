package spifki.pivo_nevskoe;
import java.io.*;

public class pivo2 {

    public static void main(String[] args) {
        String vvod = "vvod.txt";
        String vivod = "vivod.txt";
        int minl = 10;

        zd1(vvod, vivod);
        zd2(vvod, vivod);
        zd3(vvod, vivod, minl);
        zd4(vvod, vivod);
        zd5(vvod, vivod);
    }

    // 1
    public static void zd1(String input, String output) {
        try (BufferedReader br = new BufferedReader(new FileReader(input));
             BufferedWriter bw = new BufferedWriter(new FileWriter(output))) {

            String line;
            int lineNum = 1;
            while ((line = br.readLine()) != null) {
                bw.write(line + " " + lineNum);
                bw.newLine();
                lineNum++;
            }
            System.out.println("1. Строки с номерами записаны в " + output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 2
    public static void zd2(String input, String output) {
        try (BufferedReader br = new BufferedReader(new FileReader(input));
             BufferedWriter bw = new BufferedWriter(new FileWriter(output))) {

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line + " " + line.length());
                bw.newLine();
            }
            System.out.println("готово!");
            System.out.println(output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 3
    public static void zd3(String input, String output, int minLength) {
        try (BufferedReader br = new BufferedReader(new FileReader(input));
             BufferedWriter bw = new BufferedWriter(new FileWriter(output))) {

            String line;
            while ((line = br.readLine()) != null) {
                if (line.length() > minLength) {
                    bw.write(line);
                    bw.newLine();
                }
            }
            System.out.println("готово!");
            System.out.println(output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 4
    public static void zd4(String input, String output) {
        try (BufferedReader br = new BufferedReader(new FileReader(input));
             BufferedWriter bw = new BufferedWriter(new FileWriter(output))) {

            String line;
            while ((line = br.readLine()) != null) {
                if (line.length() % 2 == 0) {
                    bw.write(line);
                    bw.newLine();
                }
            }
            System.out.println("готово!");
            System.out.println(output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 5
    public static void zd5(String input, String output) {
        try (BufferedReader br = new BufferedReader(new FileReader(input));
             BufferedWriter bw = new BufferedWriter(new FileWriter(output))) {

            String line;
            while ((line = br.readLine()) != null) {
                if (!line.isEmpty() && line.charAt(0) == line.charAt(line.length() - 1)) {
                    bw.write(line);
                    bw.newLine();
                }
            }
            System.out.println("готово!");
            System.out.println(output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}