package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.LongSparseArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@RequiresApi
@SuppressLint({"SoonBlockedPrivateApi"})
@RestrictTo
final class WeightTypefaceApi21 {
    static {
        try {
            Typeface.class.getDeclaredField("native_instance");
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            Typeface.class.getDeclaredMethod("nativeCreateFromTypeface", cls, cls2).setAccessible(true);
            Typeface.class.getDeclaredMethod("nativeCreateWeightAlias", cls, cls2).setAccessible(true);
            Typeface.class.getDeclaredConstructor(cls).setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException e) {
            Log.e("WeightTypeface", e.getClass().getName(), e);
        }
        new LongSparseArray(3);
    }
}
