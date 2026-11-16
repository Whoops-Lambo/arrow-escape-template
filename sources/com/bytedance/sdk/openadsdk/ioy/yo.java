package com.bytedance.sdk.openadsdk.ioy;

import com.inmobi.media.core.config.models.AdConfig;
import defpackage.jc1;
import defpackage.pv1;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class yo {
    private static final int[] ahm = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    static final Charset kgy = StandardCharsets.ISO_8859_1;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ioy.yo$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] kgy;

        static {
            int[] iArr = new int[kus.values().length];
            kgy = iArr;
            try {
                iArr[kus.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE50Doydf6w==", "fuAumge5e4PR", "B+0hnA21fZk=", -1);
            }
            try {
                kgy[kus.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE50Doydf6w==", "fuAumge5e4PR", "B+0hnA21fZk=", -1);
            }
            try {
                kgy[kus.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e3, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE50Doydf6w==", "fuAumge5e4PR", "B+0hnA21fZk=", -1);
            }
            try {
                kgy[kus.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e4, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE50Doydf6w==", "fuAumge5e4PR", "B+0hnA21fZk=", -1);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class kgy {
        private final byte[] ahm;
        private final byte[] kgy;

        public byte[] ahm() {
            return this.ahm;
        }

        public byte[] kgy() {
            return this.kgy;
        }

        public kgy(byte[] bArr, byte[] bArr2) {
            this.kgy = bArr;
            this.ahm = bArr2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:62:0x0140  */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    public static vs kgy(String str, fi fiVar, Map<noq, ?> map) throws sx {
        boolean z;
        boolean z2;
        fpp fppVarKgy;
        fpp fppVarAhm;
        com.bytedance.sdk.openadsdk.ioy.kgy kgyVar;
        uq uqVarKgy;
        int iKgy;
        boolean z3 = false;
        if (map != null) {
            noq noqVar = noq.GS1_FORMAT;
            if (map.containsKey(noqVar) && Boolean.parseBoolean(map.get(noqVar).toString())) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (map != null) {
            noq noqVar2 = noq.QR_COMPACT;
            if (map.containsKey(noqVar2) && Boolean.parseBoolean(map.get(noqVar2).toString())) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        Charset charsetForName = kgy;
        if (map != null && map.containsKey(noq.CHARACTER_SET)) {
            z3 = true;
        }
        if (z3) {
            try {
                charsetForName = Charset.forName(map.get(noq.CHARACTER_SET).toString());
            } catch (UnsupportedCharsetException e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE50Doydf6w==", "fuAumge5ew==", "XuAumge5", 86);
            }
        }
        if (z2) {
            kus kusVar = kus.NUMERIC;
            if (charsetForName.equals(kgy)) {
                charsetForName = null;
            }
            twf.ahm ahmVarKgy = twf.kgy(str, null, charsetForName, z, fiVar);
            kgyVar = new com.bytedance.sdk.openadsdk.ioy.kgy();
            ahmVarKgy.kgy(kgyVar);
            fppVarAhm = ahmVarKgy.ahm();
        } else {
            kus kusVarKgy = kgy(str, charsetForName);
            com.bytedance.sdk.openadsdk.ioy.kgy kgyVar2 = new com.bytedance.sdk.openadsdk.ioy.kgy();
            kus kusVar2 = kus.BYTE;
            if (kusVarKgy == kusVar2 && z3 && (uqVarKgy = uq.kgy(charsetForName)) != null) {
                kgy(uqVarKgy, kgyVar2);
            }
            if (z) {
                kgy(kus.FNC1_FIRST_POSITION, kgyVar2);
            }
            kgy(kusVarKgy, kgyVar2);
            com.bytedance.sdk.openadsdk.ioy.kgy kgyVar3 = new com.bytedance.sdk.openadsdk.ioy.kgy();
            kgy(str, kusVarKgy, kgyVar3, charsetForName);
            if (map != null) {
                noq noqVar3 = noq.QR_VERSION;
                if (map.containsKey(noqVar3)) {
                    fppVarKgy = fpp.kgy(Integer.parseInt(map.get(noqVar3).toString()));
                    if (!kgy(kgy(kusVarKgy, kgyVar2, kgyVar3, fppVarKgy), fppVarKgy, fiVar)) {
                        throw new sx("Data too big for requested version");
                    }
                } else {
                    fppVarKgy = kgy(fiVar, kusVarKgy, kgyVar2, kgyVar3);
                }
            } else {
                fppVarKgy = kgy(fiVar, kusVarKgy, kgyVar2, kgyVar3);
            }
            com.bytedance.sdk.openadsdk.ioy.kgy kgyVar4 = new com.bytedance.sdk.openadsdk.ioy.kgy();
            kgyVar4.kgy(kgyVar2);
            kgy(kusVarKgy == kusVar2 ? kgyVar3.ahm() : str.length(), fppVarKgy, kusVarKgy, kgyVar4);
            kgyVar4.kgy(kgyVar3);
            fppVarAhm = fppVarKgy;
            kgyVar = kgyVar4;
        }
        fpp.ahm ahmVarKgy2 = fppVarAhm.kgy(fiVar);
        int iAhm = fppVarAhm.ahm() - ahmVarKgy2.rz();
        kgy(iAhm, kgyVar);
        com.bytedance.sdk.openadsdk.ioy.kgy kgyVarKgy = kgy(kgyVar, fppVarAhm.ahm(), iAhm, ahmVarKgy2.ahm());
        vs vsVar = new vs();
        int iRz = fppVarAhm.rz();
        rz rzVar = new rz(iRz, iRz);
        if (map != null) {
            noq noqVar4 = noq.QR_MASK_PATTERN;
            if (map.containsKey(noqVar4)) {
                iKgy = Integer.parseInt(map.get(noqVar4).toString());
                if (!vs.kgy(iKgy)) {
                    iKgy = -1;
                }
            } else {
                iKgy = -1;
            }
        } else {
            iKgy = -1;
        }
        if (iKgy == -1) {
            iKgy = kgy(kgyVarKgy, fiVar, fppVarAhm, rzVar);
        }
        at.kgy(kgyVarKgy, fiVar, fppVarAhm, iKgy, rzVar);
        vsVar.kgy(rzVar);
        return vsVar;
    }

    public static void ahm(CharSequence charSequence, com.bytedance.sdk.openadsdk.ioy.kgy kgyVar) throws sx {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int iKgy = kgy(charSequence.charAt(i));
            if (iKgy != -1) {
                int i2 = i + 1;
                if (i2 < length) {
                    int iKgy2 = kgy(charSequence.charAt(i2));
                    if (iKgy2 != -1) {
                        kgyVar.kgy((iKgy * 45) + iKgy2, 11);
                        i += 2;
                    } else {
                        throw new sx();
                    }
                } else {
                    kgyVar.kgy(iKgy, 6);
                    i = i2;
                }
            } else {
                throw new sx();
            }
        }
    }

    private static int kgy(rz rzVar) {
        return nu.kgy(rzVar) + nu.ahm(rzVar) + nu.rz(rzVar) + nu.uq(rzVar);
    }

    private static fpp kgy(fi fiVar, kus kusVar, com.bytedance.sdk.openadsdk.ioy.kgy kgyVar, com.bytedance.sdk.openadsdk.ioy.kgy kgyVar2) throws sx {
        return kgy(kgy(kusVar, kgyVar, kgyVar2, kgy(kgy(kusVar, kgyVar, kgyVar2, fpp.kgy(1)), fiVar)), fiVar);
    }

    private static int kgy(kus kusVar, com.bytedance.sdk.openadsdk.ioy.kgy kgyVar, com.bytedance.sdk.openadsdk.ioy.kgy kgyVar2, fpp fppVar) {
        return kgyVar2.kgy() + kusVar.kgy(fppVar) + kgyVar.kgy();
    }

    public static int kgy(int i) {
        int[] iArr = ahm;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    private static kus kgy(String str, Charset charset) {
        Charset charset2 = um.kgy;
        if (charset2 != null && charset2.equals(charset) && kgy(str)) {
            return kus.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= '0' && cCharAt <= '9') {
                z2 = true;
            } else {
                if (kgy(cCharAt) == -1) {
                    return kus.BYTE;
                }
                z = true;
            }
        }
        if (z) {
            return kus.ALPHANUMERIC;
        }
        if (z2) {
            return kus.NUMERIC;
        }
        return kus.BYTE;
    }

    public static boolean kgy(String str) {
        byte[] bytes = str.getBytes(um.kgy);
        int length = bytes.length;
        if (length % 2 != 0) {
            return false;
        }
        for (int i = 0; i < length; i += 2) {
            int i2 = bytes[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if ((i2 < 129 || i2 > 159) && (i2 < 224 || i2 > 235)) {
                return false;
            }
        }
        return true;
    }

    private static int kgy(com.bytedance.sdk.openadsdk.ioy.kgy kgyVar, fi fiVar, fpp fppVar, rz rzVar) throws sx {
        int i = Integer.MAX_VALUE;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            at.kgy(kgyVar, fiVar, fppVar, i3, rzVar);
            int iKgy = kgy(rzVar);
            if (iKgy < i) {
                i2 = i3;
                i = iKgy;
            }
        }
        return i2;
    }

    private static fpp kgy(int i, fi fiVar) throws sx {
        for (int i2 = 1; i2 <= 40; i2++) {
            fpp fppVarKgy = fpp.kgy(i2);
            if (kgy(i, fppVarKgy, fiVar)) {
                return fppVarKgy;
            }
        }
        throw new sx("Data too big");
    }

    public static boolean kgy(int i, fpp fppVar, fi fiVar) {
        return fppVar.ahm() - fppVar.kgy(fiVar).rz() >= (i + 7) / 8;
    }

    public static void kgy(int i, com.bytedance.sdk.openadsdk.ioy.kgy kgyVar) throws sx {
        int i2 = i * 8;
        if (kgyVar.kgy() <= i2) {
            for (int i3 = 0; i3 < 4 && kgyVar.kgy() < i2; i3++) {
                kgyVar.kgy(false);
            }
            int iKgy = kgyVar.kgy() & 7;
            if (iKgy > 0) {
                while (iKgy < 8) {
                    kgyVar.kgy(false);
                    iKgy++;
                }
            }
            int iAhm = i - kgyVar.ahm();
            for (int i4 = 0; i4 < iAhm; i4++) {
                kgyVar.kgy((i4 & 1) == 0 ? 236 : 17, 8);
            }
            if (kgyVar.kgy() != i2) {
                throw new sx("Bits size does not equal capacity");
            }
            return;
        }
        throw new sx("data bits cannot fit in the QR Code" + kgyVar.kgy() + " > " + i2);
    }

    public static void kgy(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) throws sx {
        if (i4 < i3) {
            int i5 = i % i3;
            int i6 = i3 - i5;
            int i7 = i / i3;
            int i8 = i7 + 1;
            int i9 = i2 / i3;
            int i10 = i9 + 1;
            int i11 = i7 - i9;
            int i12 = i8 - i10;
            if (i11 != i12) {
                throw new sx("EC bytes mismatch");
            }
            if (i3 != i6 + i5) {
                throw new sx("RS blocks mismatch");
            }
            if (i != ((i10 + i12) * i5) + ((i9 + i11) * i6)) {
                throw new sx("Total bytes mismatch");
            }
            if (i4 < i6) {
                iArr[0] = i9;
                iArr2[0] = i11;
                return;
            } else {
                iArr[0] = i10;
                iArr2[0] = i12;
                return;
            }
        }
        throw new sx("Block ID too large");
    }

    public static com.bytedance.sdk.openadsdk.ioy.kgy kgy(com.bytedance.sdk.openadsdk.ioy.kgy kgyVar, int i, int i2, int i3) throws sx {
        if (kgyVar.ahm() == i2) {
            ArrayList arrayList = new ArrayList(i3);
            int i4 = 0;
            int i5 = 0;
            int iMax = 0;
            int iMax2 = 0;
            while (i4 < i3) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                int i6 = i;
                int i7 = i2;
                int i8 = i3;
                kgy(i6, i7, i8, i4, iArr, iArr2);
                int i9 = iArr[0];
                byte[] bArr = new byte[i9];
                kgyVar.kgy(i5 * 8, bArr, 0, i9);
                byte[] bArrKgy = kgy(bArr, iArr2[0]);
                arrayList.add(new kgy(bArr, bArrKgy));
                iMax = Math.max(iMax, i9);
                iMax2 = Math.max(iMax2, bArrKgy.length);
                i5 += iArr[0];
                i4++;
                i = i6;
                i2 = i7;
                i3 = i8;
            }
            int i10 = i;
            if (i2 == i5) {
                com.bytedance.sdk.openadsdk.ioy.kgy kgyVar2 = new com.bytedance.sdk.openadsdk.ioy.kgy();
                for (int i11 = 0; i11 < iMax; i11++) {
                    int size = arrayList.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = arrayList.get(i12);
                        i12++;
                        byte[] bArrKgy2 = ((kgy) obj).kgy();
                        if (i11 < bArrKgy2.length) {
                            kgyVar2.kgy(bArrKgy2[i11], 8);
                        }
                    }
                }
                for (int i13 = 0; i13 < iMax2; i13++) {
                    int size2 = arrayList.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj2 = arrayList.get(i14);
                        i14++;
                        byte[] bArrAhm = ((kgy) obj2).ahm();
                        if (i13 < bArrAhm.length) {
                            kgyVar2.kgy(bArrAhm[i13], 8);
                        }
                    }
                }
                if (i10 == kgyVar2.ahm()) {
                    return kgyVar2;
                }
                StringBuilder sbS = jc1.s(i10, "Interleaving error: ", " and ");
                sbS.append(kgyVar2.ahm());
                sbS.append(" differ.");
                throw new sx(sbS.toString());
            }
            throw new sx("Data bytes does not match offset");
        }
        throw new sx("Number of bits and data bytes does not match");
    }

    public static byte[] kgy(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length + i];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        }
        new xh(gf.kgy).kgy(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    public static void kgy(kus kusVar, com.bytedance.sdk.openadsdk.ioy.kgy kgyVar) {
        kgyVar.kgy(kusVar.kgy(), 4);
    }

    public static void kgy(int i, fpp fppVar, kus kusVar, com.bytedance.sdk.openadsdk.ioy.kgy kgyVar) throws sx {
        int iKgy = kusVar.kgy(fppVar);
        int i2 = 1 << iKgy;
        if (i < i2) {
            kgyVar.kgy(i, iKgy);
            return;
        }
        throw new sx(i + " is bigger than " + (i2 - 1));
    }

    public static void kgy(String str, kus kusVar, com.bytedance.sdk.openadsdk.ioy.kgy kgyVar, Charset charset) throws sx {
        int i = AnonymousClass1.kgy[kusVar.ordinal()];
        if (i == 1) {
            kgy((CharSequence) str, kgyVar);
            return;
        }
        if (i == 2) {
            ahm(str, kgyVar);
        } else if (i == 3) {
            kgy(str, kgyVar, charset);
        } else {
            if (i == 4) {
                kgy(str, kgyVar);
                return;
            }
            throw new sx("Invalid mode: ".concat(String.valueOf(kusVar)));
        }
    }

    public static void kgy(CharSequence charSequence, com.bytedance.sdk.openadsdk.ioy.kgy kgyVar) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int iCharAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                kgyVar.kgy(pv1.v(charSequence.charAt(i + 1) - '0', 10, iCharAt * 100, charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    kgyVar.kgy((iCharAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    kgyVar.kgy(iCharAt, 4);
                }
            }
        }
    }

    public static void kgy(String str, com.bytedance.sdk.openadsdk.ioy.kgy kgyVar, Charset charset) {
        for (byte b : str.getBytes(charset)) {
            kgyVar.kgy(b, 8);
        }
    }

    public static void kgy(String str, com.bytedance.sdk.openadsdk.ioy.kgy kgyVar) throws sx {
        int i;
        Charset charset = um.kgy;
        if (charset != null) {
            byte[] bytes = str.getBytes(charset);
            if (bytes.length % 2 == 0) {
                int length = bytes.length - 1;
                for (int i2 = 0; i2 < length; i2 += 2) {
                    int i3 = ((bytes[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bytes[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    int i4 = 33088;
                    if (i3 >= 33088 && i3 <= 40956) {
                        i = i3 - i4;
                    } else if (i3 < 57408 || i3 > 60351) {
                        i = -1;
                    } else {
                        i4 = 49472;
                        i = i3 - i4;
                    }
                    if (i != -1) {
                        kgyVar.kgy(((i >> 8) * 192) + (i & 255), 13);
                    } else {
                        throw new sx("Invalid byte sequence");
                    }
                }
                return;
            }
            throw new sx("Kanji byte size not even");
        }
        throw new sx("SJIS Charset not supported on this platform");
    }

    private static void kgy(uq uqVar, com.bytedance.sdk.openadsdk.ioy.kgy kgyVar) {
        kgyVar.kgy(kus.ECI.kgy(), 4);
        kgyVar.kgy(uqVar.kgy(), 8);
    }
}
