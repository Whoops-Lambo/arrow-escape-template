package com.facebook.ads.redexgen.X;

import androidx.media3.container.Mp4Box;
import androidx.media3.extractor.mp4.Sniffer;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.b8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
@MetaExoPlayerCustomization
public abstract class AbstractC2580b8 {
    public static String[] A00 = {"byjuLDSAzhwRGO7eKKPI3or4AjnenBfg", "BT7bwZqbuVe6NV2hX8Ecfp0mExchBrJu", "aAG2C4tSMMggRHfXlZpibIt7s3KN1quw", "20ZxdlGZmGUMkXVcBqc3NOAHKm2atkKo", "d84S0i0AZIa6E3JHHu7iVpzB1yidxeR7", "LrYdV1XxeE5MkXAYS54WiQwkvWuBaZAe", "Si4gdBsV7XbcFojchbGSMgBQBQBK0sit", "BYheausTDQAkRyRY2BEjJPVsFpUkSvHM"};
    public static final int[] A01 = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, Mp4Box.TYPE_avc1, Mp4Box.TYPE_hvc1, Mp4Box.TYPE_hev1, Mp4Box.TYPE_av01, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, Sniffer.BRAND_QUICKTIME, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean A00(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 : A01) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean A01(Q9 q9) throws IOException {
        return A03(q9, true, false);
    }

    public static boolean A02(Q9 q9, boolean z) throws IOException {
        return A03(q9, false, z);
    }

    public static boolean A03(Q9 q9, boolean z, boolean z2) throws IOException {
        long jA90 = q9.A90();
        long inputLength = 4096;
        if (jA90 != -1 && jA90 <= 4096) {
            inputLength = jA90;
        }
        int i = (int) inputLength;
        C2181Mk c2181Mk = new C2181Mk(64);
        int i2 = 0;
        boolean z3 = false;
        boolean z4 = false;
        while (i2 < i) {
            int i3 = 8;
            c2181Mk.A0d(8);
            boolean zAI7 = q9.AI7(c2181Mk.A0l(), 0, 8, true);
            String[] strArr = A00;
            if (strArr[2].charAt(4) != strArr[3].charAt(4)) {
                A00[5] = "m00lnZKg3AS2XW8qA0V7ArZlWhVusfYO";
                if (!zAI7) {
                    break;
                }
                long jA0Q = c2181Mk.A0Q();
                int headerSize = c2181Mk.A0C();
                if (jA0Q == 1) {
                    i3 = 16;
                    q9.AI6(c2181Mk.A0l(), 8, 8);
                    c2181Mk.A0e(16);
                    jA0Q = c2181Mk.A0P();
                } else if (jA0Q == 0) {
                    long jA91 = q9.A90();
                    if (jA91 != -1) {
                        jA0Q = (jA91 - q9.A9L()) + ((long) 8);
                    }
                }
                long j = i3;
                if (A00[0].charAt(4) != 'L') {
                    throw new RuntimeException();
                }
                A00[5] = "UtmF8gcvAmDE2tg754qnRZQuWqRLyGBv";
                if (jA0Q < j) {
                    return false;
                }
                i2 += i3;
                if (headerSize == 1836019574) {
                    i += (int) jA0Q;
                    if (jA90 != -1 && i > jA90) {
                        i = (int) jA90;
                    }
                } else {
                    if (headerSize == 1836019558 || headerSize == 1836475768) {
                        z4 = true;
                        break;
                    }
                    if ((((long) i2) + jA0Q) - ((long) i3) >= i) {
                        break;
                    }
                    int atomDataSize = (int) (jA0Q - ((long) i3));
                    i2 += atomDataSize;
                    if (headerSize == 1718909296) {
                        if (atomDataSize >= 8) {
                            c2181Mk.A0d(atomDataSize);
                            q9.AI6(c2181Mk.A0l(), 0, atomDataSize);
                            int bytesToSearch = atomDataSize / 4;
                            for (int i4 = 0; i4 < bytesToSearch; i4++) {
                                if (i4 != 1) {
                                    if (A00(c2181Mk.A0C(), z2)) {
                                        z3 = true;
                                        break;
                                    }
                                } else {
                                    int brandsCount = A00[0].charAt(4);
                                    if (brandsCount != 76) {
                                        throw new RuntimeException();
                                    }
                                    String[] strArr2 = A00;
                                    strArr2[2] = "dzqLaRrB8roYzptOlyeuWukPOQGnaBr5";
                                    strArr2[3] = "tCGCFdpd4Lxzt3Z9CL7bUlzjSUebpCXv";
                                    c2181Mk.A0g(4);
                                }
                            }
                            if (!z3) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    } else if (atomDataSize != 0) {
                        q9.A4X(atomDataSize);
                    }
                }
            } else {
                throw new RuntimeException();
            }
        }
        return z3 && z == z4;
    }
}
