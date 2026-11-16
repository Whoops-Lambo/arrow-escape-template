package com.vungle.ads.internal.util;

import android.app.usage.StorageStats;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.storage.StorageManager;
import android.webkit.URLUtil;
import defpackage.an0;
import defpackage.bn0;
import defpackage.cn0;
import defpackage.dn0;
import defpackage.vz2;
import defpackage.ym0;
import java.io.File;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class z {
    public static long a(Context context) {
        long length;
        context.getClass();
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Object systemService = context.getSystemService("storagestats");
                systemService.getClass();
                StorageStatsManager storageStatsManagerF = vz2.f(systemService);
                UUID unused = StorageManager.UUID_DEFAULT;
                StorageStats storageStatsQueryStatsForUid = storageStatsManagerF.queryStatsForUid(StorageManager.UUID_DEFAULT, Process.myUid());
                storageStatsQueryStatsForUid.getClass();
                return storageStatsQueryStatsForUid.getAppBytes() + storageStatsQueryStatsForUid.getDataBytes();
            } catch (Exception e) {
                boolean z = u.a;
                StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Error reading host app data size: ");
                sbA.append(e.getMessage());
                t.b("HostAppSize", sbA.toString());
            }
        }
        long length2 = 0;
        try {
            File file = new File(context.getApplicationInfo().dataDir, "app_webview");
            boolean zExists = file.exists();
            bn0 bn0Var = bn0.a;
            if (zExists && file.exists()) {
                ym0 ym0Var = new ym0(new an0(file, bn0Var, (dn0) null));
                length = 0;
                while (ym0Var.hasNext()) {
                    File file2 = (File) ym0Var.next();
                    if (file2.isFile()) {
                        length += file2.length();
                    }
                }
            } else {
                length = 0;
            }
            try {
                File cacheDir = context.getCacheDir();
                if (cacheDir.exists()) {
                    File fileD = cn0.D(cacheDir, "webviewCache");
                    if (fileD.exists()) {
                        ym0 ym0Var2 = new ym0(new an0(fileD, bn0Var, (dn0) null));
                        while (ym0Var2.hasNext()) {
                            File file3 = (File) ym0Var2.next();
                            if (file3.isFile()) {
                                length2 += file3.length();
                            }
                        }
                    }
                    return length + length2;
                }
                return length;
            } catch (Exception e2) {
                e = e2;
                length2 = length;
                boolean z2 = u.a;
                StringBuilder sbA2 = com.iab.omid.library.vungle.internal.l.a("Error reading WebView data size: ");
                sbA2.append(e.getMessage());
                t.b("WebViewSize", sbA2.toString());
                return length2;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public static boolean a(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return URLUtil.isHttpsUrl(str) || URLUtil.isHttpUrl(str);
    }

    public static boolean a() {
        return false;
    }
}
