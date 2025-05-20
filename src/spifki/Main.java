package spifki;
import java.util.ArrayDeque;
import java.util.Scanner;

public class  Main {

    public static Object print(String info) {
        System.out.println(info);
        return null;
    }

    @Override
    public String toString() {
        return "Книга: " + name_book +
                ", страниц: " + pages +
                ", автор: " + First_name_author + " " + Last_name_author;
    }



    private String name_book;
    private int pages;
    private String First_name_author;
    private String Last_name_author;
    private static int stop=1;

//    String static accept;

    public String getName_book() {
        return name_book;
    }

    public void setName_book(String name_book) {
        this.name_book = name_book;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getFirst_name_author() {
        return First_name_author;
    }

    public void setFirst_name_author(String first_name_author) {
        First_name_author = first_name_author;
    }

    public String getLast_name_author() {
        return Last_name_author;
    }

    public void setLast_name_author(String last_name_author) {
        Last_name_author = last_name_author;
    }

    public Main(String name_book, int pages, String first_name_author, String last_name_author) {
        this.name_book = name_book;
        this.pages = pages;
        this.First_name_author = first_name_author;
        this.Last_name_author = last_name_author;
    }


    public static void main(String[] args) {
        ArrayDeque books = new ArrayDeque<>();

        Scanner input = new Scanner(System.in);

        while (stop!=0) {
            System.out.println("Добро пожаловать! \nВведите комманду добавить,удалить, вывести или стоп");
            String accpet = input.next();

            if(accpet.toLowerCase().contains("добавить")){
                System.out.println("Ввеиидте страницы,название книги,имя и фамилию");
                String pages = input.next();
                String name_book = input.next();
                String first_name_author = input.next();
                String Last_name_author = input.next();
                System.out.println("Если программа найдет пустые строчки у вас она запросит их ввести занова:\n"+
                        name_book.isEmpty() + "\n"+
                        pages.isEmpty() + "\n"+
                        first_name_author.isEmpty()+"\n"+
                        Last_name_author.isEmpty());
                Object o = name_book.isEmpty() ? name_book = input.next()  : print("Название написано");
                Object o1 = pages.isEmpty() ? pages = input.next()  : print("Страницы написаы");
                Object o2 = first_name_author.isEmpty() ? first_name_author = input.next()  : print("Имя автора написано");
                Object o3 = Last_name_author.isEmpty() ? Last_name_author = input.next()  : print("Фамилия написана");

                books.add(new Main(name_book,Integer.parseInt(pages),first_name_author,Last_name_author));
            }
            else if (accpet.toLowerCase().contains("удалить")) {
                System.out.println("Введите название книги для удаления:");
                String nameToDelete = input.next();

                boolean found = false;
                for (Object obj : books) {
                    // instanceof в Java используется для проверки, принадлежит ли объект определённому классу
                    if (obj instanceof Main) {
                        Main book = (Main) obj;
                        if (book.getName_book().equalsIgnoreCase(nameToDelete)) {
                            books.remove(book);
                            System.out.println("Книга \"" + nameToDelete + "\" удалена.");
                            found = true;
                            break; // удаляем только первую найденную
                        }
                    }
                }
                if (!found) {
                    System.out.println("Книга с таким названием не найдена.");
                }
            }
            else if (accpet.toLowerCase().contains("вывести")) {
                if (books.isEmpty()) {
                    System.out.println("Список книг пуст.");
                } else {
                    int index = 1;
                    for (Object all : books) {
                        System.out.println(index + ". " + all);
                        index++;
                    }
                }
            }
            else {
                stop=0;
            }

        }


    }
}