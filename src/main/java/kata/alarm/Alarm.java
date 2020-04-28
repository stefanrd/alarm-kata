package kata.alarm;

import java.time.LocalTime;

import kata.localtime.ILocalTimeProvider;
import kata.localtime.LocalTimeProvider;

public class Alarm {
  private final ILocalTimeProvider localTimeProvider;
  
  public Alarm() {
	  localTimeProvider = new LocalTimeProvider();
  }
  
  public int checkForAlarm() {

    final LocalTime currentTime = localTimeProvider.getCurrentTime();

    final int elapsed = (now.getHour() * 60 ) + now.getMinute();

    if (elapsed >= 500) {
      new EmailService().sendWarningEmail(elapsed);
    }

    return elapsed;

  }

}
