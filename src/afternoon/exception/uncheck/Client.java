package afternoon.exception.uncheck;

public class Client {
    public void callException() {
            throw new MyUnCheckException("Client.call에서 에러 발생");
    }

    public void callException2() throws MyCheckException{
        throw new MyCheckException("Client.call에서 에러 발생");
    }
}
