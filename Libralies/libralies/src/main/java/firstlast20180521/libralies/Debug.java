package firstlast20180521.libralies;

import static java.lang.Math.min;

import android.util.Log;

public class Debug {
    public static void print(String text){

        //呼び出し元のクラス名、メソッド名を取得
        int i = min(2, Thread.currentThread().getStackTrace().length - 1 );
        String location = String.format("[%s].[%s]", Thread.currentThread().getStackTrace()[i].getClassName(), Thread.currentThread().getStackTrace()[i].getMethodName());

        Log.d(location, text);
        System.out.println(String.format("[%s] %s", location, text));

        return;

    }

}
