import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Övning 1
        int h = 12;
        double j = 4.76;
        String kurs = "java";
        kurs = "start";

        System.out.println(h);
        System.out.println(kurs);

        // Övning 2
        String name;
        int age;
        Scanner cs = new Scanner(System.in);
        System.out.println("Skriv in ditt namn");
        name = cs.nextLine();
        System.out.println("Skriv in din ålder");
        age = cs.nextInt();

        System.out.println("Ditt namn är " + name + "och din ålder är " + age);


        // övning 3
        double radie;
        Scanner cs = new Scanner(System.in);
        System.out.println("Skriv in radien");
        radie = cs.nextDouble();
        double area = (Math.PI * (radie * radie));
        System.out.println("Arean är:" + area);


        // övning 4
        Scanner sc = new Scanner(System.in);
        int age;

        System.out.println("Skriv din ålder: ");
        age = sc.nextInt();

        double ageInMonths = age * 12;
        long ageInDays = age * 365L;
        long ageInMinutes = (long) age * 365 * 24 * 60;

        System.out.println("Du är " + ageInMonths + " månader gammal");
        System.out.println("Du är " + ageInDays + " dagar gammal");
        System.out.println("Du är " + ageInMinutes + " minuter gammal");

        System.out.println("Du är " + ageInMonths + ageInDays + ageInMinutes);


        // Övning 5
        boolean loggedIn = true;
        boolean paid = true;

        if (loggedIn) {
            System.out.println("Användaren online");
        } else {
            System.out.println("Användaren offline");
        }
        if (paid) {
            System.out.println("Användaren har betalat för tjänsten");
        } else {
            System.out.println("Användaren har inte betalat för tjänsten");
        }


        // Övning 6
        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("Skriv någonting");
        input = sc.nextLine();
        input = input.toUpperCase();
        System.out.println("Din sträng i stora bokstäver är  " + input);
        int length;
        length = input.length();
        System.out.println("längden poå din sträng är " + length);


        System.out.println("Individual characters from given string: ");
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }



        // övning 7
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.println("Skriv ett heltal");
        input = sc.nextInt();
        double converted = input;
        System.out.println("Din input omgjord i decimaltal är: " + converted);

        

        double input2;
        System.out.println("Skriv ett decimaltal");
        input2 = sc.nextDouble();
        int converted2 = input2;
        System.out.println("Din input omgjord i decimaltal är: " + converted2);


    }
}