package java24hours.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** processClicks has to be public for app to work.  */
    public void processClicks(View display) {
        Intent action = null;
        int id = display.getId();
        switch(id) {
            case(R.id.phoneButton):
                action = new Intent(Intent.ACTION_DIAL,
                    Uri.parse("tel:202-456-1111"));
                break;
            case(R.id.webButton):
                action = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://whitehouse.gov"));
                break;
            case(R.id.mapButton):
                action = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("geo:0,0?q=White House, Washington, DC"));
            default:
                break;
        }
        startActivity(action);
    }
}