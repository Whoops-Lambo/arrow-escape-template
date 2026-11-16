package com.bytedance.sdk.component.adexpress.noq;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import com.unity3d.services.UnityAdsConstants;
import defpackage.q63;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class um extends LinearLayout {
    private TextView ahm;
    private JSONObject at;
    private TextView ct;
    private LinearLayout fi;
    private int gf;
    private TextView kgy;
    private TextView noq;
    private int nu;
    private int ra;
    private ImageView rz;
    private com.bytedance.sdk.component.utils.lqi uq;
    private kgy yo;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.noq.um$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (um.this.rz != null) {
                final RotateAnimation rotateAnimation = new RotateAnimation(-14.0f, 14.0f, 1, 0.9f, 1, 0.9f);
                rotateAnimation.setInterpolator(new ahm(null));
                rotateAnimation.setDuration(1000L);
                rotateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.noq.um.1.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        um.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.noq.um.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                um.this.rz.startAnimation(rotateAnimation);
                            }
                        }, 250L);
                    }
                });
                um.this.rz.startAnimation(rotateAnimation);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ahm implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            if (f <= 0.25f) {
                return (f * (-2.0f)) + 0.5f;
            }
            if (f <= 0.5f) {
                return (f * 4.0f) - 1.0f;
            }
            return f <= 0.75f ? (f * (-4.0f)) + 3.0f : (f * 2.0f) - 1.5f;
        }

        private ahm() {
        }

        public /* synthetic */ ahm(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface kgy {
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

    public LinearLayout getShakeLayout() {
        return this.fi;
    }

    public void setOnShakeViewListener(kgy kgyVar) {
        this.yo = kgyVar;
    }

    public um(@NonNull Context context, View view, int i, int i2, int i3, JSONObject jSONObject) {
        super(context);
        this.gf = i;
        this.ra = i2;
        this.nu = i3;
        this.at = jSONObject;
        kgy(context, view);
    }

    public void kgy(Context context, View view) {
        addView(view);
        this.fi = (LinearLayout) findViewById(2097610727);
        this.rz = (ImageView) findViewById(2097610725);
        this.kgy = (TextView) findViewById(2097610724);
        this.ahm = (TextView) findViewById(2097610726);
        this.ct = (TextView) findViewById(2097610723);
        this.noq = (TextView) findViewById(2097610728);
        GradientDrawable gradientDrawableB = q63.b(1);
        gradientDrawableB.setColor(Color.parseColor("#57000000"));
        this.fi.setBackground(gradientDrawableB);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.uq == null) {
                this.uq = new com.bytedance.sdk.component.utils.lqi(getContext().getApplicationContext(), 1);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.noq.um.2
            };
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setShakeText(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        TextView textView = this.ct;
        if (zIsEmpty) {
            textView.setVisibility(8);
            this.noq.setVisibility(8);
        } else {
            textView.setText(str);
        }
    }

    public void kgy() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
        postDelayed(new AnonymousClass1(), 500L);
    }
}
