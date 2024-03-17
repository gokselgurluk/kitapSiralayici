import java.time.LocalDate;
import java.util.TreeSet;
import  java.util.Iterator;

 public class Main {
            public static void main(String[] args) {
                Book dune = new Book("Dune", "Frank Herbert", 800, LocalDate.of(1965, 1, 1));
                Book yy = new Book("Yüzyıllık Yalnızlık", "Gabriel Garcia Marquez", 500, LocalDate.of(1967, 1, 1));
                Book ft = new Book("Fahrenheit 451", "Ray Bradbury", 250 , LocalDate.of(1953, 1, 1));
                Book sefiller = new Book("Sefiller", "Victor Hugo", 1500 , LocalDate.of(1862, 1, 1));
                Book sb = new Book("Savaş ve Barış", " Lev Tolstoy", 1200, LocalDate.of(1869, 1, 1));

                TreeSet<Book> set = new TreeSet<>();
                set.add(dune);
                set.add(yy);
                set.add(ft);
                set.add(sefiller);
                set.add(sb);



                Iterator<Book> iterator = set.iterator();
                while (iterator.hasNext()) {
                    Book element = iterator.next();
                    System.out.println(element.getTitle());
                }
                System.out.println("#############################");
                TreeSet<Book> set2 = new TreeSet<>(new BookPageComparator());
                set2.add(dune);
                set2.add(yy);
                set2.add(ft);
                set2.add(sefiller);
                set2.add(sb);




                for (Book book : set2)
                    System.out.println(book.getPage());
            }
        }


