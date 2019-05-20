/** ????? ????????? */
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

/** ????? ????????? */
public class Test {
    private static Test instance = null;
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
 * ¡ı—”≥¨ À´÷ÿ≈–∂®À¯
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
