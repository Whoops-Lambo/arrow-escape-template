package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfxi {
    public static volatile zzfxi d;
    public volatile Boolean a;
    public volatile Boolean b;
    public final Context c;

    public static zzfxi a(Context context) {
        if (d == null) {
            synchronized (zzfxi.class) {
                try {
                    if (d == null) {
                        d = new zzfxi(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public final boolean b() {
        if (this.a != null) {
            return this.a.booleanValue();
        }
        synchronized (this) {
            try {
                if (this.a != null) {
                    return this.a.booleanValue();
                }
                boolean z = false;
                if (this.c != null && Build.MANUFACTURER.equalsIgnoreCase("Amazon") && Build.MODEL.toLowerCase().startsWith("aft") && Build.VERSION.SDK_INT <= 30) {
                    z = true;
                }
                this.a = Boolean.valueOf(z);
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzfxi(Context context) {
        this.c = context;
        b();
    }
}
