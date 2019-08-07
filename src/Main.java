public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setHits(50);

        Warrior warrior = new Warrior();
        warrior.setHealth(250);
        warrior.setHits(20);

        Magical magical = new Magical();
        magical.setHealth(250);
        magical.setHits(20);

        Mental mental = new Mental();
        mental.setHealth(250);
        mental.setHits(20);

        System.out.println("Boss health = " + boss.getHealth() +
                       "; " + "Boss hits = " + boss.getHits() + ".");
        System.out.println("Warrior health = " + warrior.getHealth() +
                "; " + "Warrior hits = " + warrior.getHits() + ".");
        System.out.println("Magical health = " + magical.getHealth() +
                "; " + "Magical hits = " + magical.getHits() + ".");
        System.out.println("Mental health = " + mental.getHealth() +
                "; " + "Mental hits = " + mental.getHits() + ".");

    }
}
