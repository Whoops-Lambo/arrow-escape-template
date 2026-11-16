package com.google.android.gms.internal.consent_sdk;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzct {
    public static String a;

    public static synchronized String a(Context context) {
        String str;
        try {
            if (a == null) {
                ContentResolver contentResolver = context.getContentResolver();
                String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
                if (string == null || zzdb.a()) {
                    string = "emulator";
                }
                int i = 0;
                while (true) {
                    if (i < 3) {
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                            messageDigest.update(string.getBytes());
                            str = String.format("%032X", new BigInteger(1, messageDigest.digest()));
                            break;
                        } catch (ArithmeticException unused) {
                            str = "";
                            break;
                        } catch (NoSuchAlgorithmException unused2) {
                            i++;
                        }
                    }
                    str = "";
                    break;
                }
                a = str;
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }
}
