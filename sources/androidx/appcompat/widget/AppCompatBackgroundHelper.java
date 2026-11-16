package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.R;
import androidx.core.view.ViewCompat;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
class AppCompatBackgroundHelper {
    public final View a;
    public TintInfo d;
    public TintInfo e;
    public TintInfo f;
    public int c = -1;
    public final AppCompatDrawableManager b = AppCompatDrawableManager.a();

    public final void e() {
        this.c = -1;
        g(null);
        a();
    }

    public final void a() {
        View view = this.a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.d != null) {
                if (this.f == null) {
                    this.f = new TintInfo();
                }
                TintInfo tintInfo = this.f;
                tintInfo.a = null;
                tintInfo.d = false;
                tintInfo.b = null;
                tintInfo.c = false;
                ColorStateList colorStateListI = ViewCompat.i(view);
                if (colorStateListI != null) {
                    tintInfo.d = true;
                    tintInfo.a = colorStateListI;
                }
                PorterDuff.Mode modeJ = ViewCompat.j(view);
                if (modeJ != null) {
                    tintInfo.c = true;
                    tintInfo.b = modeJ;
                }
                if (tintInfo.d || tintInfo.c) {
                    AppCompatDrawableManager.e(background, tintInfo, view.getDrawableState());
                    return;
                }
            }
            TintInfo tintInfo2 = this.e;
            if (tintInfo2 != null) {
                AppCompatDrawableManager.e(background, tintInfo2, view.getDrawableState());
                return;
            }
            TintInfo tintInfo3 = this.d;
            if (tintInfo3 != null) {
                AppCompatDrawableManager.e(background, tintInfo3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        TintInfo tintInfo = this.e;
        if (tintInfo != null) {
            return tintInfo.a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        TintInfo tintInfo = this.e;
        if (tintInfo != null) {
            return tintInfo.b;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListG;
        View view = this.a;
        Context context = view.getContext();
        int[] iArr = R.styleable.z;
        TintTypedArray tintTypedArrayE = TintTypedArray.e(context, attributeSet, iArr, i);
        TypedArray typedArray = tintTypedArrayE.b;
        View view2 = this.a;
        ViewCompat.y(view2, view2.getContext(), iArr, attributeSet, tintTypedArrayE.b, i);
        try {
            if (typedArray.hasValue(0)) {
                this.c = typedArray.getResourceId(0, -1);
                AppCompatDrawableManager appCompatDrawableManager = this.b;
                Context context2 = view.getContext();
                int i2 = this.c;
                synchronized (appCompatDrawableManager) {
                    colorStateListG = appCompatDrawableManager.a.g(context2, i2);
                }
                if (colorStateListG != null) {
                    g(colorStateListG);
                }
            }
            if (typedArray.hasValue(1)) {
                ViewCompat.C(view, tintTypedArrayE.a(1));
            }
            if (typedArray.hasValue(2)) {
                ViewCompat.D(view, DrawableUtils.c(typedArray.getInt(2, -1), null));
            }
            tintTypedArrayE.f();
        } catch (Throwable th) {
            tintTypedArrayE.f();
            throw th;
        }
    }

    public final void f(int i) {
        ColorStateList colorStateListG;
        this.c = i;
        AppCompatDrawableManager appCompatDrawableManager = this.b;
        if (appCompatDrawableManager != null) {
            Context context = this.a.getContext();
            synchronized (appCompatDrawableManager) {
                colorStateListG = appCompatDrawableManager.a.g(context, i);
            }
        } else {
            colorStateListG = null;
        }
        g(colorStateListG);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new TintInfo();
            }
            TintInfo tintInfo = this.d;
            tintInfo.a = colorStateList;
            tintInfo.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new TintInfo();
        }
        TintInfo tintInfo = this.e;
        tintInfo.a = colorStateList;
        tintInfo.d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new TintInfo();
        }
        TintInfo tintInfo = this.e;
        tintInfo.b = mode;
        tintInfo.c = true;
        a();
    }

    public AppCompatBackgroundHelper(View view) {
        this.a = view;
    }
}
