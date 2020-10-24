package co.com.umb.johancanon.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText text_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_1 = ( EditText )findViewById(R.id.et1);
    }
    //metodo para boton enviar

    public void Enviar(View view){
        Intent i = new Intent( this , MainActivity2.class );
        i.putExtra( "dato" , text_1.getText().toString() );
        startActivity(i);
    }

}