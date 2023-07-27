public class Main {
    public static void main(String[] args) {
        Point first = new Point(6,5);
        System.out.println(first);
        Point second = new Point(2,2);
        System.out.println(second);
        System.out.println("------------------------------");
        //System.out.println(first.distance());
        System.out.println("distance(2,2)= "+first.distance());
        System.out.println("distance(2,2)= "+first.distance(2,2));
        System.out.println("distance(second)= "+first.distance(second));
        System.out.println("------------------------------");
        Player p1 = new Player("Serkan",500,Weapon.SWORD);
        Player p2 =new Player("Musacan",100,Weapon.KNIFE);
        System.out.println(p1);
        System.out.println(p2);
        p1.attackedBy(p2);
        p1.attackedBy(p2);
        p1.loseHealth(60);
        p1.attackedBy(p2);
        System.out.println(p1);
        p1.restoreHealth(50);
        System.out.println(p1);
    }
}