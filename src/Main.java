public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var totalWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Суммарный вес боксеров = "+ totalWeight + " кг");
        var weightDifference = boxerWeight1 - boxerWeight2;
        System.out.println("Разница в весе боксеров = "+ weightDifference + " кг");
        var weightDifference1 = boxerWeight2 - boxerWeight1;
        System.out.println("Разница в весе боксеров = "+ weightDifference1 + " кг");
        var weightDifference2 = boxerWeight2 % boxerWeight1;
        System.out.println("Разница в весе боксеров = "+ weightDifference2 + " кг");
        var totalTime = 640;
        var employeeTime = 8;
        var totalEmployees = totalTime / employeeTime;
        System.out.println("Всего работников в компании "+ totalEmployees + " человек");
        totalEmployees = totalEmployees + 94;
        System.out.println("Теперь работников в компании "+ totalEmployees + " человека");
        totalTime = totalEmployees * employeeTime;
        System.out.println("Если в компании работает " + totalEmployees + " человека, то всего " + totalTime + " часа работы может быть поделено между сотрудниками");
        System.out.println("Загружено через пул реквест");
        System.out.println("Домашнее задание №3");
        System.out.println("Задача №1");
        byte a = -113;
        System.out.println("Значение переменной a c типом byte равно " + a);
        short b = 130;
        System.out.println("Значение переменной b c типом short равно " + b);
        int c = 775;
        System.out.println("Значение переменной c c типом int равно " + c);
        long d = 900L;
        System.out.println("Значение переменной d c типом long равно " + d);
        float e = 1.9f;
        System.out.println("Значение переменной e c типом float равно " + e);
        double f = 12.123456789;
        System.out.println("Значение переменной f c типом double равно " + f);
        System.out.println("Задача №2");
        byte A = 67;
        System.out.println("A = " + A);
        short B = -159;
        System.out.println("B = " + B);
        int C = 569;
        System.out.println("C = " + C);
        int D = 27897;
        System.out.println("D = " + D);
        long E = 987678965549L;
        System.out.println("E = " + E);
        float F = 2.786f;
        System.out.println("F = " + F);
        double G = 27.12;
        System.out.println("G = " + G);
        System.out.println("Задача №3");
        byte lPStudents = 23;
        System.out.println("Количество учеников в классе Людмилы Павловны " + lPStudents + " ученика");
        byte aSStudents = 27;
        System.out.println("Количество учеников в классе Анны Сергеевны " + aSStudents + " учеников");
        byte eAStudents = 30;
        System.out.println("Количество учеников в классе Екатерины Андреевны " + eAStudents + " учеников");
        int allStudents = lPStudents + aSStudents + eAStudents;
        System.out.println("Всего в трех классах " + allStudents + " учеников");
        int sheetsPaper = 480;
        System.out.println("Всего закуплено бумаги " + sheetsPaper + " листов");
        int paperForEveryone = sheetsPaper / allStudents;
        System.out.println("На каждого ученика расчитано " + paperForEveryone + " листов бумаги");
        System.out.println("Задача №4");
        int bottlesInTwoMinutes = 16;
        System.out.println("Машина производит " + bottlesInTwoMinutes + " бутылок за 2 минуты");
        int bottlesInOneMinute = bottlesInTwoMinutes / 2;
        System.out.println("Машина производит " + bottlesInOneMinute + " бутылок в минуту");
        int bottlesInTwentyMinutes = bottlesInOneMinute * 20;
        System.out.println("За 20 минут машина произвела " + bottlesInTwentyMinutes + " штук бутылок");
        int bottlesPerDay = bottlesInOneMinute * 1440;
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок");
        int bottlesPerThreeDays = bottlesPerDay * 3;
        System.out.println("За три дня машина произвела " + bottlesPerThreeDays + " штук бутылок");
        int bottlesPerMonth = bottlesPerDay * 30;
        System.out.println("За месяц машина произвела " + bottlesPerMonth + " штук бутылок");
        System.out.println("Задача №5");
        int allPaintCans = 120;
        System.out.println("Всего куплено " + allPaintCans + " банок краски");
        int whitePaintForOneClass = 2;
        System.out.println("На один класс требуется " + whitePaintForOneClass + " банки белой краски");
        int brownPaintForOneClass = 4;
        System.out.println("На один класс требуется " + brownPaintForOneClass + " банки коричневой краски");
        int totalPaintForTheClass = whitePaintForOneClass + brownPaintForOneClass;
        System.out.println("На один класс требуется " + totalPaintForTheClass + " банок краски");
        int totalClasses = allPaintCans / totalPaintForTheClass;
        System.out.println("Всего " + totalClasses + " классов");
        int totalWhitePaint = totalClasses * whitePaintForOneClass;
        int totalBrownPaint = totalClasses * brownPaintForOneClass;
        System.out.println("В школе, где всего " + totalClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");
        System.out.println("Задача №6");
        int banana = 80;
        int milk100Ml = 105;
        int iceCream = 100;
        int egg = 70;
        int sportsBreakfastGram = (banana * 5) + (milk100Ml * 2) + (iceCream * 2) + (egg * 4);
        int grPerKg = 1000;
        System.out.println("Завтрак спортсмена составляет " + sportsBreakfastGram + " граммов продуктов");
        float sportsBreakfastKilo = sportsBreakfastGram / (float) grPerKg;
        System.out.println("Завтрак спортсмена составляет " + sportsBreakfastKilo + " килограммов продуктов");
        System.out.println("Задача №7");
        int needToLoseWeight = 7;
        System.out.println("Нужно сбросить " + needToLoseWeight + " кг");
        float dailyWeightLoss1 = 0.250f;
        float dailyWeightLoss2 = 0.500f;
        float daysForWeightLoss1 = needToLoseWeight / dailyWeightLoss1;
        System.out.println("Если терять по 250 грамм в день, то потребуется " + daysForWeightLoss1 + " дней");
        float daysForWeightLoss2 = needToLoseWeight / dailyWeightLoss2;
        System.out.println("Если терять по 500 грамм в день, то потребуется " + daysForWeightLoss2 + " дней");
        float averageDaysToLoseWeight = (daysForWeightLoss1 + daysForWeightLoss2) / 2;
        System.out.println("В среднем потребуется " + averageDaysToLoseWeight + " день");
        System.out.println("Задача №8");
        int MashaSalary = 67760;
        System.out.println("Зарплата Маши " + MashaSalary + " рублей");
        int MashaSalaryForTheYear = MashaSalary * 12;
        int DenisSalary = 83690;
        System.out.println("Зарплата Дениса " + DenisSalary + " рублей");
        int DenisSalaryForTheYear = DenisSalary * 12;
        int KristinaSalary = 76230;
        System.out.println("Зарплата Кристины " + KristinaSalary + " рублей");
        int KristinaSalaryForTheYear = KristinaSalary * 12;
        float MashaSalaryAfterIncrease = MashaSalary * 1.1f;
        float DenisSalaryAfterIncrease = DenisSalary * 1.1f;
        float KristinaSalaryAfterIncrease = KristinaSalary * 1.1f;
        float MashaSalaryAfterIncreaseForTheYear = MashaSalaryAfterIncrease * 12;
        float DenisSalaryAfterIncreaseForTheYear = DenisSalaryAfterIncrease * 12;
        float KristinaSalaryAfterIncreaseForTheYear = KristinaSalaryAfterIncrease * 12;
        float salaryDifferenceMasha = MashaSalaryAfterIncreaseForTheYear - MashaSalaryForTheYear;
        float salaryDifferenceDenis = DenisSalaryAfterIncreaseForTheYear - DenisSalaryForTheYear;
        float salaryDifferenceKristina = KristinaSalaryAfterIncreaseForTheYear - KristinaSalaryForTheYear;
        System.out.println("Маша теперь получает " + MashaSalaryAfterIncrease + " рублей, годовой доход вырос на " + salaryDifferenceMasha + "рублей");
        System.out.println("Денис теперь получает " + DenisSalaryAfterIncrease + " рублей, годовой доход вырос на " + salaryDifferenceDenis + "рублей");
        System.out.println("Кристина теперь получает " + KristinaSalaryAfterIncrease + " рублей, годовой доход вырос на " + salaryDifferenceKristina + "рублей");
    }
}