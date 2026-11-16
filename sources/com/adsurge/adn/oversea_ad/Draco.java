package com.adsurge.adn.oversea_ad;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipFile;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Draco {
    public static String a(Context context, String str) {
        String nodeValue;
        ZipFile zipFile;
        PackageInfo packageArchiveInfo;
        int i = 0;
        InputStream inputStream = null;
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            nodeValue = (packageManager == null || (packageArchiveInfo = packageManager.getPackageArchiveInfo(str, 0)) == null) ? null : packageArchiveInfo.packageName;
        } catch (Throwable unused) {
        }
        if (nodeValue != null) {
            return nodeValue;
        }
        try {
            try {
                zipFile = new ZipFile(str);
                try {
                    inputStream = zipFile.getInputStream(zipFile.getEntry("AndroidManifest.xml"));
                    nodeValue = new Cimplements().a(inputStream).getChildNodes().item(0).getAttributes().getNamedItem("package").getNodeValue();
                    Octans.a(inputStream);
                    AtomicReference atomicReference = Aquila.a;
                    try {
                        i = Integer.parseInt(Build.VERSION.SDK);
                    } catch (Throwable unused2) {
                    }
                    if (i >= 19) {
                        Octans.a(zipFile);
                    } else {
                        zipFile.close();
                    }
                } catch (Throwable unused3) {
                    Octans.a(inputStream);
                    AtomicReference atomicReference2 = Aquila.a;
                    try {
                        i = Integer.parseInt(Build.VERSION.SDK);
                    } catch (Throwable unused4) {
                    }
                    if (i >= 19) {
                        Octans.a(zipFile);
                    } else {
                        zipFile.close();
                    }
                }
            } catch (Throwable unused5) {
                zipFile = null;
            }
        } catch (Throwable unused6) {
        }
        return nodeValue;
    }
}
