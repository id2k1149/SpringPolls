package ru.javawebinar.springpolls.model;

import java.util.List;

public class Menu {
    private Diner diner;
    private List<Dish> menuItems;

    public Menu(Diner diner, List<Dish> menuItems) {
        this.diner = diner;
        this.menuItems = menuItems;
    }

    public Diner getDiner() {
        return diner;
    }

    public void setDiner(Diner diner) {
        this.diner = diner;
    }

    public List<Dish> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<Dish> menuItems) {
        this.menuItems = menuItems;
    }
}
