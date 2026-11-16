package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@ShowFirstParty
public final class zzbu {
    public static volatile zzbu b;
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static zzbu a() {
        if (b == null) {
            synchronized (zzbu.class) {
                try {
                    if (b == null) {
                        b = new zzbu();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    private zzbu() {
    }
}
