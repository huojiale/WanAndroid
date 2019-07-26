package com.example.lenovo.wanandroid.http;

import com.example.lenovo.wanandroid.bean.BaseResponse;
import com.example.lenovo.wanandroid.bean.ListData;

import java.util.List;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Url;


public interface MyServer {

    @GET
    Observable<BaseResponse<List<ListData>>> get(@Url String url);


}
