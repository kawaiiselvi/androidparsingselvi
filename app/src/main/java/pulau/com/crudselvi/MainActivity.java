package pulau.com.crudselvi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editTextName;
    private EditText editTextClass;
    private EditText editTextNumber;
    private EditText editTextAddress;
    private EditText editTextAmbition;

    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextClass = (EditText) findViewById(R.id.editTextClass);
        editTextNumber = (EditText) findViewById(R.id.editTextNumber);
        editTextAddress = (EditText) findViewById(R.id.editTextAddres);
        editTextAmbition = (EditText) findViewById(R.id.editTextAmbition);

        button1 = (Button) findViewById(R.id.button1);

        //Setting listeners to button
        button1.setOnClickListener(this);
    }

    private void addEmployee(){

        final String nama = editTextName.getText().toString().trim();
        final String kelas = editTextClass.getText().toString().trim();
        final String nomor = editTextNumber.getText().toString().trim();
        final String alamat = editTextAddress.getText().toString().trim();
        final String citacita = editTextAmbition.getText().toString().trim();

        class AddEmployee extends AsyncTask<Void,Void,String>{

            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(MainActivity.this,"Menambahkan...","Tunggu...",false,false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(MainActivity.this,s,Toast.LENGTH_LONG).show();
            }

            @Override
            protected String doInBackground(Void... v) {
                HashMap<String,String> params = new HashMap<>();
                params.put(konfigurasi.KEY_EMP_NAMA,nama);
                params.put(konfigurasi.KEY_EMP_KELAS,kelas);
                params.put(konfigurasi.KEY_EMP_NOHP,nomor);
                params.put(konfigurasi.KEY_EMP_ALAMAT,alamat);
                params.put(konfigurasi.KEY_EMP_CITACITA,citacita);

                RequestHandler rh = new RequestHandler();
                String res = rh.sendPostRequest(konfigurasi.URL_ADD, params);
                return res;
            }
        }

        AddEmployee ae = new AddEmployee();
        ae.execute();
    }

    @Override
    public void onClick(View v) {
        if(v == button1){
            addEmployee();
        }
    }
}