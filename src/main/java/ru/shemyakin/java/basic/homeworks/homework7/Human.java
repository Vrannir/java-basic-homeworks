package ru.shemyakin.java.basic.homeworks.homework7;

public class Human {
    private String name;
    private Transport curentTransport;

    public Human(String name) {
        this.name = name;
        this.curentTransport = null;
    }

    public boolean move(int distance, Terrain terrain) {
        if (this.curentTransport == null) {
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

    public boolean getInTransport(Transport transport) {
        if (this.curentTransport == null) {
            this.curentTransport = transport;
            System.out.println(this.name + " сел в/на " + transport.getName());
            return true;
        }
        return false;
    }

    public boolean getOutTransport() {
        if (this.curentTransport != null) {
            this.curentTransport = null;
            System.out.println(this.name + " не использует больше транспорт");
            return true;
        }
        return false;
    }
}
