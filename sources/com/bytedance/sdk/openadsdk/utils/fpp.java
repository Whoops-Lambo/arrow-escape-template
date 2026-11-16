package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class fpp {
    private static List<String> ahm() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.INTERNET");
        arrayList.add("android.permission.ACCESS_NETWORK_STATE");
        arrayList.add("android.permission.WAKE_LOCK");
        return arrayList;
    }

    public static void kgy() {
        Context contextKgy = com.bytedance.sdk.openadsdk.core.xh.kgy();
        if (contextKgy != null && com.bytedance.sdk.component.utils.vs.rz()) {
            String packageName = contextKgy.getPackageName();
            int i = contextKgy.getApplicationInfo().targetSdkVersion;
            try {
                String[] strArr = contextKgy.getPackageManager().getPackageInfo(packageName, 4096).requestedPermissions;
                if (strArr != null && strArr.length > 0) {
                    List<String> listAhm = ahm();
                    for (String str : strArr) {
                        if (str != null) {
                            listAhm.remove(str);
                        }
                    }
                    if (!listAhm.isEmpty()) {
                        for (String str2 : listAhm) {
                        }
                    }
                }
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "cuAkgSC0bMSLT8U=", "WOYolgg=", 60);
            }
        }
    }
}
