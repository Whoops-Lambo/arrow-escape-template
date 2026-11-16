package com.bytedance.sdk.openadsdk.kus;

import android.content.Context;
import android.graphics.Color;
import android.text.Html;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.ct.fi;
import com.bytedance.sdk.openadsdk.utils.xh;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class kgy extends com.bytedance.sdk.openadsdk.core.ct.rz {
    private fi ahm;
    private Context kgy;

    @Override // com.bytedance.sdk.openadsdk.core.ct.rz, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.ct.rz, android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    private void kgy() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setId(xh.ko);
        setBackgroundColor(-1);
        setClickable(true);
        setFocusable(true);
        this.ahm = new fi(this.kgy);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        this.ahm.setLayoutParams(layoutParams);
        this.ahm.setTextColor(Color.argb(166, 0, 0, 0));
        this.ahm.setTextSize(16.0f);
        this.ahm.setMaxLines(3);
        this.ahm.setEllipsize(TextUtils.TruncateAt.END);
        addView(this.ahm);
    }

    public void setPrivacyText(String str) {
        try {
            if (this.ahm == null || TextUtils.isEmpty(str)) {
                return;
            }
            this.ahm.setText(Html.fromHtml(str, 63));
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4AQrixS4CqFArts", "cs8PtwyofciNZtZEgwS0", "SOs5pRG1f8aDU+NYlAU=", 66);
            e.getMessage();
            this.ahm.setText("You agree to the Terms of Use and Privacy Policy.");
        }
    }

    public kgy(@NonNull Context context) {
        super(context);
        this.kgy = context;
        kgy();
    }
}
