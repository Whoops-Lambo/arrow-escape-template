package com.google.android.gms.internal.ads;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzidu {
    public static String a(zzidg zzidgVar) throws GeneralSecurityException {
        int iOrdinal = zzidgVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal == 4) {
                            return "SHA-512";
                        }
                        throw new GeneralSecurityException("Unsupported hash ".concat(zzidgVar.toString()));
                    }
                    return "SHA-384";
                }
                return "SHA-256";
            }
            return "SHA-224";
        }
        return AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1;
    }
}
