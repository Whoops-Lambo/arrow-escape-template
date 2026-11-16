package io.p071bidmachine.media3.extractor.flac;

import com.inmobi.media.core.config.models.AdConfig;
import io.p071bidmachine.media3.common.q;
import io.p071bidmachine.media3.extractor.b;
import io.p071bidmachine.media3.extractor.g;
import io.p071bidmachine.media3.extractor.h;
import io.p071bidmachine.media3.extractor.n;
import io.p071bidmachine.media3.extractor.r;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class a implements h {
    public final r a;
    public final int b;
    public final q c = new q();

    public a(r rVar, int i) {
        this.a = rVar;
        this.b = i;
    }

    public final long a(n nVar) {
        q qVar;
        r rVar;
        int iPeek;
        while (true) {
            long peekPosition = nVar.getPeekPosition();
            long length = nVar.getLength() - 6;
            qVar = this.c;
            rVar = this.a;
            if (peekPosition >= length) {
                break;
            }
            long peekPosition2 = nVar.getPeekPosition();
            byte[] bArr = new byte[2];
            int i = 0;
            boolean zB = false;
            nVar.peekFully(bArr, 0, 2);
            int i2 = ((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            int i3 = this.b;
            if (i2 != i3) {
                nVar.resetPeekPosition();
                nVar.advancePeekPosition((int) (peekPosition2 - nVar.getPosition()));
            } else {
                io.p071bidmachine.media3.common.util.q qVar2 = new io.p071bidmachine.media3.common.util.q(16);
                System.arraycopy(bArr, 0, qVar2.a, 0, 2);
                byte[] bArr2 = qVar2.a;
                while (i < 14 && (iPeek = nVar.peek(bArr2, 2 + i, 14 - i)) != -1) {
                    i += iPeek;
                }
                qVar2.E(i);
                nVar.resetPeekPosition();
                nVar.advancePeekPosition((int) (peekPosition2 - nVar.getPosition()));
                zB = b.b(qVar2, rVar, i3, qVar);
            }
            if (zB) {
                break;
            }
            nVar.advancePeekPosition(1);
        }
        if (nVar.getPeekPosition() >= nVar.getLength() - 6) {
            nVar.advancePeekPosition((int) (nVar.getLength() - nVar.getPeekPosition()));
            return rVar.j;
        }
        return qVar.a;
    }

    @Override // io.p071bidmachine.media3.extractor.h
    public final g f(n nVar, long j) {
        long position = nVar.getPosition();
        long jA = a(nVar);
        long peekPosition = nVar.getPeekPosition();
        nVar.advancePeekPosition(Math.max(6, this.a.c));
        long jA2 = a(nVar);
        long peekPosition2 = nVar.getPeekPosition();
        if (jA <= j && jA2 > j) {
            return new g(0, -9223372036854775807L, peekPosition);
        }
        if (jA2 <= j) {
            return new g(-2, jA2, peekPosition2);
        }
        return new g(-1, jA, position);
    }
}
