package kata.alarm;

import java.time.LocalTime;

public class Alarm {

  private final TimeProvider timeProvider;
  private final EmailService emailService;

  public Alarm(TimeProvider timeProvider, EmailService emailService) {
    this.timeProvider = timeProvider;
    this.emailService = emailService;
  }

  public int checkForAlarm() {

    final LocalTime now = timeProvider.currentTime();

    final int elapsed = (now.getHour() * 60 ) + now.getMinute();

    if (elapsed >= 500) {
      emailService.sendWarningEmail(elapsed);
    }

    return elapsed;

  }

}
