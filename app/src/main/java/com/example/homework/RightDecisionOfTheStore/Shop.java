package com.example.homework.RightDecisionOfTheStore;

import java.util.HashSet;

public class Shop {

    // создаем поле коллекции
    HashSet<Good> goodList = new HashSet<Good>();

    //создаем метод добавления товара
    void addGood(Good good){
        goodList.add(good);
    }

    //создаем метод получения товара
    HashSet<Good> getAllGoods() {
        return goodList;
    }

    //создаем метод удаления товара
    void deleteGood(int id) {
        //тут удаляем по айдишнику(если такой айдишник есть в коллекции)
        goodList.removeIf(good -> good.getId() == id);
    }

    //создаем метод редактирования товара
    void editGood(Good good) {
        //пробегаемся по коллекции
        for (Good goodInList : goodList) {
            //проверяем есть ли в коллекции товар с таким же айдишником который мы хотим изменить
            if (goodInList.getId() == good.getId()) {
                //если есть то удаляем такой товар
                goodList.remove(goodInList);
                //и добавляем уже измененный
                goodList.add(good);
            }
        }
    }
}
