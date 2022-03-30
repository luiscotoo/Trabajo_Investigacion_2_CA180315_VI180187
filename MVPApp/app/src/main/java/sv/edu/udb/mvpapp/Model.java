package sv.edu.udb.mvpapp;

import android.os.Handler;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Model implements Contract.Model {

    // array list of strings from which
    // random strings will be selected
    // to display in the activity
    private List<String> arrayList = Arrays.asList(
            "El primer virus informático se desarrolló en 1971",
            "El primer ratón se construyó en 1964 y estaba hecho de madera. ",
            "Cada mes se crean más de 6.000 nuevos virus informáticos.",
            "El primer ordenador mecánico se llamaba ENIAC.",
            "El término “bug” se originó por una polilla."
    );



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
        Random random = new Random();
        int index = random.nextInt(arrayList.size());
        return arrayList.get(index);
    }
}