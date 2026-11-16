package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class zzbzk {
    public final zzcly a;
    public final String b;

    public final void b(String str) {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("message", str).put("action", this.b);
            zzcly zzclyVar = this.a;
            if (zzclyVar != null) {
                zzclyVar.n("onError", jSONObjectPut);
            }
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Error occurred while dispatching error event.", e);
        }
    }

    public final void c(int i, int i2, int i3, int i4) {
        try {
            this.a.n("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Error occurred while dispatching size change.", e);
        }
    }

    public final void d(String str) {
        try {
            this.a.n("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Error occurred while dispatching state change.", e);
        }
    }

    public final void e(int i, int i2, int i3, int i4, int i5, float f) {
        try {
            this.a.n("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", f).put("rotation", i5));
        } catch (JSONException e) {
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Error occurred while obtaining screen information.", e);
        }
    }

    public zzbzk(zzcly zzclyVar, String str) {
        this.a = zzclyVar;
        this.b = str;
    }
}
