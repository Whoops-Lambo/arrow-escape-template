package com.bytedance.sdk.openadsdk.ay;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class ct {
    protected static String ahm = null;
    public static int at = 32;
    protected static long ct = 15360;
    public static int fi = 2;
    public static int gf = 4;
    protected static String kgy = "images";
    public static int noq = 0;
    public static int nu = 16;
    public static int ra = 8;
    protected static int rz = 1;
    protected static int uq = 30;
    public static int yo = 1;

    public static float ahm(Context context) {
        return context == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : context.getResources().getDisplayMetrics().density;
    }

    public static boolean kgy(Context context, int i) {
        boolean zKgy;
        boolean zKgy2;
        if (noq == 0) {
            if (Build.VERSION.SDK_INT >= 33) {
                zKgy = kgy(context, "android.permission.READ_MEDIA_IMAGES");
                zKgy2 = true;
            } else {
                zKgy = kgy(context, "android.permission.READ_EXTERNAL_STORAGE");
                zKgy2 = kgy(context, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            boolean zKgy3 = kgy(context, "android.permission.CAMERA");
            boolean zKgy4 = kgy(context, "android.permission.RECORD_AUDIO");
            PackageManager packageManager = context.getPackageManager();
            if (zKgy && zKgy2) {
                noq |= yo;
            }
            if (zKgy3 && packageManager.hasSystemFeature("android.hardware.camera")) {
                noq |= fi;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.gyroscope")) {
                noq |= gf;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.accelerometer")) {
                noq |= ra;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.compass")) {
                noq |= nu;
            }
            if (zKgy4 && packageManager.hasSystemFeature("android.hardware.microphone")) {
                noq |= at;
            }
        }
        return (noq & i) != 0;
    }

    public static boolean ahm(Context context, String str) {
        return context.checkSelfPermission(str) == 0;
    }

    public static Bitmap kgy(String str) {
        byte[] bArrDecode = Base64.decode(str, 2);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    public static boolean kgy(Context context, String str) {
        return false;
    }

    public static boolean kgy(Context context) {
        boolean z;
        boolean z2;
        if (Build.VERSION.SDK_INT >= 33) {
            z = context.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0;
        } else {
            z = context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0;
            if (context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                z2 = false;
            }
            return !z2 && z;
        }
        z2 = true;
        if (z2) {
        }
    }
}
