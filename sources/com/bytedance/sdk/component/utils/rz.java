package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class rz {
    private static HashMap<String, ArrayList<String>> kgy = new HashMap<>();

    private static Signature[] ahm(Context context, String str) {
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, PackageManager.PackageInfoFlags.of(134217728L));
                if (packageInfo.signingInfo != null) {
                    return packageInfo.signingInfo.getApkContentsSigners();
                }
                return null;
            }
            PackageInfo packageInfo2 = context.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo2 != null) {
                return packageInfo2.signatures;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static ArrayList<String> kgy(Context context, String str) {
        ArrayList<String> arrayList = null;
        if (context != null && str != null) {
            String packageName = context.getPackageName();
            if (packageName == null) {
                return null;
            }
            if (kgy.get(str) != null) {
                return kgy.get(str);
            }
            arrayList = new ArrayList<>();
            try {
                Signature[] signatureArrAhm = ahm(context, packageName);
                if (signatureArrAhm != null) {
                    for (Signature signature : signatureArrAhm) {
                        String strKgy = "error!";
                        if (SameMD5.TAG.equals(str)) {
                            strKgy = kgy(signature, SameMD5.TAG);
                        } else if ("SHA1".equals(str)) {
                            strKgy = kgy(signature, "SHA1");
                        } else if ("SHA256".equals(str)) {
                            strKgy = kgy(signature, "SHA256");
                        }
                        arrayList.add(strKgy);
                    }
                }
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "ev49pgq7Z86OTQ==", "XOs5pgq7Z+6OTNg=", 57);
            }
            kgy.put(str, arrayList);
        }
        return arrayList;
    }

    public static String kgy(Context context) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arrayListKgy = kgy(context, "SHA1");
        if (arrayListKgy != null && arrayListKgy.size() != 0) {
            for (int i = 0; i < arrayListKgy.size(); i++) {
                sb.append(arrayListKgy.get(i));
                if (i < arrayListKgy.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    private static String kgy(Signature signature, String str) {
        byte[] byteArray = signature.toByteArray();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            if (messageDigest == null) {
                return "error!";
            }
            byte[] bArrDigest = messageDigest.digest(byteArray);
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(Integer.toHexString((b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | 256).substring(1, 3).toUpperCase());
                sb.append(":");
            }
            return sb.substring(0, sb.length() - 1).toString();
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "ev49pgq7Z86OTQ==", "XOs5pgq7Z8aUX8VYrgi0LWj6P5wNuw==", 159);
            return "error!";
        }
    }
}
