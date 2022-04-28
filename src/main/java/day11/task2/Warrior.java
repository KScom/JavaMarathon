package day11.task2;

public class Warrior extends Hero implements PhysAttack{

    public Warrior(){
        physDef = 0.8F;
        magicDef = 0;
        physAtt = 30;
    }

    @Override
    public String toString() {
        return "Warrior{health=" + String.valueOf(health) + "}";
    }

    @Override
    public void physicalAttack(Hero hero){
        int newHealth = (int) (hero.getHealth() - (physAtt - physAtt*(hero.getPhysDef())));
        if (newHealth<0) newHealth = 0;
        hero.setHealth(newHealth);
        System.out.println(hero);
    }
}
