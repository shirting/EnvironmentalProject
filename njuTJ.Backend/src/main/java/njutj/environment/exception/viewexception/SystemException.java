package njutj.environment.exception.viewexception;

import njutj.environment.response.WrongResponse;

public class SystemException extends Exception {
    private WrongResponse response = new WrongResponse(10001, "System is error.");

    public WrongResponse getResponse() {
        return response;
    }
}
