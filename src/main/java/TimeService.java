import java.time.Clock;
import java.time.LocalTime;

public class TimeService {

        private final Clock clock;

        public TimeService(Clock clock) {
            this.clock = clock;
        }

        public int getHourOfDay() {
            LocalTime time = LocalTime.now(clock);
            return time.getHour();
        }
}

