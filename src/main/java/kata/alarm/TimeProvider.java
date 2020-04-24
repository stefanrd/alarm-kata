package kata.alarm;

import java.time.LocalTime;

public class TimeProvider {

  public LocalTime currentTime() {
    return LocalTime.now();
  }

}
