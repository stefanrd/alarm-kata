package kata.localtime;

import java.time.LocalTime;

public class LocalTimeProvider implements ILocalTimeProvider{

	@Override
	public LocalTime getCurrentTime() {
		return LocalTime.now();
	}

}
