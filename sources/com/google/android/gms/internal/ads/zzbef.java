package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzbef {
    public final HashMap a = new HashMap();

    public final AtomicReference a(String str) {
        AtomicReference atomicReference;
        synchronized (this) {
            try {
                HashMap map = this.a;
                if (!map.containsKey(str)) {
                    map.put(str, new AtomicReference());
                }
                atomicReference = (AtomicReference) map.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return atomicReference;
    }
}
