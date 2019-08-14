package server.exception;
/**
 * @author yujian
 * @email 754369677@qq.com
 * 自定义异常
 */
public class NettyRequestBodyException  extends Exception{

    public NettyRequestBodyException(String message) {
        super(""+message+" Only once but twice");
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}
