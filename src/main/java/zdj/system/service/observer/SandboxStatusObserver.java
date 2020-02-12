package zdj.system.service.observer;

import java.util.Collection;

import zdj.system.service.bean.SandboxStatus;

public interface SandboxStatusObserver {
	void statusChanged(Collection<SandboxStatus> status);
}
