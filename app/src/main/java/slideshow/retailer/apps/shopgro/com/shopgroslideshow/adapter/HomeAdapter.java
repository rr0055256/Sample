package slideshow.retailer.apps.shopgro.com.shopgroslideshow.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by galaxy-user on 24/09/16.
 */

public class HomeAdapter extends BaseViewPagerFragmentStatAdapter {
    public HomeAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getFragmentItem(int position) {
        return null;
    }

    @Override
    public void updateFragmentItem(int position, Fragment fragment) {

    }

    @Override
    public int getCount() {
        return 0;
    }
}
