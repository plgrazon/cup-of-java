public class Main {
    public static void main(String[] args) {
        // wrong way
        Player player = new Player();
        player.name = "abcde";
        player.health = 20;
        player.weapon = "phone";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println(player.healthRemaining());

        damage = 11;
        // potential problem we can change it directly
        player.health = 200;
        player.loseHealth(damage);
        System.out.println(player.healthRemaining());

        // correct way
        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("abc", 500, "computer");
        System.out.println(enhancedPlayer.healthRemaining());
    }
}