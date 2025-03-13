package org.example.rpg;

public abstract class Monster{
    protected  String name;
    protected  int hitPoints;
    protected  double damage;

    Monster(String name,int hitPoints,double damage){
        this.name=name;
        this.hitPoints=hitPoints;
        this.damage=damage;
    }

    public String getName(){
        return name;
    }
    public int getHitPoints(){
        return hitPoints;
    }
    public double getDamage(){
        return damage;
    }

    public double attack() {
        double bleedDamage = 0;
        double poisonDamage = 0;


        if (this instanceof Bleedable) {
            bleedDamage = ((Bleedable)this).bleed();
        }

        if (this instanceof Poisonable) {
            poisonDamage = ((Poisonable)this).poison();
        }
        return getDamage() + bleedDamage + poisonDamage;
    }


}
