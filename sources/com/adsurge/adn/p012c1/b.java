package com.adsurge.adn.p012c1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class b {
    public static int a(Context context, File file, String str) {
        if (context != null && file != null && file.exists() && file.length() != 0) {
            try {
                PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 0);
                if (packageArchiveInfo != null && packageArchiveInfo.packageName != null) {
                    return (TextUtils.isEmpty(str) || TextUtils.equals(packageArchiveInfo.packageName, str)) ? 0 : 2;
                }
                file.getName();
            } catch (Throwable unused) {
            }
        }
        return 1;
    }
}
