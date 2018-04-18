package nykim.prjbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btName, btName2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btName = findViewById(R.id.btName);
        btName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "김나연 010-3245-4236", Toast.LENGTH_SHORT).show();
            }
        });

        btName2 = findViewById(R.id.btName2);
        btName2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "김진우 010-6506-6739", Toast.LENGTH_SHORT).show();
            }
        });
    }
}