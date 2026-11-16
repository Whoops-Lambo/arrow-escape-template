package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzck {
    public final zzgzb a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public final void d(ByteBuffer byteBuffer) {
        boolean z;
        do {
            z = false;
            for (int i = 0; i <= e(); i++) {
                if (!this.c[i].hasRemaining()) {
                    ArrayList arrayList = this.b;
                    zzcp zzcpVar = (zzcp) arrayList.get(i);
                    if (!zzcpVar.zzg()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : zzcp.a;
                        long jRemaining = byteBuffer2.remaining();
                        zzcpVar.b(byteBuffer2);
                        this.c[i] = zzcpVar.zzf();
                        boolean z2 = true;
                        if (jRemaining - ((long) byteBuffer2.remaining()) <= 0 && !this.c[i].hasRemaining()) {
                            z2 = false;
                        }
                        z |= z2;
                    } else if (!this.c[i].hasRemaining() && i < e()) {
                        ((zzcp) arrayList.get(i + 1)).zze();
                    }
                }
            }
        } while (z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzck)) {
            return false;
        }
        zzgzb zzgzbVar = this.a;
        int size = zzgzbVar.size();
        zzgzb zzgzbVar2 = ((zzck) obj).a;
        if (size != zzgzbVar2.size()) {
            return false;
        }
        for (int i = 0; i < zzgzbVar.size(); i++) {
            if (zzgzbVar.get(i) != zzgzbVar2.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final zzcl a(zzcl zzclVar) throws zzco {
        zzcl zzclVar2 = zzcl.e;
        if (zzclVar.equals(zzclVar2)) {
            throw new zzco("Unhandled input format:", zzclVar);
        }
        int i = 0;
        while (true) {
            zzgzb zzgzbVar = this.a;
            if (i >= zzgzbVar.size()) {
                return zzclVar;
            }
            zzcp zzcpVar = (zzcp) zzgzbVar.get(i);
            zzcl zzclVarC = zzcpVar.c(zzclVar);
            if (zzcpVar.zzc()) {
                zzgvz.f(!zzclVarC.equals(zzclVar2));
                zzclVar = zzclVarC;
            }
            i++;
        }
    }

    public final boolean b() {
        return !this.b.isEmpty();
    }

    public final boolean c() {
        return this.d && ((zzcp) this.b.get(e())).zzg() && !this.c[e()].hasRemaining();
    }

    public final int e() {
        return this.c.length - 1;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public zzck(zzgzb zzgzbVar) {
        this.a = zzgzbVar;
        zzcl zzclVar = zzcl.e;
        this.d = false;
    }
}
