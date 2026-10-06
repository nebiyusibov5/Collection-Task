import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book b1=new Book(1,"1984","George Orwell",1949,true);
        Book b2 = new Book(2, "Animal Farm", "George Orwell", 1945, true);
        Book b3 = new Book(3, "Brave New World", "Aldous Huxley", 1932, true);
        Book b4 = new Book(4, "Fahrenheit 451", "Ray Bradbury", 1953, false);
        Book b5 = new Book(5, "The Great Gatsby", "F. Scott Fitzgerald", 1925, true);
        Book b6 = new Book(6, "To Kill a Mockingbird", "Harper Lee", 1960, false);
        Book b7 = new Book(7, "Crime and Punishment", "Fyodor Dostoevsky", 1866, true);
        Book b8 = new Book(8, "The Catcher in the Rye", "J.D. Salinger", 1951, true);



        System.out.println(b1.equals(b2));
        System.out.println(b1.hashCode());

        ArrayList<Book> books=new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);
        books.add(b6);
        books.add(b7);
        books.add(b8);

        for (Book b : books) {
            System.out.println(b.getId() + " - " + b.getTitle() + " - " + b.getAuthor() + " - " + b.getYear() + " - " + b.isAvailable());
        }

        for (Book a : books) {
            if (a.getYear()>1940){
                System.out.println(a.getId() + " - " + a.getTitle() + " - " + a.getAuthor() + " - " + a.getYear() + " - " + a.isAvailable());

            }
        }



    }
}