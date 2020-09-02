package com.example.tpp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


   ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }








    public void calc(View view)
    {

        EditText valeur1 =(EditText)findViewById(R.id.editText3) ;
        EditText valeur2 =(EditText)findViewById(R.id.editText4) ;

        TextView moyene =(TextView)findViewById(R.id.textView2) ;
      if( ( valeur1.getText().toString()).equals("")|| ( valeur2.getText().toString()).equals("") )

      { Toast.makeText(this,"manque d'information" , Toast.LENGTH_LONG).show(); }
else {

          float moyy = (Float.parseFloat(valeur1.getText().toString()) + Float.parseFloat(valeur2.getText().toString())) / 2;


          moyene.setText("moyenne :" + moyy);

          // Toast.makeText(this, "moy"+moyy , Toast.LENGTH_LONG).show();
      }


}

}
