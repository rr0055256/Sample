package slideshow.retailer.apps.shopgro.com.shopgroslideshow.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import slideshow.retailer.apps.shopgro.com.shopgroslideshow.R;

import static slideshow.retailer.apps.shopgro.com.shopgroslideshow.utils.Constants.SPLASH_TIME_OUT;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.screenShots)
    ImageView screenShots;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                    startActivity(new Intent(MainActivity.this, HomeActivity.class));//Account OTP ParseUser and Store Checks or signup
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
