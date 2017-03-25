package giovanni.itt.tarea2_formulario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Formulario extends AppCompatActivity {
    TextView Tlnombre;
    TextView Tldireccion;
    TextView Tltelefono;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        Bundle parametros = getIntent().getExtras();
        String nombre  = parametros.getString(("nombre"));
        String direccion = parametros.getString("direccion");
        String telefono  = parametros.getString(("telefono"));

        Tlnombre =(TextView) findViewById(R.id.txtNombre);
        Tldireccion =(TextView)findViewById(R.id.txtDireccion);
        Tltelefono =(TextView)findViewById(R.id.txtTelefono);





    }
}
