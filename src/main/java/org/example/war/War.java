package org.example.war;

import org.example.saxon.Saxon;
import org.example.vikins.Vikings;

import java.util.ArrayList;

public class War {
    private ArrayList<Vikings> vikingArmy = new ArrayList<>();
    private ArrayList<Saxon> saxonArmy = new ArrayList<>();

    public ArrayList<Vikings> getVikingArmy() {
        return vikingArmy;
    }

    public void setVikingArmy(ArrayList<Vikings> vikingArmy) {
        this.vikingArmy = vikingArmy;
    }

    public ArrayList<Saxon> getSaxonArmy() {
        return saxonArmy;
    }

    public void setSaxonArmy(ArrayList<Saxon> saxonArmy) {
        this.saxonArmy = saxonArmy;
    }

    public void addViking(Vikings vikings){
        vikingArmy.add(vikings);
    }

    public void addSaxon(Saxon saxon){
        saxonArmy.add(saxon);
    }

    public void vikingAttack(){
        
    }

}
