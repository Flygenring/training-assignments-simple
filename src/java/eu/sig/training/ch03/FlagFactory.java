package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

public class FlagFactory {

    // tag::getFlag[]
    public List<Color> getFlagColors(Nationality nationality) {
        HashMap<Nationality, List<Color>> flagColors = setupFlagColors();
        List<Color> result;

        return flagColors.getOrDefault(nationality, Arrays.asList(Color.GRAY));
    }

    private HashMap<Nationality, List<Color>> setupFlagColors() {
        HashMap<Nationality, List<Color>> map = new HashMap<Nationality, List<Color>>();

        map.put(DUTCH, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
        map.put(GERMAN, Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW));
        map.put(BELGIAN, Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED));
        map.put(FRENCH, Arrays.asList(Color.BLUE, Color.WHITE, Color.RED));
        map.put(ITALIAN, Arrays.asList(Color.GREEN, Color.WHITE, Color.RED));
        map.put(ROMANIA, Arrays.asList(Color.BLUE, Color.YELLOW, Color.RED));
        map.put(IRELAND, Arrays.asList(Color.GREEN, Color.WHITE, Color.ORANGE));
        map.put(HUNGARIAN, Arrays.asList(Color.RED, Color.WHITE, Color.GREEN));
        map.put(BULGARIAN, Arrays.asList(Color.WHITE, Color.GREEN, Color.RED));
        map.put(RUSSIA, Arrays.asList(Color.WHITE, Color.BLUE, Color.RED));
    }
    // end::getFlag[]

}