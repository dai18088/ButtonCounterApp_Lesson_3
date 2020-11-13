package gr.uom.buttoncounterapp_lesson_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;

    private int numTimesClicked=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
}