package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.jc1;
import defpackage.q63;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaka extends zzakg {
    public final String b;
    public final String c;
    public final String d;

    public zzaka(String str, String str2, String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzaka.class != obj.getClass()) {
            return false;
        }
        zzaka zzakaVar = (zzaka) obj;
        return this.c.equals(zzakaVar.c) && this.b.equals(zzakaVar.b) && Objects.equals(this.d, zzakaVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() + ((this.b.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
        String str = this.d;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final String toString() {
        String str = this.a;
        int length = str.length();
        String str2 = this.d;
        int length2 = String.valueOf(str2).length();
        String str3 = this.b;
        int length3 = str3.length() + length + 11 + 14;
        String str4 = this.c;
        StringBuilder sb = new StringBuilder(str4.length() + length3 + 7 + length2);
        q63.y(sb, str, ": language=", str3, ", description=");
        return jc1.o(str4, ", text=", sb, str2);
    }
}
