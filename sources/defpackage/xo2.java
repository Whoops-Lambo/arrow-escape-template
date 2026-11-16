package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.content.res.ResourcesCompat;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class xo2 {
    public final ColorStateList a;
    public final String b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final boolean h;
    public final float i;
    public final ColorStateList j;
    public float k;
    public final int l;
    public boolean m = false;
    public Typeface n;

    public final boolean d(Context context) {
        Typeface typefaceC = null;
        int i = this.l;
        if (i != 0) {
            ThreadLocal threadLocal = ResourcesCompat.a;
            if (!context.isRestricted()) {
                typefaceC = ResourcesCompat.c(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceC != null;
    }

    public final void a() {
        String str;
        Typeface typeface = this.n;
        int i = this.c;
        if (typeface == null && (str = this.b) != null) {
            this.n = Typeface.create(str, i);
        }
        if (this.n == null) {
            int i2 = this.d;
            if (i2 == 1) {
                this.n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.n = Typeface.DEFAULT;
            } else {
                this.n = Typeface.MONOSPACE;
            }
            this.n = Typeface.create(this.n, i);
        }
    }

    public final Typeface b(Context context) {
        if (this.m) {
            return this.n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceB = ResourcesCompat.b(context, this.l);
                this.n = typefaceB;
                if (typefaceB != null) {
                    this.n = Typeface.create(typefaceB, this.c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.b, e);
            }
        }
        a();
        this.m = true;
        return this.n;
    }

    public xo2(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, r12.E);
        this.k = typedArrayObtainStyledAttributes.getDimension(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.j = ni1.a(context, typedArrayObtainStyledAttributes, 3);
        ni1.a(context, typedArrayObtainStyledAttributes, 4);
        ni1.a(context, typedArrayObtainStyledAttributes, 5);
        this.c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i2 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.l = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.b = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.a = ni1.a(context, typedArrayObtainStyledAttributes, 6);
        this.e = typedArrayObtainStyledAttributes.getFloat(7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f = typedArrayObtainStyledAttributes.getFloat(8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.g = typedArrayObtainStyledAttributes.getFloat(9, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, r12.v);
        this.h = typedArrayObtainStyledAttributes2.hasValue(0);
        this.i = typedArrayObtainStyledAttributes2.getFloat(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void c(Context context, yo2 yo2Var) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.l;
        if (i == 0) {
            this.m = true;
        }
        if (this.m) {
            yo2Var.b(this.n, true);
            return;
        }
        try {
            vo2 vo2Var = new vo2(this, yo2Var);
            ThreadLocal threadLocal = ResourcesCompat.a;
            if (context.isRestricted()) {
                vo2Var.a(-4);
            } else {
                ResourcesCompat.c(context, i, new TypedValue(), 0, vo2Var, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.m = true;
            yo2Var.a(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.b, e);
            this.m = true;
            yo2Var.a(-3);
        }
    }

    public final void e(Context context, TextPaint textPaint, yo2 yo2Var) {
        int colorForState;
        int colorForState2;
        f(context, textPaint, yo2Var);
        ColorStateList colorStateList = this.j;
        if (colorStateList != null) {
            colorForState = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            colorForState = -16777216;
        }
        textPaint.setColor(colorForState);
        ColorStateList colorStateList2 = this.a;
        if (colorStateList2 != null) {
            colorForState2 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            colorForState2 = 0;
        }
        textPaint.setShadowLayer(this.g, this.e, this.f, colorForState2);
    }

    public final void f(Context context, TextPaint textPaint, yo2 yo2Var) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.n);
        c(context, new wo2(this, context, textPaint, yo2Var));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z;
        float f;
        Typeface typefaceA = us2.a(context.getResources().getConfiguration(), typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.c;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        textPaint.setFakeBoldText(z);
        if ((i & 2) != 0) {
            f = -0.25f;
        } else {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        textPaint.setTextSkewX(f);
        textPaint.setTextSize(this.k);
        if (this.h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
