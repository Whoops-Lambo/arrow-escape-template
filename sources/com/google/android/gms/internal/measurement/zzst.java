package com.google.android.gms.internal.measurement;

import defpackage.fs1;
import defpackage.j75;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzst implements zzrt {
    public static zzst b() {
        return new zzst();
    }

    public static final InputStream c(zzrs zzrsVar) throws IOException {
        InputStream inputStreamC = zzrsVar.a.c(zzrsVar.d);
        ArrayList arrayList = new ArrayList();
        arrayList.add(inputStreamC);
        ArrayList arrayList2 = zzrsVar.c;
        if (!arrayList2.isEmpty()) {
            int i = j75.b;
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                zzsz zzszVarZza = ((zztb) obj).zza();
                if (zzszVarZza != null) {
                    arrayList3.add(zzszVarZza);
                }
            }
            j75 j75Var = !arrayList3.isEmpty() ? new j75(inputStreamC, arrayList3) : null;
            if (j75Var != null) {
                arrayList.add(j75Var);
            }
        }
        Iterator it = zzrsVar.b.iterator();
        if (it.hasNext()) {
            ((zztc) it.next()).a((InputStream) fs1.w(arrayList));
            throw null;
        }
        Collections.reverse(arrayList);
        return (InputStream) arrayList.get(0);
    }

    private zzst() {
    }

    @Override // com.google.android.gms.internal.measurement.zzrt
    public final /* bridge */ /* synthetic */ Object a(zzrs zzrsVar) {
        return c(zzrsVar);
    }
}
