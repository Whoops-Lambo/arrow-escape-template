package com.mbridge.msdk.foundation.same.net.exception;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class a extends Exception {
    public int a;
    public String b;
    public com.mbridge.msdk.foundation.same.net.toolbox.a c;

    public a(int i, com.mbridge.msdk.foundation.same.net.toolbox.a aVar, String str) {
        this.a = i;
        this.c = aVar;
        this.b = str;
    }

    public a(int i, com.mbridge.msdk.foundation.same.net.toolbox.a aVar) {
        this.a = i;
        this.c = aVar;
    }
}
