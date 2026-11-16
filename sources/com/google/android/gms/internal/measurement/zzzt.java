package com.google.android.gms.internal.measurement;

import com.ironsource.C4664b4;
import defpackage.ed5;
import defpackage.fd5;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzzt {
    public static final ed5 a = new ed5(1);
    public static final fd5 b = new fd5(1);

    public static zzzm a(Set set) {
        zzzm zzzmVar = new zzzm();
        zzzmVar.d = b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzyl zzylVar = (zzyl) it.next();
            zzabr.a(zzylVar, C4664b4.i.W);
            boolean z = zzylVar.c;
            HashMap map = zzzmVar.b;
            HashMap map2 = zzzmVar.a;
            if (!z) {
                map.remove(zzylVar);
                map2.put(zzylVar, zzzm.e);
            } else {
                if (!z) {
                    defpackage.d.r("key must be repeating");
                    return null;
                }
                map2.remove(zzylVar);
                map.put(zzylVar, zzzm.f);
            }
        }
        return zzzmVar;
    }
}
