package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@RestrictTo
public class TintTypedArray {
    public final Context a;
    public final TypedArray b;
    public TypedValue c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        public static int a(TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @DoNotInline
        public static int b(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    public static TintTypedArray e(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new TintTypedArray(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public final ColorStateList a(int i) {
        int resourceId;
        ColorStateList colorStateListC;
        TypedArray typedArray = this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListC = ContextCompat.c(this.a, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListC;
    }

    public final Drawable b(int i) {
        int resourceId;
        TypedArray typedArray = this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : AppCompatResources.a(this.a, resourceId);
    }

    public final Drawable c(int i) {
        int resourceId;
        Drawable drawableE;
        if (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0) {
            return null;
        }
        AppCompatDrawableManager appCompatDrawableManagerA = AppCompatDrawableManager.a();
        Context context = this.a;
        synchronized (appCompatDrawableManagerA) {
            drawableE = appCompatDrawableManagerA.a.e(context, true, resourceId);
        }
        return drawableE;
    }

    public final Typeface d(int i, int i2, ResourcesCompat.FontCallback fontCallback) {
        int resourceId = this.b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.c == null) {
            this.c = new TypedValue();
        }
        TypedValue typedValue = this.c;
        ThreadLocal threadLocal = ResourcesCompat.a;
        Context context = this.a;
        if (context.isRestricted()) {
            return null;
        }
        return ResourcesCompat.c(context, resourceId, typedValue, i2, fontCallback, true, false);
    }

    public final void f() {
        this.b.recycle();
    }

    public TintTypedArray(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }
}
