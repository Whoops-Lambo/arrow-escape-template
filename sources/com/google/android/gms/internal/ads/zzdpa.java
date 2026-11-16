package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.singular.sdk.internal.UserDetailsUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdpa implements zzdfq, com.google.android.gms.ads.internal.overlay.zzr, zzdew {
    public final Context a;
    public final zzcly b;
    public final zzflq c;
    public final VersionInfoParcel d;
    public final zzemw e;
    public zzemy f;

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdA() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdW() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdX(int i) {
        this.f = null;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    public final boolean a() {
        zzfwu zzfwuVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.A6)).booleanValue()) {
            return false;
        }
        zzemw zzemwVar = this.e;
        synchronized (zzemwVar) {
            zzfwuVar = zzemwVar.f;
        }
        return zzfwuVar != null;
    }

    @Override // com.google.android.gms.internal.ads.zzdfq
    public final void zzg() {
        zzcly zzclyVar;
        zzemv zzemvVar;
        zzemu zzemuVar;
        zzflq zzflqVar = this.c;
        if (!zzflqVar.T || (zzclyVar = this.b) == null) {
            return;
        }
        if (com.google.android.gms.ads.internal.zzt.zzu().zza(this.a)) {
            if (a()) {
                this.e.b();
                return;
            }
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
                zzemvVar = zzflqVar.Y == 2 ? zzemv.UNSPECIFIED : zzemv.BEGIN_TO_RENDER;
                zzemuVar = zzemu.HTML_DISPLAY;
            }
            zzemu zzemuVar2 = zzemuVar;
            zzemv zzemvVar2 = zzemvVar;
            com.google.android.gms.ads.internal.zzt.zzu();
            zzemy zzemyVarI = zzems.i(string, zzclyVar.zzD(), str, zzemvVar2, zzemuVar2, zzflqVar.l0);
            this.f = zzemyVarI;
            if (zzemyVarI != null) {
                zzfwk zzfwkVar = zzemyVarI.a;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.z6)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzu().a(zzfwkVar, zzclyVar.zzD());
                    ArrayList arrayListZzF = zzclyVar.zzF();
                    int size = arrayListZzF.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayListZzF.get(i3);
                        i3++;
                        com.google.android.gms.ads.internal.zzt.zzu().b(zzfwkVar, (View) obj);
                    }
                } else {
                    com.google.android.gms.ads.internal.zzt.zzu().a(zzfwkVar, zzclyVar.zzE());
                }
                zzclyVar.f0(this.f);
                com.google.android.gms.ads.internal.zzt.zzu().e(zzfwkVar);
                zzclyVar.m("onSdkLoaded", new ArrayMap(0));
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        zzcly zzclyVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.D6)).booleanValue() || (zzclyVar = this.b) == null) {
            return;
        }
        if (this.f != null || a()) {
            if (this.f != null) {
                zzclyVar.m("onSdkImpression", new ArrayMap(0));
            } else {
                this.e.c();
            }
        }
    }

    public zzdpa(Context context, zzcly zzclyVar, zzflq zzflqVar, VersionInfoParcel versionInfoParcel, zzemw zzemwVar) {
        this.a = context;
        this.b = zzclyVar;
        this.c = zzflqVar;
        this.d = versionInfoParcel;
        this.e = zzemwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdew
    public final void Q() {
        zzcly zzclyVar;
        if (a()) {
            this.e.c();
        } else if (this.f != null && (zzclyVar = this.b) != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.D6)).booleanValue()) {
                zzclyVar.m("onSdkImpression", new ArrayMap(0));
            }
        }
    }
}
