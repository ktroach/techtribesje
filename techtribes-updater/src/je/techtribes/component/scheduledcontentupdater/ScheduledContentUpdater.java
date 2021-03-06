package je.techtribes.component.scheduledcontentupdater;

import com.codingthearchitecture.seos.element.Component;

@Component(responsibility = "Refreshes the data behind techtribes.je on a scheduled basis.")
public interface ScheduledContentUpdater {

    public void start();

    public void stop();

}