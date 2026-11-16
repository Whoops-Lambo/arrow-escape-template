package com.bytedance.sdk.component.adexpress.noq;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class fi extends gm {
    private ImageView ahm;
    private int ct;
    private TextView kgy;
    private AnimatorSet noq;
    private ImageView rz;
    private ImageView uq;

    private void uq() {
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "alphaColor", 0, 60);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        objectAnimatorOfInt.setDuration(2000L);
        objectAnimatorOfInt.setRepeatCount(-1);
        objectAnimatorOfInt.start();
    }

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

    public float getAlphaColor() {
        return this.ct;
    }

    public void setAlphaColor(int i) {
        if (i < 0 || i > 60) {
            return;
        }
        int i2 = i + 195;
        ImageView imageView = this.uq;
        int iRgb = Color.rgb(i2, i2, i2);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(iRgb, mode);
        int i3 = ((i + 20) % 60) + 195;
        this.rz.setColorFilter(Color.rgb(i3, i3, i3), mode);
        int i4 = ((i + 40) % 60) + 195;
        this.ahm.setColorFilter(Color.rgb(i4, i4, i4), mode);
    }

    public void setButtonText(String str) {
        if (this.kgy == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.kgy.setText(str);
    }

    public fi(Context context) {
        super(context);
        this.noq = new AnimatorSet();
        ahm(context);
    }

    private void ahm(Context context) {
        addView(com.bytedance.sdk.component.adexpress.rz.kgy.ahm(context));
        this.ahm = (ImageView) findViewById(2097610751);
        this.rz = (ImageView) findViewById(2097610750);
        this.uq = (ImageView) findViewById(2097610749);
        this.kgy = (TextView) findViewById(2097610748);
    }

    @Override // com.bytedance.sdk.component.adexpress.noq.gm
    public void kgy() {
        uq();
    }

    @Override // com.bytedance.sdk.component.adexpress.noq.gm
    public void kgy(Context context) {
    }

    @Override // com.bytedance.sdk.component.adexpress.noq.gm
    public void ahm() {
        this.noq.cancel();
    }
}
