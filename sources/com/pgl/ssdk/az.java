package com.pgl.ssdk;

import android.os.HandlerThread;

/* JADX INFO: loaded from: classes6.dex */
public class az {
    private final a2<a0> a;
    private a3 b;
    private a3 c;

    public static class b {
        private static final az a = new az();
    }

    private a0 a(a3.a aVar, String str) {
        try {
            HandlerThread handlerThread = new HandlerThread(str);
            handlerThread.start();
            return new a0(handlerThread, aVar);
        } catch (Throwable unused) {
            return null;
        }
    }

    public a3 b() {
        if (this.c == null) {
            synchronized (az.class) {
                try {
                    if (this.c == null) {
                        this.c = a("pags_net_handler");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.c;
    }

    public a3 c() {
        if (this.b == null) {
            synchronized (az.class) {
                try {
                    if (this.b == null) {
                        this.b = a("pags_ssdk_handler");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.b;
    }

    private az() {
        this.a = a2.a(2);
    }

    public a3 a(String str) {
        return b(null, str);
    }

    public static az a() {
        return b.a;
    }

    public a3 b(a3.a aVar, String str) {
        a0 a0Var = (a0) this.a.a();
        if (a0Var == null) {
            return a(aVar, str);
        }
        a0Var.a(aVar);
        a0Var.a(str);
        return a0Var;
    }
}
