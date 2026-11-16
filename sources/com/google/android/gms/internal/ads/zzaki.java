package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.q63;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaki extends zzakg {
    public final String b;
    public final String c;
    public final String d;

    public zzaki(String str, String str2, String str3) {
        super("----");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzaki.class != obj.getClass()) {
            return false;
        }
        zzaki zzakiVar = (zzaki) obj;
        return this.c.equals(zzakiVar.c) && this.b.equals(zzakiVar.b) && this.d.equals(zzakiVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final String toString() {
        String str = this.a;
        int length = str.length() + 9;
        String str2 = this.b;
        int length2 = str2.length() + length + 14;
        String str3 = this.c;
        StringBuilder sb = new StringBuilder(str3.length() + length2);
        q63.y(sb, str, ": domain=", str2, ", description=");
        sb.append(str3);
        return sb.toString();
    }
}
