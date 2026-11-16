package com.bytedance.sdk.component.adexpress.kgy.ahm;

import com.ironsource.G5;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class fi {
    private static com.bytedance.sdk.component.adexpress.kgy.rz.kgy kgy;

    public static synchronized com.bytedance.sdk.component.adexpress.kgy.rz.kgy ahm() {
        return kgy;
    }

    public static void kgy() {
        FileInputStream fileInputStream;
        Throwable th;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File file = new File(ct.fi(), "temp_pkg_info.json");
                long length = file.length();
                Long lValueOf = Long.valueOf(length);
                if (length > 0 && file.exists() && file.isFile()) {
                    byte[] bArr = new byte[lValueOf.intValue()];
                    fileInputStream = new FileInputStream(file);
                    try {
                        fileInputStream.read(bArr);
                        com.bytedance.sdk.component.adexpress.kgy.rz.kgy kgyVarKgy = com.bytedance.sdk.component.adexpress.kgy.rz.kgy.kgy(PangleNetworkBridge.jsonObjectInit(new String(bArr, G5.O)));
                        if (kgyVarKgy != null) {
                            kgy = kgyVarKgy;
                            kgyVarKgy.rz();
                        }
                        fileInputStream2 = fileInputStream;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJsyYdD2VjCEqErU+s=", "bes/hgqzZw==", "UuAkgQ==", 45);
                            if (fileInputStream != null) {
                                fileInputStream.close();
                                return;
                            }
                            return;
                        } catch (Throwable th3) {
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e) {
                                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJsyYdD2VjCEqErU+s=", "bes/hgqzZw==", "UuAkgQ==", 51);
                                }
                            }
                            throw th3;
                        }
                    }
                }
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
            } catch (Throwable th4) {
                fileInputStream = null;
                th = th4;
            }
        } catch (IOException e2) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e2, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJsyYdD2VjCEqErU+s=", "bes/hgqzZw==", "UuAkgQ==", 51);
        }
    }

    public static void rz() {
        rz.kgy(ct.fi(), ahm(), "temp_pkg_info.json");
    }

    public static void uq() {
        rz.ahm(ct.fi(), ahm(), "temp_pkg_info.json");
        kgy = null;
    }

    public static boolean ahm(com.bytedance.sdk.component.adexpress.kgy.rz.kgy kgyVar) {
        return rz.rz(ahm(), kgyVar);
    }

    public static synchronized void kgy(com.bytedance.sdk.component.adexpress.kgy.rz.kgy kgyVar) {
        if (kgyVar != null) {
            if (kgyVar.fi()) {
                kgy = kgyVar;
            }
        }
    }

    public static boolean kgy(String str) {
        return rz.kgy(ahm(), str);
    }
}
