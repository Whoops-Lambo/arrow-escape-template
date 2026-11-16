package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.g4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class C4754g4 {
    public static final String a = "SSA_CORE.SDKController.runFunction";

    public static String a(C4772h4 c4772h4) {
        return String.format("%1$s('%2$s%3$s'%4$s)", a, c4772h4.b(), a(c4772h4.c()), b(c4772h4));
    }

    private static String b(C4772h4 c4772h4) {
        if (c4772h4.d() != null && c4772h4.a() != null) {
            return String.format(", '%1$s', '%2$s'", c4772h4.d(), c4772h4.a());
        }
        return "";
    }

    private static String a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            return jSONObject.toString();
        }
        return "";
    }
}
