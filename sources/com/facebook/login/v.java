package com.facebook.login;

import defpackage.kk2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class v {
    public static boolean a(String str) {
        return str != null && (kk2.L(str, "publish", false) || kk2.L(str, "manage", false) || x.c.contains(str));
    }
}
