package pl.basicstuff.bean;

import org.springframework.stereotype.Component;
import pl.basicstuff.model.Box;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class BoxService {
    private List<Box> games;


    public BoxService() {
        games = new ArrayList<>();
        games.add(new Box(0L, "Battle of Legends, Volume One (2019)", Arrays.asList("King Arthur", "Alice", "Sinbad", "Medusa")));
        games.add(new Box(1L, "Robin Hood vs. Bigfoot (2019)", Arrays.asList("Robin Hood", "Bigfoot")));
        games.add(new Box(2L, "Bruce Lee (2019)", Arrays.asList("Bruce Lee")));
        games.add(new Box(3L, "Cobble & Fog (2020)", Arrays.asList("Invisible Man", "Sherlock Holmes", "Dracula", "Jekyll & Hyde")));
        games.add(new Box(4L, "Little Red Riding Hood vs. Beowulf (2020)", Arrays.asList("Little Red Riding Hood", "Beowulf")));
        games.add(new Box(5L, "Jurassic Park - InGen vs Raptors (2020)", Arrays.asList("InGen", "Raptors")));
        games.add(new Box(6L, "Buffy the Vampire Slayer (2020)", Arrays.asList("Buffy", "Willow", "Spike", "Angel")));
        games.add(new Box(7L, "Unmatched: Deadpool (2021)", Arrays.asList("Deadpool")));
        games.add(new Box(8L, "Hell's Kitchen (2021)", Arrays.asList("Daredevil", "Elektra", "Bullseye")));
        games.add(new Box(9L, "For King and Country (2021)", Arrays.asList("Black Widow", "Black Panther", "Winter Soldier")));
        games.add(new Box(10L, "Battle of Legends, Volume Two (2022)", Arrays.asList("Sun Wukong", "Yennenga", "Achilles", "Bloody Mary")));
        games.add(new Box(11L, "Redemption Row (2021)", Arrays.asList("Luke Cage", "Ghost Rider", "Moon Knight")));
        games.add(new Box(12L, "Teen Spirit (2021)", Arrays.asList("Ms. Marvel", "Squirrel Girl", "Cloak and Dagger")));
        games.add(new Box(13L, "Jurassic Park - Dr. Sattler vs. T. Rex (2021)", Arrays.asList("Dr. Sattler", "T.Rex")));
    }

    public List<Box> getList() {
        return games;
    }
}
