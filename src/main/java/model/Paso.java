package model;

import java.util.LinkedList;

import javafx.scene.layout.VBox;

public class Paso {
    int paso;
    LinkedList x ;
    public Paso(){
        this.paso=0;
        x =new LinkedList<VBox>();
    }
    public int getPaso() {
        return paso;
    }
    public void setPaso(int paso) {
        this.paso = paso;
    }
    public LinkedList getX() {
        return x;
    }
    public void setX(LinkedList x) {
        this.x = x;
    }

    
}
