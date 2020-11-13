package gr.uom.buttoncounterapp_lesson_3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private static final String LOG_TAG="Teo";
    public static final String TEXT_CONTENTS = "MainActivity_textView";
    private static int numTimesClicked=0;


    private Button button;
    private TextView textView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("TAG","OnCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);


        View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numTimesClicked++;
                String result="\n The button clicked "+ numTimesClicked+" times";

                textView.append(result);

            }
        };

        button.setOnClickListener(listener);


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG","OnStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG","OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG","OnDestroy");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TAG","OnRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG","OnPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG","OnResume");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        Log.d("TAG","OnSaveInstanceState");
        outState.putString(TEXT_CONTENTS, textView.getText().toString());
        super.onSaveInstanceState(outState);

    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("TAG","OnRestoreInstanceState");

        String savedText=savedInstanceState.getString(TEXT_CONTENTS);
        textView.setText(savedText);

    }



}