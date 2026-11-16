package defpackage;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbjr;
import com.tiktok.appevents.contents.TTContentsEventConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class jc4 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final int f;
    public final boolean g;

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.a);
        jSONObject.put("version", this.c);
        if (((Boolean) zzba.zzc().a(zzbjr.Ya)).booleanValue()) {
            jSONObject.put("sdkVersion", this.b);
        }
        jSONObject.put("status", this.d);
        jSONObject.put(TTContentsEventConstants.Params.EVENT_PROPERTY_DESCRIPTION, this.e);
        jSONObject.put("initializationLatencyMillis", this.f);
        if (((Boolean) zzba.zzc().a(zzbjr.Za)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.g);
        }
        return jSONObject;
    }

    public jc4(String str, String str2, String str3, int i, String str4, int i2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = i2;
        this.g = z;
    }
}
