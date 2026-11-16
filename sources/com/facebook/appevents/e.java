package com.facebook.appevents;

import java.io.ObjectStreamException;
import java.io.Serializable;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class e implements Serializable {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;

    private final Object readResolve() throws ObjectStreamException, JSONException {
        return new f(this.a, this.b, this.c, this.d);
    }

    public e(String str, String str2, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }
}
