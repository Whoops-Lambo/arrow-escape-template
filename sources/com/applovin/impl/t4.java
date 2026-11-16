package com.applovin.impl;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class t4 {
    private final String a;
    private Map b;

    public static t4 a(String str) {
        return a(str, null);
    }

    public String b() {
        return this.a;
    }

    public String toString() {
        return "PendingReward{result='" + this.a + "'params='" + this.b + "'}";
    }

    private t4(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public static t4 a(String str, Map map) {
        return new t4(str, map);
    }

    public Map a() {
        return this.b;
    }
}
