package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbp;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdtg implements zzdrm, zzdje {
    public final zzbwv a;
    public final zzdeu b;
    public final zzdgv c;
    public final zzdea d;
    public final zzdmh e;
    public final Context f;
    public final zzflq g;
    public final VersionInfoParcel h;
    public final zzfmj i;
    public boolean j = false;
    public boolean k = false;
    public boolean l = true;
    public final zzbwr m;
    public final zzbws n;

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final boolean b(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final JSONObject c(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdje
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void e(zzbou zzbouVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void f(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void h(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final JSONObject i(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void k(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void n(MotionEvent motionEvent, View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void q(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void x() {
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void zzd(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void zzg() {
        this.k = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void zzn() {
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final int zzu() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final boolean zzv() {
        return true;
    }

    public static final HashMap s(Map map) {
        HashMap map2 = new HashMap();
        if (map == null) {
            return map2;
        }
        synchronized (map) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        map2.put((String) entry.getKey(), view);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map2;
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void a(View view) {
        try {
            ObjectWrapper objectWrapper = new ObjectWrapper(view);
            zzbwv zzbwvVar = this.a;
            if (zzbwvVar != null) {
                zzbwvVar.S0(objectWrapper);
                return;
            }
            zzbwr zzbwrVar = this.m;
            if (zzbwrVar != null) {
                Parcel parcelZzda = zzbwrVar.zzda();
                zzbfh.e(parcelZzda, objectWrapper);
                zzbwrVar.zzdc(16, parcelZzda);
            } else {
                zzbws zzbwsVar = this.n;
                if (zzbwsVar != null) {
                    Parcel parcelZzda2 = zzbwsVar.zzda();
                    zzbfh.e(parcelZzda2, objectWrapper);
                    zzbwsVar.zzdc(14, parcelZzda2);
                }
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Failed to call untrackView", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00d0 A[Catch: JSONException -> 0x0051, RemoteException -> 0x0152, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0051, blocks: (B:44:0x00b8, B:46:0x00d0), top: B:65:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x006c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00ce A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void g(View view, Map map, Map map2, zzdtb zzdtbVar, zzdtb zzdtbVar2) {
        Object obj;
        ArrayList arrayList;
        ClassLoader classLoader;
        int size;
        int i;
        Object obj2;
        IObjectWrapper iObjectWrapperZzq;
        try {
            ObjectWrapper objectWrapper = new ObjectWrapper(view);
            JSONObject jSONObject = this.g.j0;
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.q2)).booleanValue();
            zzbws zzbwsVar = this.n;
            zzbwr zzbwrVar = this.m;
            zzbwv zzbwvVar = this.a;
            boolean z = true;
            if (zBooleanValue && jSONObject.length() != 0) {
                Map map3 = map == null ? new HashMap() : map;
                Map map4 = map2 == null ? new HashMap() : map2;
                HashMap map5 = new HashMap();
                map5.putAll(map3);
                map5.putAll(map4);
                Iterator<String> itKeys = jSONObject.keys();
                loop0: while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                    if (jSONArrayOptJSONArray != null) {
                        WeakReference weakReference = (WeakReference) map5.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.r2)).booleanValue() && next.equals("3010")) {
                                Object objZ1 = null;
                                if (zzbwvVar != null) {
                                    try {
                                        iObjectWrapperZzq = zzbwvVar.zzq();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else if (zzbwrVar != null) {
                                    iObjectWrapperZzq = zzbwrVar.r();
                                } else {
                                    iObjectWrapperZzq = zzbwsVar != null ? zzbwsVar.zzu() : null;
                                }
                                if (iObjectWrapperZzq != null) {
                                    objZ1 = ObjectWrapper.z1(iObjectWrapperZzq);
                                }
                                if (objZ1 != null) {
                                    cls = objZ1.getClass();
                                    arrayList = new ArrayList();
                                    zzbp.zza(jSONArrayOptJSONArray, arrayList);
                                    com.google.android.gms.ads.internal.zzt.zzc();
                                    classLoader = this.f.getClassLoader();
                                    size = arrayList.size();
                                    i = 0;
                                    while (true) {
                                        if (i < size) {
                                            obj2 = arrayList.get(i);
                                            i++;
                                            if (Class.forName((String) obj2, false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                try {
                                    arrayList = new ArrayList();
                                    zzbp.zza(jSONArrayOptJSONArray, arrayList);
                                    com.google.android.gms.ads.internal.zzt.zzc();
                                    classLoader = this.f.getClassLoader();
                                    size = arrayList.size();
                                    i = 0;
                                    while (true) {
                                        if (i < size) {
                                            obj2 = arrayList.get(i);
                                            i++;
                                            if (Class.forName((String) obj2, false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                } catch (JSONException unused2) {
                                    continue;
                                }
                            }
                        }
                        z = false;
                        break;
                    }
                }
            }
            this.l = z;
            HashMap mapS = s(map);
            HashMap mapS2 = s(map2);
            if (zzbwvVar != null) {
                zzbwvVar.G(objectWrapper, new ObjectWrapper(mapS), new ObjectWrapper(mapS2));
                return;
            }
            if (zzbwrVar != null) {
                ObjectWrapper objectWrapper2 = new ObjectWrapper(mapS);
                ObjectWrapper objectWrapper3 = new ObjectWrapper(mapS2);
                Parcel parcelZzda = zzbwrVar.zzda();
                zzbfh.e(parcelZzda, objectWrapper);
                zzbfh.e(parcelZzda, objectWrapper2);
                zzbfh.e(parcelZzda, objectWrapper3);
                zzbwrVar.zzdc(22, parcelZzda);
                Parcel parcelZzda2 = zzbwrVar.zzda();
                zzbfh.e(parcelZzda2, objectWrapper);
                zzbwrVar.zzdc(12, parcelZzda2);
                return;
            }
            if (zzbwsVar != null) {
                ObjectWrapper objectWrapper4 = new ObjectWrapper(mapS);
                ObjectWrapper objectWrapper5 = new ObjectWrapper(mapS2);
                Parcel parcelZzda3 = zzbwsVar.zzda();
                zzbfh.e(parcelZzda3, objectWrapper);
                zzbfh.e(parcelZzda3, objectWrapper4);
                zzbfh.e(parcelZzda3, objectWrapper5);
                zzbwsVar.zzdc(22, parcelZzda3);
                Parcel parcelZzda4 = zzbwsVar.zzda();
                zzbfh.e(parcelZzda4, objectWrapper);
                zzbwsVar.zzdc(10, parcelZzda4);
            }
        } catch (RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Failed to call trackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void j(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        if (!this.k) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.g.L) {
            t(view2);
        } else {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void l(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdje
    public final void m() {
        try {
            zzbwv zzbwvVar = this.a;
            if (zzbwvVar == null || !zzbwvVar.zzt()) {
                return;
            }
            zzflq zzflqVar = this.g;
            if (zzflqVar.e == 4 || zzflqVar.D0) {
                zzbwvVar.zzv();
                this.b.zza();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Failed to report impression from an adapter", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void o(com.google.android.gms.ads.internal.client.zzdc zzdcVar) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void p(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        if (this.k && this.g.L) {
            return;
        }
        t(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void r(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            boolean z = this.j;
            zzflq zzflqVar = this.g;
            if (!z) {
                this.j = com.google.android.gms.ads.internal.zzt.zzo().zzg(this.f, this.h.afmaVersion, zzflqVar.C.toString(), this.i.g);
            }
            if (this.l) {
                zzbwv zzbwvVar = this.a;
                zzdeu zzdeuVar = this.b;
                if (zzbwvVar != null) {
                    if (zzflqVar.D0) {
                        if (zzbwvVar.zzt()) {
                            return;
                        }
                        zzbwvVar.zzv();
                        zzdeuVar.zza();
                        return;
                    }
                    if (zzbwvVar.zzt() && zzflqVar.e == 4) {
                        this.c.zza();
                        return;
                    } else {
                        zzbwvVar.zzv();
                        zzdeuVar.zza();
                        return;
                    }
                }
                zzbwr zzbwrVar = this.m;
                if (zzbwrVar != null) {
                    Parcel parcelZzdb = zzbwrVar.zzdb(13, zzbwrVar.zzda());
                    boolean zA = zzbfh.a(parcelZzdb);
                    parcelZzdb.recycle();
                    if (!zA) {
                        zzbwrVar.zzdc(10, zzbwrVar.zzda());
                        zzdeuVar.zza();
                        return;
                    }
                }
                zzbws zzbwsVar = this.n;
                if (zzbwsVar != null) {
                    Parcel parcelZzdb2 = zzbwsVar.zzdb(11, zzbwsVar.zzda());
                    boolean zA2 = zzbfh.a(parcelZzdb2);
                    parcelZzdb2.recycle();
                    if (zA2) {
                        return;
                    }
                    zzbwsVar.zzdc(8, zzbwsVar.zzda());
                    zzdeuVar.zza();
                }
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Failed to call recordImpression", e);
        }
    }

    public final void t(View view) {
        try {
            zzbwv zzbwvVar = this.a;
            zzdmh zzdmhVar = this.e;
            zzdea zzdeaVar = this.d;
            if (zzbwvVar != null && !zzbwvVar.zzu()) {
                zzbwvVar.z(new ObjectWrapper(view));
                zzdeaVar.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.zc)).booleanValue()) {
                    zzdmhVar.W();
                    return;
                }
                return;
            }
            zzbwr zzbwrVar = this.m;
            if (zzbwrVar != null) {
                Parcel parcelZzdb = zzbwrVar.zzdb(14, zzbwrVar.zzda());
                boolean zA = zzbfh.a(parcelZzdb);
                parcelZzdb.recycle();
                if (!zA) {
                    ObjectWrapper objectWrapper = new ObjectWrapper(view);
                    Parcel parcelZzda = zzbwrVar.zzda();
                    zzbfh.e(parcelZzda, objectWrapper);
                    zzbwrVar.zzdc(11, parcelZzda);
                    zzdeaVar.onAdClicked();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.zc)).booleanValue()) {
                        zzdmhVar.W();
                        return;
                    }
                    return;
                }
            }
            zzbws zzbwsVar = this.n;
            if (zzbwsVar != null) {
                Parcel parcelZzdb2 = zzbwsVar.zzdb(12, zzbwsVar.zzda());
                boolean zA2 = zzbfh.a(parcelZzdb2);
                parcelZzdb2.recycle();
                if (zA2) {
                    return;
                }
                ObjectWrapper objectWrapper2 = new ObjectWrapper(view);
                Parcel parcelZzda2 = zzbwsVar.zzda();
                zzbfh.e(parcelZzda2, objectWrapper2);
                zzbwsVar.zzdc(9, parcelZzda2);
                zzdeaVar.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.zc)).booleanValue()) {
                    zzdmhVar.W();
                }
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Failed to call handleClick", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final void zzA() {
        try {
            zzbwv zzbwvVar = this.a;
            if (zzbwvVar != null) {
                zzbwvVar.zzC();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Failed to call destroy", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdrm
    public final boolean zzh() {
        return this.g.L;
    }

    public zzdtg(zzbwr zzbwrVar, zzbws zzbwsVar, zzbwv zzbwvVar, zzdeu zzdeuVar, zzdgv zzdgvVar, zzdea zzdeaVar, zzdmh zzdmhVar, Context context, zzflq zzflqVar, VersionInfoParcel versionInfoParcel, zzfmj zzfmjVar) {
        this.m = zzbwrVar;
        this.n = zzbwsVar;
        this.a = zzbwvVar;
        this.b = zzdeuVar;
        this.c = zzdgvVar;
        this.d = zzdeaVar;
        this.e = zzdmhVar;
        this.f = context;
        this.g = zzflqVar;
        this.h = versionInfoParcel;
        this.i = zzfmjVar;
    }
}
