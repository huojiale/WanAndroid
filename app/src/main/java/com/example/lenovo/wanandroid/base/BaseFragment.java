package com.example.lenovo.wanandroid.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class BaseFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutId(), container, false);

        initMvp();
        initView(view);
        initData();
        initListener();
        return view;
    }

    protected void initListener() {

    }

    protected void initData() {

    }

    protected void initView(View view) {

    }

    protected void initMvp() {

    }

    protected abstract int getLayoutId();
}
