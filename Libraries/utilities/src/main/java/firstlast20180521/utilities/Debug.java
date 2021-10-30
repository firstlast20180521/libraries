package firstlast20180521.utilities;

import android.util.Log;

public class Debug {

    static final String SELF_CLASS_NAME = "firstlast20180521.utilities.Debug";

    //所謂オーバーロードというもの
    public static void print() {
        print("");
    }

    public static void print(String text) {
        int length = Thread.currentThread().getStackTrace().length;

        //System.out.println("start-------------------------------------------start");
        //for (int i = 0; i < length; i++) {
        //    System.out.println(String.format(Locale.JAPAN, "j===>%d, className===>%s, Method===>%s"
        //            , i
        //            , Thread.currentThread().getStackTrace()[i].getClassName()
        //            , Thread.currentThread().getStackTrace()[i].getMethodName()
        //            )
        //    );
        //
        //}
        //System.out.println("end-----------------------------------------------end!");

        String className = "";
        String methodName = "";

        //for (int j = length - 1; j > -1; j--) {
        //    String tempClassName = Thread.currentThread().getStackTrace()[j].getClassName();
        //    String[] x = tempClassName.split("\\.");
        //
        //    if (x.length > 0) {
        //        if (x[0].equals("firstlast20180521")) {
        //            className = tempClassName;
        //            methodName = Thread.currentThread().getStackTrace()[j].getMethodName();
        //            break;
        //        }
        //    }
        //
        //}

        for (int j = length - 1; j > -1; j--) {
            String tempClassName = Thread.currentThread().getStackTrace()[j].getClassName();

            if (tempClassName.equals(SELF_CLASS_NAME)) {
                className = Thread.currentThread().getStackTrace()[j + 1].getClassName();
                methodName = Thread.currentThread().getStackTrace()[j + 1].getMethodName();
                break;
            }
        }

        Log.d(String.format("<%s>.<%s>", className, methodName), text);

    }

}
