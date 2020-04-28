package Alarm;

import static org.junit.Assert.assertEquals;

import java.time.LocalTime;
import kata.alarm.EmailService;
import kata.alarm.Alarm;

import org.junit.Test;

import kata.localtime.FakeLocalTimeProvider;

public class AlarmTests {

	@Test
	public void ShouldNotSendMailFor8Hours0Minutes() {
		// Arrange
		FakeLocalTimeProvider fakeLocalTimeProvider = new FakeLocalTimeProvider(LocalTime.of(8, 0));
		EmailService emailService = new EmailService();
		Alarm alarm = new Alarm(fakeLocalTimeProvider, emailService);
		
		// Act
		int elapsedTimeInminutes = alarm.checkForAlarm();
		
		// Assert
		assertEquals(480, elapsedTimeInminutes);
	}
	
	@Test
	public void ShouldSendMailFor8Hours21Minutes() {
		// Arrange
		FakeLocalTimeProvider fakeLocalTimeProvider = new FakeLocalTimeProvider(LocalTime.of(8, 21));
		EmailService emailService = new EmailService();
		Alarm alarm = new Alarm(fakeLocalTimeProvider, emailService);

		// Act
		int elapsedTimeInminutes = alarm.checkForAlarm();

		// Assert
		assertEquals(501, elapsedTimeInminutes);
	}
}
