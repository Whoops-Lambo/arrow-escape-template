package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzadm {
    public static int b(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = 0;
        while (i < i2) {
            int i4 = byteBuffer.get(i) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i3 >= 2 && i4 == 1) {
                return i - 2;
            }
            i3 = i4 == 0 ? i3 + 1 : 0;
            i++;
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:85:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0079 A[SYNTHETIC] */
    public static void a(ByteBuffer byteBuffer, boolean z) {
        int iB;
        int i;
        int i2;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        if (iLimit - iPosition >= 4) {
            while (iPosition < iLimit) {
                int iB2 = b(byteBuffer, iPosition, iLimit);
                if (iB2 != iLimit && (iB = iB2 + 3) < iLimit && (i = (byteBuffer.get(iB) & 126) >> 1) > 31) {
                    if (i == 39) {
                        int i3 = iB2 + 5;
                        iB = b(byteBuffer, i3, iLimit);
                        int i4 = 0;
                        while (i3 < iB) {
                            int i5 = 0;
                            while (true) {
                                if (i3 < iB) {
                                    int i6 = i3 + 1;
                                    int i7 = byteBuffer.get(i3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                    if (i7 == 3) {
                                        if (i4 >= 2) {
                                            i4 = 0;
                                        } else {
                                            i7 = 3;
                                            if (i7 == 0) {
                                                i4++;
                                            } else {
                                                i4 = 0;
                                            }
                                            i5 += i7;
                                            if (i7 != 255) {
                                                if (i5 == 4) {
                                                    i2 = i3;
                                                } else {
                                                    i2 = -1;
                                                }
                                                i3 = i6;
                                                break;
                                            }
                                        }
                                    } else {
                                        if (i7 == 0) {
                                            i4++;
                                        } else {
                                            i4 = 0;
                                        }
                                        i5 += i7;
                                        if (i7 != 255) {
                                            if (i5 == 4) {
                                                i2 = i3;
                                            } else {
                                                i2 = -1;
                                            }
                                            i3 = i6;
                                            break;
                                        }
                                    }
                                    i3 = i6;
                                } else {
                                    i4 = i4;
                                    i2 = -1;
                                    break;
                                }
                            }
                            if (i3 >= iB) {
                                if (i2 == -1) {
                                    break;
                                }
                                byteBuffer.put(i2, (byte) -2);
                                break;
                            }
                            int i8 = 0;
                            while (i3 < iB) {
                                int i9 = i3 + 1;
                                int i10 = byteBuffer.get(i3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                if (i10 == 3) {
                                    if (i4 >= 2) {
                                        i4 = 0;
                                    } else {
                                        i10 = 3;
                                        if (i10 == 0) {
                                            i4++;
                                        } else {
                                            i4 = 0;
                                        }
                                        i8 += i10;
                                        if (i10 != 255) {
                                            i3 = i9;
                                            break;
                                        }
                                    }
                                } else {
                                    if (i10 == 0) {
                                        i4++;
                                    } else {
                                        i4 = 0;
                                    }
                                    i8 += i10;
                                    if (i10 != 255) {
                                        i3 = i9;
                                        break;
                                    }
                                }
                                i3 = i9;
                            }
                            if (i2 != -1 && (!z || !zzdr.f(byteBuffer, i3, Math.min(i3 + i8, iB)))) {
                                byteBuffer.put(i2, (byte) -2);
                            }
                            i4 = i4;
                            int i11 = 0;
                            while (i11 < i8 && i3 < iB) {
                                int i12 = i3 + 1;
                                int i13 = byteBuffer.get(i3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                if (i13 == 3) {
                                    if (i4 >= 2) {
                                        i11--;
                                    }
                                } else {
                                    if (i13 == 0) {
                                        i4++;
                                    }
                                    i11++;
                                    i3 = i12;
                                }
                                i4 = 0;
                                i11++;
                                i3 = i12;
                            }
                        }
                    }
                    iPosition = iB;
                } else {
                    return;
                }
            }
        }
    }
}
