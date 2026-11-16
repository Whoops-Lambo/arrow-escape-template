package com.adsurge.adn.x1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Base64;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class n {
    public static Bitmap a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                byte[] bArrDecode = Base64.decode(str, 0);
                if (bArrDecode != null && bArrDecode.length > 0) {
                    return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }
}
