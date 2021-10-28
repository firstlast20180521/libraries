package firstlast20180521.libraries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import firstlast20180521.utilities.Debug;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Debug.print();
    }
}