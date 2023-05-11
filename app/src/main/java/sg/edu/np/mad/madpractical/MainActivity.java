package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button followButton = findViewById(R.id.button);
        //ToggleButton Follow = (ToggleButton)findViewById(R.id.button);
        User user = new User("John Doe", "Software Engineer", true);

        followButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if (user.isFollowed()) {
                    user.setFollowed(false);
                    followButton.setText("Follow");
                } else {
                    user.setFollowed(true);
                    followButton.setText("Unfollow");
                }
            }
        });
    }

}



