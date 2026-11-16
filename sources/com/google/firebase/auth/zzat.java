package com.google.firebase.auth;

import com.google.android.gms.internal.p002firebaseauthapi.zzbd;
import com.google.android.gms.internal.p002firebaseauthapi.zzbh;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.dp1;
import defpackage.ey3;
import defpackage.yy3;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzat {
    public abstract String a();

    public abstract String b();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final String c() {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        int i = zzbh.a;
        int i2 = yy3.c;
        dp1 dp1Var = new dp1(1);
        String strB = b();
        Charset charset = StandardCharsets.UTF_8;
        dp1Var.d(strB);
        dp1Var.d(a());
        dp1Var.f();
        ByteBuffer byteBuffer = (ByteBuffer) dp1Var.a;
        byteBuffer.flip();
        if (byteBuffer.remaining() > 0) {
            dp1Var.f = byteBuffer.remaining() + dp1Var.f;
            char c = 24;
            long j8 = 0;
            switch (byteBuffer.remaining()) {
                case 1:
                    j = 0;
                    j7 = j ^ ((long) (byteBuffer.get(0) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
                    dp1Var.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dp1Var.d;
                    dp1Var.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 2:
                    j2 = 0;
                    j = j2 ^ (((long) (byteBuffer.get(1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 8);
                    j7 = j ^ ((long) (byteBuffer.get(0) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
                    dp1Var.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dp1Var.d;
                    dp1Var.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 3:
                    j3 = 0;
                    j2 = j3 ^ (((long) (byteBuffer.get(2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 16);
                    j = j2 ^ (((long) (byteBuffer.get(1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 8);
                    j7 = j ^ ((long) (byteBuffer.get(0) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
                    dp1Var.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dp1Var.d;
                    dp1Var.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 4:
                    c = 24;
                    j4 = 0;
                    j3 = j4 ^ (((long) (byteBuffer.get(3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << c);
                    j2 = j3 ^ (((long) (byteBuffer.get(2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 16);
                    j = j2 ^ (((long) (byteBuffer.get(1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 8);
                    j7 = j ^ ((long) (byteBuffer.get(0) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
                    dp1Var.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dp1Var.d;
                    dp1Var.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 5:
                    j5 = 0;
                    j4 = j5 ^ (((long) (byteBuffer.get(4) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 32);
                    j3 = j4 ^ (((long) (byteBuffer.get(3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << c);
                    j2 = j3 ^ (((long) (byteBuffer.get(2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 16);
                    j = j2 ^ (((long) (byteBuffer.get(1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 8);
                    j7 = j ^ ((long) (byteBuffer.get(0) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
                    dp1Var.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dp1Var.d;
                    dp1Var.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 6:
                    j6 = 0;
                    j5 = (((long) (byteBuffer.get(5) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 40) ^ j6;
                    j4 = j5 ^ (((long) (byteBuffer.get(4) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 32);
                    j3 = j4 ^ (((long) (byteBuffer.get(3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << c);
                    j2 = j3 ^ (((long) (byteBuffer.get(2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 16);
                    j = j2 ^ (((long) (byteBuffer.get(1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 8);
                    j7 = j ^ ((long) (byteBuffer.get(0) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
                    dp1Var.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dp1Var.d;
                    dp1Var.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 7:
                    j6 = ((long) (byteBuffer.get(6) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 48;
                    j5 = (((long) (byteBuffer.get(5) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 40) ^ j6;
                    j4 = j5 ^ (((long) (byteBuffer.get(4) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 32);
                    j3 = j4 ^ (((long) (byteBuffer.get(3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << c);
                    j2 = j3 ^ (((long) (byteBuffer.get(2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 16);
                    j = j2 ^ (((long) (byteBuffer.get(1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 8);
                    j7 = j ^ ((long) (byteBuffer.get(0) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
                    dp1Var.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dp1Var.d;
                    dp1Var.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 8:
                    j7 = byteBuffer.getLong();
                    dp1Var.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dp1Var.d;
                    dp1Var.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 9:
                    j8 ^= (long) (byteBuffer.get(8) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    j7 = byteBuffer.getLong();
                    dp1Var.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dp1Var.d;
                    dp1Var.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 10:
                    j8 ^= ((long) (byteBuffer.get(9) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 8;
                    j8 ^= (long) (byteBuffer.get(8) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    j7 = byteBuffer.getLong();
                    dp1Var.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dp1Var.d;
                    dp1Var.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 11:
                    j8 ^= ((long) (byteBuffer.get(10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 16;
                    j8 ^= ((long) (byteBuffer.get(9) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 8;
                    j8 ^= (long) (byteBuffer.get(8) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    j7 = byteBuffer.getLong();
                    dp1Var.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dp1Var.d;
                    dp1Var.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 12:
                    j8 ^= ((long) (byteBuffer.get(11) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 24;
                    j8 ^= ((long) (byteBuffer.get(10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 16;
                    j8 ^= ((long) (byteBuffer.get(9) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 8;
                    j8 ^= (long) (byteBuffer.get(8) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    j7 = byteBuffer.getLong();
                    dp1Var.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dp1Var.d;
                    dp1Var.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 13:
                    j8 ^= ((long) (byteBuffer.get(12) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 32;
                    j8 ^= ((long) (byteBuffer.get(11) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 24;
                    j8 ^= ((long) (byteBuffer.get(10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 16;
                    j8 ^= ((long) (byteBuffer.get(9) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 8;
                    j8 ^= (long) (byteBuffer.get(8) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    j7 = byteBuffer.getLong();
                    dp1Var.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dp1Var.d;
                    dp1Var.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 14:
                    j8 ^= ((long) (byteBuffer.get(13) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 40;
                    j8 ^= ((long) (byteBuffer.get(12) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 32;
                    j8 ^= ((long) (byteBuffer.get(11) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 24;
                    j8 ^= ((long) (byteBuffer.get(10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 16;
                    j8 ^= ((long) (byteBuffer.get(9) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 8;
                    j8 ^= (long) (byteBuffer.get(8) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    j7 = byteBuffer.getLong();
                    dp1Var.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dp1Var.d;
                    dp1Var.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 15:
                    j8 = ((long) (byteBuffer.get(14) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 48;
                    j8 ^= ((long) (byteBuffer.get(13) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 40;
                    j8 ^= ((long) (byteBuffer.get(12) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 32;
                    j8 ^= ((long) (byteBuffer.get(11) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 24;
                    j8 ^= ((long) (byteBuffer.get(10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 16;
                    j8 ^= ((long) (byteBuffer.get(9) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 8;
                    j8 ^= (long) (byteBuffer.get(8) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    j7 = byteBuffer.getLong();
                    dp1Var.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ dp1Var.d;
                    dp1Var.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                default:
                    defpackage.d.p("Should never get here.");
                    return null;
            }
        }
        long j9 = dp1Var.d;
        long j10 = dp1Var.f;
        long j11 = j9 ^ j10;
        long j12 = j10 ^ dp1Var.e;
        long j13 = j11 + j12;
        long j14 = j12 + j13;
        long j15 = (j13 ^ (j13 >>> 33)) * (-49064778989728563L);
        long j16 = (j15 ^ (j15 >>> 33)) * (-4265267296055464877L);
        long j17 = (j14 ^ (j14 >>> 33)) * (-49064778989728563L);
        long j18 = (j17 ^ (j17 >>> 33)) * (-4265267296055464877L);
        long j19 = (j18 >>> 33) ^ j18;
        long j20 = (j16 ^ (j16 >>> 33)) + j19;
        dp1Var.d = j20;
        dp1Var.e = j19 + j20;
        byte[] bArrArray = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(dp1Var.d).putLong(dp1Var.e).array();
        char[] cArr = zzbd.a;
        return new ey3(bArrArray).toString();
    }
}
