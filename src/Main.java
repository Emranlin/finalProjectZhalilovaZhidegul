import enums.Gender;
import enums.Genre;
import enums.Language;
import model.Book;
import model.User;
import service.impl.BookSeviceImpl;
import service.impl.UserSeviceImpl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static List<Book> main(String[] args) {

        // Бардык Id лер уникальный болуш керек. Эгер уникальный болбосо озубуз тузгон UniqueConstraintException класс ыргытсын.
        // User дин email адресси уникальный болуш керек жана @ болуусу керек. Эгер уникальный болбосо UniqueConstraintException класс,
        // @ болбосо озубуз тузгон BadRequestException класс ыргытсын.
        // User дин телефон номери +996 дан башталып 13 символдон турсун. Болбосо BadRequestException класс ыргытсын.
        // Китептин баасы терс сан болбошу керек. Болбосо NegativeNumberException ыргытсын.
        // Китептин чыккан жылы келечек убакыт болбошу керек.Болбосо DateTimeException ыргытсын.
        // Китептин автору бош болбошу керек. Болбосо EmptyStackException ыргытсын.

        Book book1=new Book(1L,"Ak Keme",Genre.ROMANCE,BigDecimal.valueOf(350),"Chyngyz Aitmatov",Language.KYRGYZ, LocalDate.of(1995,1,15));
        Book book2=new Book(2L,"Farengeir 470",Genre.FANTASY,BigDecimal.valueOf(450),"Leanardo Viasco",Language.ENGLISH, LocalDate.of(1985,7,15));
        Book book3=new Book(3L,"Alchemical",Genre.ROMANCE,BigDecimal.valueOf(550),"Poalo ",Language.ENGLISH, LocalDate.of(2005,1,15));
        Book book4=new Book(4L,"Toolor kulagand",Genre.ROMANCE,BigDecimal.valueOf(350),"Chyngyz Aitmatov",Language.KYRGYZ, LocalDate.of(1997,1,15));
        Book book5=new Book(5L,"Tolgon Ai",Genre.ROMANCE,BigDecimal.valueOf(350),"Chyngyz Aitmatov",Language.KYRGYZ, LocalDate.of(1995,1,15));
        List<Book>books=new ArrayList<>(Arrays.asList(book1,book2,book3,book4,book5));

        User user1=new User(1L,"Aigul","Jalilova","vbjn","+9965014796", Gender.FEMALE,BigDecimal.valueOf(10000),books);
        User user2=new User(2L,"Aibek","Asanov","vbjn","+9965014796", Gender.MALE,BigDecimal.valueOf(10000),books);
        User user3=new User(3L,"Asan","Jalilova","vbjn","+9965014796", Gender.MALE,BigDecimal.valueOf(10000),books);
        User user4=new User(4L,"Jazgul","lilova","vbjn","+9965014796", Gender.FEMALE,BigDecimal.valueOf(10000),books);
        User user5=new User(5L,"Sagyn","Jalilova","vbjn","+9965014796", Gender.MALE,BigDecimal.valueOf(10000),books);
        List<User>users=new ArrayList<>(Arrays.asList(user1,user2,user3,user4,user5));

        while(true){
            BookSeviceImpl bookSevice=new BookSeviceImpl();
            UserSeviceImpl userSevice=new UserSeviceImpl();
            switch (new Scanner(System.in).nextByte()){
                case 1:System.out.println(bookSevice.createBooks(books));
                    break;
                case 2:bookSevice.getAllBooks();
                    break;
                case 3:{
                    String ganre=new Scanner(System.in).next();
                    List<Book>streamGenre=books.stream().filter(b->b.getGenre().equals(ganre)).toList();
                    return streamGenre;}break;
                case 4:{ String removingName=new Scanner(System.in).next();
                    boolean streamRemove= streamRemove=books.removeIf(x->books.contains(removingName));}
                case 5: List<Book>streamSort=books.stream().sorted(Comparator.comparing(x->x.getPrice());break;;
                case 6:{List<Book>streamYear=books.stream().filter(book -> book.getName().startsWith("B")).toList();
                    streamYear.forEach(System.out::println);}break;
                case 7:{List<Book>streamMax=books.stream().max(Comparator.comparing(book -> book.getPrice())).stream().toList();
                    streamMax.forEach(System.out::println)}break;
                case 8:{Long id=new Scanner(System.in).nextLong();
                    List<User>streamUser=users.stream().filter(b->b.getId().equals(id)).toList();
                    streamUser.forEach(System.out::println);}break;
                case 9:{String name=new Scanner(System.in).next();
                    List<User>StreamRemove=users.stream().filter(x->x.getName().equals(name)).toList();}break;
                case 10:{
                    List<Integer> streamUpdate=users.stream().map(x->x.getMoney().intValue()+1000).toList();}break;
                case 11:{
                    List<User>streamGirl=users.stream().filter(x->x.getGender().equals(Gender.FEMALE)).toList();
                    streamGirl.forEach(System.out::println);
                    List<User>streamBoys=users.stream().filter(g->g.getGender().equals(Gender.FEMALE)).toList();
                    streamBoys.forEach(System.out::println);}
                case 12:{List<User>streamUser=users.stream().toList();
                    streamUser.forEach(System.out::println);}
                case 13: System.out.println(userSevice.createUser(users));break;



            }

            }
        }

    }
}