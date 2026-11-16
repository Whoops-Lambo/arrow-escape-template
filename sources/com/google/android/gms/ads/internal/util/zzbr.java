package com.google.android.gms.ads.internal.util;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzbr {
    final Map zza = new ConcurrentHashMap();

    public final Bitmap zza(Integer num) {
        return (Bitmap) this.zza.get(num);
    }

    public zzbr() {
        new AtomicInteger(0);
    }
}
