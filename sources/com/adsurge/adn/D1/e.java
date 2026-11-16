package com.adsurge.adn.D1;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static void a(String str, long j, int i, b.InterfaceC0070b interfaceC0070b) {
        if (a.g()) {
            try {
                b.b(str, j, i, interfaceC0070b);
            } catch (LinkageError e) {
                a.a(e);
            } catch (RuntimeException | VirtualMachineError unused) {
            } catch (Throwable th) {
                a.b(th);
            }
        }
    }

    public static boolean a(String str) {
        if (!a.g()) {
            return false;
        }
        try {
            return b.c(str);
        } catch (LinkageError e) {
            a.a(e);
            return false;
        } catch (VirtualMachineError unused) {
            return false;
        } catch (Throwable th) {
            a.b(th);
            return false;
        }
    }

    public static com.adsurge.adn.C1.i a(Context context, com.adsurge.adn.C1.k kVar, boolean z) {
        if (!a.g()) {
            return null;
        }
        try {
            return new f(context, kVar, z);
        } catch (LinkageError e) {
            a.a(e);
            return null;
        } catch (VirtualMachineError unused) {
            return null;
        } catch (Throwable th) {
            a.b(th);
            return null;
        }
    }

    public static void a() {
        if (a.g()) {
            try {
                d.b();
            } catch (LinkageError e) {
                a.a(e);
            } catch (RuntimeException | VirtualMachineError unused) {
            } catch (Throwable th) {
                a.b(th);
            }
        }
    }
}
