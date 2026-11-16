package io.p071bidmachine.util;

import defpackage.s71;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class o {
    public static final /* synthetic */ int a = 0;

    public static final String c(String str) {
        boolean zB;
        Boolean bool = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.length() == 0) {
            zB = false;
        } else {
            try {
                new URL(str);
                bool = Boolean.TRUE;
            } catch (Throwable unused) {
            }
            zB = s71.b(bool, Boolean.TRUE);
        }
        if (zB) {
            return str;
        }
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException | IllegalArgumentException unused2) {
            return str;
        }
    }

    static {
        "0123456789abcdef".toCharArray().getClass();
        "0123456789ABCDEF".toCharArray().getClass();
    }

    public static final Object a(Object obj) {
        if (obj == null || obj.equals(JSONObject.NULL)) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return p.e0((JSONObject) obj);
        }
        return obj instanceof JSONArray ? p.c0((JSONArray) obj) : obj;
    }

    public static final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof List) {
            return p.a0((List) obj);
        }
        return obj instanceof Map ? p.b0((Map) obj) : obj;
    }
}
