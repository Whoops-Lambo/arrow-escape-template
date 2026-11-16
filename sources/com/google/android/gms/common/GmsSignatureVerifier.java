package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.common.zzam;
import com.google.android.gms.internal.common.zzan;
import defpackage.wq3;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@ShowFirstParty
@KeepForSdk
public class GmsSignatureVerifier {
    private static final zzab zza;
    private static final zzab zzb;
    private static final HashMap zzc;

    static {
        zzaa zzaaVar = new zzaa();
        zzaaVar.zza("com.google.android.gms");
        zzaaVar.zzb(204200000L);
        zzm zzmVar = zzo.zzf;
        byte[] bArrZzc = zzmVar.zzc();
        byte[] bArrZzc2 = zzo.zzd.zzc();
        byte[] bArrZzc3 = zzo.zzb.zzc();
        wq3 wq3Var = zzam.b;
        Object[] objArr = {bArrZzc, bArrZzc2, bArrZzc3};
        zzan.a(3, objArr);
        zzaaVar.zzc(zzam.A(3, objArr));
        zzm zzmVar2 = zzo.zze;
        byte[] bArrZzc4 = zzmVar2.zzc();
        zzm zzmVar3 = zzo.zzc;
        Object[] objArr2 = {bArrZzc4, zzmVar3.zzc(), zzo.zza.zzc()};
        zzan.a(3, objArr2);
        zzaaVar.zzd(zzam.A(3, objArr2));
        zza = zzaaVar.zze();
        zzaa zzaaVar2 = new zzaa();
        zzaaVar2.zza("com.android.vending");
        zzaaVar2.zzb(82240000L);
        Object[] objArr3 = {zzmVar.zzc()};
        zzan.a(1, objArr3);
        zzaaVar2.zzc(zzam.A(1, objArr3));
        Object[] objArr4 = {zzmVar2.zzc(), zzmVar3.zzc()};
        zzan.a(2, objArr4);
        zzaaVar2.zzd(zzam.A(2, objArr4));
        zzb = zzaaVar2.zze();
        zzc = new HashMap();
    }
}
