package android.example.oddoreven;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et_number;
    Button b_go;
    TextView t_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_number =(EditText) findViewById(R.id.et_number);
        b_go = (Button)findViewById(R.id.button);
        t_show =(TextView) findViewById(R.id.textView);

        b_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = Integer.parseInt(et_number.getText().toString());
                number = number %2;
                if(number == 0){
                    t_show.setText("EVEN");
                }
                else{
                    t_show.setText("ODD");
                }
            }
        });
    }
}