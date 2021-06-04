package entity;

import logic.IVehicle;

public class TwoWheeler implements IVehicle {
    private String id;
    private String type;
    public TwoWheeler(String id, String type){
        this.id = id;
        this.type = type;
    }

    @Override
    public void start() {
        System.out.println(" start method");

    }

    @Override
    public void accelerate(int speed) {
        System.out.println("accelerate method");
    }

    @Override
    public void brake() {
        System.out.println(" brake method");
    }

    @Override
    public void stop() {
        System.out.println(" stop method");
    }
}
