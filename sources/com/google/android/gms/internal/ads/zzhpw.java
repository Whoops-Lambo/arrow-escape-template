package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhpw {
    public final HashMap a = new HashMap();

    public final void a(zzidx zzidxVar, Object obj) throws GeneralSecurityException {
        List list;
        byte[] bArr = zzidxVar.a;
        if (bArr.length != 0 && bArr.length != 5) {
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("PrefixMap only supports 0 and 5 byte prefixes");
            return;
        }
        HashMap map = this.a;
        if (map.containsKey(zzidxVar)) {
            list = (List) map.get(zzidxVar);
        } else {
            ArrayList arrayList = new ArrayList();
            map.put(zzidxVar, arrayList);
            list = arrayList;
        }
        list.add(obj);
    }
}
