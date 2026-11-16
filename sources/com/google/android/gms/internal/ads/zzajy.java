package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzajy extends zzakg implements zzajn {
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final zzakg[] g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajy.class == obj.getClass()) {
            zzajy zzajyVar = (zzajy) obj;
            if (this.c == zzajyVar.c && this.d == zzajyVar.d && this.e == zzajyVar.e && this.f == zzajyVar.f && Objects.equals(this.b, zzajyVar.b) && Arrays.equals(this.g, zzajyVar.g)) {
                return true;
            }
        }
        return false;
    }

    public zzajy(String str, int i, int i2, long j, long j2, zzakg[] zzakgVarArr) {
        String str2;
        super("CHAP");
        zzgvz.a(i <= i2);
        this.b = str;
        this.c = i;
        this.d = i2;
        int length = zzakgVarArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                str2 = null;
                break;
            }
            zzakg zzakgVar = zzakgVarArr[i3];
            if (zzakgVar instanceof zzakl) {
                zzakl zzaklVar = (zzakl) zzakgVar;
                zzgzb zzgzbVar = zzaklVar.c;
                if (zzaklVar.a.equals("TIT2") && !zzgzbVar.isEmpty()) {
                    str2 = (String) zzgzbVar.get(0);
                    break;
                }
            }
            i3++;
        }
        if (str2 != null) {
            new zzx(null, str2);
        }
        this.e = j;
        this.f = j2;
        this.g = zzakgVarArr;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((((((this.c + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31);
    }
}
