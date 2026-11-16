package com.mbridge.msdk.foundation.controller.authoritycontroller;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;
import defpackage.q63;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class c extends b {
    private static volatile c j;

    public static boolean l() {
        return true;
    }

    public static c m() {
        if (j == null) {
            synchronized (c.class) {
                try {
                    if (j == null) {
                        j = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return j;
    }

    @Override // com.mbridge.msdk.foundation.controller.authoritycontroller.b
    public int a(g gVar, String str) {
        if (gVar == null) {
            gVar = i.b().a();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return gVar.A0();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return gVar.z0();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_SERIAL_ID)) {
            return gVar.B0();
        }
        return -1;
    }

    private c() {
        h();
    }

    public boolean c(String str) {
        boolean z;
        boolean z2;
        g gVarE = q63.e(i.b());
        if (gVarE == null) {
            gVarE = i.b().a();
            z = true;
        } else {
            z = false;
        }
        int iN0 = gVarE.n0();
        if (iN0 != 0 ? !(iN0 != 1 || a(gVarE, str) != 1) : !(a(str) != 1 || a(gVarE, str) != 1)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (str.equals(MBridgeConstans.AUTHORITY_OTHER)) {
            if (a(str) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID) && m().e() == 2) {
            if (!gVarE.L0() && !z && a(str) == 1) {
                return true;
            }
            return false;
        }
        return z2;
    }

    public static void c(boolean z) {
    }
}
