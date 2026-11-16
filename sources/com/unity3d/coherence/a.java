package com.unity3d.coherence;

import android.content.Context;
import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public static volatile a c;
    public final b a;
    public final long b;

    public a(Context context) {
        long jInit = CoherenceBridge.init(new Coherence(context, context.getSharedPreferences("com.unity3d.coherence.prefs", 0)), "0.1.0", 2);
        if (jInit != 0) {
            this.b = jInit;
            this.a = new b(this);
        } else {
            e32.i("unity_coherence_library_init returned null (source=2)");
            throw null;
        }
    }
}
