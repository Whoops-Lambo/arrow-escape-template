package com.bytedance.sdk.component.adexpress.noq;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class nu extends FrameLayout {
    private final ImageView ahm;
    private final TextView kgy;
    private final at rz;
    private final RotateAnimation uq;

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

    /* JADX INFO: Access modifiers changed from: private */
    public Runnable getHaloAnimation() {
        return new Runnable() { // from class: com.bytedance.sdk.component.adexpress.noq.nu.1
            @Override // java.lang.Runnable
            public void run() {
                nu.this.ahm.startAnimation(nu.this.uq);
                nu.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.noq.nu.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        nu.this.rz.kgy(4);
                    }
                }, 100L);
                nu.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.noq.nu.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        nu.this.rz.kgy(4);
                    }
                }, 300L);
                nu nuVar = nu.this;
                nuVar.postDelayed(nuVar.getHaloAnimation(), 1200L);
            }
        };
    }

    public void ahm() {
        this.uq.cancel();
    }

    public nu(@NonNull Context context) {
        super(context);
        addView(com.bytedance.sdk.component.adexpress.rz.kgy.uq(context));
        this.kgy = (TextView) findViewById(2097610742);
        this.ahm = (ImageView) findViewById(2097610745);
        this.rz = (at) findViewById(2097610744);
        RotateAnimation rotateAnimation = new RotateAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30.0f, 1, 0.65f, 1, 0.9f);
        this.uq = rotateAnimation;
        rotateAnimation.setDuration(300L);
        rotateAnimation.setRepeatMode(2);
        rotateAnimation.setRepeatCount(1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
    }

    public void kgy() {
        postDelayed(getHaloAnimation(), 300L);
    }

    public void setText(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "Slide or click to jump to the details page or third-party application";
        }
        TextView textView = this.kgy;
        if (textView != null) {
            textView.setText(str);
        }
    }
}
