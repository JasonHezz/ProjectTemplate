package com.jasonhezz.github.rxandroidtemplate.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 * 所有业务Fragment的父类
 */
public class BaseFragment extends Fragment {

  public BaseFragment() {
    // Required empty public constructor
  }

  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
  }

  @Override public void onDestroyView() {
    super.onDestroyView();
    ButterKnife.unbind(this);
  }
}
