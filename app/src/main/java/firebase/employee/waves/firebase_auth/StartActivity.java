package firebase.employee.waves.firebase_auth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity implements View.OnClickListener {

    private Button email,phone,twitter,facebook,google;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_activity);



       // email = (Button)findViewById(R.id.email);
        phone = (Button)findViewById(R.id.phone);
      /*  twitter = (Button)findViewById(R.id.twitter);
        facebook = (Button)findViewById(R.id.facebook);*/
        google = (Button)findViewById(R.id.google);
        // Dialog close button




        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartActivity.this, GoogleSignInActivity.class);
                startActivity(intent);


            }
        });
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartActivity.this, Phone_Activity.class);
                startActivity(intent);


            }
        });

    }


    @Override
    public void onClick(View v) {
       /* switch (v.getId()) {
            case R.id.google:
                Intent intent = new Intent(StartActivity.this, GoogleSignInActivity.class);
                startActivity(intent);
                break;

        }*/

    }
}
