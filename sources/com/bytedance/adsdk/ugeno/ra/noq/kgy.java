package com.bytedance.adsdk.ugeno.ra.noq;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.ct;
import com.bytedance.adsdk.ugeno.kgy.fi;
import com.bytedance.adsdk.ugeno.kgy.yo;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class kgy extends TextView implements IAnimation, yo {
    private float ahm;
    private float ct;
    private ct kgy;
    private float noq;
    private fi rz;
    private float uq;
    private float yo;

    public float getBorderRadius() {
        return this.rz.kgy();
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation, com.bytedance.adsdk.ugeno.kgy.yo
    public float getRipple() {
        return this.ahm;
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.yo
    public float getRubIn() {
        return this.rz.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.yo
    public float getShine() {
        return this.rz.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.yo
    public float getStretch() {
        return this.rz.getStretch();
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ct ctVar = this.kgy;
        if (ctVar != null) {
            ctVar.kgy(i, i2, i3, i4);
        }
        if (z && this.uq > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            kgy(((i3 - i) - getCompoundPaddingLeft()) - getCompoundPaddingRight(), ((i4 - i2) - getCompoundPaddingBottom()) - getCompoundPaddingTop());
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        ct ctVar = this.kgy;
        if (ctVar == null) {
            super.onMeasure(i, i2);
        } else {
            int[] iArrKgy = ctVar.kgy(i, i2);
            super.onMeasure(iArrKgy[0], iArrKgy[1]);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.rz.kgy(i);
    }

    public void setBorderRadius(float f) {
        fi fiVar = this.rz;
        if (fiVar != null) {
            fiVar.kgy(f);
        }
    }

    public void setMinTextSize(float f) {
        this.uq = f;
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f) {
        this.ahm = f;
        fi fiVar = this.rz;
        if (fiVar != null) {
            fiVar.ahm(f);
        }
        postInvalidate();
    }

    public void setRubIn(float f) {
        fi fiVar = this.rz;
        if (fiVar != null) {
            fiVar.ct(f);
        }
    }

    public void setShine(float f) {
        fi fiVar = this.rz;
        if (fiVar != null) {
            fiVar.rz(f);
        }
    }

    public void setStretch(float f) {
        fi fiVar = this.rz;
        if (fiVar != null) {
            fiVar.uq(f);
        }
    }

    public kgy(Context context) {
        super(context);
        this.uq = -1.0f;
        this.noq = 1.0f;
        this.yo = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.rz = new fi(this);
    }

    private void kgy(int i, int i2) {
        CharSequence text = getText();
        if (text != null && text.length() != 0 && i2 > 0 && i > 0 && this.ct != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            TextPaint paint = getPaint();
            float fMax = this.ct;
            int iKgy = kgy(text, paint, i, fMax);
            while (iKgy > i2 && fMax > this.uq) {
                Log.d("UGTextView", "resizeText: targetSize=" + fMax + "; mMinTextSize=" + this.uq);
                fMax = Math.max(fMax - 1.0f, this.uq);
                iKgy = kgy(text, paint, i, fMax);
            }
            Log.d("UGTextView", "resizeText: targetSize: ".concat(String.valueOf(fMax)));
            setTextSize(0, fMax);
            setLineSpacing(this.yo, this.noq);
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ct ctVar = this.kgy;
        if (ctVar != null) {
            ctVar.ahm(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ct ctVar = this.kgy;
        if (ctVar != null) {
            ctVar.yo();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ct ctVar = this.kgy;
        if (ctVar != null) {
            ctVar.fi();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ct ctVar = this.kgy;
        if (ctVar != null) {
            ctVar.kgy(canvas, this);
            this.kgy.kgy(canvas);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ct ctVar = this.kgy;
        if (ctVar != null) {
            ctVar.ahm(i, i2, i3, i3);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        ct ctVar = this.kgy;
        if (ctVar != null) {
            ctVar.kgy(z);
        }
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f, float f2) {
        super.setLineSpacing(f, f2);
        this.noq = f2;
        this.yo = f;
    }

    @Override // android.widget.TextView
    public void setTextSize(float f) {
        super.setTextSize(f);
        this.ct = getTextSize();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.ct = getTextSize();
    }

    public void kgy(ct ctVar) {
        this.kgy = ctVar;
    }

    private int kgy(CharSequence charSequence, TextPaint textPaint, int i, float f) {
        TextPaint textPaint2 = new TextPaint(textPaint);
        textPaint2.setTextSize(f);
        return new StaticLayout(charSequence, textPaint2, i, Layout.Alignment.ALIGN_NORMAL, this.noq, this.yo, true).getHeight();
    }
}
