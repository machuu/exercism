enum Signal {

    WINK            (0b00001),
    DOUBLE_BLINK    (0b00010),
    CLOSE_YOUR_EYES (0b00100),
    JUMP            (0b01000);

    public static int REVERSE = 0b10000;

    private final int key;
    private Signal ( int key ) {
        this.key   = key;
    }

    public boolean isEncoded ( int number ) {
        return (number & this.key) > 0;
    }

    public static boolean isReversed ( int number ) {
        return (number & Signal.REVERSE) > 0;
    }
}
