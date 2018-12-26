package navelist.com.hanmoon;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class HanmoonReadActivity extends AppCompatActivity {
    private String tag = "Sajasohak";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hanmoon_read);
        Character song = new Character('宋');
        ((TextView)findViewById(R.id.let1)).setText(song.toString());
        ((TextView)findViewById(R.id.let2)).setText("時");
        ((TextView)findViewById(R.id.let3)).setText("厚");

        int codepoint = Character.codePointAt("宋時厚", 0);
        int cd2 = '宋';
        Log.d(tag, String.format("%d : %d", codepoint, cd2));
    }
}
