package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.jc1;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzakm extends zzakg {
    public final String b;
    public final String c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzakm.class != obj.getClass()) {
            return false;
        }
        zzakm zzakmVar = (zzakm) obj;
        return this.a.equals(zzakmVar.a) && Objects.equals(this.b, zzakmVar.b) && this.c.equals(zzakmVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        String str = this.b;
        return this.c.hashCode() + (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final String toString() {
        String str = this.a;
        int length = str.length() + 6;
        String str2 = this.c;
        return jc1.o(str, ": url=", new StringBuilder(str2.length() + length), str2);
    }

    public zzakm(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }
}
