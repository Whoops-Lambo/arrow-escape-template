package com.bytedance.adsdk.ahm.uq;

import android.content.Context;
import android.util.Pair;
import com.bytedance.adsdk.ahm.at;
import com.ironsource.G5;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class fi {
    private final noq ahm;
    private final yo kgy;

    private com.bytedance.adsdk.ahm.yo ahm(Context context, String str, String str2) {
        yo yoVar;
        Pair<rz, InputStream> pairKgy;
        if (str2 == null || (yoVar = this.kgy) == null || (pairKgy = yoVar.kgy(str)) == null) {
            return null;
        }
        rz rzVar = (rz) pairKgy.first;
        InputStream inputStream = (InputStream) pairKgy.second;
        at<com.bytedance.adsdk.ahm.yo> atVarKgy = rzVar == rz.ZIP ? com.bytedance.adsdk.ahm.fi.kgy(context, new ZipInputStream(inputStream), str2) : com.bytedance.adsdk.ahm.fi.ahm(inputStream, str2);
        if (atVarKgy.kgy() != null) {
            return atVarKgy.kgy();
        }
        return null;
    }

    private at<com.bytedance.adsdk.ahm.yo> rz(Context context, String str, String str2) {
        Closeable closeable = null;
        try {
            try {
                uq uqVarKgy = this.ahm.kgy(str);
                if (!uqVarKgy.kgy()) {
                    at<com.bytedance.adsdk.ahm.yo> atVar = new at<>(new IllegalArgumentException(uqVarKgy.uq()));
                    try {
                        uqVarKgy.close();
                    } catch (IOException unused) {
                    }
                    return atVar;
                }
                at<com.bytedance.adsdk.ahm.yo> atVarKgy = kgy(context, str, uqVarKgy.ahm(), uqVarKgy.rz(), str2);
                atVarKgy.kgy();
                try {
                    uqVarKgy.close();
                } catch (IOException unused2) {
                }
                return atVarKgy;
            } catch (Exception e) {
                at<com.bytedance.adsdk.ahm.yo> atVar2 = new at<>(e);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException unused3) {
                    }
                }
                return atVar2;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                throw th;
            }
            try {
                closeable.close();
                throw th;
            } catch (IOException unused4) {
                throw th;
            }
        }
    }

    private at<com.bytedance.adsdk.ahm.yo> kgy(Context context, String str, InputStream inputStream, String str2, String str3) throws IOException {
        at<com.bytedance.adsdk.ahm.yo> atVarKgy;
        rz rzVar;
        yo yoVar;
        if (str2 == null) {
            str2 = G5.M;
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            rz rzVar2 = rz.ZIP;
            atVarKgy = kgy(context, str, inputStream, str3);
            rzVar = rzVar2;
        } else {
            rzVar = rz.JSON;
            atVarKgy = kgy(str, inputStream, str3);
        }
        if (str3 != null && atVarKgy.kgy() != null && (yoVar = this.kgy) != null) {
            yoVar.kgy(str, rzVar);
        }
        return atVarKgy;
    }

    public fi(yo yoVar, noq noqVar) {
        this.kgy = yoVar;
        this.ahm = noqVar;
    }

    public at<com.bytedance.adsdk.ahm.yo> kgy(Context context, String str, String str2) {
        com.bytedance.adsdk.ahm.yo yoVarAhm = ahm(context, str, str2);
        if (yoVarAhm != null) {
            return new at<>(yoVarAhm);
        }
        return rz(context, str, str2);
    }

    private at<com.bytedance.adsdk.ahm.yo> kgy(Context context, String str, InputStream inputStream, String str2) throws IOException {
        yo yoVar;
        if (str2 != null && (yoVar = this.kgy) != null) {
            return com.bytedance.adsdk.ahm.fi.kgy(context, new ZipInputStream(new FileInputStream(yoVar.kgy(str, inputStream, rz.ZIP))), str);
        }
        return com.bytedance.adsdk.ahm.fi.kgy(context, new ZipInputStream(inputStream), (String) null);
    }

    private at<com.bytedance.adsdk.ahm.yo> kgy(String str, InputStream inputStream, String str2) throws IOException {
        yo yoVar;
        if (str2 != null && (yoVar = this.kgy) != null) {
            return com.bytedance.adsdk.ahm.fi.ahm(new FileInputStream(yoVar.kgy(str, inputStream, rz.JSON).getAbsolutePath()), str);
        }
        return com.bytedance.adsdk.ahm.fi.ahm(inputStream, (String) null);
    }
}
