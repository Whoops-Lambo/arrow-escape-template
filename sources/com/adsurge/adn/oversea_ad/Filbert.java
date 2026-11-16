package com.adsurge.adn.oversea_ad;

import android.content.Context;
import android.content.pm.Signature;
import android.os.IBinder;
import android.os.Parcel;
import com.inmobi.media.core.config.models.AdConfig;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class Filbert extends Fig {
    public static final String a = CanisMinor.a(CanisMinor.i);

    @Override // com.adsurge.adn.oversea_ad.Fig
    public final String a(IBinder iBinder) {
        Context context;
        Signature[] signatureArr;
        synchronized (Cconst.class) {
            context = Cconst.a;
        }
        String packageName = context.getPackageName();
        String string = null;
        try {
            signatureArr = context.getPackageManager().getPackageInfo(packageName, 64).signatures;
        } catch (Throwable unused) {
            signatureArr = null;
        }
        if (signatureArr != null && signatureArr.length > 0) {
            byte[] byteArray = signatureArr[0].toByteArray();
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                if (messageDigest != null) {
                    byte[] bArrDigest = messageDigest.digest(byteArray);
                    StringBuilder sb = new StringBuilder();
                    for (byte b : bArrDigest) {
                        sb.append(Integer.toHexString((b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | 256).substring(1, 3));
                    }
                    string = sb.toString();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        String strA = CanisMinor.a(CanisMinor.j);
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(a);
            parcelObtain.writeString(packageName);
            parcelObtain.writeString(string);
            parcelObtain.writeString(strA);
            iBinder.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
