package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfcq implements zzfdt {
    public final zzgey a;
    public final zzgey b;
    public final boolean c;
    public final boolean d;
    public final boolean e = false;
    public final boolean f;

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    /* JADX WARN: Code duplicated, block: B:20:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    /* JADX WARN: Code duplicated, block: B:23:0x0078  */
    /* JADX WARN: Code duplicated, block: B:25:0x0080  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026 A[DONT_INVERT] */
    @Override // com.google.android.gms.internal.ads.zzfdt
    public final void zza(Object obj) {
        String str;
        long j;
        String str2;
        long j2;
        Bundle bundle = (Bundle) obj;
        if (this.e) {
            return;
        }
        Bundle bundleA = zzfmy.a(bundle, "pii");
        boolean z = this.f;
        if (!z) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.i4)).booleanValue()) {
                zzgey zzgeyVar = this.a;
                str2 = zzgeyVar.a;
                j2 = zzgeyVar.b;
                if (str2 != null) {
                    bundleA.putString("paidv1_id_android", str2);
                    bundleA.putLong("paidv1_creation_time_android", j2);
                }
            } else if (z) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.k4)).booleanValue()) {
                    zzgey zzgeyVar2 = this.a;
                    str2 = zzgeyVar2.a;
                    j2 = zzgeyVar2.b;
                    if (str2 != null && j2 > 0) {
                        bundleA.putString("paidv1_id_android", str2);
                        bundleA.putLong("paidv1_creation_time_android", j2);
                    }
                }
            }
        } else if (z) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.k4)).booleanValue()) {
                zzgey zzgeyVar3 = this.a;
                str2 = zzgeyVar3.a;
                j2 = zzgeyVar3.b;
                if (str2 != null) {
                    bundleA.putString("paidv1_id_android", str2);
                    bundleA.putLong("paidv1_creation_time_android", j2);
                }
            }
        }
        if (!z) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.j4)).booleanValue()) {
                zzgey zzgeyVar4 = this.b;
                str = zzgeyVar4.a;
                j = zzgeyVar4.b;
                if (str != null) {
                    bundleA.putString("paidv2_id_android", str);
                    bundleA.putLong("paidv2_creation_time_android", j);
                }
                bundleA.putBoolean("paidv2_pub_option_android", this.c);
                bundleA.putBoolean("paidv2_user_option_android", this.d);
            } else if (z) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.l4)).booleanValue()) {
                    zzgey zzgeyVar5 = this.b;
                    str = zzgeyVar5.a;
                    j = zzgeyVar5.b;
                    if (str != null && j > 0) {
                        bundleA.putString("paidv2_id_android", str);
                        bundleA.putLong("paidv2_creation_time_android", j);
                    }
                    bundleA.putBoolean("paidv2_pub_option_android", this.c);
                    bundleA.putBoolean("paidv2_user_option_android", this.d);
                }
            }
        } else if (z) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.l4)).booleanValue()) {
                zzgey zzgeyVar6 = this.b;
                str = zzgeyVar6.a;
                j = zzgeyVar6.b;
                if (str != null) {
                    bundleA.putString("paidv2_id_android", str);
                    bundleA.putLong("paidv2_creation_time_android", j);
                }
                bundleA.putBoolean("paidv2_pub_option_android", this.c);
                bundleA.putBoolean("paidv2_user_option_android", this.d);
            }
        }
        if (bundleA.isEmpty()) {
            return;
        }
        bundle.putBundle("pii", bundleA);
    }

    public zzfcq(zzgey zzgeyVar, zzgey zzgeyVar2, boolean z, boolean z2, boolean z3) {
        this.a = zzgeyVar;
        this.b = zzgeyVar2;
        this.c = z;
        this.d = z2;
        this.f = z3;
    }

    public zzfcq(boolean z) {
        this.f = z;
    }
}
