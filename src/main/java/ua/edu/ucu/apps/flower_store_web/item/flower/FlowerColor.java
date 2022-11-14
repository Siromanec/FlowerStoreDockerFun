package ua.edu.ucu.apps.flower_store_web.item.flower;

/**
 * all possible flower colors
 */
public enum FlowerColor {
    /**
     * red
     */
    RED("red"),
    /**
     * blue
     */

    BLUE("blue"),
    /**
     * white
     */
    WHITE("white"),
    /**
     * pink
     */
    PINK("pink");

    private final String stringRepresentation;

    /**
     * sets all enum values
     * @param stringRepresentation string representation of the color
     */
    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    /**
     * to string
     * @return stringRepresentation of the color
     */
    @Override
    public String toString() {
        return stringRepresentation;
    }

    public static FlowerColor fromString(String clr) {
        for (FlowerColor flowerColor: FlowerColor.values()) {
            if (flowerColor.toString().equalsIgnoreCase(clr)) {
                return flowerColor;
            }
        }
        return null;
    }
}

