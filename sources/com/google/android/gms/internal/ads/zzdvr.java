package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.mx3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdvr extends zzbnw {
    public final Context a;
    public final zzdre b;
    public zzdsd c;
    public zzdqz d;

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final String zze(String str) {
        SimpleArrayMap simpleArrayMap;
        zzdre zzdreVar = this.b;
        synchronized (zzdreVar) {
            simpleArrayMap = zzdreVar.w;
        }
        return (String) simpleArrayMap.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final zzbng zzf(String str) {
        SimpleArrayMap simpleArrayMap;
        zzdre zzdreVar = this.b;
        synchronized (zzdreVar) {
            simpleArrayMap = zzdreVar.v;
        }
        return (zzbng) simpleArrayMap.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final List zzg() {
        SimpleArrayMap simpleArrayMap;
        SimpleArrayMap simpleArrayMap2;
        try {
            zzdre zzdreVar = this.b;
            synchronized (zzdreVar) {
                simpleArrayMap = zzdreVar.v;
            }
            synchronized (zzdreVar) {
                simpleArrayMap2 = zzdreVar.w;
            }
            String[] strArr = new String[simpleArrayMap.c + simpleArrayMap2.c];
            int i = 0;
            for (int i2 = 0; i2 < simpleArrayMap.c; i2++) {
                strArr[i] = (String) simpleArrayMap.f(i2);
                i++;
            }
            for (int i3 = 0; i3 < simpleArrayMap2.c; i3++) {
                strArr[i] = (String) simpleArrayMap2.f(i3);
                i++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().d("InternalNativeCustomTemplateAdShim.getAvailableAssetNames", e);
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final String zzh() {
        return this.b.g();
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzi(String str) {
        zzdqz zzdqzVar = this.d;
        if (zzdqzVar != null) {
            synchronized (zzdqzVar) {
                zzdqzVar.n.zzd(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzj() {
        zzdqz zzdqzVar = this.d;
        if (zzdqzVar != null) {
            synchronized (zzdqzVar) {
                if (zzdqzVar.y) {
                    return;
                }
                zzdqzVar.n.zzn();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzl() {
        zzdqz zzdqzVar = this.d;
        if (zzdqzVar != null) {
            zzdqzVar.m();
        }
        this.d = null;
        this.c = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final IObjectWrapper zzm() {
        return new ObjectWrapper(this.a);
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final boolean zzo() {
        zzdqz zzdqzVar = this.d;
        if (zzdqzVar != null && !zzdqzVar.p.c()) {
            return false;
        }
        zzdre zzdreVar = this.b;
        return zzdreVar.j() != null && zzdreVar.h() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final boolean zzp() {
        zzdre zzdreVar = this.b;
        zzemy zzemyVarK = zzdreVar.k();
        if (zzemyVarK == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("Trying to start OMID session before creation.");
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzu().e(zzemyVarK.a);
        if (zzdreVar.j() == null) {
            return true;
        }
        zzdreVar.j().m("onSdkLoaded", new ArrayMap(0));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzr() {
        String str;
        try {
            zzdre zzdreVar = this.b;
            synchronized (zzdreVar) {
                str = zzdreVar.y;
            }
            if (Objects.equals(str, "Google")) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzi("Illegal argument specified for omid partner name.");
            } else if (TextUtils.isEmpty(str)) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzi("Not starting OMID session. OM partner name has not been configured.");
            } else {
                zzdqz zzdqzVar = this.d;
                if (zzdqzVar != null) {
                    zzdqzVar.e(str, false);
                }
            }
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().d("InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final zzbnd zzs() {
        zzbnd zzbndVar;
        try {
            zzdrb zzdrbVar = this.d.F;
            synchronized (zzdrbVar) {
                zzbndVar = zzdrbVar.a;
            }
            return zzbndVar;
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().d("InternalNativeCustomTemplateAdShim.getMediaContent", e);
            return null;
        }
    }

    public zzdvr(Context context, zzdre zzdreVar, zzdsd zzdsdVar, zzdqz zzdqzVar) {
        this.a = context;
        this.b = zzdreVar;
        this.c = zzdsdVar;
        this.d = zzdqzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final boolean S1(IObjectWrapper iObjectWrapper) {
        zzdsd zzdsdVar;
        Object objZ1 = ObjectWrapper.z1(iObjectWrapper);
        if ((objZ1 instanceof ViewGroup) && (zzdsdVar = this.c) != null && zzdsdVar.c((ViewGroup) objZ1, true)) {
            this.b.h().I(new mx3(this, 26));
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void Z1(IObjectWrapper iObjectWrapper) {
        zzdqz zzdqzVar;
        Object objZ1 = ObjectWrapper.z1(iObjectWrapper);
        if ((objZ1 instanceof View) && this.b.k() != null && (zzdqzVar = this.d) != null) {
            zzdqzVar.f((View) objZ1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final boolean g(IObjectWrapper iObjectWrapper) {
        zzdsd zzdsdVar;
        Object objZ1 = ObjectWrapper.z1(iObjectWrapper);
        if (!(objZ1 instanceof ViewGroup) || (zzdsdVar = this.c) == null || !zzdsdVar.c((ViewGroup) objZ1, false)) {
            return false;
        }
        this.b.i().I(new mx3(this, 26));
        return true;
    }
}
