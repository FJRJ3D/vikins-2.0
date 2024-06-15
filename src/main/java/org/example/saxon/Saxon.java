package org.example.saxon;

import org.example.soldier.Soldier;

public class Saxon extends Soldier {

    private String msg;

    public Saxon(int health, int strength) {
        super(health, strength);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public void receiveDamage(int damage) {
        super.receiveDamage(damage);
        if (health>0){
            setMsg("A Saxon has received"+damage+"points of damage");
        } else {
            setMsg("A Saxon has died in combat");
        }
    }

    @Override
    public int attack() {
        return super.attack();
    }
}