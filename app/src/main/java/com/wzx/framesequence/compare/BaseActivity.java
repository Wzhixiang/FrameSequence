package com.wzx.framesequence.compare;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.wzx.framesequence.R;

/**
 * 描述：
 *
 * @author wzx
 * @date 2019/4/18
 */
public class BaseActivity extends AppCompatActivity {

    protected static final String url = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1555578468286&di=0f2629eaf0aa789e847c1b040932f81b&imgtype=0&src=http%3A%2F%2Fphotocdn.sohu.com%2F20150721%2Fmp23627612_1437451852870_2.gif";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
    }
}
