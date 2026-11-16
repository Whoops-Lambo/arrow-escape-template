package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzum extends zzcq {
    public static void j(int i, ByteBuffer byteBuffer) {
        float f = (float) (((double) i) * 4.656612875245797E-10d);
        byteBuffer.putInt(Float.isNaN(f) ? 0 : Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final zzcl f(zzcl zzclVar) throws zzco {
        int i = zzclVar.c;
        if (zzfq.d(i)) {
            return i != 4 ? new zzcl(zzclVar.a, zzclVar.b, 4) : zzcl.e;
        }
        throw new zzco("Unhandled input format:", zzclVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferE;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.b.c;
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 21) {
                    if (i2 != 22) {
                        if (i2 != 268435456) {
                            if (i2 != 1342177280) {
                                if (i2 != 1610612736) {
                                    if (i2 != 1879048192) {
                                        if (i2 != 1895825408) {
                                            if (i2 == 1912602624) {
                                                byteBufferE = e(i / 2);
                                                while (iPosition < iLimit) {
                                                    byteBufferE.putFloat((float) Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong(iPosition))));
                                                    iPosition += 8;
                                                }
                                            } else {
                                                io.p071bidmachine.media3.extractor.ts.y.b();
                                                return;
                                            }
                                        } else {
                                            byteBufferE = e(i);
                                            while (iPosition < iLimit) {
                                                byteBufferE.putFloat(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt(iPosition))));
                                                iPosition += 4;
                                            }
                                        }
                                    } else {
                                        byteBufferE = e(i / 2);
                                        while (iPosition < iLimit) {
                                            byteBufferE.putFloat((float) byteBuffer.getDouble(iPosition));
                                            iPosition += 8;
                                        }
                                    }
                                } else {
                                    byteBufferE = e(i);
                                    while (iPosition < iLimit) {
                                        j(Integer.reverseBytes(byteBuffer.getInt(iPosition)), byteBufferE);
                                        iPosition += 4;
                                    }
                                }
                            } else {
                                byteBufferE = e((i / 3) * 4);
                                while (iPosition < iLimit) {
                                    j((byteBuffer.get(iPosition) << 24) | ((byteBuffer.get(iPosition + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(iPosition + 2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8), byteBufferE);
                                    iPosition += 3;
                                }
                            }
                        } else {
                            byteBufferE = e(i + i);
                            while (iPosition < iLimit) {
                                j(Short.reverseBytes(byteBuffer.getShort(iPosition)) << 16, byteBufferE);
                                iPosition += 2;
                            }
                        }
                    } else {
                        byteBufferE = e(i);
                        while (iPosition < iLimit) {
                            j(byteBuffer.getInt(iPosition), byteBufferE);
                            iPosition += 4;
                        }
                    }
                } else {
                    byteBufferE = e((i / 3) * 4);
                    while (iPosition < iLimit) {
                        j((byteBuffer.get(iPosition + 2) << 24) | ((byteBuffer.get(iPosition + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8), byteBufferE);
                        iPosition += 3;
                    }
                }
            } else {
                byteBufferE = e(i * 4);
                while (iPosition < iLimit) {
                    j(((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) - 128) << 24, byteBufferE);
                    iPosition++;
                }
            }
        } else {
            byteBufferE = e(i + i);
            while (iPosition < iLimit) {
                j(byteBuffer.getShort(iPosition) << 16, byteBufferE);
                iPosition += 2;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferE.flip();
    }
}
