package day11.task2;

public class Paladin extends Hero implements PhysAttack,Healer{

    public Paladin() {
        physDef = 0.5F;
        magicDef = 0.2F;
        physAtt = 15;
    }

    @Override
    public String toString() {
        return "Paladin{health=" + String.valueOf(health) + "}";
    }

    @Override
    public void physicalAttack(Hero hero){
        int newHealth = (int) (hero.getHealth() - (physAtt - physAtt*hero.getPhysDef()));
        if (newHealth<0) newHealth = 0;
        hero.setHealth(newHealth);
        System.out.println(hero);
    }

    @Override
    public void healHimself() {
            health += 25;
            if (health>100) health = 100;
        System.out.println(toString());
    }

    @Override
    public void healTeammate(Hero hero) {
        int newHeath = hero.getHealth();
        newHeath += 10;
        if (newHeath>100) newHeath = 100;
        hero.setHealth(newHeath);
        System.out.println(hero);
    }
}
