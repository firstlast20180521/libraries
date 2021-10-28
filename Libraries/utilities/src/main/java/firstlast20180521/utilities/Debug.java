package firstlast20180521.utilities;

import android.util.Log;

public class Debug {

    //所謂オーバーロードというもの
    public static void print() {
        print("");
    }

    public static void print(String text) {

        ////呼び出し元のクラス名、メソッド名を取得
        //int length = Thread.currentThread().getStackTrace().length;
        //
        //for (int j = 0; j < length; j++) {
        //
        //    String className = Thread.currentThread().getStackTrace()[j].getClassName();
        //
        //    System.out.println(String.format("j===>%d, className===>%s, Method===>%s"
        //            , j
        //            , Thread.currentThread().getStackTrace()[j].getClassName()
        //            , Thread.currentThread().getStackTrace()[j].getMethodName()
        //    ));
        //
        //}

        //int i = min(3, Thread.currentThread().getStackTrace().length - 1 );
        if (text == "") {
            String location = String.format("<%s>.<%s>"
                    , Thread.currentThread().getStackTrace()[4].getClassName()
                    , Thread.currentThread().getStackTrace()[4].getMethodName()
            );
            Log.d(location, "ログ:" + text);

        }else{
            String location = String.format("<%s>.<%s>"
                    , Thread.currentThread().getStackTrace()[5].getClassName()
                    , Thread.currentThread().getStackTrace()[5].getMethodName()
            );
            Log.d(location, "ログ:" + text);

        }

        //System.out.println(String.format("[%s] %s", location, text));

        return;

    }

}
