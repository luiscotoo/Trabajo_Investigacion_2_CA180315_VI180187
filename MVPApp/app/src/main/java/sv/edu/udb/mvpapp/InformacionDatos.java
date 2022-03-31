package sv.edu.udb.mvpapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Objects;

public class InformacionDatos extends AppCompatActivity {

    private TextView tvInfo, tvDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion_datos);

        tvInfo = (TextView) findViewById(R.id.tvInfo);
        tvDescripcion = (TextView) findViewById(R.id.tvDescripcion);
        String TituloDato = getIntent().getExtras().getString("TituloDato");
        tvInfo.setText(TituloDato);


        String Dato0,Dato1,Dato2,Dato3,Dato4,Dato5;
        Dato0 = "Presiona en siguiente dato para comenzar";
        Dato1 = "El primer virus informático se desarrolló en 1971.";
        Dato2 = "El primer ratón se construyó en 1964 y estaba hecho de madera.";
        Dato3 = "Cada mes se crean más de 6.000 nuevos virus informáticos.";
        Dato4 = "El primer ordenador mecánico se llamaba ENIAC.";
        Dato5 = "El término “bug” se originó por una polilla.";

        if(Objects.equals(Dato0, TituloDato)){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

        String Info1,Info2,Info3,Info4,Info5;
        Info1 = "Su nombre era Creeper y circulaba en ARPANET. Era totalmente inofensivo:" +
                " se creó sólo como un experimento, para ver cómo se extendía de un ordenador" +
                " a otro.";
        Info2 = "Lo diseño el ingeniero Douglas Engelbart y tenía la forma de una caja un tanto " +
                "aparatosa. ¿Tendría la famosa “bola” que portaban los antiguos ratones?";
        Info3 = "En lo que parece una voraz carrera por superar al número de virus biológicos. " +
                "Una carrera un tanto chunga, por cierto.";
        Info4 = "Ocupaba 167 metros cuadrados y pesaba 27 toneladas. Nada que no pueda meter " +
                "cualquiera en su sala de estar.";
        Info5 = "En concreto, la que causó el mal funcionamiento del ordenador Mark III en 1947." +
                " Un momento para la historia de la informática…";

        if(Objects.equals(Dato1,TituloDato)){
            tvDescripcion.setText(Info1);
        }
        if (Objects.equals(Dato2,TituloDato)){
            tvDescripcion.setText(Info2);
        }
        if(Objects.equals(Dato3,TituloDato)){
            tvDescripcion.setText(Info3);
        }
        if(Objects.equals(Dato4,TituloDato)){
            tvDescripcion.setText(Info4);
        }
        if(Objects.equals(Dato5,TituloDato)){
            tvDescripcion.setText(Info5);
        }

    }


}