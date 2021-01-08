import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        Loader.choice();

    }

    public static void choice() {
        System.out.println("================================================================================================");
        System.out.println
                ("Добрый день! Данная программа помогает приготовить небольшое количество блюд.\n" +
                        "Вам необходимо выбрать дальнейший вариант работы программы:\n" +
                        "1 - Вы указываете имеющиеся у Вас ингридиенты (в том числе их кол-во), а программа подбирет блюдо.\n" +
                        "2 - Вы выбираете блюдо, программа отображает рецепт и проверяет хватит ли у Вас ингридиентов.\n" +
                        "Пожалуйста, укажите один из вариантов. Напечатайте 1 или 2.");
        System.out.println("================================================================================================");

        Scanner scanner = new Scanner(System.in);
        String branch = scanner.nextLine();

        switch (branch) {
            case "1":
                Loader.kitchen1();
                break;

            case "2":
                Loader.kitchen2();
            default:
                System.out.println("Просьба выбрать из предоставленных вариантов. Укажите \"1\" или \"2\".");

        }
    }

    public static void kitchen1() {

        int powderAmount =0;
        int milkAmount = 0;
        int sugarAmount = 0;
        int oilAmount = 0;
        int appleCount = 0;
        int eggsAmount = 0;

        System.out.println("Давайте провирим, что у Вас есть и подберем рецепт. \n" +
                "Напишите в консоль, что в наличии. Например - мука. \n");

        String currentAnswer = "";
        Scanner scanner = new Scanner(System.in);
        while (!currentAnswer.equals("Конец")) {
            currentAnswer = scanner.nextLine();
            if (currentAnswer.equals("Мука") || currentAnswer.equals("мука")) {
                System.out.println("Отлично у Вас есть Мука, а теперь укажите ее количество.");
                powderAmount = scanner.nextInt();
                System.out.println("Отлично, продолжаем, что у Вас еще есть?");
            } else if (currentAnswer.equals("Молоко") || currentAnswer.equals("молоко")) {
                System.out.println("Отлично у Вас есть Молоко, а теперь укажите ее количество.");
                milkAmount = scanner.nextInt();
                System.out.println("Отлично, продолжаем, что у Вас еще есть?");
            } else if (currentAnswer.equals("Сахар") || currentAnswer.equals("сахар")) {
                System.out.println("Отлично у Вас есть Сахар, а теперь укажите ее количество.");
                sugarAmount = scanner.nextInt();
                System.out.println("Отлично, продолжаем, что у Вас еще есть?");
            } else if (currentAnswer.equals("Масло") || currentAnswer.equals("масло")) {
                System.out.println("Отлично у Вас есть Масло, а теперь укажите ее количество.");
                oilAmount = scanner.nextInt();
                System.out.println("Отлично, продолжаем, что у Вас еще есть?");
            } else if (currentAnswer.equals("Яблоки") || currentAnswer.equals("яблоки")) {
                System.out.println("Отлично у Вас есть Яблоки, а теперь укажите ее количество.");
                appleCount = scanner.nextInt();
                System.out.println("Отлично, продолжаем, что у Вас еще есть?");
            } else if (currentAnswer.equals("Яйца") || currentAnswer.equals("яйца") || currentAnswer.equals("яйцо") || currentAnswer.equals("Яйцо")) {
                System.out.println("Отлично у Вас есть Яйца, а теперь укажите ее количество.");
                eggsAmount = scanner.nextInt();
                System.out.println("Отлично, продолжаем, что у Вас еще есть?");
            }
        }
                System.out.println("Хорошо сейчас что-нибудь подберем");

            if (milkAmount >= 300 && powderAmount >= 5 && eggsAmount >= 5) {
                System.out.println("Отлично! У Вас хватило ингридиентов на Омлет. Начинайте готовить!");
            }
            else if (appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300 && eggsAmount >= 4) {
                System.out.println("Отлично! У Вас хватило ингридиентов на Яблочный пирог. Начинайте готовить!");
            }
            else if (powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1 && oilAmount >= 30) {
                System.out.println("Отлично! У Вас хватило ингридиентов на Блины. Начинайте готовить!");
            }
            else {
                System.out.println("Вам необходимо докупить ингридиенты");
            }
        }

         public static void kitchen2 () {
             System.out.println("У нас в меню: Блины, Омлет, Яблочный пирог");
             System.out.println("Укажите, что из этого хотите приготовить");

             Scanner scanner = new Scanner(System.in);
             String dish = scanner.nextLine();

             // Готовим Блины================================================================================================

             if (dish.equals("Блины") || dish.equals("блины")) {
                 System.out.println("Необходимые ингридиенты :" + " powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml");
                 System.out.println("Давайте проверим достаточно ли у Вас ингридиентов.");
                 System.out.println("Укажите имеющиеся у Вас количество Муки.");
                 int powderAmount = scanner.nextInt();
                 System.out.println("Укажите имеющиеся у Вас количество Сахара.");
                 int sugarAmount = scanner.nextInt();
                 System.out.println("Укажите имеющиеся у Вас количество Молока.");
                 int milkAmount = scanner.nextInt();
                 System.out.println("Укажите имеющиеся у Вас количество Масла.");
                 int oilAmount = scanner.nextInt();

                 if ((powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1 && oilAmount >= 30)) {
                     System.out.println("Отлично! Все в наличии, начинайте готовить!");
                 } else {
                     System.out.println("Не хватает ингридиентов, сверьтесь с рецептом!");
                 }
             }
             //Готовим Омлет=============================================================================================================

             else if (dish.equals("Омлет") || dish.equals("омлет")) {
                 System.out.println("Необходимые ингридиенты :" + " milk - 300 ml, powder - 5 g, eggs - 5");
                 System.out.println("Давайте проверим достаточно ли у Вас ингридиентов.");
                 System.out.println("Укажите имеющиеся у Вас количество Молока.");
                 int milkAmount = scanner.nextInt();
                 System.out.println("Укажите имеющиеся у Вас количество Муки.");
                 int powderAmount = scanner.nextInt();
                 System.out.println("Укажите имеющиеся у Вас количество Яиц.");
                 int eggsAmount = scanner.nextInt();

                 if (milkAmount >= 300 && powderAmount >= 5 && eggsAmount >= 5)
                     System.out.println("Отлично! Все в наличии, начинайте готовить!");
                 else {
                     System.out.println("Не хватает ингридиентов, сверьтесь с рецептом!");
                 }
             }

             // Готовим Яблочный пирог=======================================================================================

             else if (dish.equals("Яблочный пирог") || dish.equals("яблочный пирог") || dish.equals("пирог")) {
                 System.out.println("Необходимые ингридиенты :" + " apples - 3, milk - 100 ml, powder - 300 g, eggs - 4");
                 System.out.println("Давайте проверим достаточно ли у Вас ингридиентов.");
                 System.out.println("Укажите имеющиеся у Вас количество Яблок.");
                 int appleCount = scanner.nextInt();
                 System.out.println("Укажите имеющиеся у Вас количество Молока.");
                 int milkAmount = scanner.nextInt();
                 System.out.println("Укажите имеющиеся у Вас количество Муки.");
                 int powderAmount = scanner.nextInt();
                 System.out.println("Укажите имеющиеся у Вас количество Яиц.");
                 int eggsAmount = scanner.nextInt();

                 if (appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300 && eggsAmount >= 4)
                     System.out.println("Отлично! Все в наличии, начинайте готовить!");
                 else {
                     System.out.println("Не хватает ингридиентов, сверьтесь с рецептом!");
                 }
             } else {
                 System.out.println("Пожалуйста, выберите блюдо из меню или убедитесь в правильности написания!");
             }
         }

        //powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml


        //milk - 300 ml, powder - 5 g, eggs - 5


        //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4



    }
