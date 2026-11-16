package com.google.android.gms.internal.measurement;

import androidx.collection.ArrayMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzma {
    public static final ArrayMap a = new ArrayMap(0);

    public static synchronized void a() {
        ArrayMap arrayMap = a;
        Iterator it = arrayMap.values().iterator();
        if (it.hasNext()) {
            ((zzma) it.next()).getClass();
            throw null;
        }
        arrayMap.clear();
    }
}
