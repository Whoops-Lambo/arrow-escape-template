package com.mbridge.msdk.foundation.controller;

import android.annotation.SuppressLint;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class c extends a {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile c t;

    @Override // com.mbridge.msdk.foundation.controller.a
    public void a(a.e eVar) {
    }

    public static c n() {
        if (t == null) {
            synchronized (c.class) {
                try {
                    if (t == null) {
                        t = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return t;
    }

    private c() {
    }
}
