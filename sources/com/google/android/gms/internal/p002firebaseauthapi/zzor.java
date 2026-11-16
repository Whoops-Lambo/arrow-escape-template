package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzor extends zzcs {
    public final zzcx a;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcs
    public final boolean a() {
        return !this.a.c.equals(zzcv.e);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzor)) {
            return false;
        }
        zzcx zzcxVar = ((zzor) obj).a;
        zzcx zzcxVar2 = this.a;
        return zzcxVar2.c.equals(zzcxVar.c) && zzcxVar2.b.equals(zzcxVar.b) && zzcxVar2.a.equals(zzcxVar.a);
    }

    public final int hashCode() {
        zzcx zzcxVar = this.a;
        return Objects.hash(zzcxVar.b, zzcxVar.a, zzcxVar.c);
    }

    public final String toString() {
        zzcx zzcxVar = this.a;
        return "(typeUrl=" + zzcxVar.b + ", outputPrefixType=" + zzcxVar.c + ")";
    }

    public zzor(zzcx zzcxVar) {
        this.a = zzcxVar;
    }
}
