package com.google.android.gms.internal.ads;

import defpackage.ak1;
import java.util.ArrayDeque;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzaxe {
    public final zzavz a;
    public final zzaxa b;
    public final zzawx c = new zzawx();
    public final zzaws d;

    public final Optional a() {
        try {
            try {
                ArrayDeque arrayDeque = this.c.a;
                if (arrayDeque.isEmpty()) {
                    throw new zzaww();
                }
                zzawu zzawuVar = (zzawu) arrayDeque.pop();
                long j = zzawuVar.a;
                long j2 = zzawuVar.b;
                long j3 = zzawuVar.c;
                zzaxa zzaxaVar = this.b;
                if (zzaxaVar.b < j2) {
                    return Optional.of(zzavt.H);
                }
                this.d.a(j);
                if (j3 == 0) {
                    while (zzaxaVar.b > j2) {
                        zzaxaVar.c();
                    }
                }
                return Optional.empty();
            } catch (zzaww unused) {
                return Optional.of(zzavt.x);
            } catch (zzawy unused2) {
                return Optional.of(zzavt.H);
            }
        } catch (zzawq | zzawr e) {
            ak1.l(zzawl.a("CEiv6BFfPnitUE+D"), e);
            return null;
        }
    }

    public zzaxe(zzavz zzavzVar, zzaxa zzaxaVar, zzaws zzawsVar) {
        this.a = zzavzVar;
        this.b = zzaxaVar;
        this.d = zzawsVar;
    }
}
