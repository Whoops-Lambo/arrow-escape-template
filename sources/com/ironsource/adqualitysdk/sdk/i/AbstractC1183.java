package com.ironsource.adqualitysdk.sdk.i;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.וּ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1183 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static final Charset f3490 = Charset.forName(StringFog.decrypt("jI6+Lww=\n", "2dr4AjQlbgw=\n"));

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static byte[] m870(byte[] bArr, C1195 c1195, C1099 c1099) {
        if (bArr.length < 29) {
            StringBuilder sb = new StringBuilder();
            sb.append(StringFog.decrypt("ocV9RDeyzNzT1GFbeK/X1oHUNBQ=\n", "86AONFjcv7k=\n"));
            sb.append(bArr.length);
            defpackage.d.r(AbstractC1156.m868("wof0kscq\n", "4uWN5qJZrSg=\n", sb));
            return null;
        }
        int i = (bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) + 1;
        if (i > bArr.length) {
            defpackage.d.r(StringFog.decrypt("3UJ//BUnZYKvU375FCp3k+pDLO0OaXiI4URp\n", "jycMjHpJFuc=\n"));
            return null;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 1, i);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i, bArr.length);
        if (bArrCopyOfRange2.length < 16) {
            defpackage.d.r(StringFog.decrypt("EBwOUDnehqFiDQ9VONOUsCcdXUEikJatMhEYUiLVjbA=\n", "Qnl9IFaw9cQ=\n"));
            return null;
        }
        c1099.getClass();
        byte[] bArr2 = C1099.f3183;
        byte[] bArr3 = new byte[bArr2.length + 3];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        bArr3[bArr2.length] = 0;
        bArr3[bArr2.length + 1] = 1;
        bArr3[bArr2.length + 2] = 2;
        return c1099.m814(c1099.m813(c1195.f3600, bArrCopyOfRange, bArr3), bArrCopyOfRange, bArrCopyOfRange2, c1195.f3601.getBytes(f3490));
    }
}
