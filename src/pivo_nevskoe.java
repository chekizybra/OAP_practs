import java.io.*;

public class pivo_nevskoe{
    public static void main(String[] args) throws IOException {
        String imyafaila = "input.txt";
        char dalibukavu = 'A';
        int k1 = 2, k2 = 5;

        zd1(imyafaila, dalibukavu);
        zd2(imyafaila);
        zd3(imyafaila);
        zd4(imyafaila);
        zd5(imyafaila);
        zd6(imyafaila);
        zd7(imyafaila, dalibukavu);
        zd8(imyafaila);
        zd9(imyafaila, k1, k2);
        zd10(imyafaila);


    }


    // 1
    public static void zd1(String imyafaila, char ch) {
        int shet = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(imyafaila))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.isEmpty() && line.charAt(0) == ch) {
                    shet++;
                }
            }
            System.out.println("1 Строк начинающихся с " + ch + " : " + shet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 2
    public static void zd2(String imyafaila) {
        int shet = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(imyafaila))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.isEmpty() && line.charAt(0) == line.charAt(line.length() - 1)) {
                    shet++;
                }
            }
            System.out.println("2 Строк начинающихся и заканчивающихся одной буквой:" + shet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 3
    public static void zd3(String imyafaila) {
        String longest = "";
        int maxLength = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(imyafaila))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.length() > maxLength) {
                    maxLength = line.length();
                    longest = line;
                }
            }
            System.out.println("3 Самая длинная строка: " + longest + " длина: " + maxLength);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 4
    public static void zd4(String imyafaila) {
        String shortest = null;
        int minLength = Integer.MAX_VALUE;
        try (BufferedReader br = new BufferedReader(new FileReader(imyafaila))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.length() < minLength) {
                    minLength = line.length();
                    shortest = line;
                }
            }
            System.out.println("4 Самая короткая строка " + shortest + " длина: " + minLength);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 5
    public static void zd5(String imyafaila) {
        int maxLen = 0, lineNum = 0, maxLineNum = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(imyafaila))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineNum++;
                if (line.length() > maxLen) {
                    maxLen = line.length();
                    maxLineNum = lineNum;
                }
            }
            System.out.println("5 Номер самой длинной строки " + maxLineNum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 6
    public static void zd6(String imyafaila) {
        int minLen = Integer.MAX_VALUE, lineNum = 0, minLineNum = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(imyafaila))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineNum++;
                if (line.length() < minLen) {
                    minLen = line.length();
                    minLineNum = lineNum;
                }
            }
            System.out.println("6 Номер самой короткой строки " + minLineNum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 7
    public static void zd7(String imyafaila, char ch) {
        try (BufferedReader br = new BufferedReader(new FileReader(imyafaila))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.isEmpty() && line.charAt(0) == ch) {
                    System.out.println("7 Найдена строка начинающаяся с " + ch + " : " + line);
                    return;
                }
            }
            System.out.println("7 Строк начинающихся с " + ch + " нет");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 8
    public static void zd8(String imyafaila) {
        System.out.println("8 Первый символ каждой строки");
        try (BufferedReader br = new BufferedReader(new FileReader(imyafaila))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.isEmpty()) {
                    System.out.println(line.charAt(0));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 9
    public static void zd9(String imyafaila, int k1, int k2) {
        System.out.println("9 Символы с позиции " + k1 + " по " + k2 + ":");
        try (BufferedReader br = new BufferedReader(new FileReader(imyafaila))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.length() >= k2) {
                    System.out.println(line.substring(k1 - 1, k2));
                } else {
                    System.out.println("Строка слишком короткая " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 10
    public static void zd10(String imyafaila) {
        System.out.println("10 Нечётные строки");
        try (BufferedReader br = new BufferedReader(new FileReader(imyafaila))) {
            String line;
            int lineNum = 0;
            while ((line = br.readLine()) != null) {
                lineNum++;
                if (lineNum % 2 != 0) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}