package com.company;

public class Fighter {
    public String name;
    public int health, damagePerAttack;
    public Fighter (String name, int health, int damagePerAttack){
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
        /*String firstAttacker = "Harry";
        Fighter fighter1 = new Fighter("Harald", 20, 5);
        Fighter fighter2 = new Fighter("Harry", 5, 4);
        String res = "";
        if(firstAttacker == fighter1.name){
            while (true){
                fighter2.health -= fighter1.damagePerAttack;
                if(fighter2.health <= 0){
                    res = fighter1.name;
                    break;
                }
                fighter1.health -= fighter2.damagePerAttack;
                if(fighter1.health <= 0){
                    res = fighter2.name;
                    break;
                }
            }
        }
        else if(firstAttacker == fighter2.name){
            while (true){
                fighter1.health -= fighter2.damagePerAttack;
                if(fighter1.health <= 0){
                    res = fighter2.name;
                    break;
                }
                fighter2.health -= fighter1.damagePerAttack;
                if(fighter2.health <= 0){
                    res = fighter1.name;
                    break;
                }
            }
        }
        System.out.println(res);*/
    }
}
