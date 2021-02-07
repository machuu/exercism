import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> handshake = new ArrayList<Signal>();

        if ( (number & 0b00001) > 0 ) {
            handshake.add(Signal.WINK);
        }

        if ( (number & 0b00010) > 0 ) {
            handshake.add(Signal.DOUBLE_BLINK);
        }

        if ( (number & 0b00100) > 0 ) {
            handshake.add(Signal.CLOSE_YOUR_EYES);
        }

        if ( (number & 0b01000) > 0 ) {
            handshake.add(Signal.JUMP);
        }

        if ( (number & 0b10000) > 0 ) {
            Collections.reverse(handshake);
        }

        return handshake;
    }

}
