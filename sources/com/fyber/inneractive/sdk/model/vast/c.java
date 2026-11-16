package com.fyber.inneractive.sdk.model.vast;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class c implements com.fyber.inneractive.sdk.response.i {
    public final i a;
    public k b;
    public final int c;
    public final int d;
    public final String e;
    public String f;
    public String g;
    public final int h;
    public final HashMap i = new HashMap();

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("w", this.c);
            jSONObject.put(CmcdData.STREAMING_FORMAT_HLS, this.d);
            jSONObject.put("type", this.a.toString());
            k kVar = this.b;
            jSONObject.put("creativeType", kVar != null ? kVar.mimeType : "none");
            jSONObject.put("content", this.f);
            return jSONObject;
        } catch (JSONException e) {
            IAlog.a("Vast Parser: Failed creating Companion json object: %s", e.getMessage());
            return jSONObject;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Companion:  w:");
        sb.append(this.c);
        sb.append(" h:");
        sb.append(this.d);
        sb.append(" type:");
        sb.append(this.a.toString());
        sb.append(" creativeType: ");
        k kVar = this.b;
        sb.append(kVar != null ? kVar.mimeType : "none");
        sb.append(" ctr:");
        sb.append(this.g);
        sb.append(" events:");
        sb.append(this.i);
        return sb.toString();
    }

    public c(i iVar, int i, int i2, String str, int i3) {
        this.a = iVar;
        this.c = i;
        this.d = i2;
        this.e = str;
        this.h = i3;
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public final List a(x xVar) {
        if (xVar == null || this.i.isEmpty()) {
            return null;
        }
        return (List) this.i.get(xVar);
    }

    public final void a(x xVar, String str) {
        List arrayList = (List) this.i.get(xVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.i.put(xVar, arrayList);
        }
        if (arrayList.contains(str)) {
            return;
        }
        arrayList.add(str);
    }
}
