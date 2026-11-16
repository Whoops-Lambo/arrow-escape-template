package com.google.android.gms.internal.ads;

import defpackage.ic4;
import defpackage.jc4;
import defpackage.o64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzedx {
    public final zzedh a;
    public final zzdyk b;
    public final Object c = new Object();
    public final ArrayList d = new ArrayList();
    public boolean e;

    public final JSONArray a() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.c) {
            try {
                if (!this.e) {
                    zzedh zzedhVar = this.a;
                    if (!zzedhVar.b) {
                        ic4 ic4Var = new ic4(this);
                        zzedh zzedhVar2 = this.a;
                        zzedhVar2.getClass();
                        zzedhVar2.e.addListener(new o64(22, zzedhVar2, ic4Var), zzedhVar2.j);
                        return jSONArray;
                    }
                    b(zzedhVar.b());
                }
                ArrayList arrayList = this.d;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    jSONArray.put(((jc4) obj).a());
                }
                return jSONArray;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(List list) {
        zzbyu zzbyuVar;
        zzdyj zzdyjVarB;
        zzdyj zzdyjVarB2;
        zzbyu zzbyuVar2;
        synchronized (this.c) {
            try {
                if (this.e) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzbst zzbstVar = (zzbst) it.next();
                    String string = (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Ya)).booleanValue() || (zzdyjVarB2 = this.b.b(zzbstVar.a)) == null || (zzbyuVar2 = zzdyjVarB2.c) == null) ? "" : zzbyuVar2.toString();
                    String str = string;
                    boolean z = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Za)).booleanValue() && (zzdyjVarB = this.b.b(zzbstVar.a)) != null && zzdyjVarB.d;
                    ArrayList arrayList = this.d;
                    String str2 = zzbstVar.a;
                    zzdyj zzdyjVarB3 = this.b.b(str2);
                    arrayList.add(new jc4(str2, str, (zzdyjVarB3 == null || (zzbyuVar = zzdyjVarB3.b) == null) ? "" : zzbyuVar.toString(), zzbstVar.b ? 1 : 0, zzbstVar.d, zzbstVar.c, z));
                }
                this.e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzedx(zzedh zzedhVar, zzdyk zzdykVar) {
        this.a = zzedhVar;
        this.b = zzdykVar;
    }
}
