package sv.edu.udb.mvpapp;

import android.os.Handler;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Model implements Contract.Model {

    // array list of strings from which
    // random strings will be selected
    // to display in the activity
    int index = 0;
    private List<String> arrayList = Arrays.asList(
            "El primer virus informático se desarrolló en 1971.",
            "El primer ratón se construyó en 1964 y estaba hecho de madera.",
            "Cada mes se crean más de 6.000 nuevos virus informáticos.",
            "El primer ordenador mecánico se llamaba ENIAC.",
            "El término “bug” se originó por una polilla."
    );
    String Dato0 = "Presiona en siguiente dato para comenzar",
            Dato1 = "El primer virus informático se desarrolló en 1971.",
            Dato2 = "El primer ratón se construyó en 1964 y estaba hecho de madera.",
            Dato3 = "Cada mes se crean más de 6.000 nuevos virus informáticos.",
            Dato4 = "El primer ordenador mecánico se llamaba ENIAC.",
            Dato5 = "El término “bug” se originó por una polilla.";

    String Info1 = "Su nombre era Creeper y circulaba en ARPANET. Era totalmente inofensivo:" +
            " se creó sólo como un experimento, para ver cómo se extendía de un ordenador" +
            " a otro.",
            Info2 = "Lo diseño el ingeniero Douglas Engelbart y tenía la forma de una caja un tanto " +
                    "aparatosa. ¿Tendría la famosa “bola” que portaban los antiguos ratones?",
            Info3 = "En lo que parece una voraz carrera por superar al número de virus biológicos. " +
                    "Una carrera un tanto chunga, por cierto.",
            Info4 = "Ocupaba 167 metros cuadrados y pesaba 27 toneladas. Nada que no pueda meter " +
                    "cualquiera en su sala de estar.",
            Info5 = "En concreto, la que causó el mal funcionamiento del ordenador Mark III en 1947." +
                    " Un momento para la historia de la informática…";

    @Override
    // this method will invoke when
    // user clicks on the button
    // and it will take a delay of
    // 1200 milliseconds to display next course detail
    public void getNextCourse(final OnFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                listener.onFinished(getRandomString());
            }
        }, 1200);
    }

    // method to select random
    // string from the list of strings
    private String getRandomString() {
        index++;
        if (index>4){
            index =0;
        }
        return arrayList.get(index);
    }
}