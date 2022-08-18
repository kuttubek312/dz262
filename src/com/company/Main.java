package com.company;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

         // City деген класс тузунуз. (code, name, ...)
        //  Эгерде code так сан болсо TreeSet ke салыныз.
        //  Аларды чонунан кичинесине караган тартипте чыгарыныз.

        City city1 = new City(312, "Бишкек");
        City city2 = new City(306, "Ош");
        City city3 = new City(304, "Жалал-абад");
        City city4 = new City(309, "Ыссык-кол");
        City city5 = new City(308, "Наарын");
        City city6 = new City(307, "Чуй");
        City city7 = new City(305, "Талас");



        Set<City> cities = new TreeSet<>();
        cities.add(city1);
        cities.add(city2);
        cities.add(city3);
        cities.add(city4);
        cities.add(city5);
        cities.add(city6);
        cities.add(city7);
        for (City city : cities) {
            if (city.getCode() % 2 == 1){
                cities.add(city);
            }
        }
        System.out.print(cities);

    }
}