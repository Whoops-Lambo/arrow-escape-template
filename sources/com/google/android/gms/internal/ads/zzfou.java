package com.google.android.gms.internal.ads;

import defpackage.b64;
import defpackage.ca4;
import defpackage.ku4;
import defpackage.nh4;
import defpackage.tc4;
import defpackage.ut4;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfou {
    public final s a;
    public final tc4 b;
    public zzfpa d;
    public int e = 1;
    public final ArrayDeque c = new ArrayDeque();

    /* JADX WARN: Code duplicated, block: B:33:0x0071 A[Catch: all -> 0x002a, DONT_GENERATE, TRY_ENTER, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0013, B:7:0x0023, B:12:0x002d, B:16:0x0034, B:21:0x003b, B:23:0x0043, B:25:0x004b, B:27:0x0051, B:28:0x0057, B:35:0x0074, B:33:0x0071, B:42:0x007d, B:43:0x007e, B:44:0x0090, B:46:0x00a9, B:51:0x00ae, B:18:0x0037, B:56:0x00b3, B:13:0x002e, B:29:0x0058, B:31:0x0062, B:45:0x0091), top: B:63:0x0001, inners: #0, #1, #3 }] */
    public final synchronized void a() {
        zzfos zzfosVar;
        boolean z;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.x7)).booleanValue() && !com.google.android.gms.ads.internal.zzt.zzh().g().zzi().j) {
            this.c.clear();
            return;
        }
        synchronized (this) {
            int i = 0;
            if (this.d == null) {
                while (true) {
                    ArrayDeque arrayDeque = this.c;
                    if (!arrayDeque.isEmpty()) {
                        zzfosVar = (zzfos) arrayDeque.pollFirst();
                        if (zzfosVar == null) {
                            break;
                        }
                        if (zzfosVar.zzb() != null) {
                            s sVar = this.a;
                            zzfoi zzfoiVarZzb = zzfosVar.zzb();
                            synchronized (sVar) {
                                nh4 nh4Var = (nh4) sVar.a.get(zzfoiVarZzb);
                                if (nh4Var != null) {
                                    zzfof zzfofVar = sVar.b;
                                    nh4Var.a();
                                    z = nh4Var.a.size() < zzfofVar.e;
                                }
                                throw th;
                            }
                            if (z) {
                                break;
                            }
                        }
                    }
                }
                zzfpa zzfpaVar = new zzfpa(this.a, this.b, zzfosVar);
                this.d = zzfpaVar;
                ca4 ca4Var = new ca4(11, this, zzfosVar);
                synchronized (zzfpaVar) {
                    ut4 ut4VarH = zzheh.h(zzfpaVar.b, b64.m, zzfosVar.zza());
                    ut4VarH.addListener(new ku4(i, ut4VarH, ca4Var), zzfosVar.zza());
                }
            }
        }
    }

    public zzfou(s sVar, zzfnu zzfnuVar, tc4 tc4Var) {
        this.a = sVar;
        this.b = tc4Var;
        zzfnuVar.a = new tc4(this, 23);
    }
}
