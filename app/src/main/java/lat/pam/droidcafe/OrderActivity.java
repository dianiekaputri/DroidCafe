package lat.pam.droidcafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }

    public void onRadioButtonCLicked(View view) {
            // Is the button now checked?
            boolean checked = ((RadioButton) view).isChecked();
            // Check which radio button was clicked.
            switch (view.getId()) {
                case R.id.smaeday:
                    if (checked)
                        // Same day service
                        displayToast(getString(R.string.same_day));
                    break;
                case R.id.nextday:
                    if (checked)
                        // Next day delivery
                        displayToast(getString(R.string.next_day));
                    break;
                case R.id.pickup:
                    if (checked)
                        // Pick up
                        displayToast(getString(R.string.pick_up));
                    break;
                default:
                    // Do nothing.
                    break;
            }
        }

        private void displayToast(String message) {
            Toast.makeText(getApplicationContext(), message,
                    Toast.LENGTH_SHORT).show();
        }

    }


