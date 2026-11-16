package com.adsurge.adn.p070z0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.MetricAffectingSpan;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import com.adsurge.adn.p038l0.e;
import com.adsurge.adn.p038l0.i;
import com.adsurge.adn.p041m0.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class c extends TextView implements e {
    public i a;
    public boolean b;

    public final void a(CharSequence charSequence, TextView.BufferType bufferType) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spanned);
            MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(0, spanned.length(), MetricAffectingSpan.class);
            if (metricAffectingSpanArr != null && metricAffectingSpanArr.length > 0) {
                for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                    int spanStart = spannableStringBuilder.getSpanStart(metricAffectingSpan);
                    if (a(spannableStringBuilder, spanStart - 1)) {
                        spannableStringBuilder.insert(spanStart, (CharSequence) " ");
                    }
                    int spanEnd = spannableStringBuilder.getSpanEnd(metricAffectingSpan);
                    if (a(spannableStringBuilder, spanEnd)) {
                        spannableStringBuilder.insert(spanEnd, (CharSequence) " ");
                    }
                }
            }
            super.setText(spannableStringBuilder, bufferType);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int width;
        int height;
        i iVar = this.a;
        d dVarU = iVar == null ? null : iVar.u();
        if (dVarU != null) {
            width = getWidth();
            height = getHeight();
            dVarU.a(canvas, width, height);
        } else {
            width = 0;
            height = 0;
        }
        super.draw(canvas);
        if (dVarU != null) {
            dVarU.b(canvas, width, height);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        com.adsurge.adn.p050p0.d dVarX = this.a.x();
        if (dVarX == null) {
            super.onMeasure(i, i2);
            return;
        }
        if (this.b) {
            i = 0;
        }
        Pair pairB = dVarX.b(i, i2);
        super.onMeasure(((Integer) pairB.first).intValue(), ((Integer) pairB.second).intValue());
        Pair pairA = dVarX.a(i, i2);
        if (pairA != null) {
            super.setMeasuredDimension(View.MeasureSpec.getSize(((Integer) pairA.first).intValue()), View.MeasureSpec.getSize(((Integer) pairA.second).intValue()));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onVisibilityChanged(View view, int i) {
        i iVar = this.a;
        if (iVar != null) {
            iVar.a(view, i);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.a.f(i);
    }

    @Override // com.adsurge.adn.p038l0.e
    public void setViewNode(i iVar) {
        this.a = iVar;
    }

    public c(Context context) {
        super(context);
        getPaint().setAntiAlias(true);
        setIncludeFontPadding(false);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        try {
            super.setText(charSequence, bufferType);
        } catch (IndexOutOfBoundsException unused) {
            a(charSequence, bufferType);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        try {
            super.setTypeface(typeface);
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    public final boolean a(CharSequence charSequence, int i) {
        return i < 0 || i >= charSequence.length() || charSequence.charAt(i) != ' ';
    }

    public void a(boolean z) {
        this.b = z;
    }
}
