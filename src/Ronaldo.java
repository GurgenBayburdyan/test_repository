import java.util.logging.Logger;

/**
 * @author Gurgen Bayburdyan
 */
public class Ronaldo implements Footballer {
    private static final Logger logger = Logger.getLogger(Ronaldo.class.getName());

    @Override
    public void score() {
        logger.info("Attempting to score...");
        System.out.println("Siuuuuuuuuu");
        logger.info("Goal scored with a Siuuuu celebration!");
    }
}
