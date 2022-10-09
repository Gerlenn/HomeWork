package com.example.homework;
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
        SeasonsOfTheYear seasonsOfTheYear = new SeasonsOfTheYear();
        seasonsOfTheYear.choiceSeason(Season.SPRING);

        Season season = Season.SPRING;
        String favoriteSeason = "Spring is the time of year when snowdrifts thaw and everything turns green little by little.\nFirst flowers come out and trees are in bloom. May is the warmest spring month. In May weather is usually very nice.\nWarm wind blows and the sun beams.\n";
        System.out.println("My favorite season - " + season + "\n" + favoriteSeason);


        for (Season allSeasons : Season.values()) {
            System.out.println("Season: " + allSeasons + ". Average temperature of the season: " + allSeasons.temperature);
        }
    }
    void choiceSeason(Season nameSeason) {
        switch (nameSeason) {
            case SUMMER:
                System.out.println("I love summer\n");
                break;
            case AUTUMN:
                System.out.println("I love autumn\n");
                break;
            case WINTER:
                System.out.println("I love winter\n");
                break;
            case SPRING:
                System.out.println("I love spring\n");
                break;
        }
    }
}
