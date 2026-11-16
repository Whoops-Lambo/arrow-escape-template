package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzqj;
import com.google.android.gms.internal.consent_sdk.zzqm;
import defpackage.m75;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class zzqj<MessageType extends zzqm<MessageType, BuilderType>, BuilderType extends zzqj<MessageType, BuilderType>> extends zzoz<MessageType, BuilderType> {
    public final zzqm a;
    public zzqm b;

    @Override // com.google.android.gms.internal.consent_sdk.zzoz
    /* JADX INFO: renamed from: b */
    public final zzqj clone() {
        zzqj zzqjVar = (zzqj) this.a.f(5);
        boolean zE = this.b.e();
        zzqm zzqmVar = this.b;
        if (zE) {
            zzqmVar.k();
            zzqmVar = this.b;
        }
        zzqjVar.b = zzqmVar;
        return zzqjVar;
    }

    public final zzqm c() {
        boolean zE = this.b.e();
        zzqm zzqmVar = this.b;
        if (zE) {
            zzqmVar.k();
            zzqmVar = this.b;
        }
        zzqmVar.getClass();
        if (zzqm.g(zzqmVar, true)) {
            return zzqmVar;
        }
        throw new zzso(zzqmVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzoz
    public final Object clone() {
        zzqj zzqjVar = (zzqj) this.a.f(5);
        boolean zE = this.b.e();
        zzqm zzqmVar = this.b;
        if (zE) {
            zzqmVar.k();
            zzqmVar = this.b;
        }
        zzqjVar.b = zzqmVar;
        return zzqjVar;
    }

    public final void e() {
        if (this.b.e()) {
            return;
        }
        zzqm zzqmVar = (zzqm) this.a.f(4);
        m75.c.a(zzqmVar.getClass()).f(zzqmVar, this.b);
        this.b = zzqmVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrr
    public final boolean zzo() {
        return zzqm.g(this.b, false);
    }

    public zzqj(zzqm zzqmVar) {
        this.a = zzqmVar;
        if (!zzqmVar.e()) {
            this.b = (zzqm) zzqmVar.f(4);
        } else {
            defpackage.d.r("Default instance must be immutable.");
            throw null;
        }
    }
}
