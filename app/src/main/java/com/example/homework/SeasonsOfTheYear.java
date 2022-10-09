package com.example.homework;
//1 Создать перечисление, содержащее названия времен года.
//2 Создать переменную содержащую ваше любимое время года и распечатать всю информацию о нем.
//3 Создать метод, который принимает на вход переменную созданного вами enum типа.
// Если значение равно Лето, выводим на консоль “Я люблю лето” и так далее. Используем оператор switch.
//4 Перечисление должно содержать переменную, содержащую среднюю температуру в каждом времени года.
//5 Добавить конструктор принимающий на вход среднюю температуру.
//6 Создать метод getDescription, возвращающий строку “Холодное время года”.
// Переопределить метод getDescription - для константы Лето метод должен возвращать “Теплое время года”.
//7 В цикле распечатать все времена года, среднюю температуру и описание времени года.
public class SeasonsOfTheYear {

    enum Season {
        WINTER(-3) {
            @Override
            String getDescription() {
                return "Warm season";
            }
        },
        SPRING(11),
        SUMMER(22),
        AUTUMN(10);

        private final int temperature;
        Season(int temperature) {
            this.temperature = temperature;
        }

        String getDescription(){
            return "Сold season";
        }
    }

    public static void main(String[] args) {
        Season season = Season.SPRING;
        String favoriteSeason = "Spring is the time of year when snowdrifts thaw and everything turns green little by little.\nFirst flowers come out and trees are in bloom. May is the warmest spring month. In May weather is usually very nice.\nWarm wind blows and the sun beams.\n";
        System.out.println("My favorite season - " + Season.SPRING + "\n" + favoriteSeason);

        for (Season allSeasons : Season.values()) {
            System.out.println("Season: " + allSeasons + ". Average temperature of the season: " + allSeasons.temperature);
        }
    }
    void choiceSeason(Season nameSeason) {
        switch (nameSeason) {
            case SUMMER:
                System.out.println("I love summer");
                break;
            case AUTUMN:
                System.out.println("I love autumn");
                break;
            case WINTER:
                System.out.println("I love winter");
                break;
            case SPRING:
                System.out.println("I love spring");
                break;
        }
    }
}
