package com.example.volleytest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.volleytest.bean.UserInfoBean;
import com.example.volleytest.constant.Constants;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private TextView tvContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvContent = (TextView) findViewById(R.id.tv_content);
        /*
        GET:
        POST:
         */
        getUserInfo();
        getUserInfoPost();

    }

    private void getUserInfoPost() {
        String url= Constants.BASE_URL+"api/user/2416";
        RequestQueue volley = Volley.newRequestQueue(this);
        StringRequest request = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.d(TAG,"---------"+response);
                Gson gson = new Gson();
                UserInfoBean userInfoBean = gson.fromJson(response, UserInfoBean.class);
                String username=userInfoBean.getData().getUsername();

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> map = new HashMap<>();
                map.put("open_id", "FPo-MODPnyWnOebakhSRNfWFz1Toj2oULZz0P%3DWWjSUDB88lifd%3DCQTUPQ7dlN9aR-POORUX56WxNxW3mO9YOPo2hNPaQ-9PmjYze");
                map.put("method", "GET");
                map.put("access_token", "20e17b40059138731a6f5ea0b0443a86");
                map.put("version", "2.0.3");
                return map;
            }
        };
        volley.add(request);

    }

    private void getUserInfo() {
//        String url= Constants.BASE_URL+"api/user/2416";
        String url = "http://api.k780.com:88/?app=phone.get&phone=13800138000&appkey=10003&sign=b59bc3ef6191eb9f747dd4e83c99f2a4&format=json";
        RequestQueue volley = Volley.newRequestQueue(this);
        StringRequest request = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                //请求数据结果
                Log.d(TAG, "-------------:" + response);
                //ui操作，主线程中
                /*
                {}对象
                []数组

                 */
                JSONObject jsonObject = null;
                try {
                    jsonObject = new JSONObject(response);
                    String success = jsonObject.getString("success");
                    tvContent.setText(success);
                    Log.d(TAG,"----success:"+success);
                } catch (JSONException e) {
                    e.printStackTrace();
                }



            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                //请求错误
                Log.e(TAG, "-----------error:" + error.getMessage());
            }
        });
        volley.add(request);

    }
}
