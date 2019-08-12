package server.error;

public class NettyRequestBodyException  extends Exception{

    public NettyRequestBodyException(String message) {
        super(""+message+" Only once but twice");
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}
