package io.p071bidmachine.media3.extractor.ts;

import com.inmobi.media.core.config.models.AdConfig;
import io.p071bidmachine.media3.common.util.q;
import io.p071bidmachine.media3.extractor.j;
import io.p071bidmachine.media3.extractor.m;
import io.p071bidmachine.media3.extractor.n;
import io.p071bidmachine.media3.extractor.o;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class c implements m {
    public final b a = new b(null, 0, "audio/ac4", 1);
    public final q b = new q(16384);
    public boolean c;

    @Override // io.p071bidmachine.media3.extractor.m
    public final void release() {
    }

    @Override // io.p071bidmachine.media3.extractor.m
    public final void seek(long j, long j2) {
        this.c = false;
        this.a.seek();
    }

    @Override // io.p071bidmachine.media3.extractor.m
    public final int a(n nVar, io.p071bidmachine.media3.common.q qVar) {
        q qVar2 = this.b;
        int i = nVar.read(qVar2.a, 0, 16384);
        if (i == -1) {
            return -1;
        }
        qVar2.F(0);
        qVar2.E(i);
        boolean z = this.c;
        b bVar = this.a;
        if (!z) {
            bVar.o = 0L;
            this.c = true;
        }
        bVar.c(qVar2);
        return 0;
    }

    @Override // io.p071bidmachine.media3.extractor.m
    public final boolean b(n nVar) {
        j jVar;
        int i;
        q qVar = new q(10);
        int i2 = 0;
        while (true) {
            jVar = (j) nVar;
            jVar.peekFully(qVar.a, 0, 10, false);
            qVar.F(0);
            if (qVar.w() != 4801587) {
                break;
            }
            qVar.G(3);
            int iS = qVar.s();
            i2 += iS + 10;
            jVar.c(iS, false);
        }
        jVar.f = 0;
        jVar.c(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            jVar.peekFully(qVar.a, 0, 7, false);
            qVar.F(0);
            int iZ = qVar.z();
            if (iZ == 44096 || iZ == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = qVar.a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    } else {
                        i5 = 4;
                    }
                    if (iZ == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    break;
                }
                jVar.c(i - 7, false);
            } else {
                jVar.f = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    break;
                }
                jVar.c(i4, false);
                i3 = 0;
            }
        }
        return false;
    }

    @Override // io.p071bidmachine.media3.extractor.m
    public final void c(o oVar) {
        this.a.d(oVar, new f0(0, 1));
        oVar.endTracks();
        oVar.h(new io.p071bidmachine.media3.extractor.q(-9223372036854775807L));
    }
}
