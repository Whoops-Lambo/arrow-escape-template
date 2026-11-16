package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzcw extends zzcq {
    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    @Override // com.google.android.gms.internal.ads.zzcp
    public final void b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.b.c;
        if (i2 == 3) {
            i += i;
        } else if (i2 == 4) {
            i /= 2;
        } else {
            if (i2 != 21) {
                if (i2 == 22) {
                    i /= 2;
                } else if (i2 != 268435456) {
                    if (i2 != 1342177280) {
                        if (i2 == 1610612736) {
                            i /= 2;
                        } else {
                            if (i2 != 1879048192) {
                                if (i2 == 1895825408) {
                                    i /= 2;
                                } else if (i2 != 1912602624) {
                                    io.p071bidmachine.media3.extractor.ts.y.b();
                                    return;
                                }
                            }
                            i /= 4;
                        }
                    }
                }
            }
            i /= 3;
            i += i;
        }
        ByteBuffer byteBufferE = e(i);
        int i3 = this.b.c;
        if (i3 == 3) {
            while (iPosition < iLimit) {
                byteBufferE.put((byte) 0);
                byteBufferE.put((byte) ((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) - 128));
                iPosition++;
            }
        } else if (i3 == 4) {
            while (iPosition < iLimit) {
                float f = byteBuffer.getFloat(iPosition);
                String str = zzfq.a;
                short sMax = (short) (Math.max(-1.0f, Math.min(f, 1.0f)) * 32767.0f);
                byteBufferE.put((byte) (sMax & 255));
                byteBufferE.put((byte) ((sMax >> 8) & 255));
                iPosition += 4;
            }
        } else if (i3 == 21) {
            while (iPosition < iLimit) {
                byteBufferE.put(byteBuffer.get(iPosition + 1));
                byteBufferE.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i3 == 22) {
            while (iPosition < iLimit) {
                byteBufferE.put(byteBuffer.get(iPosition + 2));
                byteBufferE.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i3 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferE.put(byteBuffer.get(iPosition + 1));
                byteBufferE.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i3 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferE.put(byteBuffer.get(iPosition + 1));
                byteBufferE.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else if (i3 == 1610612736) {
            while (iPosition < iLimit) {
                byteBufferE.put(byteBuffer.get(iPosition + 1));
                byteBufferE.put(byteBuffer.get(iPosition));
                iPosition += 4;
            }
        } else if (i3 == 1879048192) {
            while (iPosition < iLimit) {
                short sMax2 = (short) (Math.max(-1.0d, Math.min(byteBuffer.getDouble(iPosition), 1.0d)) * 32767.0d);
                byteBufferE.put((byte) (sMax2 & 255));
                byteBufferE.put((byte) ((sMax2 >> 8) & 255));
                iPosition += 8;
            }
        } else if (i3 == 1895825408) {
            while (iPosition < iLimit) {
                float fIntBitsToFloat = Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt(iPosition)));
                String str2 = zzfq.a;
                short sMax3 = (short) (Math.max(-1.0f, Math.min(fIntBitsToFloat, 1.0f)) * 32767.0f);
                byteBufferE.put((byte) (sMax3 & 255));
                byteBufferE.put((byte) ((sMax3 >> 8) & 255));
                iPosition += 4;
            }
        } else {
            if (i3 != 1912602624) {
                io.p071bidmachine.media3.extractor.ts.y.b();
                return;
            }
            while (iPosition < iLimit) {
                short sMax4 = (short) (Math.max(-1.0d, Math.min(Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong(iPosition))), 1.0d)) * 32767.0d);
                byteBufferE.put((byte) (sMax4 & 255));
                byteBufferE.put((byte) ((sMax4 >> 8) & 255));
                iPosition += 8;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferE.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final zzcl f(zzcl zzclVar) throws zzco {
        int i = zzclVar.c;
        if (zzfq.d(i)) {
            return i != 2 ? new zzcl(zzclVar.a, zzclVar.b, 2) : zzcl.e;
        }
        throw new zzco("Unhandled input format:", zzclVar);
    }
}
