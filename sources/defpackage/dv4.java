package defpackage;

import com.google.android.gms.internal.ads.zzhgc;
import com.google.android.gms.internal.ads.zzhgt;
import com.google.android.gms.internal.ads.zzhgx;
import com.google.android.gms.internal.ads.zzhgy;
import com.google.android.gms.internal.ads.zzhgz;
import com.google.android.gms.internal.ads.zzhhg;
import com.google.android.gms.internal.ads.zzhou;
import com.google.android.gms.internal.ads.zzhov;
import com.google.android.gms.internal.ads.zzhpn;
import com.google.android.gms.internal.ads.zzhqm;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class dv4 implements zzhgy {
    @Override // com.google.android.gms.internal.ads.zzhgy
    public final zzhgc c(zzhgx zzhgxVar, zzhhg zzhhgVar) {
        zzhpn zzhpnVar = zzhpn.b;
        return !((zzhqm) zzhpnVar.a.get()).b.containsKey(zzhgxVar.a) ? new zzhou(zzhgxVar) : ((zzhqm) zzhpnVar.a.get()).c(zzhgxVar, zzhhgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhgy
    public final zzhgx d(zzhgc zzhgcVar, zzhhg zzhhgVar) {
        return ((zzhqm) zzhpn.b.a.get()).d(zzhgcVar, zzhhgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhgy
    public final zzhgz e(zzhgt zzhgtVar) {
        return ((zzhqm) zzhpn.b.a.get()).e(zzhgtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhgy
    public final zzhgt f(zzhgz zzhgzVar) {
        zzhpn zzhpnVar = zzhpn.b;
        return !((zzhqm) zzhpnVar.a.get()).d.containsKey(zzhgzVar.b) ? new zzhov(zzhgzVar) : ((zzhqm) zzhpnVar.a.get()).f(zzhgzVar);
    }
}
