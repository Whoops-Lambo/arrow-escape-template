package com.google.android.gms.internal.ads;

import defpackage.ar4;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaqm implements zzasc {
    public final List a;

    public zzaqm(int i) {
        ar4 ar4Var = zzgzb.b;
        this.a = w.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    public final List a(zzasb zzasbVar) {
        String str;
        int i;
        List listSingletonList;
        zzey zzeyVar = new zzey(zzasbVar.c);
        ArrayList arrayList = this.a;
        while (zzeyVar.B() > 0) {
            int iK = zzeyVar.K();
            int iK2 = zzeyVar.b + zzeyVar.K();
            if (iK == 134) {
                arrayList = new ArrayList();
                int iK3 = zzeyVar.K() & 31;
                for (int i2 = 0; i2 < iK3; i2++) {
                    String strK = zzeyVar.k(3, StandardCharsets.UTF_8);
                    int iK4 = zzeyVar.K();
                    boolean z = (iK4 & 128) != 0;
                    if (z) {
                        i = iK4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bK = (byte) zzeyVar.K();
                    zzeyVar.G(1);
                    if (z) {
                        int i3 = bK & 64;
                        byte[] bArr = zzdr.a;
                        listSingletonList = Collections.singletonList(i3 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    zzt zztVar = new zzt();
                    zztVar.e(str);
                    zztVar.d = strK;
                    zztVar.M = i;
                    zztVar.q = listSingletonList;
                    arrayList.add(new zzv(zztVar));
                }
            }
            zzeyVar.E(iK2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    public zzaqm() {
        this(0);
    }

    public zzaqm(List list) {
        this.a = list;
    }
}
