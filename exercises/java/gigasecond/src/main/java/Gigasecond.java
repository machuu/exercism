import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

	private static final long ONE_GIGASECOND = 1_000_000_000;
	private LocalDateTime gigasecondDateTime;

    Gigasecond(LocalDate moment) {
		LocalDateTime momentDateTime = moment.atStartOfDay();
		gigasecondDateTime = momentDateTime.plusSeconds(ONE_GIGASECOND);
    }

    Gigasecond(LocalDateTime moment) {
		gigasecondDateTime = moment.plusSeconds(ONE_GIGASECOND);
    }

    LocalDateTime getDateTime() {
		return gigasecondDateTime;
    }

}
