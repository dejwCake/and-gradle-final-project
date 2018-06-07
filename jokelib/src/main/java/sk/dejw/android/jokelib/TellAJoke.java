package sk.dejw.android.jokelib;

import java.util.Random;

public class TellAJoke {

    private String[] jokes = {
        "What do you call a cow with no legs?\r\n\r\nGround Beef!",
        "If the opposite of pro is con, isn't the opposite of progress, congress?",
        "I went to a wedding the other day.  Two antennas were getting married.  It wasn't much of a wedding ceremony, but it was one heck of a reception!",
        "There's this dyslexic guy... he walked into a bra...",
        "Do infants enjoy infancy as much as adults enjoy adultery?"
    };

    public String getJoke() {
        int randomNum = (int)(Math.random() * this.jokes.length);
        return jokes[randomNum];
    }
}
