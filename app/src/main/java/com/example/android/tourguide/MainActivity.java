package com.example.android.tourguide;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

public class MainActivity extends AppCompatActivity {

    ViewPagerAdapter mAdapter;
    ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // view pager
        viewPager2 = findViewById(R.id.view_pager);
        mAdapter = new ViewPagerAdapter(this);
        viewPager2.setAdapter(mAdapter);

        //tab layout
        TabLayout tab = findViewById(R.id.tab_layout);
        int[] tabText = {R.string.art, R.string.food, R.string.history, R.string.shopping};
        new TabLayoutMediator(tab, viewPager2, (tab1, position) -> tab1.setText(tabText[position]))
                .attach();

    }

    private static class ViewPagerAdapter extends FragmentStateAdapter {

        private static final int TOTAL_TAB_COUNT = 4;

        public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            if (position == 0) {
                return new ArtFragment();
            } else if (position == 1) {
                return new FoodFragment();
            } else if (position == 2) {
                return new HistoryFragment();
            } else {
                return new ShoppingFragment();
            }
        }

        @Override
        public int getItemCount() {
            return TOTAL_TAB_COUNT;
        }
    }
}

