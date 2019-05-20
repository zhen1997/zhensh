/** ????? ????��??? */
public class Test {
    private volatile static Test instance = null;
    private Test(){}
    private static Test getInstance(){
        if (null == instance){
            synchronized (Test.class){
                if(null == instance){
                    instance = new Test();
                }
            }
        }
        return instance;
    }
}

/** ????? ????��??? */
public class Test {
    private volatile static Test instance = null;
    private Test(){}
    private static Test getInstance(){
        if (null == instance){
            synchronized (Test.class){
                if(null == instance){
                    instance = new Test();
                }
            }
        }
        return instance;
    }
}
/**
 * 刘延超 双重判定锁
 */

public class Test {
    private volatile static Test instance = null;
    private Test(){}
    private static Test getInstance(){
        if (null == instance){
            synchronized (Test.class){
                if(null == instance){
                    instance = new Test();
                }
            }
        }
        return instance;
    }
}

