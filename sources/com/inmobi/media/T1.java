package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class T1 extends Ca {
    public final int g;
    public final String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T1(String str, int i, String str2) {
        super("AppExitReasonReporting", "AppExitReasonEvent", AbstractC4447un.a("reason - " + i + " description - " + (str == null ? "ApplicationExit" : str), str2));
        str2.getClass();
        this.g = i;
        this.h = str2;
    }
}
