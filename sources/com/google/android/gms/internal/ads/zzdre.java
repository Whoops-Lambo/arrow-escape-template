package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C4664b4;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdre {
    public int a;
    public com.google.android.gms.ads.internal.client.zzea b;
    public zzbmz c;
    public View d;
    public List e;
    public zzew g;
    public Bundle h;
    public zzcly i;
    public zzcly j;
    public zzcly k;
    public zzemy l;
    public ListenableFuture m;
    public zzcha n;
    public View o;
    public View p;
    public IObjectWrapper q;
    public double r;
    public zzbng s;
    public zzbng t;
    public String u;
    public float x;
    public String y;
    public final SimpleArrayMap v = new SimpleArrayMap(0);
    public final SimpleArrayMap w = new SimpleArrayMap(0);
    public List f = Collections.EMPTY_LIST;

    public static zzdre l(zzbwv zzbwvVar) {
        zzdrd zzdrdVar;
        zzbwv zzbwvVar2;
        try {
            com.google.android.gms.ads.internal.client.zzea zzeaVarZzn = zzbwvVar.zzn();
            if (zzeaVarZzn == null) {
                zzbwvVar2 = zzbwvVar;
                zzdrdVar = null;
            } else {
                zzbwvVar2 = zzbwvVar;
                zzdrdVar = new zzdrd(zzeaVarZzn, zzbwvVar2);
            }
            return m(zzdrdVar, zzbwvVar2.zzo(), (View) n(zzbwvVar2.zzp()), zzbwvVar2.zze(), zzbwvVar2.zzf(), zzbwvVar2.zzg(), zzbwvVar2.zzs(), zzbwvVar2.zzi(), (View) n(zzbwvVar2.zzq()), zzbwvVar2.zzr(), zzbwvVar2.zzl(), zzbwvVar2.zzm(), zzbwvVar2.zzk(), zzbwvVar2.zzh(), zzbwvVar2.zzj(), zzbwvVar2.zzz());
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public final synchronized String a() {
        return p("headline");
    }

    public final synchronized String c() {
        return p("body");
    }

    public final synchronized Bundle d() {
        try {
            if (this.h == null) {
                this.h = new Bundle();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.h;
    }

    public final synchronized String e() {
        return p("call_to_action");
    }

    public final synchronized String f() {
        return p(C4664b4.i.F0);
    }

    public final synchronized String g() {
        return this.u;
    }

    public final synchronized zzcly h() {
        return this.i;
    }

    public final synchronized zzcly i() {
        return this.j;
    }

    public final synchronized zzcly j() {
        return this.k;
    }

    public final synchronized zzemy k() {
        return this.l;
    }

    public final synchronized void o(String str, String str2) {
        SimpleArrayMap simpleArrayMap = this.w;
        try {
            if (str2 == null) {
                simpleArrayMap.remove(str);
            } else {
                simpleArrayMap.put(str, str2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized String p(String str) {
        return (String) this.w.get(str);
    }

    public final synchronized int q() {
        return this.a;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzea r() {
        return this.b;
    }

    public final synchronized zzbmz s() {
        return this.c;
    }

    public static zzdre m(zzdrd zzdrdVar, zzbmz zzbmzVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d, zzbng zzbngVar, String str6, float f) {
        zzdre zzdreVar = new zzdre();
        zzdreVar.a = 6;
        zzdreVar.b = zzdrdVar;
        zzdreVar.c = zzbmzVar;
        zzdreVar.d = view;
        zzdreVar.o("headline", str);
        zzdreVar.e = list;
        zzdreVar.o("body", str2);
        zzdreVar.h = bundle;
        zzdreVar.o("call_to_action", str3);
        zzdreVar.o = view2;
        zzdreVar.q = iObjectWrapper;
        zzdreVar.o(C4664b4.i.U, str4);
        zzdreVar.o("price", str5);
        zzdreVar.r = d;
        zzdreVar.s = zzbngVar;
        zzdreVar.o(C4664b4.i.F0, str6);
        synchronized (zzdreVar) {
            zzdreVar.x = f;
        }
        return zzdreVar;
    }

    public static Object n(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.z1(iObjectWrapper);
    }

    public final zzbng b() {
        List list = this.e;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.e.get(0);
        if (obj instanceof IBinder) {
            return zzbnf.O3((IBinder) obj);
        }
        return null;
    }
}
