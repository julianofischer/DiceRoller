package ads.vilhena.ifro.edu.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button rollButton;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rollButton =  (Button) findViewById(R.id.rolar_button);
        imageView = (ImageView) findViewById(R.id.dice_image);

        rollButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //Toast.makeText(getApplicationContext(), "Clicked",
                        //        Toast.LENGTH_LONG).show();
                        //imageView.setText(rolar_dado());
                        imageView.setImageResource(rolar_dado());
                    }
                }
        );
    }

    private int rolar_dado(){
        Random r = new Random();
        switch (r.nextInt(6)+1){
            case 1:
                return R.drawable.dice_1;
            case 2:
                return R.drawable.dice_2;
            case 3:
                return R.drawable.dice_3;
            case 4:
                return R.drawable.dice_4;
            case 5:
                return R.drawable.dice_5;
            case 6:
                return R.drawable.dice_6;
            default:
                return R.drawable.empty_dice;
        }
    }
}
