package sumandk.com.sumandk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static {
        System.loadLibrary("suma");
    }

    EditText et1, et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnSumar = (Button) findViewById(R.id.btnSumar);
        btnSumar.setOnClickListener(OkListener);
    }

    private View.OnClickListener OkListener = new View.OnClickListener() {
        public void onClick(View view) {
            et1 = (EditText) findViewById(R.id.editText1);
            et2 = (EditText) findViewById(R.id.editText2);
            int aux1 = Integer.valueOf(et1.getText().toString());
            int aux2 = Integer.valueOf(et2.getText().toString());
            int resultado = calcularSuma(aux1, aux2);
            final TextView tvResultado = (TextView) findViewById(R.id.textViewResultado);
            tvResultado.setText("" + resultado);
        }
    };

    public native int calcularSuma(int aux1, int aux2);

}
