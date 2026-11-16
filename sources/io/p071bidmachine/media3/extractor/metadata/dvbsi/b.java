package io.p071bidmachine.media3.extractor.metadata.dvbsi;

import com.moloco.sdk.internal.publisher.k0;
import io.p071bidmachine.media3.common.d0;
import io.p071bidmachine.media3.common.util.p;
import io.p071bidmachine.media3.common.util.q;
import io.p071bidmachine.media3.extractor.metadata.a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class b extends k0 {
    public final /* synthetic */ int a;

    @Override // com.moloco.sdk.internal.publisher.k0
    public final d0 o(a aVar, ByteBuffer byteBuffer) {
        switch (this.a) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                p pVar = new p(byteBuffer.array(), byteBuffer.limit());
                pVar.t(12);
                int iF = (pVar.f() + pVar.i(12)) - 4;
                pVar.t(44);
                pVar.u(pVar.i(12));
                pVar.t(16);
                ArrayList arrayList = new ArrayList();
                while (pVar.f() < iF) {
                    pVar.t(48);
                    int i = pVar.i(8);
                    pVar.t(4);
                    int iF2 = pVar.f() + pVar.i(12);
                    String str = null;
                    String str2 = null;
                    while (pVar.f() < iF2) {
                        int i2 = pVar.i(8);
                        int i3 = pVar.i(8);
                        int iF3 = pVar.f() + i3;
                        if (i2 == 2) {
                            int i4 = pVar.i(16);
                            pVar.t(8);
                            if (i4 == 3) {
                                while (pVar.f() < iF3) {
                                    int i5 = pVar.i(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[i5];
                                    pVar.l(i5, bArr);
                                    String str3 = new String(bArr, charset);
                                    int i6 = pVar.i(8);
                                    for (int i7 = 0; i7 < i6; i7++) {
                                        pVar.u(pVar.i(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (i2 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[i3];
                            pVar.l(i3, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        pVar.q(iF3 * 8);
                    }
                    pVar.q(iF2 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new a(i, str.concat(str2)));
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new d0(arrayList);
            default:
                return new d0(C(new q(byteBuffer.array(), byteBuffer.limit())));
        }
    }

    public static io.p071bidmachine.media3.extractor.metadata.emsg.a C(q qVar) {
        String strO = qVar.o();
        strO.getClass();
        String strO2 = qVar.o();
        strO2.getClass();
        return new io.p071bidmachine.media3.extractor.metadata.emsg.a(strO, strO2, qVar.n(), qVar.n(), Arrays.copyOfRange(qVar.a, qVar.b, qVar.c));
    }
}
