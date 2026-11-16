package com.google.android.gms.internal.fido;

import com.ironsource.C4664b4;
import defpackage.wa4;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzeu extends zzei {
    public static final Set a;

    static {
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(zzdh.a, zzdm.b)));
        a = setUnmodifiableSet;
        zzdv zzdvVar = new zzdv();
        Iterator it = setUnmodifiableSet.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            HashMap map = zzdvVar.a;
            HashMap map2 = zzdvVar.b;
            if (!zHasNext) {
                new wa4();
                HashMap map3 = new HashMap();
                HashMap map4 = new HashMap();
                map3.putAll(map);
                map4.putAll(map2);
                Level level = Level.ALL;
                return;
            }
            zzdk zzdkVar = (zzdk) it.next();
            if (zzdkVar == null) {
                defpackage.d.w(C4664b4.i.W.concat(" must not be null"));
                return;
            }
            boolean z = zzdkVar.c;
            if (!z) {
                map2.remove(zzdkVar);
                map.put(zzdkVar, zzdv.c);
            } else if (!z) {
                defpackage.d.r("key must be repeating");
                return;
            } else {
                map.remove(zzdkVar);
                map2.put(zzdkVar, zzdv.d);
            }
        }
    }
}
