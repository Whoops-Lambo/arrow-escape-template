package io.p071bidmachine.media3.common.audio;

import com.inmobi.media.core.config.models.AdConfig;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.extractor.ts.y;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class k extends h {
    @Override // io.p071bidmachine.media3.common.audio.h
    public final e b(e eVar) throws f {
        int i = eVar.c;
        if (i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4) {
            return i != 2 ? new e(eVar.a, eVar.b, 2) : e.e;
        }
        throw new f(eVar);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    @Override // io.p071bidmachine.media3.common.audio.g
    public final void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.b.c;
        if (i2 != 3) {
            if (i2 != 4) {
                if (i2 != 21) {
                    if (i2 != 22) {
                        if (i2 != 268435456) {
                            if (i2 != 1342177280) {
                                if (i2 != 1610612736) {
                                    y.b();
                                    return;
                                }
                                i /= 2;
                            }
                        }
                    } else {
                        i /= 2;
                    }
                }
                i /= 3;
                i *= 2;
            } else {
                i /= 2;
            }
        } else {
            i *= 2;
        }
        ByteBuffer byteBufferF = f(i);
        int i3 = this.b.c;
        if (i3 != 3) {
            if (i3 != 4) {
                if (i3 != 21) {
                    if (i3 != 22) {
                        if (i3 != 268435456) {
                            if (i3 != 1342177280) {
                                if (i3 == 1610612736) {
                                    while (iPosition < iLimit) {
                                        byteBufferF.put(byteBuffer.get(iPosition + 1));
                                        byteBufferF.put(byteBuffer.get(iPosition));
                                        iPosition += 4;
                                    }
                                } else {
                                    y.b();
                                    return;
                                }
                            } else {
                                while (iPosition < iLimit) {
                                    byteBufferF.put(byteBuffer.get(iPosition + 1));
                                    byteBufferF.put(byteBuffer.get(iPosition));
                                    iPosition += 3;
                                }
                            }
                        } else {
                            while (iPosition < iLimit) {
                                byteBufferF.put(byteBuffer.get(iPosition + 1));
                                byteBufferF.put(byteBuffer.get(iPosition));
                                iPosition += 2;
                            }
                        }
                    } else {
                        while (iPosition < iLimit) {
                            byteBufferF.put(byteBuffer.get(iPosition + 2));
                            byteBufferF.put(byteBuffer.get(iPosition + 3));
                            iPosition += 4;
                        }
                    }
                } else {
                    while (iPosition < iLimit) {
                        byteBufferF.put(byteBuffer.get(iPosition + 1));
                        byteBufferF.put(byteBuffer.get(iPosition + 2));
                        iPosition += 3;
                    }
                }
            } else {
                while (iPosition < iLimit) {
                    short sG = (short) (x.g(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                    byteBufferF.put((byte) (sG & 255));
                    byteBufferF.put((byte) ((sG >> 8) & 255));
                    iPosition += 4;
                }
            }
        } else {
            while (iPosition < iLimit) {
                byteBufferF.put((byte) 0);
                byteBufferF.put((byte) ((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) - 128));
                iPosition++;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferF.flip();
    }
}
