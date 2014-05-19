package sv.ues.fia.semo.activity;

import ues.semo.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends Activity {
	//Variables
	EditText username;
	EditText password;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}
	
	
	
	public void loginUser(View v){
		//Obtencion de parametros de inicio de sesion user y password
		username = (EditText) findViewById(R.id.edtUsername);
		password = (EditText) findViewById(R.id.edtPassword);
		if(username.getText().length() > 0 && password.getText().length() > 0){
			Toast.makeText(this, "Bienvenidos " + username.getText().toString(),Toast.LENGTH_SHORT).show();
		}else{
			Toast.makeText(this, "Usuario o Password Vacios",Toast.LENGTH_SHORT).show();
		}
	}
	
	
	public void logout(){
		
	}

}
