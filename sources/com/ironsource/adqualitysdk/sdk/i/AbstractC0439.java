package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.dr0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ɬ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC0439 {
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static byte[] m473(byte[] bArr) {
        int i;
        if (bArr.length == 0) {
            return bArr;
        }
        if (bArr.length < 4) {
            dr0.h(StringFog.decrypt("KaRFWLnm/IcisU1MueLykW6tREfr4r2KIf5PSevk5N4v/kBN9/Hplm6qXknw+viM\n", "Tt4sKJmWnf4=\n"));
            return null;
        }
        int length = bArr.length;
        long j = (((long) bArr[length - 4]) & 255) | ((((long) bArr[length - 3]) & 255) << 8) | ((((long) bArr[length - 2]) & 255) << 16) | ((255 & ((long) bArr[length - 1])) << 24);
        if (j > 67108864) {
            StringBuilder sb = new StringBuilder();
            sb.append(StringFog.decrypt("ZisGK0GL/LZmJQd7FZX4sW00HXsIium0YCQcMgOL/OIh\n", "AVFvW2Hnmdg=\n"));
            sb.append(j);
            dr0.h(AbstractC1156.m868("fqXPciVZ\n", "Xse2BkAqRjo=\n", sb));
            return null;
        }
        int i2 = (int) j;
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
        try {
            byte[] bArr2 = new byte[i2];
            int i3 = 0;
            while (i3 < i2 && (i = gZIPInputStream.read(bArr2, i3, i2 - i3)) != -1) {
                i3 += i;
            }
            if (i3 >= i2 && gZIPInputStream.read() == -1) {
                gZIPInputStream.close();
                return bArr2;
            }
            throw new IOException(StringFog.decrypt("HdXavQnbRR0WwNKpCc9LAQmP3aJdi0kFDszb7UDfV0QWyt2qXcMEEAjO2qFM2QRM\n", "eq+zzSmrJGQ=\n") + i3 + StringFog.decrypt("7NO2mg==\n", "zLzQut9Vzjs=\n") + i2 + StringFog.decrypt("Yk8x7sRMoQ==\n", "Qi1ImqE/iD8=\n"));
        } catch (Throwable th) {
            try {
                gZIPInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static byte[] m474(byte[] bArr) {
        if (bArr.length == 0) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.finish();
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            try {
                gZIPOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
