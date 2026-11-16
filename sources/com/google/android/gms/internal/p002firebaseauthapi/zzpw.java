package com.google.android.gms.internal.p002firebaseauthapi;

import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzpw<P> {
    public final HashMap a = new HashMap();

    public final void a(zzaau zzaauVar, Object obj) throws GeneralSecurityException {
        List list;
        byte[] bArr = zzaauVar.a;
        if (bArr.length != 0 && bArr.length != 5) {
            e.d("PrefixMap only supports 0 and 5 byte prefixes");
            return;
        }
        HashMap map = this.a;
        if (map.containsKey(zzaauVar)) {
            list = (List) map.get(zzaauVar);
        } else {
            ArrayList arrayList = new ArrayList();
            map.put(zzaauVar, arrayList);
            list = arrayList;
        }
        list.add(obj);
    }
}
