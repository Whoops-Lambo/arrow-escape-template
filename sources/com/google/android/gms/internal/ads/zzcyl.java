package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.singular.sdk.internal.UserDetailsUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcyl implements zzdfq, zzdew {
    public final Context a;
    public final zzcly b;
    public final zzflq c;
    public final VersionInfoParcel d;
    public zzemy e;
    public boolean f;
    public final zzemw g;

    @Override // com.google.android.gms.internal.ads.zzdew
    public final synchronized void Q() {
        boolean z;
        zzcly zzclyVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.A6)).booleanValue()) {
            zzemw zzemwVar = this.g;
            synchronized (zzemwVar) {
                z = zzemwVar.f != null;
            }
        }
        if (z) {
            this.g.c();
            return;
        }
        if (!this.f) {
            a();
        }
        if (!this.c.T || this.e == null || (zzclyVar = this.b) == null) {
            return;
        }
        zzclyVar.m("onSdkImpression", new ArrayMap(0));
    }

    public final synchronized void a() {
        zzcly zzclyVar;
        zzemv zzemvVar;
        zzemu zzemuVar;
        try {
            zzflq zzflqVar = this.c;
            if (zzflqVar.T && (zzclyVar = this.b) != null) {
                if (com.google.android.gms.ads.internal.zzt.zzu().zza(this.a)) {
                    VersionInfoParcel versionInfoParcel = this.d;
                    int i = versionInfoParcel.buddyApkVersion;
                    int i2 = versionInfoParcel.clientJarVersion;
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i2).length());
                    sb.append(i);
                    sb.append(UserDetailsUtils.UserDetailsLiterals.DOT);
                    sb.append(i2);
                    String string = sb.toString();
                    zzfmm zzfmmVar = zzflqVar.V;
                    String str = zzfmmVar.a() + (-1) != 1 ? "javascript" : null;
                    if (zzfmmVar.a() == 1) {
                        zzemuVar = zzemu.VIDEO;
                        zzemvVar = zzemv.DEFINED_BY_JAVASCRIPT;
                    } else {
                        int i3 = zzflqVar.e;
                        zzemu zzemuVar2 = zzemu.HTML_DISPLAY;
                        zzemvVar = i3 == 1 ? zzemv.ONE_PIXEL : zzemv.BEGIN_TO_RENDER;
                        zzemuVar = zzemuVar2;
                    }
                    com.google.android.gms.ads.internal.zzt.zzu();
                    zzemy zzemyVarI = zzems.i(string, zzclyVar.zzD(), str, zzemvVar, zzemuVar, zzflqVar.l0);
                    this.e = zzemyVarI;
                    if (zzemyVarI != null) {
                        zzfwk zzfwkVar = zzemyVarI.a;
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.z6)).booleanValue()) {
                            com.google.android.gms.ads.internal.zzt.zzu().a(zzfwkVar, zzclyVar.zzD());
                            ArrayList arrayListZzF = zzclyVar.zzF();
                            int size = arrayListZzF.size();
                            int i4 = 0;
                            while (i4 < size) {
                                Object obj = arrayListZzF.get(i4);
                                i4++;
                                com.google.android.gms.ads.internal.zzt.zzu().b(zzfwkVar, (View) obj);
                            }
                        } else {
                            com.google.android.gms.ads.internal.zzt.zzu().a(zzfwkVar, zzclyVar.zzE());
                        }
                        zzclyVar.f0(this.e);
                        com.google.android.gms.ads.internal.zzt.zzu().e(zzfwkVar);
                        this.f = true;
                        zzclyVar.m("onSdkLoaded", new ArrayMap(0));
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfq
    public final synchronized void zzg() {
        boolean z;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.A6)).booleanValue()) {
            zzemw zzemwVar = this.g;
            synchronized (zzemwVar) {
                z = zzemwVar.f != null;
            }
        }
        if (z) {
            this.g.b();
        } else {
            if (this.f) {
                return;
            }
            a();
        }
    }

    public zzcyl(Context context, zzcly zzclyVar, zzflq zzflqVar, VersionInfoParcel versionInfoParcel, zzemw zzemwVar) {
        this.a = context;
        this.b = zzclyVar;
        this.c = zzflqVar;
        this.d = versionInfoParcel;
        this.g = zzemwVar;
    }
}
