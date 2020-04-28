package kata.localtime;

import java.time.LocalTime;

public class FakeLocalTimeProvider implements ILocalTimeProvider{
	
    private final LocalTime fakeLocalTime;
	
	public FakeLocalTimeProvider(LocalTime fakeLocalTime) {
		this.fakeLocalTime = fakeLocalTime;
	}
	@Override
	public LocalTime getCurrentTime() {
		return fakeLocalTime;
	}

}
