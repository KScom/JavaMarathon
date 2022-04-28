package day11.task2;

public class Shaman extends Hero implements PhysAttack,MagicAttack,Healer {

    public Shaman(){
        physDef = 0.2F;
        magicDef = 2.2F;
        physAtt = 10;
        magicAtt = 15;
    }

    @Override
    public String toString() {
        return "Shaman{health=" + String.valueOf(health) + "}";
    }
    @Override
    public void physicalAttack(Hero hero){
        int newHealth = (int) (hero.getHealth() - (physAtt - physAtt*hero.getPhysDef()));
        if (newHealth<0) newHealth = 0;
        hero.setHealth(newHealth);
        System.out.println(hero);
    }

    @Override
    public void magicalAttack(Hero hero) {
        int newHealth = (int) (hero.getHealth() - (magicAtt - magicAtt*hero.getMagicDef()));
        if (newHealth<0) newHealth = 0;
        hero.setHealth(newHealth);
        System.out.println(hero);
    }
    @Override
    public void healHimself() {
        health += 50;
        if (health>100) health = 100;
        System.out.println(toString());
    }

    @Override
    public void healTeammate(Hero hero) {
        int newHeath = hero.getHealth();
        newHeath += 30;
        if (newHeath>100) newHeath = 100;
        hero.setHealth(newHeath);
        System.out.println(hero);
    }
}

