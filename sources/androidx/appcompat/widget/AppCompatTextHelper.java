package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.appcompat.R;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.unity3d.services.UnityAdsConstants;
import defpackage.d;
import defpackage.pv1;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
class AppCompatTextHelper {
    public final TextView a;
    public TintInfo b;
    public TintInfo c;
    public TintInfo d;
    public TintInfo e;
    public TintInfo f;
    public TintInfo g;
    public TintInfo h;
    public final AppCompatTextViewAutoSizeHelper i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public static TintInfo c(Context context, AppCompatDrawableManager appCompatDrawableManager, int i) {
        ColorStateList colorStateListG;
        synchronized (appCompatDrawableManager) {
            colorStateListG = appCompatDrawableManager.a.g(context, i);
        }
        if (colorStateListG == null) {
            return null;
        }
        TintInfo tintInfo = new TintInfo();
        tintInfo.d = true;
        tintInfo.a = colorStateListG;
        return tintInfo;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api24Impl {
        @DoNotInline
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        @DoNotInline
        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api26Impl {
        @DoNotInline
        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @DoNotInline
        public static void b(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        @DoNotInline
        public static void c(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        @DoNotInline
        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api28Impl {
        @DoNotInline
        public static Typeface a(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    public final void a(Drawable drawable, TintInfo tintInfo) {
        if (drawable == null || tintInfo == null) {
            return;
        }
        AppCompatDrawableManager.e(drawable, tintInfo, this.a.getDrawableState());
    }

    public final void b() {
        TintInfo tintInfo = this.b;
        TextView textView = this.a;
        if (tintInfo != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public final ColorStateList d() {
        TintInfo tintInfo = this.h;
        if (tintInfo != null) {
            return tintInfo.a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        TintInfo tintInfo = this.h;
        if (tintInfo != null) {
            return tintInfo.b;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:223:0x0391  */
    /* JADX WARN: Code duplicated, block: B:225:0x0396  */
    /* JADX WARN: Code duplicated, block: B:228:0x039d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:229:0x039f  */
    /* JADX WARN: Code duplicated, block: B:231:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:234:? A[RETURN, SYNTHETIC] */
    public final void f(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String string;
        String string2;
        int i2;
        float dimensionPixelSize;
        int i3;
        int i4;
        int resourceId;
        TextView textView = this.a;
        Context context = textView.getContext();
        AppCompatDrawableManager appCompatDrawableManagerA = AppCompatDrawableManager.a();
        int[] iArr = R.styleable.h;
        TintTypedArray tintTypedArrayE = TintTypedArray.e(context, attributeSet, iArr, i);
        ViewCompat.y(textView, textView.getContext(), iArr, attributeSet, tintTypedArrayE.b, i);
        TypedArray typedArray = tintTypedArrayE.b;
        int resourceId2 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.b = c(context, appCompatDrawableManagerA, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.c = c(context, appCompatDrawableManagerA, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.d = c(context, appCompatDrawableManagerA, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.e = c(context, appCompatDrawableManagerA, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f = c(context, appCompatDrawableManagerA, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.g = c(context, appCompatDrawableManagerA, typedArray.getResourceId(6, 0));
        }
        tintTypedArrayE.f();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = R.styleable.w;
        if (resourceId2 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, iArr2);
            TintTypedArray tintTypedArray = new TintTypedArray(context, typedArrayObtainStyledAttributes);
            if (z3 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z2 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z = true;
            }
            m(context, tintTypedArray);
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = (Build.VERSION.SDK_INT < 26 || !typedArrayObtainStyledAttributes.hasValue(13)) ? null : typedArrayObtainStyledAttributes.getString(13);
            tintTypedArray.f();
        } else {
            z = false;
            z2 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        TintTypedArray tintTypedArray2 = new TintTypedArray(context, typedArrayObtainStyledAttributes2);
        if (!z3 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z2 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z = true;
        }
        boolean z4 = z2;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26 && typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i5 >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        m(context, tintTypedArray2);
        tintTypedArray2.f();
        if (!z3 && z) {
            textView.setAllCaps(z4);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            Api26Impl.d(textView, string);
        }
        if (string2 != null) {
            Api24Impl.b(textView, Api24Impl.a(string2));
        }
        AppCompatTextViewAutoSizeHelper appCompatTextViewAutoSizeHelper = this.i;
        Context context2 = appCompatTextViewAutoSizeHelper.j;
        int[] iArr3 = R.styleable.i;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = appCompatTextViewAutoSizeHelper.i;
        ViewCompat.y(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            appCompatTextViewAutoSizeHelper.a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i6 = 0; i6 < length; i6++) {
                    iArr4[i6] = typedArrayObtainTypedArray.getDimensionPixelSize(i6, -1);
                }
                appCompatTextViewAutoSizeHelper.f = AppCompatTextViewAutoSizeHelper.b(iArr4);
                appCompatTextViewAutoSizeHelper.i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!appCompatTextViewAutoSizeHelper.j()) {
            appCompatTextViewAutoSizeHelper.a = 0;
        } else if (appCompatTextViewAutoSizeHelper.a == 1) {
            if (!appCompatTextViewAutoSizeHelper.g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i4 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i4 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i4, 112.0f, displayMetrics);
                }
                float f = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                appCompatTextViewAutoSizeHelper.k(dimension2, f, dimension);
            }
            appCompatTextViewAutoSizeHelper.h();
        }
        if (ViewUtils.c && appCompatTextViewAutoSizeHelper.a != 0) {
            int[] iArr5 = appCompatTextViewAutoSizeHelper.f;
            if (iArr5.length > 0) {
                if (Api26Impl.a(textView) != -1.0f) {
                    Api26Impl.b(textView, Math.round(appCompatTextViewAutoSizeHelper.d), Math.round(appCompatTextViewAutoSizeHelper.e), Math.round(appCompatTextViewAutoSizeHelper.c), 0);
                } else {
                    Api26Impl.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        TintTypedArray tintTypedArray3 = new TintTypedArray(context, typedArrayObtainStyledAttributes4);
        int resourceId3 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableB = resourceId3 != -1 ? appCompatDrawableManagerA.b(context, resourceId3) : null;
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableB2 = resourceId4 != -1 ? appCompatDrawableManagerA.b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableB3 = resourceId5 != -1 ? appCompatDrawableManagerA.b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableB4 = resourceId6 != -1 ? appCompatDrawableManagerA.b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableB5 = resourceId7 != -1 ? appCompatDrawableManagerA.b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableB6 = resourceId8 != -1 ? appCompatDrawableManagerA.b(context, resourceId8) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableB5 == null) {
                drawableB5 = compoundDrawablesRelative[0];
            }
            if (drawableB2 == null) {
                drawableB2 = compoundDrawablesRelative[1];
            }
            if (drawableB6 == null) {
                drawableB6 = compoundDrawablesRelative[2];
            }
            if (drawableB4 == null) {
                drawableB4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawablesRelative2[1];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableB2, compoundDrawablesRelative2[2], drawableB4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            textView.setCompoundDrawableTintList(tintTypedArray3.a(11));
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(DrawableUtils.c(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                i2 = -1;
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
            } else {
                int i7 = typedValuePeekValue.data;
                int i8 = i7 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i7);
                i3 = i8;
                i2 = -1;
            }
            tintTypedArray3.f();
            if (dimensionPixelSize2 != i2) {
                TextViewCompat.b(textView, dimensionPixelSize2);
            }
            if (dimensionPixelSize3 != i2) {
                TextViewCompat.c(textView, dimensionPixelSize3);
            }
            if (dimensionPixelSize != -1.0f) {
                if (i3 == i2) {
                    TextViewCompat.d(textView, (int) dimensionPixelSize);
                } else {
                    TextViewCompat.e(textView, i3, dimensionPixelSize);
                }
            }
        }
        i2 = -1;
        dimensionPixelSize = -1.0f;
        i3 = i2;
        tintTypedArray3.f();
        if (dimensionPixelSize2 != i2) {
            TextViewCompat.b(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i2) {
            TextViewCompat.c(textView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != -1.0f) {
            if (i3 == i2) {
                TextViewCompat.d(textView, (int) dimensionPixelSize);
            } else {
                TextViewCompat.e(textView, i3, dimensionPixelSize);
            }
        }
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, R.styleable.w);
        TintTypedArray tintTypedArray = new TintTypedArray(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        m(context, tintTypedArray);
        if (Build.VERSION.SDK_INT >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            Api26Impl.d(textView, string);
        }
        tintTypedArray.f();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void h(int i, int i2, int i3, int i4) {
        AppCompatTextViewAutoSizeHelper appCompatTextViewAutoSizeHelper = this.i;
        if (appCompatTextViewAutoSizeHelper.j()) {
            DisplayMetrics displayMetrics = appCompatTextViewAutoSizeHelper.j.getResources().getDisplayMetrics();
            appCompatTextViewAutoSizeHelper.k(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (appCompatTextViewAutoSizeHelper.h()) {
                appCompatTextViewAutoSizeHelper.a();
            }
        }
    }

    public final void i(int[] iArr, int i) {
        AppCompatTextViewAutoSizeHelper appCompatTextViewAutoSizeHelper = this.i;
        if (appCompatTextViewAutoSizeHelper.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = appCompatTextViewAutoSizeHelper.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                appCompatTextViewAutoSizeHelper.f = AppCompatTextViewAutoSizeHelper.b(iArrCopyOf);
                if (!appCompatTextViewAutoSizeHelper.i()) {
                    d.q(Arrays.toString(iArr), "None of the preset sizes is valid: ");
                    return;
                }
            } else {
                appCompatTextViewAutoSizeHelper.g = false;
            }
            if (appCompatTextViewAutoSizeHelper.h()) {
                appCompatTextViewAutoSizeHelper.a();
            }
        }
    }

    public final void j(int i) {
        AppCompatTextViewAutoSizeHelper appCompatTextViewAutoSizeHelper = this.i;
        if (appCompatTextViewAutoSizeHelper.j()) {
            if (i == 0) {
                appCompatTextViewAutoSizeHelper.a = 0;
                appCompatTextViewAutoSizeHelper.d = -1.0f;
                appCompatTextViewAutoSizeHelper.e = -1.0f;
                appCompatTextViewAutoSizeHelper.c = -1.0f;
                appCompatTextViewAutoSizeHelper.f = new int[0];
                appCompatTextViewAutoSizeHelper.b = false;
                return;
            }
            if (i != 1) {
                d.r(pv1.k(i, "Unknown auto-size text type: "));
                return;
            }
            DisplayMetrics displayMetrics = appCompatTextViewAutoSizeHelper.j.getResources().getDisplayMetrics();
            appCompatTextViewAutoSizeHelper.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (appCompatTextViewAutoSizeHelper.h()) {
                appCompatTextViewAutoSizeHelper.a();
            }
        }
    }

    public final void k(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new TintInfo();
        }
        TintInfo tintInfo = this.h;
        tintInfo.a = colorStateList;
        tintInfo.d = colorStateList != null;
        this.b = tintInfo;
        this.c = tintInfo;
        this.d = tintInfo;
        this.e = tintInfo;
        this.f = tintInfo;
        this.g = tintInfo;
    }

    public final void l(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new TintInfo();
        }
        TintInfo tintInfo = this.h;
        tintInfo.b = mode;
        tintInfo.c = mode != null;
        this.b = tintInfo;
        this.c = tintInfo;
        this.d = tintInfo;
        this.e = tintInfo;
        this.f = tintInfo;
        this.g = tintInfo;
    }

    public final void m(Context context, TintTypedArray tintTypedArray) {
        String string;
        int i = this.j;
        TypedArray typedArray = tintTypedArray.b;
        this.j = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.k = i3;
            if (i3 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.m = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        final int i6 = this.k;
        final int i7 = this.j;
        if (!context.isRestricted()) {
            final WeakReference weakReference = new WeakReference(this.a);
            try {
                Typeface typefaceD = tintTypedArray.d(i5, this.j, new ResourcesCompat.FontCallback() { // from class: androidx.appcompat.widget.AppCompatTextHelper.1
                    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                    public final void b(int i8) {
                    }

                    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                    public final void c(final Typeface typeface) {
                        int i8;
                        if (Build.VERSION.SDK_INT >= 28 && (i8 = i6) != -1) {
                            typeface = Api28Impl.a(typeface, i8, (i7 & 2) != 0);
                        }
                        AppCompatTextHelper appCompatTextHelper = AppCompatTextHelper.this;
                        if (appCompatTextHelper.m) {
                            appCompatTextHelper.l = typeface;
                            final TextView textView = (TextView) weakReference.get();
                            if (textView != null) {
                                boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                                final int i9 = appCompatTextHelper.j;
                                if (zIsAttachedToWindow) {
                                    textView.post(new Runnable() { // from class: androidx.appcompat.widget.AppCompatTextHelper.2
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            textView.setTypeface(typeface, i9);
                                        }
                                    });
                                } else {
                                    textView.setTypeface(typeface, i9);
                                }
                            }
                        }
                    }
                });
                if (typefaceD != null) {
                    if (i2 < 28 || this.k == -1) {
                        this.l = typefaceD;
                    } else {
                        this.l = Api28Impl.a(Typeface.create(typefaceD, 0), this.k, (this.j & 2) != 0);
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            this.l = Typeface.create(string, this.j);
        } else {
            this.l = Api28Impl.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
        }
    }

    public AppCompatTextHelper(TextView textView) {
        this.a = textView;
        this.i = new AppCompatTextViewAutoSizeHelper(textView);
    }
}
