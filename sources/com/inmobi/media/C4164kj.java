package com.inmobi.media;

import defpackage.f02;
import defpackage.p32;
import kotlin.reflect.KProperty;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.kj, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4164kj {
    public static final /* synthetic */ KProperty[] a;

    static {
        f02 f02Var = new f02(C4164kj.class, "areImraidLogsEnabled", "getAreImraidLogsEnabled()Z", 0);
        p32.a.getClass();
        a = new KProperty[]{f02Var};
    }

    public static JSONObject a(String str, String str2) {
        str.getClass();
        str2.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("browser", str);
        jSONObject.put("event", str2);
        return jSONObject;
    }
}
