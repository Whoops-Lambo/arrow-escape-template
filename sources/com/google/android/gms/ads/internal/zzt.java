package com.google.android.gms.ads.internal;

import android.os.Build;
import com.google.android.gms.ads.internal.overlay.zzae;
import com.google.android.gms.ads.internal.overlay.zzaf;
import com.google.android.gms.ads.internal.util.zzaa;
import com.google.android.gms.ads.internal.util.zzax;
import com.google.android.gms.ads.internal.util.zzbq;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zzcg;
import com.google.android.gms.ads.internal.util.zzu;
import com.google.android.gms.ads.internal.util.zzv;
import com.google.android.gms.ads.internal.util.zzx;
import com.google.android.gms.ads.internal.util.zzy;
import com.google.android.gms.ads.internal.util.zzz;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.ads.zzbgm;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbin;
import com.google.android.gms.internal.ads.zzbjx;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzbvd;
import com.google.android.gms.internal.ads.zzbwb;
import com.google.android.gms.internal.ads.zzcco;
import com.google.android.gms.internal.ads.zzcfd;
import com.google.android.gms.internal.ads.zzcgh;
import com.google.android.gms.internal.ads.zzcgq;
import com.google.android.gms.internal.ads.zzchb;
import com.google.android.gms.internal.ads.zzchi;
import com.google.android.gms.internal.ads.zzcjx;
import com.google.android.gms.internal.ads.zzcmo;
import com.google.android.gms.internal.ads.zzems;
import com.google.android.gms.internal.ads.zzemt;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzt {
    private static final zzt zza = new zzt();
    private final zzbin zzA;
    private final zzcfd zzB;
    private final zzcg zzC;
    private final zzcjx zzD;
    private final zzchi zzE;
    private final com.google.android.gms.ads.internal.overlay.zza zzb;
    private final com.google.android.gms.ads.internal.overlay.zzn zzc;
    private final com.google.android.gms.ads.internal.util.zzs zzd;
    private final zzcmo zze;
    private final zzcgq zzf;
    private final zzz zzg;
    private final zzbgm zzh;
    private final zzcgh zzi;
    private final zzaa zzj;
    private final zzbhy zzk;
    private final Clock zzl;
    private final zzf zzm;
    private final zzbjx zzn;
    private final zzbkq zzo;
    private final zzax zzp;
    private final zzcco zzq;
    private final zzchb zzr;
    private final zzbvd zzs;
    private final com.google.android.gms.ads.internal.overlay.zzz zzt;
    private final zzbq zzu;
    private final zzae zzv;
    private final zzaf zzw;
    private final zzbwb zzx;
    private final zzbr zzy;
    private final zzemt zzz;

    public zzt() {
        com.google.android.gms.ads.internal.overlay.zza zzaVar = new com.google.android.gms.ads.internal.overlay.zza();
        com.google.android.gms.ads.internal.overlay.zzn zznVar = new com.google.android.gms.ads.internal.overlay.zzn();
        com.google.android.gms.ads.internal.util.zzs zzsVar = new com.google.android.gms.ads.internal.util.zzs();
        zzcmo zzcmoVar = new zzcmo();
        zzcgq zzcgqVar = new zzcgq();
        int i = Build.VERSION.SDK_INT;
        zzz zzyVar = i >= 30 ? new zzy() : i >= 28 ? new zzx() : i >= 26 ? new zzv() : new zzu();
        zzbgm zzbgmVar = new zzbgm();
        zzcgh zzcghVar = new zzcgh();
        zzaa zzaaVar = new zzaa();
        zzbhy zzbhyVar = new zzbhy();
        Clock defaultClock = DefaultClock.getInstance();
        zzf zzfVar = new zzf();
        zzbjx zzbjxVar = new zzbjx();
        zzbkq zzbkqVar = new zzbkq();
        zzax zzaxVar = new zzax();
        zzcco zzccoVar = new zzcco();
        zzchb zzchbVar = new zzchb();
        zzbvd zzbvdVar = new zzbvd();
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = new com.google.android.gms.ads.internal.overlay.zzz();
        zzbq zzbqVar = new zzbq();
        zzae zzaeVar = new zzae();
        zzaf zzafVar = new zzaf();
        zzbwb zzbwbVar = new zzbwb();
        zzbr zzbrVar = new zzbr();
        zzems zzemsVar = new zzems();
        zzbin zzbinVar = new zzbin();
        zzcfd zzcfdVar = new zzcfd();
        zzcg zzcgVar = new zzcg();
        zzcjx zzcjxVar = new zzcjx();
        zzchi zzchiVar = new zzchi();
        this.zzb = zzaVar;
        this.zzc = zznVar;
        this.zzd = zzsVar;
        this.zze = zzcmoVar;
        this.zzf = zzcgqVar;
        this.zzg = zzyVar;
        this.zzh = zzbgmVar;
        this.zzi = zzcghVar;
        this.zzj = zzaaVar;
        this.zzk = zzbhyVar;
        this.zzl = defaultClock;
        this.zzm = zzfVar;
        this.zzn = zzbjxVar;
        this.zzo = zzbkqVar;
        this.zzp = zzaxVar;
        this.zzq = zzccoVar;
        this.zzr = zzchbVar;
        this.zzs = zzbvdVar;
        this.zzu = zzbqVar;
        this.zzt = zzzVar;
        this.zzv = zzaeVar;
        this.zzw = zzafVar;
        this.zzx = zzbwbVar;
        this.zzy = zzbrVar;
        this.zzz = zzemsVar;
        this.zzA = zzbinVar;
        this.zzB = zzcfdVar;
        this.zzC = zzcgVar;
        this.zzD = zzcjxVar;
        this.zzE = zzchiVar;
    }

    public static zzcg zzA() {
        return zza.zzC;
    }

    public static zzcjx zzB() {
        return zza.zzD;
    }

    public static zzchi zzC() {
        return zza.zzE;
    }

    public static zzcfd zzD() {
        return zza.zzB;
    }

    public static com.google.android.gms.ads.internal.overlay.zza zza() {
        return zza.zzb;
    }

    public static com.google.android.gms.ads.internal.overlay.zzn zzb() {
        return zza.zzc;
    }

    public static com.google.android.gms.ads.internal.util.zzs zzc() {
        return zza.zzd;
    }

    public static zzcmo zzd() {
        return zza.zze;
    }

    public static zzcgq zze() {
        return zza.zzf;
    }

    public static zzz zzf() {
        return zza.zzg;
    }

    public static zzbgm zzg() {
        return zza.zzh;
    }

    public static zzcgh zzh() {
        return zza.zzi;
    }

    public static zzaa zzi() {
        return zza.zzj;
    }

    public static zzbhy zzj() {
        return zza.zzk;
    }

    public static Clock zzk() {
        return zza.zzl;
    }

    public static zzf zzl() {
        return zza.zzm;
    }

    public static zzbjx zzm() {
        return zza.zzn;
    }

    public static zzbkq zzn() {
        return zza.zzo;
    }

    public static zzax zzo() {
        return zza.zzp;
    }

    public static zzcco zzp() {
        return zza.zzq;
    }

    public static zzchb zzq() {
        return zza.zzr;
    }

    public static zzbvd zzr() {
        return zza.zzs;
    }

    public static zzbq zzs() {
        return zza.zzu;
    }

    public static com.google.android.gms.ads.internal.overlay.zzz zzt() {
        return zza.zzt;
    }

    public static zzemt zzu() {
        return zza.zzz;
    }

    public static zzae zzv() {
        return zza.zzv;
    }

    public static zzaf zzw() {
        return zza.zzw;
    }

    public static zzbwb zzx() {
        return zza.zzx;
    }

    public static zzbr zzy() {
        return zza.zzy;
    }

    public static zzbin zzz() {
        return zza.zzA;
    }
}
