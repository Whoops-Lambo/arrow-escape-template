package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class StarLevelLayoutView extends ComponentLinearLayout {
    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.o, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setRating(int i) {
        try {
            removeAllViews();
            if (i == 0) {
                i = 5;
            }
            int iA = i0.a(c.n().d(), "mbridge_demo_star_sel", "drawable");
            int iA2 = i0.a(c.n().d(), "mbridge_demo_star_nor", "drawable");
            for (int i2 = 0; i2 < 5; i2++) {
                ImageView imageView = new ImageView(getContext());
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                if (i2 < i) {
                    imageView.setImageResource(iA);
                } else {
                    imageView.setImageResource(iA2);
                }
                addView(imageView, layoutParams);
            }
        } catch (Exception e) {
            q0.b("StarLevelLayoutView", e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void updateBindData(String str, Object obj) {
        if (obj == null) {
            return;
        }
        try {
            String strValueOf = String.valueOf(obj);
            if (strValueOf.equals("null")) {
                return;
            }
            setRating(Math.toIntExact(Math.round(Double.parseDouble(strValueOf))));
        } catch (Throwable th) {
            q0.b("StarLevelLayoutView", th.getMessage(), th);
        }
    }

    public StarLevelLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        super.setXmlData(map);
        try {
            String strValueOf = String.valueOf(map.get("data"));
            if (strValueOf.equals("null")) {
                return;
            }
            setRating(Math.toIntExact(Math.round(Double.parseDouble(strValueOf))));
        } catch (Throwable th) {
            q0.b("StarLevelLayoutView", th.getMessage(), th);
        }
    }
}
