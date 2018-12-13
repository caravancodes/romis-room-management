package com.frogobox.romis.Admin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.frogobox.romis.Admin.Fragment.AdminAllBookingFragment;
import com.frogobox.romis.Admin.Fragment.AdminApprovalFragment;
import com.frogobox.romis.Admin.Fragment.AdminMemberFragment;
import com.frogobox.romis.Admin.Fragment.AdminRoomFragment;
import com.frogobox.romis.R;



public class AdminActivity extends AppCompatActivity {

    ViewPager viewPager;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        fab = (FloatingActionButton) findViewById(R.id.fab);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        viewPager = (ViewPager) findViewById(R.id.viewpager);

        setSupportActionBar(toolbar);
        // Get the ViewPager and set it's PagerAdapter so that it can display items

        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(), AdminActivity.this);
        viewPager.setAdapter(pagerAdapter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        fab.show();
                        fab.setImageResource(R.drawable.ic_room_add);
                        fab.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent i = new Intent(AdminActivity.this, EditorRoomActivity.class);
                                startActivity(i);
                            }
                        });
                        break;
                    case 1:
                        fab.hide();
                        break;
                    case 2:
                        fab.hide();
                        break;
                    case 3:
                        fab.show();
                        fab.setImageResource(R.drawable.ic_member_add);
                        fab.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent i = new Intent(AdminActivity.this, EditorMemberActivity.class);
                                startActivity(i);
                            }
                        });
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });



        // Give the TabLayout the ViewPager

        tabLayout.setupWithViewPager(viewPager);

        // Iterate over all tabs and set the custom view
//        for (int i = 0; i < tabLayout.getTabCount(); i++) {
//            TabLayout.Tab tab = tabLayout.getTabAt(i);
//            tab.setCustomView(pagerAdapter.getTabView(i));
//        }


    }

    @Override
    public void onResume() {
        super.onResume();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        return super.onOptionsItemSelected(item);
    }

    class PagerAdapter extends FragmentPagerAdapter {

        String tabTitles[] = new String[] {"Room", "Approval", "All Boking", "Member"};
        Context context;

        public PagerAdapter(FragmentManager fm, Context context) {
            super(fm);
            this.context = context;
        }

        @Override
        public int getCount() {
            return tabTitles.length;
        }

        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    return new AdminRoomFragment();
                case 1:
                    return new AdminApprovalFragment();
                case 2:
                    return new AdminAllBookingFragment();
                case 3:
                    return new AdminMemberFragment();
            }

            return null;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            // Generate title based on item position
            return tabTitles[position];
        }

//        public View getTabView(int position) {
//            View tab = LayoutInflater.from(AdminActivity.this).inflate(R.layout.custom_tab, null);
//            TextView tv = (TextView) tab.findViewById(R.id.custom_text);
//            tv.setText(tabTitles[position]);
//            return tab;
//        }

    }

}
