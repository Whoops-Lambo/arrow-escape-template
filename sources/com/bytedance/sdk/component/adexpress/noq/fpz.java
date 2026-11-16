package com.bytedance.sdk.component.adexpress.noq;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class fpz extends LinearLayout {
    private com.bytedance.sdk.component.utils.lqi ahm;
    private LinearLayout ct;
    private TextView kgy;
    private com.bytedance.adsdk.ahm.noq noq;
    private TextView rz;
    private kgy uq;
    private com.bytedance.sdk.component.adexpress.dynamic.uq.ra yo;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface kgy {
    }

    private void kgy(Context context, View view) {
        setClipChildren(false);
        addView(view);
        this.ct = (LinearLayout) findViewById(2097610722);
        this.kgy = (TextView) findViewById(2097610719);
        this.rz = (TextView) findViewById(2097610718);
        com.bytedance.adsdk.ahm.noq noqVar = (com.bytedance.adsdk.ahm.noq) findViewById(2097610706);
        this.noq = noqVar;
        noqVar.setAnimation("lottie_json/twist_multi_angle.json");
        this.noq.setImageAssetsFolder("images/");
        this.noq.kgy(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    public TextView getTopTextView() {
        return this.kgy;
    }

    public LinearLayout getWriggleLayout() {
        return this.ct;
    }

    public View getWriggleProgressIv() {
        return this.noq;
    }

    public void setOnShakeViewListener(kgy kgyVar) {
        this.uq = kgyVar;
    }

    public void setShakeText(String str) {
        this.rz.setText(str);
    }

    public fpz(@NonNull Context context, View view, com.bytedance.sdk.component.adexpress.dynamic.uq.ra raVar) {
        super(context);
        this.yo = raVar;
        kgy(context, view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.ahm == null) {
                this.ahm = new com.bytedance.sdk.component.utils.lqi(getContext().getApplicationContext(), 2);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.noq.fpz.2
            };
            com.bytedance.sdk.component.adexpress.dynamic.uq.ra raVar = this.yo;
            if (raVar != null) {
                raVar.rz();
                this.yo.ct();
                this.yo.noq();
                this.yo.fi();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            com.bytedance.adsdk.ahm.noq noqVar = this.noq;
            if (noqVar != null) {
                noqVar.ct();
            }
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJ+zoRN0kk=", "bPwkkgSwbOCVQ9NYrR+pJVr6JJoNimDClw==", "VOAJkBe9as+FTvFPgxyXIVXqIoI=", Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
        }
    }

    public void kgy() {
        postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.noq.fpz.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    fpz.this.noq.kgy();
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJ+zoRN0kk=", "bPwkkgSwbOCVQ9NYrR+pJVr6JJoNimDClw6G", "Sfsj", 73);
                }
            }
        }, 500L);
    }
}
