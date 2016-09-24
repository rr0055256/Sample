package slideshow.retailer.apps.shopgro.com.shopgroslideshow.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import slideshow.retailer.apps.shopgro.com.shopgroslideshow.R;

/**
 * Created by galaxy-user on 24/09/16.
 */

public class HomeActivity extends AppCompatActivity{


    @BindView(R.id.screenShots)
    ImageView screenShots;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);


    }
}
