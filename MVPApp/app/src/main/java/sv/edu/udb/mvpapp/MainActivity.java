package sv.edu.udb.mvpapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import static android.view.View.GONE;

public class MainActivity extends AppCompatActivity implements Contract.View {

    private TextView textView;

    private Button button;

    private ProgressBar progressBar;

    Contract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.txtView);

        button = findViewById(R.id.btnNext);
        presenter = new Presenter(this, new Model());

        progressBar = findViewById(R.id.progressBar);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onButtonClick();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
        textView.setVisibility(View.INVISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(GONE);
        textView.setVisibility(View.VISIBLE);
    }
    public void IrInformacion(View v){
        Bundle extras = new Bundle();
        extras.putString("TituloDato",textView.getText().toString());
        Intent intent = new Intent(this, InformacionDatos.class);
        intent.putExtras(extras);
        startActivity(intent);
    }
    @Override

    public void setString(String string) {
        textView.setText(string);
    }


}