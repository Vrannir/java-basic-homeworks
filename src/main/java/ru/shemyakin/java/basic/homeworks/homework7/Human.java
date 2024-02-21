package ru.shemyakin.java.basic.homeworks.homework7;

public class Human implements Transport {
    private String name;
    private Transport curentTransport;

    public Human(String name) {
        this.name = name;
        this.curentTransport = this;
    }

    @Override
    public boolean move(int distance, Terrain terrain) {
        if (this.curentTransport == this) {
            System.out.println(this.name + " прошел пешком через " + terrain.getName());
            return true;
        }
        if (this.curentTransport.move(distance, terrain)) {
            System.out.println(this.name + " добрался через " + terrain.getName());
            return true;
        }
        System.out.println(this.name + " не смог добраться через " + terrain.getName());
        return false;
    }

    @Override
    public String getName() {
        return null;
    }

    public boolean getInTransport(Transport transport) {
        if (this.curentTransport == this) {
            this.curentTransport = transport;
            System.out.println(this.name + " сел в/на " + transport.getName());
            return true;
        }
        return false;
    }

    public boolean getOutTransport() {
        if (this.curentTransport != this) {
            this.curentTransport = this;
            System.out.println(this.name + " не использует больше транспорт");
            return true;
        }
        return false;
    }
}
