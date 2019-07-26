package com.example.lenovo.wanandroid.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class BaseMvpFragment <V,P extends BasePresenter<V>> extends BaseFragment{
    protected P myPresenter;

    @Override
    protected void initMvp() {
        myPresenter=initMvpPresenter();
        if (myPresenter!=null){
            myPresenter.attach((V) this);
        }
    }
    public void showProgressBar(){

    }


    public void hideProgressBar(){

    }

    protected abstract P initMvpPresenter();

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (myPresenter!=null){
            myPresenter.detachView();
        }
    }
}
