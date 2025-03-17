package rtk.k8s_app.utils;

public class Logger {

    public static void info(String msg){
        String log = "[INFO] - ".concat(msg);
        System.out.println(log);
    }

    public static void error(String msg){
        String log = "[ERROR] - ".concat(msg);
        System.out.println(log);
    }
}
