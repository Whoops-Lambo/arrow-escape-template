package androidx.media3.common.util;

import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import defpackage.d;
import defpackage.dr0;
import defpackage.e32;
import io.p071bidmachine.media3.extractor.ts.y;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@UnstableApi
public final class Assertions {
    public static void checkArgument(boolean z) {
        if (z) {
            return;
        }
        e32.a();
    }

    public static int checkIndex(int i, int i2, int i3) {
        if (i >= i2 && i < i3) {
            return i;
        }
        dr0.b();
        return 0;
    }

    public static <T> T checkNotNull(@Nullable T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void checkState(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static <T> T checkStateNotNull(@Nullable T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    private Assertions() {
    }

    public static void checkMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        e32.i("Not in applications main thread");
    }

    public static String checkNotEmpty(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        e32.a();
        return null;
    }

    public static void checkArgument(boolean z, Object obj) {
        if (z) {
            return;
        }
        d.h(obj);
    }

    public static String checkNotEmpty(@Nullable String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        d.h(obj);
        return null;
    }

    public static <T> T checkNotNull(@Nullable T t) {
        t.getClass();
        return t;
    }

    public static void checkState(boolean z) {
        if (z) {
            return;
        }
        y.b();
    }

    public static <T> T checkStateNotNull(@Nullable T t) {
        if (t != null) {
            return t;
        }
        y.b();
        return null;
    }
}
