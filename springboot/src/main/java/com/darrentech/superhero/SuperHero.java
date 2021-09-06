package com.darrentech.superhero;

import java.util.Objects;

public class SuperHero {
    private String name;
    private String superPower;

    public SuperHero(String name, String superPower) {
        this.name = name;
        this.superPower = superPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    @Override
    public String toString() {
        return "SuperHero{" +
                "name='" + name + '\'' +
                ", superPower='" + superPower + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuperHero superHero = (SuperHero) o;
        return Objects.equals(name, superHero.name) && Objects.equals(superPower, superHero.superPower);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, superPower);
    }


}
