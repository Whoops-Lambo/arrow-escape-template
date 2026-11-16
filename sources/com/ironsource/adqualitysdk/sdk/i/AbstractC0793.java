package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.dr0;
import defpackage.q63;
import defpackage.vq2;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᐨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0793 {
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static String m606(String str) {
        if (str == null) {
            return null;
        }
        try {
            byte[] bArrDigest = MessageDigest.getInstance(StringFog.decrypt("k6owpiQOBg==\n", "wOJxixY7MAQ=\n")).digest(str.getBytes(StringFog.decrypt("iU6uYWA=\n", "3BroTFjnoEA=\n")));
            StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
            for (byte b : bArrDigest) {
                sb.append(String.format(StringFog.decrypt("XMN4XA==\n", "efNKJGXqkPU=\n"), Integer.valueOf(b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            dr0.m(e);
            return null;
        } catch (NoSuchAlgorithmException e2) {
            vq2.n(StringFog.decrypt("e9QDb+vhHqtG8zZiuKJJ4kT9IC68\n", "KJxCQtnUKIs=\n"), e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static ArrayList m607(String str, String str2, boolean z) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = Pattern.compile(str2).matcher(str);
        loop0: while (matcher.find()) {
            if (matcher.groupCount() == 0) {
                arrayList.add(matcher.group());
                if (z) {
                    break;
                }
            } else {
                for (int i = 1; i <= matcher.groupCount(); i++) {
                    arrayList.add(matcher.group(i));
                    if (z) {
                        break loop0;
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static int m609(String str, String str2) {
        String[] strArrSplit = str.replaceAll(StringFog.decrypt("uGUxGlydKw==\n", "4zsBN2WzdkA=\n"), "").split(StringFog.decrypt("rDI=\n", "8Bx9x0OEMl8=\n"));
        String[] strArrSplit2 = str2.replaceAll(StringFog.decrypt("CI41OCPSoQ==\n", "U9AFFRr8/GU=\n"), "").split(StringFog.decrypt("D6M=\n", "U43poz2HVQU=\n"));
        int i = 0;
        while (i < strArrSplit.length && i < strArrSplit2.length && strArrSplit[i].equals(strArrSplit2[i])) {
            i++;
        }
        return (i >= strArrSplit.length || i >= strArrSplit2.length) ? Integer.signum(strArrSplit.length - strArrSplit2.length) : Integer.signum(Integer.valueOf(strArrSplit[i]).compareTo(Integer.valueOf(strArrSplit2[i])));
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m608(String str) {
        Handler handler = AbstractC4631n.f410;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return false;
        }
        try {
            new GZIPInputStream(new ByteArrayInputStream(Base64.decode(str, 0))).close();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m612(String str, int i) {
        return !TextUtils.isEmpty(str) && str.length() >= 1 && str.length() <= i;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m611(String str, String str2, boolean z) {
        if (z && !TextUtils.isEmpty(str2)) {
            if (!str2.startsWith(StringFog.decrypt("fA==\n", "IuJPAkAudro=\n"))) {
                str2 = q63.i("mcSqhaFRqpc=\n", "x5/29v0C970=\n", str2);
            }
            if (!str2.endsWith(StringFog.decrypt("vQ==\n", "mc0R8LyQWc8=\n"))) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                str2 = AbstractC1156.m868("meETtgGRLw==\n", "wr1g6lLMBXI=\n", sb);
            }
        }
        ArrayList arrayListM607 = m607(str, str2, true);
        if (arrayListM607.size() > 0) {
            return (String) arrayListM607.get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m610(String str) {
        if (str != null) {
            Handler handler = AbstractC4631n.f410;
            if (Looper.myLooper() != Looper.getMainLooper() && m608(str)) {
                int i = 0;
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 0));
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                    new ByteArrayOutputStream();
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i2 = gZIPInputStream.read(bArr, i, 8192 - i);
                        if (i2 == -1) {
                            gZIPInputStream.close();
                            byteArrayInputStream.close();
                            return new String(bArr, StringFog.decrypt("A20N+JI=\n", "VjlL1aoVEB4=\n"));
                        }
                        i += i2;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return null;
    }
}
