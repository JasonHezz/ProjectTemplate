package com.jasonhezz.github.rxandroidtemplate.ui;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import butterknife.Bind;
import butterknife.ButterKnife;
import com.jasonhezz.github.rxandroidtemplate.R;
import com.jasonhezz.github.rxandroidtemplate.ui.adapter.SectionsPagerAdapter;

public class BottomTabActivity extends AppCompatActivity {
  @Bind(R.id.viewpager) ViewPager mViewpager;
  @Bind(R.id.sliding_tabs) TabLayout mSlidingTabs;
  private SectionsPagerAdapter mSectionsPagerAdapter;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_bottom_tab);
    ButterKnife.bind(this);
    mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
    mViewpager.setAdapter(mSectionsPagerAdapter);
    mSlidingTabs.setupWithViewPager(mViewpager);
  }
}
