/** ���Ϻ� ˫���ж��� */
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

/** ��˼�� ˫���ж��� */
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