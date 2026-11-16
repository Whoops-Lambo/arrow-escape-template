package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzab {
    public zzaa a;
    public zzaa b;
    public final ArrayList c;

    public final /* bridge */ /* synthetic */ Object clone() {
        zzab zzabVar = new zzab(this.a.clone());
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            zzabVar.c.add(((zzaa) obj).clone());
        }
        return zzabVar;
    }

    public zzab() {
        this.a = new zzaa("", 0L, null);
        this.b = new zzaa("", 0L, null);
        this.c = new ArrayList();
    }

    public zzab(zzaa zzaaVar) {
        this.a = zzaaVar;
        this.b = zzaaVar.clone();
        this.c = new ArrayList();
    }
}
