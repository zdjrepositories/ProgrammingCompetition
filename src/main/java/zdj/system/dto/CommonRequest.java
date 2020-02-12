package zdj.system.dto;

import zdj.system.commandExecutor.ResponseExecutor;
import zdj.system.sandbox.dto.Request;

public class CommonRequest {
	private ResponseExecutor executor;
	private Request request;

	public ResponseExecutor getExecutor() {
		return executor;
	}

	public void setExecutor(ResponseExecutor executor) {
		this.executor = executor;
	}

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}
}
