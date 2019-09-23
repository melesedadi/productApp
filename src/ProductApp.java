import java.util.ArrayList;

public class ProductApp {
    public static void main(String[] args) {
//        ArrayList<Product> products = new ArrayList<>();

        Product newProducts = new Product();
        newProducts.setCode("prod1");
        newProducts.setDescription("New product purchased this week");
        newProducts.setPrice(20.0);
//        products.add(newProducts);
//        System.out.println("checking if newProduct class intance prints out:" +newProducts);
        System.out.println("Product print out:");
        System.out.println(newProducts.toString());



        Book newBook = new Book();
        newBook.setPages(20);
        newBook.setAuthor("Melese D");
        newBook.setCode("Book1");
        newBook.setDescription("My new book published in 2019");
        newBook.setPrice(4000);
//        products.add(newBook);
        System.out.println("Books:");
        System.out.println("My new books:" + newBook.toString());

        Software newSoftware = new Software();
        newSoftware.setProgrammer("Tom");
        newSoftware.setPlatform("Java");
        newSoftware.setDescription("ProductApp");
        newSoftware.setCode("softwar01");
        newSoftware.setPrice(100);

//        products.add(newSoftware);
        System.out.println("Software:");
        System.out.println("software list:" + newSoftware.toString());
        System.out.println("Plat form:" + newSoftware.getPlatform());



        System.out.println(newProducts);
        }




    }




