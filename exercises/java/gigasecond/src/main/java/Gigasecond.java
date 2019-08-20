import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;

class Gigasecond {

	private static final Duration ONE_GIGASECOND = Duration.ofSeconds(1_000_000_000);
	private LocalDateTime gigasecondDateTime;

    Gigasecond(LocalDate moment) {
		gigasecondDateTime = moment.atStartOfDay().plus(ONE_GIGASECOND);
    }

    Gigasecond(LocalDateTime moment) {
		gigasecondDateTime = moment.plus(ONE_GIGASECOND);
    }

    LocalDateTime getDateTime() {
		return gigasecondDateTime;
    }

}
