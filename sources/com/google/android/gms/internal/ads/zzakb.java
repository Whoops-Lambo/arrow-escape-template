package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.h50;
import defpackage.jc1;
import defpackage.q63;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzakb extends zzakg {
    public final String b;
    public final String c;
    public final String d;
    public final byte[] e;

    public zzakb(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzakb.class != obj.getClass()) {
            return false;
        }
        zzakb zzakbVar = (zzakb) obj;
        return Objects.equals(this.b, zzakbVar.b) && this.c.equals(zzakbVar.c) && this.d.equals(zzakbVar.d) && Arrays.equals(this.e, zzakbVar.e);
    }

    public final int hashCode() {
        String str = this.b;
        return Arrays.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + (((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final String toString() {
        String str = this.a;
        int length = str.length();
        String str2 = this.b;
        int iD = h50.d(length, 11, String.valueOf(str2).length(), 11);
        String str3 = this.c;
        int length2 = str3.length() + iD + 14;
        String str4 = this.d;
        StringBuilder sb = new StringBuilder(str4.length() + length2);
        q63.y(sb, str, ": mimeType=", str2, ", filename=");
        return jc1.o(str3, ", description=", sb, str4);
    }
}
