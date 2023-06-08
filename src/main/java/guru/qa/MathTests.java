package guru.qa;
public class MathTests {

    public static void main(String args[]) {

        //попробовать вычисления int
        int first = 101;
        int second = 10;
        System.out.println(first % second + "= остаток от деления first на second");

        // разница между a++ и ++a для int
        int a = 10;
        System.out.println("a++ =" + (a++));
        System.out.println("++a =" + (++a));


        //else if для int
        int cat = 6;
        int dog = 7;
        if (cat > dog) {
            System.out.println("cat bites dog");
        } else if (cat < dog) {
            System.out.println("dog bites cat");
        } else {
            System.out.println("bite each other");
        }

//посмотреть переполнения byte
        byte num1 = 127;
        num1 += 1;
        System.out.println(num1);

//вычисления комбинации int и double
        int meow = 10;
        double gaw = 10.5;
        System.out.println(meow + gaw);

        //упражнения с логическими операторами
        int vtrave = 1;
        int sidel = 2;
        int kuznechik = 4;
        if (vtrave < sidel && kuznechik > (vtrave + sidel)) {
            System.out.println("vtrave sidel kuznechik");
        }

        //switch

        String condition = "breakfast = ";
        String result;

        switch (condition) {
            case "ovsyanka": {
                result = "byaka";
                break;
            }
            case "pancakes": {
                result = "nyamka";
                break;
            }
            default: {
                result = "hungry";
            }
            System.out.println(condition + result);
        }


    }
}

