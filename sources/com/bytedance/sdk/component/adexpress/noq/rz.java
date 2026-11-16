package com.bytedance.sdk.component.adexpress.noq;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.view.MotionEvent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.uf;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class rz extends FrameLayout {
    private ImageView ahm;
    private dg ct;
    private Context kgy;
    private AnimatorSet noq;
    private ImageView rz;
    private TextView uq;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    private void ct() {
        FrameLayout frameLayout = new FrameLayout(this.kgy);
        this.ct = new dg(this.kgy);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.kgy, 95.0f), (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.kgy, 95.0f));
        layoutParams.gravity = 17;
        frameLayout.addView(this.ct, layoutParams);
        this.ahm = new ImageView(this.kgy);
        int iKgy = uf.kgy(this.kgy, 60.0f);
        this.ahm.setImageDrawable(com.bytedance.sdk.component.adexpress.uq.fi.kgy(1, null, null, new int[]{iKgy, iKgy}, Integer.valueOf(uf.kgy(this.kgy, 1.0f)), Integer.valueOf(Color.parseColor("#80FFFFFF"))));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.kgy, 75.0f), (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.kgy, 75.0f));
        layoutParams2.gravity = 17;
        frameLayout.addView(this.ahm, layoutParams2);
        this.rz = new ImageView(this.kgy);
        int iKgy2 = uf.kgy(this.kgy, 50.0f);
        this.rz.setImageDrawable(com.bytedance.sdk.component.adexpress.uq.fi.kgy(1, Integer.valueOf(Color.parseColor("#80FFFFFF")), null, new int[]{iKgy2, iKgy2}, null, null));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.kgy, 63.0f), (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.kgy, 63.0f));
        layoutParams3.gravity = 17;
        frameLayout.addView(this.rz, layoutParams3);
        addView(frameLayout);
        TextView textView = new TextView(this.kgy);
        this.uq = textView;
        textView.setTextColor(-1);
        this.uq.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 81;
        addView(this.uq, layoutParams4);
    }

    private void noq() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.rz, "scaleX", 1.0f, 0.9f);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.setRepeatMode(2);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.rz, "scaleY", 1.0f, 0.9f);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.noq.setDuration(800L);
        this.noq.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    public void ahm() {
        this.noq.cancel();
    }

    public void kgy() {
        this.noq.start();
    }

    public void rz() {
        this.ct.kgy();
    }

    public void setGuideText(String str) {
        this.uq.setText(str);
    }

    public void uq() {
        this.ct.ahm();
        this.ct.rz();
    }

    public rz(@NonNull Context context) {
        super(context);
        this.noq = new AnimatorSet();
        this.kgy = context;
        ct();
        noq();
    }
}
