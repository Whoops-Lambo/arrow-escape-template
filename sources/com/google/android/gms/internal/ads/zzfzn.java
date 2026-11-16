package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Collections;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfzn extends zzfzi {
    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        zzfzb zzfzbVar = this.b;
        JSONObject jSONObject = zzfzbVar.a;
        JSONObject jSONObject2 = this.d;
        if (zzfyt.e(jSONObject2, jSONObject)) {
            return null;
        }
        zzfzbVar.a = jSONObject2;
        return jSONObject2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfzj, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public final void onPostExecute(String str) {
        zzfxr zzfxrVar;
        if (!TextUtils.isEmpty(str) && (zzfxrVar = zzfxr.c) != null) {
            for (zzfwk zzfwkVar : Collections.unmodifiableCollection(zzfxrVar.a)) {
                if (this.c.contains(zzfwkVar.g)) {
                    zzfyk zzfykVar = zzfwkVar.d;
                    if (this.e >= zzfykVar.c) {
                        zzfykVar.d = 2;
                        zzfxy.a.a(zzfykVar.c(), "setNativeViewHierarchy", str, zzfykVar.a);
                    }
                }
            }
        }
        super.onPostExecute(str);
    }
}
