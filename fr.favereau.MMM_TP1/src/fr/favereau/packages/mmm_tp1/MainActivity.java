package fr.favereau.packages.mmm_tp1;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button btn_valid = (Button) findViewById(R.id.btn_valider);
        btn_valid.setOnClickListener(btn_valider_listener);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    
    // mes listeners ----------------------
    
    private OnClickListener btn_valider_listener = new OnClickListener() {
		@Override
		public void onClick(View v) {
			
			String texteMsg = ((EditText)findViewById(R.id.txt_nom)).getText().toString();
			texteMsg += "\n";
			texteMsg += ((EditText)findViewById(R.id.txt_prenom)).getText().toString();
			
			
			Toast.makeText(getApplicationContext(), texteMsg, Toast.LENGTH_LONG).show();
			
		}
	};

    
}
