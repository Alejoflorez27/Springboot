package com.example.loguin;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.loguin.interfaces.ProductoAPI;
import com.example.loguin.model.Empleado;
import com.example.loguin.utils.Constants;
import androidx.annotation.RequiresApi;
import android.os.Build;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    List<Empleado> empleados;
    ProductoAPI productoAPI;

    private EditText correo;
    private EditText Password;
    private String contrasena;
    private String EmailAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.LOGIN);

        correo = findViewById(R.id.correo);
        Password = findViewById(R.id.Password);
        getAll();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (EmailAddress.equals(correo.getText().toString())) {
                    if (contrasena.equals(Password.getText().toString())) {
                        Intent intent= new Intent(MainActivity.this,Dashboard.class);
                        startActivity(intent);
                    }
                }
            }

        });

    }
    private void getAll(){
        Retrofit retrofit=new Retrofit.Builder().baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()).build();

        productoAPI = retrofit.create(ProductoAPI.class);
        Call<List<Empleado>>call= productoAPI.getAll();
        call.enqueue(new Callback<List<Empleado>>() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onResponse(Call<List<Empleado>> call, Response<List<Empleado>> response) {
                if(!response.isSuccessful()){
                    Toast toast= Toast.makeText(getApplicationContext(),response.message(),Toast.LENGTH_LONG);
                    toast.show();

                    Log.e("Response err: ",response.message());
                    return;
                }
                empleados = response.body();

                empleados.forEach(p -> {
                    int i = Log.i("Prods: ", p.getEmail().toString());
                    EmailAddress = p.getEmail();

                });

                empleados.forEach(p -> {
                    int i = Log.i("Prods: ", p.getPassword().toString());
                    contrasena = p.getPassword();

                });
                Log.i("prueba", EmailAddress);

            }

            @Override
            public void onFailure(Call<List<Empleado>> call, Throwable t) {
                Toast toast=Toast.makeText(getApplicationContext(),t.getMessage(),Toast.LENGTH_LONG);
                toast.show();
                Log.e("Throw err: ",t.getMessage());
            }
        });
    }
}
