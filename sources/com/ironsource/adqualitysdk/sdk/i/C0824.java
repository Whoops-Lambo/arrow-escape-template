package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.pv1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᒨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0824 {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final List f2190;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final boolean f2191;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final boolean f2192;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final boolean f2193;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean f2194;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0824.class != obj.getClass()) {
            return false;
        }
        C0824 c0824 = (C0824) obj;
        if (this.f2194 == c0824.f2194 && this.f2193 == c0824.f2193 && this.f2192 == c0824.f2192 && this.f2191 == c0824.f2191) {
            return this.f2190.equals(c0824.f2190);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2190.hashCode() + ((((((((this.f2194 ? 1 : 0) * 31) + (this.f2193 ? 1 : 0)) * 31) + (this.f2192 ? 1 : 0)) * 31) + (this.f2191 ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("COsCYmTjh3Mv8RBif/mERCT2BHpi7YNlB/cYcnfSj2Ik5gVzcqs=\n", "QYVxFhaW6hY=\n"));
        sb.append(this.f2194);
        sb.append(StringFog.decrypt("i/4Z4xnzLCrCujT1NeYgLcK6TQ==\n", "p95wkEGDQ1k=\n"));
        sb.append(this.f2193);
        sb.append(StringFog.decrypt("F1NQkrFM1eJcFFyTtF3D9lgbXIXI\n", "O3M54fUpt5c=\n"));
        sb.append(this.f2192);
        sb.append(StringFog.decrypt("4in9F7y9xOm9YtABhbnA9KttqQ==\n", "zgmUZPHco4A=\n"));
        sb.append(this.f2191);
        sb.append(StringFog.decrypt("g7BQoWUDcx/crQ==\n", "r5AjyAJtEnM=\n"));
        return pv1.q(sb, this.f2190, '}');
    }

    public C0824(boolean z, boolean z2, boolean z3, boolean z4, ArrayList arrayList) {
        this.f2194 = z;
        this.f2193 = z2;
        this.f2192 = z3;
        this.f2191 = z4;
        this.f2190 = Collections.unmodifiableList(new ArrayList(arrayList));
    }
}
