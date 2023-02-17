public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        assert warrior.getHp() == 100;
        warrior.damage(20);
        assert warrior.getHp() == 80;
        warrior.fix(5);
        assert warrior.getHp() == 85;
        assert warrior.isAlive();
        warrior.damage(150);
        assert !warrior.isAlive();
        assert warrior.getHp() == 0;
    }
}