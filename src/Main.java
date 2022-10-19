public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Exercise 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println("Exercise 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        System.out.println("Exercise 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Exercise 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Exercise 6");
        var firsrBoxerWeight = 78.2;
        System.out.println("Вес первого боксера " + firsrBoxerWeight + " кг");
        var secondBoxerWeight = 82.7;
        System.out.println("Вес второго боксера " + secondBoxerWeight + " кг");
        var weightTweBoxer = firsrBoxerWeight + secondBoxerWeight;
        System.out.println("Вес двух боксеров " + weightTweBoxer + "кг");
        var differenceWeightTweBoxer = secondBoxerWeight - firsrBoxerWeight;
        System.out.println("Разнеца в весе между двумяя боксерами " + differenceWeightTweBoxer + " кг");

        System.out.println("Exercise 7");
        differenceWeightTweBoxer = secondBoxerWeight - firsrBoxerWeight;
        System.out.println("Разнеца в весе между двумяя боксерами " + differenceWeightTweBoxer + " кг");
        //Вычитание большего веса из меньшего//
        differenceWeightTweBoxer = secondBoxerWeight % firsrBoxerWeight;
        System.out.println("Разнеца в весе между двумяя боксерами " + differenceWeightTweBoxer + " кг");
        //Использование функции остаток от деления//

        System.out.println("Exercise 8");
        var workTimeOneDay = 640;
        System.out.println("Количество нормачасов на один рабочий день компании составляет " + workTimeOneDay);
        var workTimeOneWorker = 8;
        var quentityWorker = workTimeOneDay / workTimeOneWorker;
        System.out.println("Штат компании " + quentityWorker + " человек, при длительности рабочего дня " + workTimeOneWorker + " часов");
        quentityWorker = quentityWorker + 94;
        workTimeOneDay = quentityWorker * workTimeOneWorker;
        System.out.println("При увеличении штата сотрудников компании на 94 человека, количество нормочасов на один рабочий день должен составлять " + workTimeOneDay);

    }
}