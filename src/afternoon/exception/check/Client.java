package afternoon.exception.check;

import java.util.Random;

public class Client {
    public void callException() throws MyCheckException {
            throw new MyCheckException("Client.call에서 에러 발생");
    }

    public void callRandException() throws MyCheckException2 {
        Random random = new Random();

        if(random.nextBoolean()) {
            throw new MyCheckException2("에러발생~");
        } else{
            System.out.println("lucky");
        }
    }
}
