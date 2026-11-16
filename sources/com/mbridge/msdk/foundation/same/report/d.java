package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C4664b4;
import com.ironsource.G5;
import com.mbridge.msdk.foundation.tools.m0;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class d implements com.mbridge.msdk.tracker.d {
    private static StringBuilder a(List<com.mbridge.msdk.tracker.i> list) {
        com.mbridge.msdk.tracker.e eVarD;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            com.mbridge.msdk.tracker.i iVar = list.get(i);
            if (iVar != null && (eVarD = iVar.d()) != null) {
                JSONObject jSONObjectH = eVarD.h();
                c.a(jSONObjectH);
                if (jSONObjectH == null) {
                    jSONObjectH = new JSONObject();
                }
                try {
                    try {
                        jSONObjectH.put("ts", eVarD.k());
                        jSONObjectH.put("rts", System.currentTimeMillis());
                        String strH = iVar.h();
                        if (!TextUtils.isEmpty(strH)) {
                            jSONObjectH.put("reason_lib", strH);
                        }
                        int iG = iVar.g() - 1;
                        if (iG >= 1) {
                            jSONObjectH.put("retryed", iG);
                        }
                        long jD = eVarD.d();
                        if (jD > 0) {
                            jSONObjectH.put("duration", jD);
                        }
                    } catch (Exception e) {
                        if (com.mbridge.msdk.tracker.a.a) {
                            Log.e("TrackManager", "decorateRequestParams: ", e);
                        }
                    }
                    sb.append(b(jSONObjectH));
                    if (i < list.size() - 1) {
                        sb.append("\n");
                    }
                } catch (Throwable th) {
                    sb.append(b(jSONObjectH));
                    throw th;
                }
            }
        }
        return sb;
    }

    public static String b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> itKeys = jSONObject.keys();
        int i = 0;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            i++;
            if (i <= jSONObject.length() - 1) {
                sb.append(next);
                sb.append("=");
                sb.append(a(String.valueOf(jSONObject.opt(next))));
                sb.append(C4664b4.j.c);
            } else {
                sb.append(next);
                sb.append("=");
                sb.append(a(String.valueOf(jSONObject.opt(next))));
            }
        }
        return sb.toString();
    }

    @Override // com.mbridge.msdk.tracker.d
    public Map<String, String> a(com.mbridge.msdk.tracker.m mVar, List<com.mbridge.msdk.tracker.i> list, JSONObject jSONObject) {
        Map<String, String> mapA;
        StringBuilder sbA;
        if (list != null && !list.isEmpty()) {
            try {
                c.a(jSONObject);
                mapA = a(jSONObject);
                if (mapA == null) {
                    try {
                        mapA = new HashMap();
                    } catch (Exception unused) {
                        sbA = null;
                        a(mapA, sbA);
                        return null;
                    } catch (Throwable unused2) {
                        sbA = null;
                        a(mapA, sbA);
                        return null;
                    }
                }
                sbA = a(list);
                try {
                    mapA.put("tun", String.valueOf(m0.B()));
                    mapA.put("data", sbA.toString());
                    return mapA;
                } catch (Exception unused3) {
                    a(mapA, sbA);
                    return null;
                } catch (Throwable unused4) {
                    a(mapA, sbA);
                    return null;
                }
            } catch (Exception unused5) {
                mapA = null;
                sbA = null;
            } catch (Throwable unused6) {
                mapA = null;
                sbA = null;
            }
        }
        return null;
    }

    public static Map<String, String> a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, String.valueOf(jSONObject.opt(next)));
        }
        return map;
    }

    private static void a(Map<String, String> map, StringBuilder sb) {
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return URLEncoder.encode(str, G5.O);
        } catch (Exception unused) {
            return str;
        }
    }
}
