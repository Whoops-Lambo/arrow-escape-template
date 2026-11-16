package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzboz;
import com.google.android.gms.internal.ads.zzbpa;
import com.google.android.gms.internal.ads.zzcac;
import com.google.android.gms.internal.ads.zzcdy;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzay {
    public static final /* synthetic */ int zza = 0;
    private static final zzay zzb = new zzay();
    private final com.google.android.gms.ads.internal.util.client.zzf zzc;
    private final zzaw zzd;
    private boolean zze;
    private final VersionInfoParcel zzf;
    private final Random zzg;
    private final String zzh;

    public zzay() {
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = new com.google.android.gms.ads.internal.util.client.zzf();
        zzaw zzawVar = new zzaw(new zzk(), new zzi(), new zzfc(), new zzboz(), new zzcdy(), new zzcac(), new zzbpa(), new zzl());
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(0, ModuleDescriptor.MODULE_VERSION, true);
        Random random = new Random();
        String strZzj = com.google.android.gms.ads.internal.util.client.zzf.zzj();
        this.zzc = zzfVar;
        this.zzd = zzawVar;
        this.zze = false;
        this.zzf = versionInfoParcel;
        this.zzg = random;
        this.zzh = strZzj;
    }

    public static com.google.android.gms.ads.internal.util.client.zzf zza() {
        return zzb.zzc;
    }

    public static zzaw zzb() {
        return zzb.zzd;
    }

    public static void zzc() {
        zzb.zze = false;
    }

    public static void zzd() {
        zzb.zze = true;
    }

    public static boolean zze() {
        return zzb.zze;
    }

    public static String zzf() {
        return zzb.zzh;
    }

    public static VersionInfoParcel zzg() {
        return zzb.zzf;
    }

    public static Random zzh() {
        return zzb.zzg;
    }
}
