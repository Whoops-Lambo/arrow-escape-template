package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzavk {
    public static double c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((double) (((((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680)) | (65280 & (bArr[2] << 8))) | (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED))) / 65536.0d;
    }

    public static double d(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((double) (((((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680)) | (65280 & (bArr[2] << 8))) | (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED))) / 1.073741824E9d;
    }

    public static long a(ByteBuffer byteBuffer) {
        long j = byteBuffer.getInt();
        if (j < 0) {
            return j + 4294967296L;
        }
        return j;
    }

    public static long b(ByteBuffer byteBuffer) {
        long jA = a(byteBuffer) << 32;
        if (jA >= 0) {
            return a(byteBuffer) + jA;
        }
        io.p071bidmachine.media3.extractor.ts.y.j("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
        return 0L;
    }
}
