package com.adsurge.adn.p010c;

import com.adsurge.adn.p007b.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b {
    public static String a(Boolean bool) {
        return bool != null ? d.a(bool.booleanValue()) : "-777";
    }

    public static String a(Integer num) {
        return num != null ? String.valueOf(num) : "-777";
    }

    public static String a(Float f) {
        return f != null ? String.valueOf(f) : "-777";
    }

    public static String a(String str) {
        return str != null ? str : "-777";
    }
}
