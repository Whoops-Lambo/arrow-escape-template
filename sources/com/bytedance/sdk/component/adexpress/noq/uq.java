package com.bytedance.sdk.component.adexpress.noq;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.unity3d.services.UnityAdsConstants;
import defpackage.pv1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class uq extends View {
    private int ahm;
    private float at;
    private float ct;
    private List<Integer> fi;
    private List<Integer> gf;
    private int kgy;
    private int kus;
    private int noq;
    private Paint nu;
    private Paint ra;
    private float rz;
    private float twf;
    private int uq;
    private boolean yo;

    public void ahm() {
        this.yo = false;
        this.gf.clear();
        this.fi.clear();
        this.fi.add(255);
        this.gf.add(0);
        invalidate();
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    public void kgy() {
        this.yo = true;
        invalidate();
    }

    public void setCoreRadius(int i) {
        this.rz = i;
    }

    public void setMaxWidth(int i) {
        this.ct = i;
    }

    private void rz() {
        Paint paint = new Paint();
        this.ra = paint;
        paint.setAntiAlias(true);
        this.ra.setStrokeWidth(this.kus);
        this.fi.add(255);
        this.gf.add(0);
        Paint paint2 = new Paint();
        this.nu = paint2;
        paint2.setAntiAlias(true);
        this.nu.setColor(Color.parseColor("#0FFFFFFF"));
        this.nu.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.ra.setShader(new LinearGradient(this.at, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.twf, getMeasuredHeight(), -1, 16777215, Shader.TileMode.CLAMP));
        int i = 0;
        while (true) {
            if (i >= this.fi.size()) {
                break;
            }
            Integer num = this.fi.get(i);
            this.ra.setAlpha(num.intValue());
            Integer num2 = this.gf.get(i);
            if (this.rz + num2.intValue() < this.ct) {
                canvas.drawCircle(this.at, this.twf, this.rz + num2.intValue(), this.ra);
            }
            if (num.intValue() > 0 && num2.intValue() < this.ct) {
                this.fi.set(i, Integer.valueOf(num.intValue() - this.noq > 0 ? num.intValue() - (this.noq * 3) : 1));
                this.gf.set(i, Integer.valueOf(num2.intValue() + this.noq));
            }
            i++;
        }
        if (((Integer) pv1.i(1, this.gf)).intValue() >= this.ct / this.uq) {
            this.fi.add(255);
            this.gf.add(0);
        }
        if (this.gf.size() >= 3) {
            this.gf.remove(0);
            this.fi.remove(0);
        }
        this.ra.setAlpha(255);
        this.ra.setColor(this.ahm);
        canvas.drawCircle(this.at, this.twf, this.rz, this.nu);
        if (this.yo) {
            invalidate();
        }
    }

    public void setColor(int i) {
        this.kgy = i;
    }

    public void setCoreColor(int i) {
        this.ahm = i;
    }

    public void setDiffuseSpeed(int i) {
        this.noq = i;
    }

    public void setDiffuseWidth(int i) {
        this.uq = i;
    }

    public uq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.kgy = -1;
        this.ahm = -65536;
        this.rz = 18.0f;
        this.uq = 3;
        this.ct = 50.0f;
        this.noq = 2;
        this.yo = false;
        this.fi = new ArrayList();
        this.gf = new ArrayList();
        this.kus = 24;
        rz();
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = i / 2.0f;
        this.at = f;
        this.twf = i2 / 2.0f;
        float f2 = f - (this.kus / 2.0f);
        this.ct = f2;
        this.rz = f2 / 4.0f;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            invalidate();
        }
    }

    public uq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public uq(Context context) {
        this(context, null);
    }
}
