package radiobutton.cursoandroid.com.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioEsco;
    private TextView txtRes;

    private Button btnRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.rdgId);
        txtRes = (TextView) findViewById(R.id.txtResId);

        btnRes = (Button) findViewById(R.id.btnEscId);



        btnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int escRbId = radioGroup.getCheckedRadioButtonId();
                if(escRbId > 0 ){

                    radioEsco = (RadioButton) findViewById(escRbId);



                    txtRes.setText(radioEsco.getText());
                }
            }
        });



    }
}
