package com.bytedance.sdk.component.adexpress.noq;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class noq extends gm {
    private fpp kgy;

    @Override // com.bytedance.sdk.component.adexpress.noq.gm, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.component.adexpress.noq.gm, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    private void kgy(Context context, int i, int i2, int i3, JSONObject jSONObject) {
        fpp fppVar = new fpp(context, com.bytedance.sdk.component.adexpress.rz.kgy.rz(context), i, i2, i3, jSONObject);
        this.kgy = fppVar;
        addView(fppVar);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        this.kgy.setLayoutParams(layoutParams);
    }

    public fpp getShakeView() {
        return this.kgy;
    }

    public void setShakeText(String str) {
        if (this.kgy == null) {
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        fpp fppVar = this.kgy;
        if (zIsEmpty) {
            fppVar.setShakeText("");
        } else {
            fppVar.setShakeText(str);
        }
    }

    public noq(Context context, int i, int i2, int i3, JSONObject jSONObject) {
        super(context);
        kgy(context, i, i2, i3, jSONObject);
    }
}
