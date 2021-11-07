package pl.basicstuff.bean;

import org.springframework.stereotype.Component;
import pl.basicstuff.model.Box;

import java.util.ArrayList;
import java.util.List;

@Component
public class BoxService {
    private List<Box> games;


    public BoxService() {
        games = new ArrayList<>();
        games.add(new Box(1L, "Battle of Legends, Volume One (2019)", List.of("King Arthur", "Alice", "Sinbad", "Medusa")));
        games.add(new Box(2L,"Robin Hood vs. Bigfoot (2019)",List.of("Robin Hood", "Bigfoot")));
        games.add(new Box(3L,"Bruce Lee (2019)",List.of("Bruce Lee")));
        games.add(new Box(4L,"Cobble & Fog (2020)",List.of("Invisible Man", "Sherlock Holmes", "Dracula", "Jekyll & Hyde")));
        games.add(new Box(5L,"Little Red Riding Hood vs. Beowulf (2020)",List.of("Little Red Riding Hood", "Beowulf")));
        games.add(new Box(6L,"Jurassic Park – InGen vs Raptors (2020)",List.of("InGen", "Raptors")));
        games.add(new Box(7L,"Buffy the Vampire Slayer (2020)",List.of("Buffy", "Willow", "Spike", "Angel")));
        games.add(new Box(8L,"Unmatched: Deadpool (2021)",List.of("Deadpool")));

//        Below expansions are not yet published
//        games.add(new Box(9L,"Hell's Kitchen (2021)",List.of("Daredevil", "Elektra", "Bullseye")));
//        games.add(new Box(10L,"For King and Country (2021)",List.of("Black Widow", "Black Panther", "Winter Soldier")));
//        games.add(new Box(11L,"Battle of Legends, Volume Two (2022)",List.of("Sun Wukong", "Yennenga", "Achilles", "Bloody Mary")));
//        games.add(new Box(12L,"Redemption Row (2021)",List.of("Luke Cage", "Ghost Rider", "Moon Knight")));
//        games.add(new Box(13L,"Teen Spirit (2021)",List.of("Ms. Marvel", "Squirrel Girl", "Cloak and Dagger")));
//        games.add(new Box(14L,"Jurassic Park – Dr. Sattler vs. T. Rex (2021)",List.of("Dr. Sattler", "T.Rex")));
    }

    public List<Box> getList() {
        return games;
    }
}
