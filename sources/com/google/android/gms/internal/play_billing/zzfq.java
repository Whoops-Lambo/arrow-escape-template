package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzfq;
import com.google.android.gms.internal.play_billing.zzfu;
import defpackage.hv4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class zzfq<MessageType extends zzfu<MessageType, BuilderType>, BuilderType extends zzfq<MessageType, BuilderType>> extends zzef<MessageType, BuilderType> {
    public final zzfu a;
    public zzfu b;

    @Override // com.google.android.gms.internal.play_billing.zzef
    /* JADX INFO: renamed from: b */
    public final zzfq clone() {
        zzfq zzfqVar = (zzfq) this.a.i(5);
        boolean zG = this.b.g();
        zzfu zzfuVar = this.b;
        if (zG) {
            zzfuVar.o();
            zzfuVar = this.b;
        }
        zzfqVar.b = zzfuVar;
        return zzfqVar;
    }

    public final zzfu c() {
        boolean zG = this.b.g();
        zzfu zzfuVar = this.b;
        if (zG) {
            zzfuVar.o();
            zzfuVar = this.b;
        }
        zzfuVar.getClass();
        if (zzfu.h(zzfuVar, true)) {
            return zzfuVar;
        }
        throw new zzia(zzfuVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzef
    public final Object clone() {
        zzfq zzfqVar = (zzfq) this.a.i(5);
        boolean zG = this.b.g();
        zzfu zzfuVar = this.b;
        if (zG) {
            zzfuVar.o();
            zzfuVar = this.b;
        }
        zzfqVar.b = zzfuVar;
        return zzfqVar;
    }

    public final void e() {
        if (this.b.g()) {
            return;
        }
        f();
    }

    public final void f() {
        zzfu zzfuVar = (zzfu) this.a.i(4);
        hv4.c.a(zzfuVar.getClass()).zzg(zzfuVar, this.b);
        this.b = zzfuVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhc
    public final boolean zzo() {
        return zzfu.h(this.b, false);
    }

    public zzfq(zzfu zzfuVar) {
        this.a = zzfuVar;
        if (!zzfuVar.g()) {
            this.b = (zzfu) zzfuVar.i(4);
        } else {
            defpackage.d.r("Default instance must be immutable.");
            throw null;
        }
    }
}
