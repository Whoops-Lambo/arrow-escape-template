package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzak {
    public final String a;
    public final zzag b;
    public final zzaf c;
    public final zzan d;
    public final zzac e;
    public final zzai f;

    static {
        new zzz().a();
        String str = zzfq.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzak)) {
            return false;
        }
        zzak zzakVar = (zzak) obj;
        return this.a.equals(zzakVar.a) && this.e.equals(zzakVar.e) && Objects.equals(this.b, zzakVar.b) && this.c.equals(zzakVar.c) && Objects.equals(this.d, zzakVar.d) && Objects.equals(this.f, zzakVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        zzag zzagVar = this.b;
        return (this.d.hashCode() + ((((this.c.hashCode() + ((iHashCode + (zzagVar != null ? zzagVar.hashCode() : 0)) * 31)) * 31) - Integer.MIN_VALUE) * 31)) * 31;
    }

    public /* synthetic */ zzak(String str, zzac zzacVar, zzag zzagVar, zzaf zzafVar, zzan zzanVar, zzai zzaiVar) {
        this.a = str;
        this.b = zzagVar;
        this.c = zzafVar;
        this.d = zzanVar;
        this.e = zzacVar;
        this.f = zzaiVar;
    }
}
