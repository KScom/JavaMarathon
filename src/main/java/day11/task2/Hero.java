package day11.task2;

public abstract class Hero {

    int health = 100; //здоровье
    float physDef; //процент поглощения физического урона
    float magicDef; //процент поглощения магического урона
    int physAtt; //величина физической атаки, по необходимости
    int magicAtt; //величина магической атаки

    public float getPhysDef() {
        return physDef;
    }

    public float getMagicDef() {
        return magicDef;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public abstract String toString();

}
