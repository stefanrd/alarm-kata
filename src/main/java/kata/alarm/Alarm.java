package kata.alarm;

import java.time.LocalTime;

public class Alarm {

  public int checkForAlarm() {

    final LocalTime now = LocalTime.now();

    final int elapsed = (now.getHour() * 60 ) + now.getMinute();

    if (elapsed >= 500) {
      new EmailService().sendWarningEmail(elapsed);
    }

    return elapsed;

  }

}
