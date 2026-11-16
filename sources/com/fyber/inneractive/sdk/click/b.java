package com.fyber.inneractive.sdk.click;

import defpackage.n30;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class b {
    public final q a;
    public final Throwable b;
    public final String c;
    public final String d;
    public long e;
    public final ArrayList f = new ArrayList();

    public final String toString() {
        q qVar = this.a;
        if (qVar == q.FAILED) {
            Throwable th = this.b;
            return n30.y("Open result: Failed! error: ", th != null ? th.getMessage() : "none");
        }
        return "Open result: Success! target: " + qVar + " method: " + this.c;
    }

    public b(String str, q qVar, String str2, Exception exc) {
        this.d = str;
        this.a = qVar;
        this.c = str2;
        this.b = exc;
    }
}
