package exceptionmulticatch.trainer;

import javax.swing.text.html.parser.Parser;
import java.text.ParseException;

public class TrainerParser {
    public static final String SEPARATOR = ";";

    public Trainer parse(String line) {
        try {
            String[] fields = line.split(SEPARATOR);
            return new Trainer(fields[0], Integer.parseInt(fields[1]));
        }
        catch (NullPointerException | IllegalArgumentException | IndexOutOfBoundsException e) {
            throw new ParserException("Invalid line: " + line, e);
        }
    }
}
