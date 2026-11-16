package com.google.android.gms.internal.location;

import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbj {
    public static Looper a() {
        boolean z;
        if (Looper.myLooper() != null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Can't create handler inside thread that has not called Looper.prepare()");
        return Looper.myLooper();
    }
}
