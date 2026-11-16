package com.adsurge.adn.oversea_ad;

import com.singular.sdk.internal.Constants;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Strawberry {
    public static volatile x0 a;

    public static v0 a(String str) {
        v0 v0VarA;
        w0 w0Var = new w0(str, str, 5000L);
        try {
            if (a == null) {
                synchronized (Strawberry.class) {
                    try {
                        if (a == null) {
                            a = a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            v0VarA = a.a(w0Var);
        } catch (Exception e) {
            a(e);
            v0VarA = null;
        }
        return v0VarA == null ? new v0("", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY) : v0VarA;
    }

    public static void a(Exception exc) {
        if (((exc instanceof IOException) || (exc instanceof InterruptedException)) && a != null) {
            synchronized (Strawberry.class) {
                try {
                    if (a != null) {
                        x0 x0Var = a;
                        x0Var.getClass();
                        try {
                            x0Var.a();
                        } catch (Throwable unused) {
                        }
                        a = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static x0 a() {
        try {
            return new x0();
        } catch (Exception unused) {
            return null;
        }
    }
}
