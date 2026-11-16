package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.ironsource.C4887nc;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class f {
    public static boolean a(String str) {
        return (str.equals(C4887nc.a) || str.equals("HEAD")) ? false : true;
    }

    public static boolean b(String str) {
        return !str.equals("PROPFIND");
    }

    public static boolean c(String str) {
        return str.equals("PROPFIND");
    }

    public static boolean d(String str) {
        return str.equals("POST") || str.equals(com.safedk.android.a.g.f) || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }
}
