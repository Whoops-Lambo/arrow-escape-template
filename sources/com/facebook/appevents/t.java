package com.facebook.appevents;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.hf2;
import defpackage.jc1;
import defpackage.vq2;
import io.p071bidmachine.media3.common.f0;
import io.p071bidmachine.media3.extractor.ts.c0;
import io.p071bidmachine.media3.extractor.ts.g0;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class t implements io.p071bidmachine.media3.exoplayer.mediacodec.u {
    public int a;
    public Object b;

    public boolean c() {
        b(1);
        String str = (String) this.b;
        int i = this.a;
        this.a = i + 1;
        return str.charAt(i) == '1';
    }

    @Override // io.p071bidmachine.media3.exoplayer.mediacodec.u
    public boolean secureDecodersExplicit() {
        return true;
    }

    public void b(int i) {
        if (this.a + i <= ((String) this.b).length()) {
            return;
        }
        defpackage.d.r("Not enough bits");
    }

    public void d(long j) {
        int i = this.a;
        long[] jArr = (long[]) this.b;
        if (i == jArr.length) {
            this.b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = (long[]) this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        jArr2[i2] = j;
    }

    public void e(long[] jArr) {
        int length = this.a + jArr.length;
        long[] jArr2 = (long[]) this.b;
        if (length > jArr2.length) {
            this.b = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, (long[]) this.b, this.a, jArr.length);
        this.a = length;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:39:0x0061  */
    public g0 g(int i, hf2 hf2Var) {
        String str = (String) hf2Var.b;
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new io.p071bidmachine.media3.extractor.ts.w(new io.p071bidmachine.media3.extractor.ts.t(str, hf2Var.a(), "video/mp2t"));
            }
            if (i == 21) {
                return new io.p071bidmachine.media3.extractor.ts.w(new io.p071bidmachine.media3.extractor.ts.g());
            }
            if (i == 27) {
                if (k(4)) {
                    return null;
                }
                return new io.p071bidmachine.media3.extractor.ts.w(new io.p071bidmachine.media3.extractor.ts.p(new com.facebook.login.p(j(hf2Var)), k(1), k(8)));
            }
            if (i == 36) {
                return new io.p071bidmachine.media3.extractor.ts.w(new io.p071bidmachine.media3.extractor.ts.r(new com.facebook.login.p(j(hf2Var))));
            }
            if (i == 45) {
                return new io.p071bidmachine.media3.extractor.ts.w(new io.p071bidmachine.media3.extractor.ts.u());
            }
            if (i == 89) {
                return new io.p071bidmachine.media3.extractor.ts.w(new io.p071bidmachine.media3.extractor.ts.g((List) hf2Var.c));
            }
            if (i == 172) {
                return new io.p071bidmachine.media3.extractor.ts.w(new io.p071bidmachine.media3.extractor.ts.b(str, hf2Var.a(), "video/mp2t", 1));
            }
            if (i == 257) {
                return new c0(new com.facebook.login.p("application/vnd.dvb.ait"));
            }
            if (i != 138) {
                if (i == 139) {
                    return new io.p071bidmachine.media3.extractor.ts.w(new io.p071bidmachine.media3.extractor.ts.f(str, hf2Var.a(), 5408));
                }
                switch (i) {
                    case 15:
                        if (k(2)) {
                            return null;
                        }
                        return new io.p071bidmachine.media3.extractor.ts.w(new io.p071bidmachine.media3.extractor.ts.e(false, str, hf2Var.a(), "video/mp2t"));
                    case 16:
                        return new io.p071bidmachine.media3.extractor.ts.w(new io.p071bidmachine.media3.extractor.ts.m(new io.p071bidmachine.media3.exoplayer.offline.b(j(hf2Var))));
                    case 17:
                        if (k(2)) {
                            return null;
                        }
                        return new io.p071bidmachine.media3.extractor.ts.w(new io.p071bidmachine.media3.extractor.ts.s(str, hf2Var.a()));
                    default:
                        switch (i) {
                            case 128:
                                break;
                            case 129:
                                return new io.p071bidmachine.media3.extractor.ts.w(new io.p071bidmachine.media3.extractor.ts.b(str, hf2Var.a(), "video/mp2t", 0));
                            case 130:
                                if (!k(64)) {
                                    return null;
                                }
                                break;
                            default:
                                switch (i) {
                                    case 134:
                                        if (k(16)) {
                                            return null;
                                        }
                                        return new c0(new com.facebook.login.p("application/x-scte35"));
                                    case 135:
                                        return new io.p071bidmachine.media3.extractor.ts.w(new io.p071bidmachine.media3.extractor.ts.b(str, hf2Var.a(), "video/mp2t", 0));
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                                break;
                        }
                        break;
                }
            }
            return new io.p071bidmachine.media3.extractor.ts.w(new io.p071bidmachine.media3.extractor.ts.f(str, hf2Var.a(), 4096));
        }
        return new io.p071bidmachine.media3.extractor.ts.w(new io.p071bidmachine.media3.extractor.ts.j(new io.p071bidmachine.media3.exoplayer.offline.b(j(hf2Var)), "video/mp2t"));
    }

    @Override // io.p071bidmachine.media3.exoplayer.mediacodec.u
    public int getCodecCount() {
        if (((MediaCodecInfo[]) this.b) == null) {
            this.b = new MediaCodecList(this.a).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.b).length;
    }

    @Override // io.p071bidmachine.media3.exoplayer.mediacodec.u
    public MediaCodecInfo getCodecInfoAt(int i) {
        if (((MediaCodecInfo[]) this.b) == null) {
            this.b = new MediaCodecList(this.a).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.b)[i];
    }

    public long i(int i) {
        if (i >= 0 && i < this.a) {
            return ((long[]) this.b)[i];
        }
        vq2.q(this.a, jc1.s(i, "Invalid index ", ", size is "));
        return 0L;
    }

    public List j(hf2 hf2Var) {
        String str;
        int i;
        List listSingletonList;
        List list = (List) this.b;
        if (k(32)) {
            return list;
        }
        io.p071bidmachine.media3.common.util.q qVar = new io.p071bidmachine.media3.common.util.q((byte[]) hf2Var.d);
        while (qVar.a() > 0) {
            int iT = qVar.t();
            int iT2 = qVar.b + qVar.t();
            if (iT == 134) {
                ArrayList arrayList = new ArrayList();
                int iT3 = qVar.t() & 31;
                for (int i2 = 0; i2 < iT3; i2++) {
                    String strR = qVar.r(3, StandardCharsets.UTF_8);
                    int iT4 = qVar.t();
                    boolean z = (iT4 & 128) != 0;
                    if (z) {
                        i = iT4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bT = (byte) qVar.t();
                    qVar.G(1);
                    if (z) {
                        boolean z2 = (bT & 64) != 0;
                        byte[] bArr = io.p071bidmachine.media3.common.util.c.a;
                        listSingletonList = Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    io.p071bidmachine.media3.common.m mVar = new io.p071bidmachine.media3.common.m();
                    mVar.m = f0.p(str);
                    mVar.d = strR;
                    mVar.H = i;
                    mVar.p = listSingletonList;
                    arrayList.add(new io.p071bidmachine.media3.common.n(mVar));
                }
                list = arrayList;
            }
            qVar.F(iT2);
        }
        return list;
    }

    public boolean k(int i) {
        return (this.a & i) != 0;
    }

    public long l(io.p071bidmachine.media3.extractor.j jVar) {
        io.p071bidmachine.media3.common.util.q qVar = (io.p071bidmachine.media3.common.util.q) this.b;
        int i = 0;
        jVar.peekFully(qVar.a, 0, 1, false);
        int i2 = qVar.a[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        jVar.peekFully(qVar.a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (qVar.a[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) + (i5 << 8);
        }
        this.a = i4 + 1 + this.a;
        return i5;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(int i, boolean z) {
        this(32);
        switch (i) {
            case 6:
                this.b = new io.p071bidmachine.media3.common.util.q(8);
                break;
            default:
                break;
        }
    }

    @Override // io.p071bidmachine.media3.exoplayer.mediacodec.u
    public boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    public int f(int i) {
        int i2;
        b(i);
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = i3 << 1;
            String str = (String) this.b;
            int i6 = this.a;
            this.a = i6 + 1;
            if (str.charAt(i6) == '1') {
                i2 = 1;
            } else {
                i2 = 0;
            }
            i3 = i5 | i2;
        }
        return i3;
    }

    public void h(int i) {
        b(i);
        this.a += i;
    }

    @Override // io.p071bidmachine.media3.exoplayer.mediacodec.u
    public boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public t(int i) {
        this.b = new long[i];
    }

    public t(IOException iOException, int i) {
        this.b = iOException;
        this.a = i;
    }

    public t(int i, List list) {
        this.a = i;
        this.b = list;
    }
}
