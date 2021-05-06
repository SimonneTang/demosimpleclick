package sg.edu.rp.c346.id20025732.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.widget.RadioButton;


public class MainActivity extends AppCompatActivity {
    TextView tvdefault;
    Button btndisplay;
    EditText etinput;
    ToggleButton tbenabler;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvdefault = findViewById(R.id.tvResult);
        etinput = findViewById(R.id.editTextinput);
        btndisplay = findViewById(R.id.btndisplay);
        tbenabler = findViewById(R.id.toggleButtonenabled);
        rgGender = findViewById(R.id.RadioGroupGender);
        btndisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etinput.getText().toString();
                String Stringresponse = etinput.getText().toString();
                tvdefault.setText(Stringresponse);
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if (checkedRadioId == R.id.radioButtongenderMale) {
                    tvdefault.setText("He says " + Stringresponse);
                } else {
                    tvdefault.setText("She says " + Stringresponse);
                }

                if (tbenabler.isChecked() == true) {
                    etinput.setEnabled(true);
                } else {
                    etinput.setEnabled(false);

                }

            }
        });

    }
}