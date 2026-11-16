package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.jc1;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzakk extends zzakg {
    public final String b;
    public final byte[] c;

    public zzakk(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzakk.class != obj.getClass()) {
            return false;
        }
        zzakk zzakkVar = (zzakk) obj;
        return this.b.equals(zzakkVar.b) && Arrays.equals(this.c, zzakkVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ((this.b.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzakg
    public final String toString() {
        String str = this.a;
        int length = str.length() + 8;
        String str2 = this.b;
        return jc1.o(str, ": owner=", new StringBuilder(str2.length() + length), str2);
    }
}
