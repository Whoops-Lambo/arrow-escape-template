package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzft;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfmj {
    public final com.google.android.gms.ads.internal.client.zzfw a;
    public final zzbtf b;
    public final zzeun c;
    public final com.google.android.gms.ads.internal.client.zzm d;
    public final Bundle e;
    public final com.google.android.gms.ads.internal.client.zzr f;
    public final String g;
    public final ArrayList h;
    public final ArrayList i;
    public final zzbmv j;
    public final com.google.android.gms.ads.internal.client.zzx k;
    public final int l;
    public final AdManagerAdViewOptions m;
    public final PublisherAdViewOptions n;
    public final com.google.android.gms.ads.internal.client.zzcl o;
    public final zzflx p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final Bundle t;
    public final AtomicLong u;
    public final boolean v;
    public final JSONArray w;
    public final com.google.android.gms.ads.internal.client.zzcp x;

    public /* synthetic */ zzfmj(zzfmi zzfmiVar) {
        this.f = zzfmiVar.b;
        this.g = zzfmiVar.c;
        this.x = zzfmiVar.x;
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfmiVar.a;
        this.e = zzmVar.zzC;
        int i = zzmVar.zza;
        long j = zzmVar.zzb;
        Bundle bundle = zzmVar.zzc;
        int i2 = zzmVar.zzd;
        List list = zzmVar.zze;
        boolean z = zzmVar.zzf;
        int i3 = zzmVar.zzg;
        boolean z2 = true;
        if (!zzmVar.zzh && !zzfmiVar.e) {
            z2 = false;
        }
        boolean z3 = z2;
        com.google.android.gms.ads.internal.client.zzm zzmVar2 = zzfmiVar.a;
        String str = zzmVar2.zzi;
        zzft zzftVar = zzmVar2.zzj;
        Location location = zzmVar2.zzk;
        String str2 = zzmVar2.zzl;
        Bundle bundle2 = zzmVar2.zzm;
        Bundle bundle3 = zzmVar2.zzn;
        List list2 = zzmVar2.zzo;
        String str3 = zzmVar2.zzp;
        String str4 = zzmVar2.zzq;
        boolean z4 = zzmVar2.zzr;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzmVar2.zzs;
        int i4 = zzmVar2.zzt;
        String str5 = zzmVar2.zzu;
        List list3 = zzmVar2.zzv;
        int iZza = com.google.android.gms.ads.internal.util.zzs.zza(zzmVar2.zzw);
        com.google.android.gms.ads.internal.client.zzm zzmVar3 = zzfmiVar.a;
        com.google.android.gms.ads.internal.client.zzm zzmVar4 = new com.google.android.gms.ads.internal.client.zzm(i, j, bundle, i2, list, z, i3, z3, str, zzftVar, location, str2, bundle2, bundle3, list2, str3, str4, z4, zzcVar, i4, str5, list3, iZza, zzmVar3.zzx, zzmVar3.zzy, zzmVar3.zzz, zzmVar3.zzA, zzmVar3.zzB);
        this.d = zzmVar4;
        com.google.android.gms.ads.internal.client.zzfw zzfwVar = zzfmiVar.d;
        zzbmv zzbmvVar = null;
        if (zzfwVar == null) {
            zzbmv zzbmvVar2 = zzfmiVar.h;
            zzfwVar = zzbmvVar2 != null ? zzbmvVar2.f : null;
        }
        this.a = zzfwVar;
        ArrayList arrayList = zzfmiVar.f;
        this.h = arrayList;
        this.i = zzfmiVar.g;
        if (arrayList != null && (zzbmvVar = zzfmiVar.h) == null) {
            zzbmvVar = new zzbmv(new NativeAdOptions.Builder().build());
        }
        this.j = zzbmvVar;
        this.k = zzfmiVar.i;
        this.l = zzfmiVar.m;
        this.m = zzfmiVar.j;
        this.n = zzfmiVar.k;
        this.o = zzfmiVar.l;
        this.b = zzfmiVar.n;
        this.p = new zzflx(zzfmiVar.o);
        this.q = zzfmiVar.p;
        this.r = zzfmiVar.q;
        this.c = zzfmiVar.r;
        this.s = zzfmiVar.s;
        this.t = zzfmiVar.t;
        this.u = zzmVar4.zzA != 0 ? new AtomicLong(zzmVar4.zzA) : zzfmiVar.u;
        this.v = zzfmiVar.v;
        this.w = zzfmiVar.w;
    }
}
