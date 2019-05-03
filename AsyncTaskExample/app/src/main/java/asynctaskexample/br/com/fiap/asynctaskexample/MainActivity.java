package asynctaskexample.br.com.fiap.asynctaskexample;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.InputStream;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    private static final String IMG_URL = "https://douglascabral.com.br/aula-api/img/01.png";
    ImageView imgBaixada;
    private ProgressDialog mProgressDialog;
    EditText edtUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgBaixada = findViewById(R.id.imgBaixada);
        edtUrl = findViewById(R.id.edtUrl);

    }

    public void download(View view){
        DownloadAsyncTask download = new DownloadAsyncTask();


        String url = edtUrl.getText().toString();
        Log.i("EditText", edtUrl.getText().toString());
        download.execute(url);

    }

    private class DownloadAsyncTask extends AsyncTask<String, Void, Bitmap>{

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            mProgressDialog = ProgressDialog.show(MainActivity.this,
                    getString(R.string.aguarde_download),
                    getString(R.string.baixando_img));
        }

        @Override
        protected Bitmap doInBackground(String... strings) {
            try {
                InputStream inputStream;
                Bitmap img;

                URL endereco = new URL(strings[0]);
                inputStream = endereco.openStream();
                img = BitmapFactory.decodeStream(inputStream);

                inputStream.close();

                return img;
            }catch (Exception e){
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            if(mProgressDialog != null){
                imgBaixada.setImageBitmap(bitmap);
            }
            mProgressDialog.dismiss();
        }
    }
}
