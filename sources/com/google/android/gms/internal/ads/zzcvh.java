package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.ironsource.C4664b4;
import com.ironsource.C4811j8;
import com.singular.sdk.internal.Constants;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcvh implements zzbvf {
    public final Context a;
    public final zzbfo b;
    public final PowerManager c;

    @Override // com.google.android.gms.internal.ads.zzbvf
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject zzb(zzcvk zzcvkVar) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzbfq zzbfqVar = zzcvkVar.e;
        if (zzbfqVar == null) {
            jSONObject = new JSONObject();
        } else {
            zzbfo zzbfoVar = this.b;
            if (zzbfoVar.b == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z = zzbfqVar.a;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObjectPut = jSONObject3.put("afmaVersion", zzbfoVar.d).put("activeViewJSON", zzbfoVar.b).put("timestamp", zzcvkVar.c).put("adFormat", zzbfoVar.a).put("hashCode", zzbfoVar.c).put("isMraid", false).put("isStopped", false).put("isPaused", zzcvkVar.b).put("isNative", zzbfoVar.e).put("isScreenOn", this.c.isInteractive()).put("appMuted", com.google.android.gms.ads.internal.zzt.zzi().zzd()).put("appVolume", com.google.android.gms.ads.internal.zzt.zzi().zzb());
            Context context = this.a;
            jSONObjectPut.put(C4664b4.j.P, com.google.android.gms.ads.internal.util.zzaa.zze(context.getApplicationContext()));
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            JSONObject jSONObjectPut2 = jSONObject3.put("windowVisibility", zzbfqVar.b).put("isAttachedToWindow", z);
            JSONObject jSONObject4 = new JSONObject();
            Rect rect = zzbfqVar.c;
            JSONObject jSONObjectPut3 = jSONObjectPut2.put("viewBox", jSONObject4.put("top", rect.top).put("bottom", rect.bottom).put("left", rect.left).put("right", rect.right));
            JSONObject jSONObject5 = new JSONObject();
            Rect rect2 = zzbfqVar.d;
            JSONObject jSONObjectPut4 = jSONObjectPut3.put("adBox", jSONObject5.put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
            JSONObject jSONObject6 = new JSONObject();
            Rect rect3 = zzbfqVar.e;
            JSONObject jSONObjectPut5 = jSONObjectPut4.put("globalVisibleBox", jSONObject6.put("top", rect3.top).put("bottom", rect3.bottom).put("left", rect3.left).put("right", rect3.right)).put("globalVisibleBoxVisible", zzbfqVar.f);
            JSONObject jSONObject7 = new JSONObject();
            Rect rect4 = zzbfqVar.g;
            JSONObject jSONObjectPut6 = jSONObjectPut5.put("localVisibleBox", jSONObject7.put("top", rect4.top).put("bottom", rect4.bottom).put("left", rect4.left).put("right", rect4.right)).put("localVisibleBoxVisible", zzbfqVar.h);
            JSONObject jSONObject8 = new JSONObject();
            Rect rect5 = zzbfqVar.i;
            jSONObjectPut6.put("hitBox", jSONObject8.put("top", rect5.top).put("bottom", rect5.bottom).put("left", rect5.left).put("right", rect5.right)).put("screenDensity", displayMetrics.density);
            jSONObject3.put(C4811j8.k, zzcvkVar.a);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.j2)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzbfqVar.k;
                if (list != null) {
                    for (Rect rect6 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect6.top).put("bottom", rect6.bottom).put("left", rect6.left).put("right", rect6.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcvkVar.d)) {
                jSONObject3.put("doneReasonCode", Constants.RequestParamsKeys.IDENTIFIER_UNIQUE_ID_KEY);
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }

    public zzcvh(Context context, zzbfo zzbfoVar) {
        this.a = context;
        this.b = zzbfoVar;
        this.c = (PowerManager) context.getSystemService("power");
    }
}
