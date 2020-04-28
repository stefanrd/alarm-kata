package kata.alarm;

import java.time.LocalTime;

import kata.localtime.ILocalTimeProvider;
import kata.localtime.LocalTimeProvider;

public class Alarm {
  private final ILocalTimeProvider localTimeProvider;
  private final EmailService emailService;
  
  public Alarm() {
	  localTimeProvider = new LocalTimeProvider();
	  emailService = new EmailService();
  }
  
  public Alarm(ILocalTimeProvider localTimeProvider, EmailService emailService) {
	  this.localTimeProvider = localTimeProvider;
	  this.emailService = emailService;
  }
  
  public int checkForAlarm() {

    final LocalTime currentTime = localTimeProvider.getCurrentTime();

    final int elapsed = getElapsedTimeInMinutes(currentTime);

    if (elapsed >= 500) {
      emailService.sendWarningEmail(elapsed);
    }

    return elapsed;

  }
  
  private int getElapsedTimeInMinutes(LocalTime localTime) {
	  return localTime.getHour() * 60 + localTime.getMinute();
  }

}
