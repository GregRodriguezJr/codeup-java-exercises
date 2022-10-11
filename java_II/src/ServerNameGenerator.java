import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {
        String [] adjectives = {"victorious", "proud", "witty", "plain", "clean", "elegant", "fit", "jolly", "lively", "silly" };

        String [] nouns = {"fire", "detail", "change", "act", "design", "iron", "flight", "kick", "land", "jelly"};

        String random1 = ServerNameGenerator.getName(adjectives);
        String random2 = ServerNameGenerator.getName(nouns);

        System.out.println("Here is your server name:\n" + random2 + "-" + random1);
    }

    public static String getName(String [] arr) {
        int randomInt = new Random().nextInt(arr.length);
        return arr[randomInt];
    }
}
