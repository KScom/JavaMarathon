package day11.task2;

public class Magician extends Hero implements PhysAttack,MagicAttack{

    public Magician(){
        physDef = 0.0F;
        magicDef = 0.8F;
        physAtt = 5;
        magicAtt = 20;
    }

    @Override
    public String toString() {
        return "Magician{health=" + String.valueOf(health) + "}";
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
}
