package com.fyber.inneractive.sdk.util;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j1 {
    public static String a(String str, int i) {
        return (i <= 0 || str.length() <= i) ? str : str.substring(0, i - 3).concat("...");
    }
}
