package br.com.fiap.componentes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imgAndroid;
    EditText edtTelefone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtTelefone = findViewById(R.id.edtTelefone);
        imgAndroid = findViewById(R.id.imgAndroid);
    }
    public void salvar(View view){
        Toast.makeText(this,edtTelefone.getText().toString(), Toast.LENGTH_SHORT).show();
        imgAndroid.setImageResource(R.drawable.ic_launcher_background);
    }
}
