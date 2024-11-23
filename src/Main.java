//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Задание 1
        System.out.println("\nЗадание 1:");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog=" + dog + "\ncat=" + cat + "\npaper=" + paper);

        //Задание 2
        System.out.println("\nЗадание 2:");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("dog=" + dog + "\ncat=" + cat + "\npaper=" + paper);

        //Задание 3
        System.out.println("\nЗадание 3:");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("dog=" + dog + "\ncat=" + cat + "\npaper=" + paper);

        //Задание 4
        System.out.println("\nЗадание 4:");
        var friend = 19;
        System.out.println("friend=" + friend);
        friend  = friend + 2;
        System.out.println("friend+2=" + friend);
        friend  = friend / 7;
        System.out.println("friend/7=" + friend);

        //Задание 5
        System.out.println("\nЗадание 5:");
        var frog = 3.5;
        System.out.println("frog=" + frog);
        frog  = frog * 10;
        System.out.println("frog*10=" + frog);
        frog  = frog / 3.5;
        System.out.println("frog/3.5=" + frog);
        frog  = frog + 4;
        System.out.println("frog+4=" + frog);

        //Задание 6
        System.out.println("\nЗадание 6:");
        var massSum = 78.2 + 82.7;
        System.out.println("Общая масса двух бойцов — "+massSum+" кг.");
        var massDiff = 82.7 - 78.2;
        System.out.println("Разница между массами бойцов — "+massDiff+" кг.");

        //Задание 7
        System.out.println("\nЗадание 7:");
        var modMass = 82.7 % 78.2;
        System.out.println("Остаток от деления между двумя весами — "+modMass);

        //Задание 8
        System.out.println("\nЗадание 8:");
        var sumWorkHours = 640;
        var unitWorkHours = 8;
        var empQty = sumWorkHours / unitWorkHours;
        System.out.println("Всего работников в компании — "+empQty+" человек");
        empQty = empQty + 94;
        sumWorkHours = empQty * unitWorkHours;
        System.out.println("Если в компании работает "+empQty+" человек, то всего "+sumWorkHours+" часов работы может быть поделено между сотрудниками");
    }
}