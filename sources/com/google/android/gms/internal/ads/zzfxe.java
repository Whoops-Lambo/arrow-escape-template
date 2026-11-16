package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfxe implements zzfye {
    @Override // com.google.android.gms.internal.ads.zzfye
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzfye
    public final void a(String str, JSONObject jSONObject) {
        if ("attest".equals(str)) {
            try {
                String string = jSONObject.getString("mechanism");
                String string2 = jSONObject.getString("version");
                JSONObject jSONObject2 = jSONObject.getJSONObject("attestationArgs");
                ExecutorService executorService = zzfyt.a;
                try {
                    HashMap map = new HashMap();
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        Object obj = jSONObject2.get(next);
                        if (obj instanceof String) {
                            map.put(next, (String) obj);
                        }
                    }
                    map.put("version", string2);
                    zzfxd.a(zzfxw.b.a.getApplicationContext(), string, new zzfwz(map));
                } catch (Exception e) {
                    throw new RuntimeException("Failed to parse JSON to Map", e);
                }
            } catch (Exception e2) {
                zzfyu.a("Error processing attestation request", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfye
    public final String zzg() {
        return "omidJsAttestationListener";
    }
}
