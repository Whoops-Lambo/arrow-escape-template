package com.google.android.gms.internal.fido;

import android.os.Build;
import dalvik.system.VMStack;
import defpackage.md4;
import defpackage.nd4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzel extends zzeg {
    static {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            nd4.class.getName().equals(a());
        } catch (Throwable unused) {
        }
        String str = Build.FINGERPRINT;
        if (str != null) {
            "robolectric".equals(str);
        }
        new md4();
    }

    public static String a() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }
}
