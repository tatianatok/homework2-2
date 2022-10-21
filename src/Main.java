public class Main {
    public static void main(String[] args) {
        byte apple=5;
        short bananas=8;
        int orange=24;
        long lemons=35;
        float juce=7;
        double milk=2.3;
        System.out.println("Значение переменной apple с типом byte равно " + apple);
        System.out.println("Значение переменной bananas с типом short равно " + bananas);
        System.out.println("Значение переменной orange с типом int равно " + orange);
        System.out.println("Значение переменной lemons с типом long равно " + lemons);
        System.out.println("Значение переменной juce с типом float равно " + juce);
        System.out.println("Значение переменной milk с типом double равно " + milk);

        byte money =67;
        short line=-159;
        int books=569;
        long pages=987678965;
        float water = 27897;
        double paper =27.12;
        boolean year=false;
        System.out.println("Значение переменной money с типом byte равно " + money);
        System.out.println("Значение переменной line с типом short равно " + line);
        System.out.println("Значение переменной books с типом int равно " + books);
        System.out.println("Значение переменной pages с типом long равно " + pages);
        System.out.println("Значение переменной water с типом float равно " + water);
        System.out.println("Значение переменной paper с типом double равно " + paper);
        System.out.println("Значение переменной year с типом boolean равно " + year);

        byte teacher1=23;
        byte teacher2=27;
        byte teacher3=30;
        int totalStudent=teacher1+teacher2+teacher3;
        int paperForStudent=480/totalStudent;
        System.out.println("На каждого ученика рассчитано " +paperForStudent + " листов бумаги");

        byte bottles=16;
        byte time=2;
        byte time20Min=20;
        int minute=time20Min/time;
        int bottlesFor20Min=bottles*minute;
        System.out.println("За " + time20Min + " минут, машина произвела бутылок " + bottlesFor20Min + " штук.");
        int bottlesPerHour=60/time20Min*bottlesFor20Min;
        int bottlesPerDay=bottlesPerHour*24;
        System.out.println("За 1 сутки машина произвела бутылок " + bottlesPerDay + " штук.");
        int bottlesPer3Days=bottlesPerDay*3;
        System.out.println("За 3 дня, машина произвела бутылок " + bottlesPer3Days + " штук.");
        int bottlesPer1month=bottlesPerDay*30;
        System.out.println("За 1 месяц, машина произвела бутылок " + bottlesPer1month + " штук.");

        int totalPot=120;
        byte whiteFor1Room=2;
        byte brawnFor1Room=4;
        int totalFor1Room=whiteFor1Room+brawnFor1Room;
        int totalrooms=totalPot/totalFor1Room;
        int totalWhite=totalrooms*whiteFor1Room;
        int totalBrawn=totalrooms*brawnFor1Room;
        System.out.println( "В школе, где " +totalrooms+ " классов, нужно " +totalWhite + " банок белой краски и " + totalBrawn + " банок коричневой краски.");

        byte bananaGr=80;
        byte milkGr=105;
        byte icecreamGr=100;
        byte eggGr=70;
        byte bananaTh=5;
        int milkMl=2;
        byte icecreamTh=2;
        byte eggs=4;
        int blender=bananaGr*bananaTh+milkGr*milkMl+icecreamGr*icecreamTh+eggGr*eggs;
        System.out.println("Вес такого спорт-завтрака равен " + blender + " гр.");
        double kg=blender*0.001;
        System.out.println("Вес такого спорт-завтрака равен " + kg + " кг.");

        byte totalWightKg=7;
        int totalWightGr=totalWightKg*1000;
        int lose250=250;
        int lose500=500;
        int quantityDays250=totalWightGr/lose250;
        int quanyityDays500=totalWightGr/lose500;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то вес уйдет за " + quantityDays250 + " дней. Если спортсмен будет терять каждый день по 500 грамм, то вес уйдет за " + quanyityDays500 + " дней.");

        int masha=67_760;
        double plus=0.1;
        double mashaPlus=masha*plus+masha;
        int mashaYear=masha*12;
        double mashaYearPlus=mashaPlus*12;
        double mashaTotalYear=mashaYearPlus%mashaYear;
        System.out.println("Маша теперь получает " + mashaPlus + " рублей. Годовой доход вырос на " +mashaTotalYear+ " рублей");

        int denis=83_690;
        double denisPlus=denis*plus+denis;
        int denisYear=denis*12;
        double denisYearPlus=denisPlus*12;
        double denisTotalYear=denisYearPlus%denisYear;
        System.out.println("Денис теперь получает " + denisPlus + " рублей. Годовой доход вырос на " + denisTotalYear + " рублей");

        int kristina=76_230;
        double kristinaPlus=kristina*plus+kristina;
        int kristinaYear=kristina*12;
        double kristinaYearPlus=kristinaPlus*12;
        double kristinaTotalYear=kristinaYearPlus%kristinaYear;
        System.out.println("Кристина теперь получает " + kristinaPlus + " рублей. Годовой доход вырос на " +  kristinaTotalYear + " рублей");



    }
}