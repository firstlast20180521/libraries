package firstlast20180521.utilities;

import android.util.Log;

public class Debug {

    static final String SELF_CLASS_NAME = "firstlast20180521.utilities.Debug";

    //所謂オーバーロードというもの
    public static void print() {
        print("-");
    }

    public static void print(String text) {

        StackTraceElement[] trace = Thread.currentThread().getStackTrace();

        int length = trace.length;

        //System.out.println("start-------------------------------------------start");
        //for (int i = 0; i < length; i++) {
        //    System.out.println(String.format(Locale.JAPAN, "j===>%d, className===>%s, Method===>%s"
        //            , i
        //            , trace[i].getClassName()
        //            , trace[i].getMethodName()
        //            )
        //    );
        //
        //}
        //System.out.println("end-----------------------------------------------end!");

        String className = "";
        String methodName = "";
        int lineNumber = 0;

        //for (int j = length - 1; j > -1; j--) {
        //    String tempClassName = trace[j].getClassName();
        //    String[] x = tempClassName.split("\\.");
        //
        //    if (x.length > 0) {
        //        if (x[0].equals("xxxxxxxxxxxx")) {
        //            className = tempClassName;
        //            methodName = trace[j].getMethodName();
        //            break;
        //        }
        //    }
        //
        //}

        for (int j = length - 1; j > -1; j--) {
            String tempClassName = trace[j].getClassName();

            if (tempClassName.equals(SELF_CLASS_NAME)) {
                //className = trace[j + 1].getClassName();

                String name = trace[j + 1].getClassName();
                String[] arr = name.split("\\.");
                className = arr[arr.length - 1];
                methodName = trace[j + 1].getMethodName();
                lineNumber = trace[j + 1].getLineNumber();
                break;
            }
        }

        Log.d(String.format("%-16s %4d行目 %-16s===>", className, lineNumber, methodName), text);

    }

}
