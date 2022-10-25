package com.example.homework.RightDecisionOfTheStore;

import java.util.Objects;

public class Good {

    private int id;
    private String name;
    private int price;

// создаем конструктор
    public Good(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
// переопределяем товар по айдишнику
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Good good = (Good) o;
        return id == good.id;
    }
// не забываем также про переопределения хэшкода
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
