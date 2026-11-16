package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.content.ContextCompat;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class ni1 {
    public static ColorStateList b(Context context, TintTypedArray tintTypedArray, int i) {
        int resourceId;
        ColorStateList colorStateListC;
        TypedArray typedArray = tintTypedArray.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListC = ContextCompat.c(context, resourceId)) == null) ? tintTypedArray.a(i) : colorStateListC;
    }

    public static ColorStateList a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListC;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (colorStateListC = ContextCompat.c(context, resourceId)) != null) {
            return colorStateListC;
        }
        return typedArray.getColorStateList(i);
    }

    public static Drawable c(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableA;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (drawableA = AppCompatResources.a(context, resourceId)) != null) {
            return drawableA;
        }
        return typedArray.getDrawable(i);
    }

    public static boolean d(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }
}
