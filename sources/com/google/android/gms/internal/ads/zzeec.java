package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.ic4;
import defpackage.o64;
import defpackage.uy3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeec implements zzefe, zzedn {
    public final zzeen a;
    public final zzeff b;
    public final zzedo c;
    public final zzedx d;
    public final zzedm e;
    public final zzeez f;
    public final zzeej g;
    public final zzeej h;
    public final String i;
    public final Context j;
    public final String k;
    public JSONObject p;
    public boolean s;
    public int t;
    public boolean u;
    public final HashMap l = new HashMap();
    public final HashMap m = new HashMap();
    public final HashMap n = new HashMap();
    public String o = JsonUtils.EMPTY_JSON;
    public long q = Long.MAX_VALUE;
    public zzedy r = zzedy.a;
    public zzeeb v = zzeeb.a;
    public long w = 0;
    public String x = "";

    public final synchronized void c(String str, zzedq zzedqVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Ca)).booleanValue() && f()) {
            if (this.t >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Ea)).intValue()) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzi("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            HashMap map = this.l;
            if (!map.containsKey(str)) {
                map.put(str, new ArrayList());
            }
            this.t++;
            ((List) map.get(str)).add(zzedqVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.ab)).booleanValue()) {
                String str2 = zzedqVar.c;
                this.m.put(str2, zzedqVar);
                HashMap map2 = this.n;
                if (map2.containsKey(str2)) {
                    List list = (List) map2.get(str2);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((zzcha) it.next()).zzc(zzedqVar);
                    }
                    list.clear();
                }
            }
        }
    }

    public final synchronized zzcha d(String str) {
        zzcha zzchaVar;
        try {
            zzchaVar = new zzcha();
            HashMap map = this.m;
            if (map.containsKey(str)) {
                zzchaVar.zzc((zzedq) map.get(str));
            } else {
                HashMap map2 = this.n;
                if (!map2.containsKey(str)) {
                    map2.put(str, new ArrayList());
                }
                ((List) map2.get(str)).add(zzchaVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzchaVar;
    }

    public final synchronized void e(zzdk zzdkVar, zzeeb zzeebVar) {
        if (!f()) {
            try {
                zzdkVar.zze(zzfnl.d(18, null, null));
                return;
            } catch (RemoteException unused) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzi("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Ca)).booleanValue()) {
            this.v = zzeebVar;
            this.a.a(zzdkVar, new zzbrp(this), new zzbrh(this.f), new zzbqt(this));
            return;
        } else {
            try {
                zzdkVar.zze(zzfnl.d(1, null, null));
                return;
            } catch (RemoteException unused2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzi("Ad inspector had an internal error.");
                return;
            }
        }
        throw th;
    }

    public final synchronized boolean f() {
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Ra)).booleanValue();
        boolean z = this.s;
        if (zBooleanValue) {
            return z || com.google.android.gms.ads.internal.zzt.zzo().zzk();
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:15:0x0029, B:20:0x0038, B:16:0x002d, B:18:0x0033), top: B:27:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0033 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:15:0x0029, B:20:0x0038, B:16:0x002d, B:18:0x0033), top: B:27:0x0001 }] */
    public final synchronized void g(boolean z, boolean z2) {
        try {
            if (this.s != z) {
                this.s = z;
                if (z) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Ra)).booleanValue() || !com.google.android.gms.ads.internal.zzt.zzo().zzk()) {
                        k();
                    } else if (!f()) {
                        l();
                    }
                } else if (!f()) {
                    l();
                }
                if (z2) {
                    m();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void h(zzedy zzedyVar, boolean z) {
        try {
            if (this.r != zzedyVar) {
                if (f()) {
                    l();
                }
                this.r = zzedyVar;
                if (f()) {
                    k();
                }
                if (z) {
                    m();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized JSONObject i() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.l.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (zzedq zzedqVar : (List) entry.getValue()) {
                    if (zzedqVar.e != zzedp.a) {
                        jSONArray.put(zzedqVar.a());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((String) entry.getKey(), jSONArray);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public final void j() {
        this.u = true;
        zzedx zzedxVar = this.d;
        zzedxVar.getClass();
        ic4 ic4Var = new ic4(zzedxVar);
        zzedh zzedhVar = zzedxVar.a;
        zzedhVar.getClass();
        zzedhVar.e.addListener(new o64(22, zzedhVar, ic4Var), zzedhVar.j);
        this.a.c = this;
        this.b.f = this;
        this.c.i = this;
        this.f.f = this;
        uy3 uy3Var = zzbjr.gb;
        if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().a(uy3Var))) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.j);
            List listAsList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(uy3Var)).split(","));
            zzeej zzeejVar = this.g;
            zzeejVar.b = listAsList;
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzeejVar);
            Iterator it = listAsList.iterator();
            while (it.hasNext()) {
                zzeejVar.onSharedPreferenceChanged(defaultSharedPreferences, (String) it.next());
            }
        }
        uy3 uy3Var2 = zzbjr.hb;
        if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().a(uy3Var2))) {
            SharedPreferences sharedPreferences = this.j.getSharedPreferences("admob", 0);
            List listAsList2 = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(uy3Var2)).split(","));
            zzeej zzeejVar2 = this.h;
            zzeejVar2.b = listAsList2;
            sharedPreferences.registerOnSharedPreferenceChangeListener(zzeejVar2);
            Iterator it2 = listAsList2.iterator();
            while (it2.hasNext()) {
                zzeejVar2.onSharedPreferenceChanged(sharedPreferences, (String) it2.next());
            }
        }
        String strZzH = com.google.android.gms.ads.internal.zzt.zzh().g().zzH();
        synchronized (this) {
            if (!TextUtils.isEmpty(strZzH)) {
                try {
                    JSONObject jSONObject = new JSONObject(strZzH);
                    g(jSONObject.optBoolean("isTestMode", false), false);
                    h((zzedy) Enum.valueOf(zzedy.class, jSONObject.optString("gesture", "NONE")), false);
                    this.o = jSONObject.optString("networkExtras", JsonUtils.EMPTY_JSON);
                    this.q = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
                } catch (JSONException unused) {
                }
            }
        }
        this.x = com.google.android.gms.ads.internal.zzt.zzh().g().zzN();
    }

    public final synchronized void k() {
        int iOrdinal = this.r.ordinal();
        if (iOrdinal == 1) {
            this.b.b();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.c.b();
        }
    }

    public final synchronized void l() {
        SensorManager sensorManager;
        Sensor sensor;
        try {
            int iOrdinal = this.r.ordinal();
            if (iOrdinal == 1) {
                zzeff zzeffVar = this.b;
                synchronized (zzeffVar) {
                    try {
                        if (zzeffVar.g) {
                            SensorManager sensorManager2 = zzeffVar.b;
                            if (sensorManager2 != null) {
                                sensorManager2.unregisterListener(zzeffVar, zzeffVar.c);
                                com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for shake gestures.");
                            }
                            zzeffVar.g = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            if (iOrdinal != 2) {
                return;
            }
            zzedo zzedoVar = this.c;
            synchronized (zzedoVar) {
                try {
                    if (zzedoVar.j && (sensorManager = zzedoVar.a) != null && (sensor = zzedoVar.b) != null) {
                        sensorManager.unregisterListener(zzedoVar, sensor);
                        zzedoVar.j = false;
                        com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for flick gestures.");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        } catch (Throwable th3) {
            throw th3;
        }
        throw th3;
    }

    public final void a() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Ca)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Ra)).booleanValue() && com.google.android.gms.ads.internal.zzt.zzh().g().zzJ()) {
                j();
                return;
            }
            String strZzH = com.google.android.gms.ads.internal.zzt.zzh().g().zzH();
            if (TextUtils.isEmpty(strZzH)) {
                return;
            }
            try {
                if (new JSONObject(strZzH).optBoolean("isTestMode", false)) {
                    j();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final void b(boolean z) {
        if (!this.u && z) {
            j();
        }
        g(z, true);
    }

    public zzeec(zzeen zzeenVar, zzeff zzeffVar, zzedo zzedoVar, Context context, VersionInfoParcel versionInfoParcel, zzedx zzedxVar, zzeez zzeezVar, zzeej zzeejVar, zzeej zzeejVar2, String str) {
        this.a = zzeenVar;
        this.b = zzeffVar;
        this.c = zzedoVar;
        this.e = new zzedm(context);
        this.i = versionInfoParcel.afmaVersion;
        this.k = str;
        this.d = zzedxVar;
        this.f = zzeezVar;
        this.g = zzeejVar;
        this.h = zzeejVar2;
        this.j = context;
        com.google.android.gms.ads.internal.zzt.zzo().zza(this);
    }

    public final void m() {
        String string;
        com.google.android.gms.ads.internal.util.zzj zzjVarG = com.google.android.gms.ads.internal.zzt.zzh().g();
        synchronized (this) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("isTestMode", this.s);
                jSONObject.put("gesture", this.r);
                if (this.q > com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() / 1000) {
                    jSONObject.put("networkExtras", this.o);
                    jSONObject.put("networkExtrasExpirationSecs", this.q);
                }
            } catch (JSONException unused) {
            }
            string = jSONObject.toString();
        }
        zzjVarG.zzI(string);
    }
}
