package com.ironsource.sdk.controller;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C4950r4;
import com.ironsource.Nb;
import com.ironsource.mediationsdk.logger.IronLog;
import java.security.MessageDigest;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
final class s {
    private static final String b = "MD5";
    private String a;

    private String b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return a(messageDigest.digest());
        } catch (Exception e) {
            C4950r4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }

    public boolean a(String str, String str2, String str3) {
        try {
            return str3.equalsIgnoreCase(a(str + str2 + this.a));
        } catch (Exception e) {
            C4950r4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }

    public s(String str) {
        this.a = str;
    }

    public String b() {
        return this.a;
    }

    private String a(String str) {
        try {
            return Nb.a(str);
        } catch (Exception e) {
            C4950r4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return b(str);
        }
    }

    private String a(byte[] bArr) throws Exception {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            if (hexString.length() < 2) {
                hexString = "0".concat(hexString);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static String a() {
        return UUID.randomUUID().toString();
    }
}
