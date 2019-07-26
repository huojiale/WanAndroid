package com.example.lenovo.wanandroid.contract;

import com.example.lenovo.wanandroid.bean.ListData;

import java.util.List;


public interface MainContract {

    interface MainView{

        void showSuccess(List<ListData> listData);

        void showError(String error);
    }


    interface MainPresenter{
        void http();
    }


    interface MainModle{
        interface CallBack{
            void showSuccess(List<ListData> listData);

            void showError(String error);
        }
        void getData(CallBack callBack);
    }
}
