package com.bytedance.sdk.component.adexpress.noq;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.bytedance.sdk.component.utils.ft;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class kgy extends TextSwitcher implements ViewSwitcher.ViewFactory, ft.kgy {
    private List<String> ahm;
    private int at;
    private Context ct;
    private int fi;
    private float gf;
    Animation.AnimationListener kgy;
    private Handler kus;
    private TextView noq;
    private int nu;
    private int ra;
    private int rz;
    private int twf;
    private final int uq;
    private int yo;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    public void ahm() {
        List<String> list = this.ahm;
        if (list == null || list.size() <= 0) {
            return;
        }
        int i = this.rz;
        this.rz = i + 1;
        this.nu = i;
        setText(this.ahm.get(i));
        if (this.rz > this.ahm.size() - 1) {
            this.rz = 0;
        }
    }

    public void kgy() {
        int i = this.at;
        if (i == 1) {
            setInAnimation(getContext(), com.bytedance.sdk.component.utils.ay.yo(this.ct, "tt_text_animation_y_in"));
            setOutAnimation(getContext(), com.bytedance.sdk.component.utils.ay.yo(this.ct, "tt_text_animation_y_out"));
        } else if (i == 0) {
            setInAnimation(getContext(), com.bytedance.sdk.component.utils.ay.yo(this.ct, "tt_text_animation_x_in"));
            setOutAnimation(getContext(), com.bytedance.sdk.component.utils.ay.yo(this.ct, "tt_text_animation_x_in"));
            getInAnimation().setInterpolator(new LinearInterpolator());
            getOutAnimation().setInterpolator(new LinearInterpolator());
            getInAnimation().setAnimationListener(this.kgy);
            getOutAnimation().setAnimationListener(this.kgy);
        }
        this.kus.sendEmptyMessage(1);
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        TextView textView = new TextView(getContext());
        this.noq = textView;
        textView.setTextColor(this.fi);
        this.noq.setTextSize(this.gf);
        this.noq.setMaxLines(this.ra);
        this.noq.setTextAlignment(this.twf);
        return this.noq;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        try {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(com.bytedance.sdk.component.adexpress.dynamic.ct.nu.ahm(this.ahm.get(this.nu), this.gf, false)[0], 1073741824), i);
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJ+zoRN0kk=", "euAkmAKoYMiOftJFmA==", "VOAAkAKvfNWF", 182);
            super.onMeasure(i, i2);
        }
    }

    public void setAnimationDuration(int i) {
        this.yo = i;
    }

    public void setAnimationText(List<String> list) {
        this.ahm = list;
    }

    public void setAnimationType(int i) {
        this.at = i;
    }

    public void setMaxLines(int i) {
        this.ra = i;
    }

    public void setTextColor(int i) {
        this.fi = i;
    }

    public void setTextSize(float f) {
        this.gf = f;
    }

    public kgy(Context context, int i, float f, int i2, int i3) {
        super(context);
        this.ahm = new ArrayList();
        this.rz = 0;
        this.uq = 1;
        this.kus = new ft(Looper.getMainLooper(), this);
        this.kgy = new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.noq.kgy.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (kgy.this.noq != null) {
                    kgy.this.noq.setText("");
                }
            }
        };
        this.ct = context;
        this.fi = i;
        this.gf = f;
        this.ra = i2;
        this.twf = i3;
        rz();
    }

    private void rz() {
        setFactory(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.kus.sendEmptyMessageDelayed(1, this.yo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.kus.removeMessages(1);
    }

    @Override // com.bytedance.sdk.component.utils.ft.kgy
    public void kgy(Message message) {
        if (message.what != 1) {
            return;
        }
        ahm();
        this.kus.sendEmptyMessageDelayed(1, this.yo);
    }
}
