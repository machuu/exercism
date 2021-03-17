import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> handshake = new ArrayList<Signal>();

        for ( Signal signal : Signal.values() ) {
            if ( signal.check(number) ) {
                handshake.add(signal);
            }
        }

        if ( Signal.reverse(number) ) {
            Collections.reverse(handshake);
        }

        return handshake;
    }

}
