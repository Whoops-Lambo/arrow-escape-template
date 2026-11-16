package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzet;
import com.google.android.gms.internal.auth.zzev;
import defpackage.zk4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class zzet<MessageType extends zzev<MessageType, BuilderType>, BuilderType extends zzet<MessageType, BuilderType>> extends zzdp<MessageType, BuilderType> {
    public final zzev a;
    public zzev b;

    @Override // com.google.android.gms.internal.auth.zzdp
    /* JADX INFO: renamed from: a */
    public final zzet clone() {
        zzet zzetVar = (zzet) this.a.g(5);
        boolean zF = this.b.f();
        zzev zzevVar = this.b;
        if (zF) {
            zzevVar.getClass();
            zk4.c.a(zzevVar.getClass()).a(zzevVar);
            zzevVar.c();
            zzevVar = this.b;
        }
        zzetVar.b = zzevVar;
        return zzetVar;
    }

    @Override // com.google.android.gms.internal.auth.zzdp
    public final Object clone() {
        zzet zzetVar = (zzet) this.a.g(5);
        boolean zF = this.b.f();
        zzev zzevVar = this.b;
        if (zF) {
            zzevVar.getClass();
            zk4.c.a(zzevVar.getClass()).a(zzevVar);
            zzevVar.c();
            zzevVar = this.b;
        }
        zzetVar.b = zzevVar;
        return zzetVar;
    }

    public zzet(zzhs zzhsVar) {
        this.a = zzhsVar;
        if (!zzhsVar.f()) {
            this.b = (zzev) zzhsVar.g(4);
        } else {
            defpackage.d.r("Default instance must be immutable.");
            throw null;
        }
    }
}
