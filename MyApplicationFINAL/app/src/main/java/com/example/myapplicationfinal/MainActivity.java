package com.example.myapplicationfinal;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.myapplicationfinal.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private TextView resultadoCalculadora;
    private TextView resultFact;
    private TextView resultFibo;
    private EditText valor1;
    private EditText valor2;
    private EditText valorFibo;
    private EditText valorFact;
    private Button sum;
    private Button res;
    private Button div;
    private Button multi;
    private Button fibo;
    private Button fac;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.navigation_notifications);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController); */


        resultadoCalculadora = findViewById(R.id.textView6);
        resultFibo = findViewById(R.id.textView3);
        resultFact = findViewById(R.id.textView5);
        valor1 = findViewById(R.id.editTextText);
        valor2 = findViewById(R.id.editTextText2);
        valorFibo = findViewById(R.id.editTextText3);
        valorFact = findViewById(R.id.editTextText4);
        sum = findViewById(R.id.button4);
        res = findViewById(R.id.button2);
        multi = findViewById(R.id.button);
        div = findViewById(R.id.button3);
        fibo = findViewById(R.id.button7);
        fac = findViewById(R.id.button8);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double sumar = Double.parseDouble(valor1.getText().toString()) + Double.parseDouble(valor2.getText().toString());
                resultadoCalculadora.setText(sumar + "");
            }
        });

        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double resta = Double.parseDouble(valor1.getText().toString()) - Double.parseDouble(valor2.getText().toString());
                resultadoCalculadora.setText(resta + "");
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double multiplicar = Double.parseDouble(valor1.getText().toString()) * Double.parseDouble(valor2.getText().toString());
                resultadoCalculadora.setText(multiplicar + "");
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double dividir = Double.parseDouble(valor1.getText().toString()) / Double.parseDouble(valor2.getText().toString());
                resultadoCalculadora.setText(dividir + "");
            }
        });

        fibo.setOnClickListener(new View.OnClickListener() {
            public int fibo(int n) {
                if(n < 2) {
                    return n;
                }

                return fibo( n - 2) + fibo(n - 1);
            }

            @Override
            public void onClick(View view) {
                int n = Integer.parseInt(valorFibo.getText().toString());
                int resultadoFibonacci = fibo(n);
                resultFibo.setText(resultadoFibonacci + "");
            }
        });

        fac.setOnClickListener(new View.OnClickListener() {
            public int factorial(int nFac) {
                if(nFac < 2) {
                    return nFac;
                }

                return nFac * factorial(nFac - 1);
            }

            @Override
            public void onClick(View view) {
                int nFac = Integer.parseInt(valorFact.getText().toString());
                int resultadoFactorial = factorial(nFac);
                resultFact.setText(resultadoFactorial + "");
            }
        });
    }
}