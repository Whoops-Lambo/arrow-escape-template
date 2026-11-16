package com.mbridge.msdk.dycreator.error;

import defpackage.h50;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class a {
    private int a;
    private String b;

    public String toString() {
        return h50.l(new StringBuilder("DyError{errorCode="), this.a, '}');
    }

    public a(b bVar) {
        if (bVar != null) {
            this.a = bVar.f();
            this.b = bVar.g();
        }
    }

    public a(int i, String str) {
        this.a = i;
        this.b = str;
    }
}
