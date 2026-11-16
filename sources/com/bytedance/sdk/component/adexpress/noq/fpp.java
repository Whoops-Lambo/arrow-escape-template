package com.bytedance.sdk.component.adexpress.noq;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class fpp extends um {
    private TextView kgy;

    @Override // com.bytedance.sdk.component.adexpress.noq.um, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.component.adexpress.noq.um, android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.noq.um
    public void setShakeText(String str) {
        if (this.kgy == null) {
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        TextView textView = this.kgy;
        if (!zIsEmpty) {
            textView.setText(str);
            return;
        }
        try {
            this.kgy.setText(com.bytedance.sdk.component.utils.ay.ahm(textView.getContext(), "tt_splash_default_click_shake"));
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJ+zoRN0kk=", "aOYsngafZc6DQeFUiQY=", "SOs5pgu9YsK0T89J", 42);
            e.getMessage();
        }
    }

    public fpp(@NonNull Context context, View view, int i, int i2, int i3, JSONObject jSONObject) {
        super(context, view, i, i2, i3, jSONObject);
    }

    @Override // com.bytedance.sdk.component.adexpress.noq.um
    public void kgy(Context context, View view) {
        addView(view);
        this.kgy = (TextView) findViewById(2097610747);
    }
}
