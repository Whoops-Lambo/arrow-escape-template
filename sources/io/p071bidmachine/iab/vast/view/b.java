package io.p071bidmachine.iab.vast.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.unity3d.services.UnityAdsConstants;
import io.p071bidmachine.iab.utils.a;
import io.p071bidmachine.iab.utils.p;
import io.p071bidmachine.iab.utils.q;
import io.p071bidmachine.iab.utils.y;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class b extends TextView implements p {
    public final RectF a;
    public final GradientDrawable b;
    public Paint c;
    public boolean d;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        GradientDrawable gradientDrawable = this.b;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i);
        }
    }

    @Override // io.p071bidmachine.iab.utils.p
    public void setStyle(@NonNull q qVar) {
        Boolean bool = qVar.c;
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        boolean zBooleanValue = bool.booleanValue();
        this.d = zBooleanValue;
        if (zBooleanValue) {
            Paint paint = new Paint(1);
            this.c = paint;
            paint.setStyle(Paint.Style.STROKE);
            Paint paint2 = this.c;
            Integer numValueOf = qVar.a;
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(a.a);
            }
            paint2.setColor(numValueOf.intValue());
            this.c.setStrokeWidth(qVar.k(getContext()).floatValue());
        }
        Integer numValueOf2 = qVar.a;
        if (numValueOf2 == null) {
            numValueOf2 = Integer.valueOf(a.a);
        }
        setTextColor(numValueOf2.intValue());
        setBackgroundColor(qVar.f().intValue());
        Context context = getContext();
        Float f = qVar.w;
        setTextSize(0, (f != null ? Float.valueOf(y.c(context, f.floatValue())) : Float.valueOf(y.c(context, 16.0f))).floatValue());
        Typeface typeface = Typeface.DEFAULT;
        Integer num = qVar.v;
        if (num == null) {
            num = 0;
        }
        setTypeface(Typeface.create(typeface, num.intValue()));
        Float fValueOf = qVar.h;
        if (fValueOf == null) {
            fValueOf = Float.valueOf(1.0f);
        }
        setAlpha(fValueOf.floatValue());
        setPadding(qVar.h(getContext()).intValue(), qVar.j(getContext()).intValue(), qVar.i(getContext()).intValue(), qVar.g(getContext()).intValue());
    }

    public b(Context context) {
        super(context);
        this.a = new RectF();
        this.d = false;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.b = gradientDrawable;
        gradientDrawable.setColor(a.b);
        this.b.setShape(0);
        setBackgroundDrawable(this.b);
        setGravity(17);
        setMaxLines(1);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.d && this.c != null) {
            float height = getHeight() / 2.0f;
            canvas.drawRoundRect(this.a, height, height, this.c);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            float size = (View.MeasureSpec.getSize(i2) - getCompoundPaddingTop()) - getCompoundPaddingRight();
            if (getTextSize() != size) {
                setTextSize(0, size);
            }
        }
        if (mode == 1073741824 && getText() != null) {
            int size2 = (View.MeasureSpec.getSize(i) - getCompoundPaddingLeft()) - getCompoundPaddingRight();
            float fMeasureText = getPaint().measureText(getText(), 0, getText().length());
            float f = size2;
            if (f < fMeasureText) {
                float textSize = (int) (getTextSize() * (f / fMeasureText));
                if (getTextSize() != textSize) {
                    setTextSize(0, textSize);
                }
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        Paint paint;
        super.onSizeChanged(i, i2, i3, i4);
        GradientDrawable gradientDrawable = this.b;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadius(i2 / 2.0f);
        }
        if (this.d && (paint = this.c) != null) {
            float strokeWidth = paint.getStrokeWidth() / 2.0f;
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT + strokeWidth;
            this.a.set(f, f, i - strokeWidth, i2 - strokeWidth);
        }
    }
}
