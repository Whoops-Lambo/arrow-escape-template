package com.google.android.gms.internal.measurement;

import android.net.Uri;
import defpackage.d31;
import defpackage.fs1;
import defpackage.k75;
import defpackage.vt;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzrs {
    public final zzsx a;
    public final d31 b;
    public final ArrayList c;
    public final Uri d;

    public final ArrayList a(OutputStream outputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStream);
        ArrayList arrayList2 = this.c;
        if (!arrayList2.isEmpty()) {
            int i = k75.b;
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                zzta zztaVarZzb = ((zztb) obj).zzb();
                if (zztaVarZzb != null) {
                    arrayList3.add(zztaVarZzb);
                }
            }
            k75 k75Var = !arrayList3.isEmpty() ? new k75(outputStream, arrayList3) : null;
            if (k75Var != null) {
                arrayList.add(k75Var);
            }
        }
        Iterator it = this.b.iterator();
        if (it.hasNext()) {
            ((zztc) it.next()).b((OutputStream) fs1.w(arrayList));
            throw null;
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public zzrs(vt vtVar) {
        this.a = (zzsx) vtVar.b;
        this.b = (d31) vtVar.c;
        this.c = (ArrayList) vtVar.d;
        this.d = (Uri) vtVar.f;
    }
}
