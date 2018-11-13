package cs361.battleships.models;

public class Submarine extends Ship {
    public Submarine(){
        super();
        length = 5;
        health = length;
        shipType = "SUBMARINE";
        armor = true;
    }
}
