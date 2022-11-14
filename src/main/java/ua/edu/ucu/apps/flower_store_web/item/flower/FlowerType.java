package ua.edu.ucu.apps.flower_store_web.item.flower;

/**
 * lists all possible flowers
 */
public enum FlowerType {
    /**
     * chamomile
     */
    ROMASHKA("Romashka"),
    /**
     * rose
     */
    ROSE("Rose"),
    /**
     * tulip
     */
    TULIP("Tulip"),
    /**
     * cactus
     */
    CACTUS("Cactus")
    ;
    private final String stringRepresentation;

    /**
     * sets all enum values
     * @param stringRepresentation string representation of the type
     */
    FlowerType(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    /**
     * to string
     * @return stringRepresentation of the type
     */
    @Override
    public String toString() {
        return stringRepresentation;
    }
}
