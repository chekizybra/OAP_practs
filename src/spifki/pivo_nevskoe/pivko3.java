package spifki.pivo_nevskoe;
import java.io.*;
import java.nio.file.Files;
import java.util.*;
public class pivko3 {
    public static void main(String[] args) {
        task1("f.txt", "g.txt", "h.txt");
        task2("a.txt", "b.txt", "tmp.txt");
        task3("a.txt", "b.txt", "sum.txt");
        task4("a.txt", "b.txt", "max.txt");
        task5("a.txt", "b.txt", "evenodd.txt");
        task6("f.txt", "digits.txt", "other.txt");
        task7("f1.txt", "f2.txt");
    }
    // 1
    public static void task1(String f, String g, String h) {
        try (Scanner sc = new Scanner(new File(f));
             PrintWriter outG = new PrintWriter(g);
             PrintWriter outH = new PrintWriter(h)) {
            while (sc.hasNextInt()) {
                int x = sc.nextInt();
                if (x < 0) outG.println(x);
                else if (x > 0) outH.println(x);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // 2
    public static void task2(String file1, String file2, String tempFile) {
        try {
            Files.copy(new File(file1).toPath(), new File(tempFile).toPath(), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
            Files.copy(new File(file2).toPath(), new File(file1).toPath(), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
            Files.copy(new File(tempFile).toPath(), new File(file2).toPath(), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // 3
    public static void task3(String file1, String file2, String result) {
        try (Scanner sc1 = new Scanner(new File(file1));
             Scanner sc2 = new Scanner(new File(file2));
             PrintWriter out = new PrintWriter(result)) {
            while (sc1.hasNextInt() && sc2.hasNextInt()) {
                out.println(sc1.nextInt() + sc2.nextInt());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // 4
    public static void task4(String file1, String file2, String result) {
        try (Scanner sc1 = new Scanner(new File(file1));
             Scanner sc2 = new Scanner(new File(file2));
             PrintWriter out = new PrintWriter(result)) {
            while (sc1.hasNextInt() && sc2.hasNextInt()) {
                out.println(Math.max(sc1.nextInt(), sc2.nextInt()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // 5
    public static void task5(String file1, String file2, String result) {
        try (Scanner sc1 = new Scanner(new File(file1));
             Scanner sc2 = new Scanner(new File(file2));
             PrintWriter out = new PrintWriter(result)) {
            while (sc1.hasNextInt()) {
                int x = sc1.nextInt();
                if (x % 2 == 0) out.println(x);
            }
            while (sc2.hasNextInt()) {
                int x = sc2.nextInt();
                if (x % 2 != 0) out.println(x);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // 6
    public static void task6(String f, String g, String h) {
        try (BufferedReader br = new BufferedReader(new FileReader(f));
             PrintWriter outG = new PrintWriter(g);
             PrintWriter outH = new PrintWriter(h)) {
            int ch;
            while ((ch = br.read()) != -1) {
                if (Character.isDigit(ch)) outG.print((char) ch);
                else outH.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // 7
    public static void task7(String file1, String file2) {
        try (BufferedReader br1 = new BufferedReader(new FileReader(file1));
             BufferedReader br2 = new BufferedReader(new FileReader(file2))) {
            int ch1, ch2, pos = 1;
            while (true) {
                ch1 = br1.read();
                ch2 = br2.read();
                if (ch1 == -1 && ch2 == -1) {
                    System.out.println("Файлы совпадают");
                    return;
                }
                if (ch1 != ch2) {
                    System.out.println("Файлы отличаются на позиции: " + pos);
                    return;
                }
                pos++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

