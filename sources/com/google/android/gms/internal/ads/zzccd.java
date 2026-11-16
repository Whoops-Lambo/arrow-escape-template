package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.nu4;
import defpackage.wm4;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzccd extends zzcca {
    public final Context b;
    public SharedPreferences c;
    public final zzbvq d;
    public final VersionInfoParcel e;
    public final Executor g;
    public final Object a = new Object();
    public final AtomicBoolean f = new AtomicBoolean(false);

    public static JSONObject b(Context context, VersionInfoParcel versionInfoParcel) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) zzbls.f.c()).booleanValue()) {
                jSONObject.put("package_name", context.getPackageName());
            }
            jSONObject.put("js", versionInfoParcel.afmaVersion);
            jSONObject.put("mf", zzbls.g.c());
            jSONObject.put("cl", "982601081");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451001);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.d(context, ModuleDescriptor.MODULE_ID, false));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final ListenableFuture a() {
        synchronized (this.a) {
            try {
                if (this.c == null) {
                    this.c = this.b.getSharedPreferences("google_ads_flags_meta", 0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        SharedPreferences sharedPreferences = this.c;
        if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - (sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L) < ((Long) zzbls.h.c()).longValue()) {
            return nu4.b;
        }
        return zzheh.i(this.d.a(b(this.b, this.e)), new wm4(this, 1), ((Boolean) zzbls.m.c()).booleanValue() ? this.g : zzcgv.h);
    }

    public zzccd(Context context, zzbvq zzbvqVar, VersionInfoParcel versionInfoParcel, Executor executor) {
        this.b = context.getApplicationContext();
        this.e = versionInfoParcel;
        this.d = zzbvqVar;
        this.g = executor;
    }
}
