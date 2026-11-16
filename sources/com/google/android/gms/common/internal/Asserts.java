package com.google.android.gms.common.internal;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import defpackage.d;
import defpackage.e32;
import defpackage.q63;
import io.p071bidmachine.media3.extractor.ts.y;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@KeepForSdk
public final class Asserts {
    @KeepForSdk
    public static void checkNotNull(Object obj) {
        if (obj != null) {
            return;
        }
        d.r("null reference");
    }

    @KeepForSdk
    public static void checkNull(Object obj) {
        if (obj == null) {
            return;
        }
        d.r("non-null reference");
    }

    @KeepForSdk
    public static void checkState(boolean z, @NonNull Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    private Asserts() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static void checkMainThread(@NonNull String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        String strValueOf = String.valueOf(Thread.currentThread());
        String strValueOf2 = String.valueOf(Looper.getMainLooper().getThread());
        StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 56 + 1);
        q63.y(sb, "checkMainThread: current thread ", strValueOf, " IS NOT the main thread ", strValueOf2);
        sb.append("!");
        Log.e("Asserts", sb.toString());
        e32.i(str);
    }

    @KeepForSdk
    public static void checkNotMainThread(@NonNull String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        String strValueOf = String.valueOf(Thread.currentThread());
        String strValueOf2 = String.valueOf(Looper.getMainLooper().getThread());
        StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 55 + 1);
        q63.y(sb, "checkNotMainThread: current thread ", strValueOf, " IS the main thread ", strValueOf2);
        sb.append("!");
        Log.e("Asserts", sb.toString());
        e32.i(str);
    }

    @KeepForSdk
    public static void checkNotNull(Object obj, @NonNull Object obj2) {
        if (obj != null) {
            return;
        }
        d.h(obj2);
    }

    @KeepForSdk
    public static void checkNull(Object obj, @NonNull Object obj2) {
        if (obj == null) {
            return;
        }
        d.h(obj2);
    }

    @KeepForSdk
    public static void checkState(boolean z) {
        if (z) {
            return;
        }
        y.b();
    }
}
