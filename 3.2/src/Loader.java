import org.w3c.dom.ls.LSOutput;

public class Loader
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();
        Cat musia = new Cat();
        Cat vasia = new Cat();

        System.out.println("Вес Муси - " + musia.getWeight());
        System.out.println("Вес Васи - " + vasia.getWeight());

        System.out.println("Заставим Мусю мяукать 2000 раз");

            for (int i = 1; i <= 2000; i++) {
                musia.meow();
                System.out.println(musia.getWeight());
                System.out.println(musia.getStatus());
            }
        System.out.println("===================================================================================");
        for (int i = 1; i <= 5; i++) {
            vasia.feed(3000.2);
            System.out.println(vasia.getWeight());
            System.out.println(vasia.getStatus());
        }

    }
}