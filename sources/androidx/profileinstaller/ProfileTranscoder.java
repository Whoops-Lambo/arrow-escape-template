package androidx.profileinstaller;

import androidx.annotation.RequiresApi;
import defpackage.e32;
import defpackage.h50;
import defpackage.nj;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@RequiresApi
class ProfileTranscoder {
    public static final byte[] a = {112, 114, 111, 0};
    public static final byte[] b = {112, 114, 109, 0};

    public static byte[] a(DexProfileData[] dexProfileDataArr, byte[] bArr) throws IOException {
        int length = 0;
        for (DexProfileData dexProfileData : dexProfileDataArr) {
            length += ((((dexProfileData.g * 2) + 7) & (-8)) / 8) + (dexProfileData.e * 2) + b(dexProfileData.a, dexProfileData.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + dexProfileData.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, ProfileVersion.c)) {
            for (DexProfileData dexProfileData2 : dexProfileDataArr) {
                j(byteArrayOutputStream, dexProfileData2, b(dexProfileData2.a, dexProfileData2.b, bArr));
                l(byteArrayOutputStream, dexProfileData2);
                int[] iArr = dexProfileData2.h;
                int length2 = iArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length2) {
                    int i3 = iArr[i];
                    Encoding.f(byteArrayOutputStream, i3 - i2);
                    i++;
                    i2 = i3;
                }
                k(byteArrayOutputStream, dexProfileData2);
            }
        } else {
            for (DexProfileData dexProfileData3 : dexProfileDataArr) {
                j(byteArrayOutputStream, dexProfileData3, b(dexProfileData3.a, dexProfileData3.b, bArr));
            }
            for (DexProfileData dexProfileData4 : dexProfileDataArr) {
                l(byteArrayOutputStream, dexProfileData4);
                int[] iArr2 = dexProfileData4.h;
                int length3 = iArr2.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length3) {
                    int i6 = iArr2[i4];
                    Encoding.f(byteArrayOutputStream, i6 - i5);
                    i4++;
                    i5 = i6;
                }
                k(byteArrayOutputStream, dexProfileData4);
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static String b(String str, String str2, byte[] bArr) {
        byte[] bArr2 = ProfileVersion.e;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = ProfileVersion.d;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return nj.q(h50.p(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static int[] c(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iD = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iD += (int) Encoding.d(2, byteArrayInputStream);
            iArr[i2] = iD;
        }
        return iArr;
    }

    public static DexProfileData[] d(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, DexProfileData[] dexProfileDataArr) throws IOException {
        byte[] bArr3 = ProfileVersion.f;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, ProfileVersion.g)) {
                e32.i("Unsupported meta version");
                return null;
            }
            int iD = (int) Encoding.d(2, fileInputStream);
            byte[] bArrC = Encoding.c(fileInputStream, (int) Encoding.d(4, fileInputStream), (int) Encoding.d(4, fileInputStream));
            if (fileInputStream.read() > 0) {
                e32.i("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrC);
            try {
                DexProfileData[] dexProfileDataArrF = f(byteArrayInputStream, bArr2, iD, dexProfileDataArr);
                byteArrayInputStream.close();
                return dexProfileDataArrF;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(ProfileVersion.a, bArr2)) {
            e32.i("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            e32.i("Unsupported meta version");
            return null;
        }
        int iD2 = (int) Encoding.d(1, fileInputStream);
        byte[] bArrC2 = Encoding.c(fileInputStream, (int) Encoding.d(4, fileInputStream), (int) Encoding.d(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            e32.i("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrC2);
        try {
            DexProfileData[] dexProfileDataArrE = e(byteArrayInputStream2, iD2, dexProfileDataArr);
            byteArrayInputStream2.close();
            return dexProfileDataArrE;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static DexProfileData[] g(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, ProfileVersion.b)) {
            e32.i("Unsupported version");
            return null;
        }
        int iD = (int) Encoding.d(1, fileInputStream);
        byte[] bArrC = Encoding.c(fileInputStream, (int) Encoding.d(4, fileInputStream), (int) Encoding.d(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            e32.i("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrC);
        try {
            DexProfileData[] dexProfileDataArrH = h(byteArrayInputStream, str, iD);
            byteArrayInputStream.close();
            return dexProfileDataArrH;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static DexProfileData[] h(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new DexProfileData[0];
        }
        DexProfileData[] dexProfileDataArr = new DexProfileData[i];
        for (int i3 = 0; i3 < i; i3++) {
            int iD = (int) Encoding.d(2, byteArrayInputStream);
            int iD2 = (int) Encoding.d(2, byteArrayInputStream);
            dexProfileDataArr[i3] = new DexProfileData(str, new String(Encoding.b(iD, byteArrayInputStream), StandardCharsets.UTF_8), Encoding.d(4, byteArrayInputStream), iD2, (int) Encoding.d(4, byteArrayInputStream), (int) Encoding.d(4, byteArrayInputStream), new int[iD2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            DexProfileData dexProfileData = dexProfileDataArr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = dexProfileData.f;
            int i6 = dexProfileData.g;
            TreeMap treeMap = dexProfileData.i;
            int i7 = iAvailable - i5;
            int iD3 = i2;
            while (byteArrayInputStream.available() > i7) {
                iD3 += (int) Encoding.d(2, byteArrayInputStream);
                treeMap.put(Integer.valueOf(iD3), 1);
                int iD4 = (int) Encoding.d(2, byteArrayInputStream);
                while (iD4 > 0) {
                    Encoding.d(2, byteArrayInputStream);
                    int iD5 = (int) Encoding.d(1, byteArrayInputStream);
                    if (iD5 != 6 && iD5 != 7) {
                        while (iD5 > 0) {
                            Encoding.d(1, byteArrayInputStream);
                            int i8 = i2;
                            int i9 = i4;
                            for (int iD6 = (int) Encoding.d(1, byteArrayInputStream); iD6 > 0; iD6--) {
                                Encoding.d(2, byteArrayInputStream);
                            }
                            iD5--;
                            i2 = i8;
                            i4 = i9;
                        }
                    }
                    iD4--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i10 = i2;
            int i11 = i4;
            if (byteArrayInputStream.available() != i7) {
                e32.i("Read too much data during profile line parse");
                return null;
            }
            dexProfileData.h = c(byteArrayInputStream, dexProfileData.e);
            BitSet bitSetValueOf = BitSet.valueOf(Encoding.b((((i6 * 2) + 7) & (-8)) / 8, byteArrayInputStream));
            for (int i12 = i10; i12 < i6; i12++) {
                int i13 = bitSetValueOf.get(i12) ? 2 : i10;
                if (bitSetValueOf.get(i12 + i6)) {
                    i13 |= 4;
                }
                if (i13 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i12));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i10);
                    }
                    treeMap.put(Integer.valueOf(i12), Integer.valueOf(i13 | numValueOf.intValue()));
                }
            }
            i4 = i11 + 1;
            i2 = i10;
        }
        return dexProfileDataArr;
    }

    public static boolean i(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, DexProfileData[] dexProfileDataArr) throws IOException {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = ProfileVersion.a;
        int i = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = ProfileVersion.b;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrA = a(dexProfileDataArr, bArr3);
                Encoding.e(byteArrayOutputStream, dexProfileDataArr.length, 1);
                Encoding.e(byteArrayOutputStream, bArrA.length, 4);
                byte[] bArrA2 = Encoding.a(bArrA);
                Encoding.e(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr4 = ProfileVersion.d;
            if (Arrays.equals(bArr, bArr4)) {
                Encoding.e(byteArrayOutputStream, dexProfileDataArr.length, 1);
                for (DexProfileData dexProfileData : dexProfileDataArr) {
                    int size = dexProfileData.i.size() * 4;
                    String strB = b(dexProfileData.a, dexProfileData.b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    Encoding.f(byteArrayOutputStream, strB.getBytes(charset).length);
                    Encoding.f(byteArrayOutputStream, dexProfileData.h.length);
                    Encoding.e(byteArrayOutputStream, size, 4);
                    Encoding.e(byteArrayOutputStream, dexProfileData.c, 4);
                    byteArrayOutputStream.write(strB.getBytes(charset));
                    Iterator it = dexProfileData.i.keySet().iterator();
                    while (it.hasNext()) {
                        Encoding.f(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        Encoding.f(byteArrayOutputStream, 0);
                    }
                    for (int i2 : dexProfileData.h) {
                        Encoding.f(byteArrayOutputStream, i2);
                    }
                }
                return true;
            }
            byte[] bArr5 = ProfileVersion.c;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrA3 = a(dexProfileDataArr, bArr5);
                Encoding.e(byteArrayOutputStream, dexProfileDataArr.length, 1);
                Encoding.e(byteArrayOutputStream, bArrA3.length, 4);
                byte[] bArrA4 = Encoding.a(bArrA3);
                Encoding.e(byteArrayOutputStream, bArrA4.length, 4);
                byteArrayOutputStream.write(bArrA4);
                return true;
            }
            byte[] bArr6 = ProfileVersion.e;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            Encoding.f(byteArrayOutputStream, dexProfileDataArr.length);
            for (DexProfileData dexProfileData2 : dexProfileDataArr) {
                String str = dexProfileData2.a;
                TreeMap treeMap = dexProfileData2.i;
                String strB2 = b(str, dexProfileData2.b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                Encoding.f(byteArrayOutputStream, strB2.getBytes(charset2).length);
                Encoding.f(byteArrayOutputStream, treeMap.size());
                Encoding.f(byteArrayOutputStream, dexProfileData2.h.length);
                Encoding.e(byteArrayOutputStream, dexProfileData2.c, 4);
                byteArrayOutputStream.write(strB2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    Encoding.f(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i3 : dexProfileData2.h) {
                    Encoding.f(byteArrayOutputStream, i3);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            Encoding.f(byteArrayOutputStream2, dexProfileDataArr.length);
            int i4 = 2;
            int i5 = 2;
            for (DexProfileData dexProfileData3 : dexProfileDataArr) {
                Encoding.e(byteArrayOutputStream2, dexProfileData3.c, 4);
                Encoding.e(byteArrayOutputStream2, dexProfileData3.d, 4);
                Encoding.e(byteArrayOutputStream2, dexProfileData3.g, 4);
                String strB3 = b(dexProfileData3.a, dexProfileData3.b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strB3.getBytes(charset3).length;
                Encoding.f(byteArrayOutputStream2, length2);
                i5 = i5 + 14 + length2;
                byteArrayOutputStream2.write(strB3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i5 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            }
            WritableFileSection writableFileSection = new WritableFileSection(FileSectionType.DEX_FILES, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(writableFileSection);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i6 = 0;
            for (int i7 = 0; i7 < dexProfileDataArr.length; i7++) {
                try {
                    DexProfileData dexProfileData4 = dexProfileDataArr[i7];
                    Encoding.f(byteArrayOutputStream3, i7);
                    Encoding.f(byteArrayOutputStream3, dexProfileData4.e);
                    i6 = i6 + 4 + (dexProfileData4.e * i4);
                    int[] iArr = dexProfileData4.h;
                    int length3 = iArr.length;
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < length3) {
                        int i10 = iArr[i8];
                        Encoding.f(byteArrayOutputStream3, i10 - i9);
                        i8++;
                        i4 = i4;
                        i9 = i10;
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i6 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray2.length);
            }
            WritableFileSection writableFileSection2 = new WritableFileSection(FileSectionType.CLASSES, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(writableFileSection2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i11 = 0;
            int i12 = 0;
            while (i11 < dexProfileDataArr.length) {
                try {
                    DexProfileData dexProfileData5 = dexProfileDataArr[i11];
                    Iterator it3 = dexProfileData5.i.entrySet().iterator();
                    int iIntValue = i;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        k(byteArrayOutputStream5, dexProfileData5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            l(byteArrayOutputStream6, dexProfileData5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            Encoding.f(byteArrayOutputStream4, i11);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i13 = i12 + 6;
                            ArrayList arrayList4 = arrayList3;
                            Encoding.e(byteArrayOutputStream4, length4, 4);
                            Encoding.f(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i12 = i13 + length4;
                            i11++;
                            arrayList3 = arrayList4;
                            i = 0;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            WritableFileSection writableFileSection3 = new WritableFileSection(FileSectionType.METHODS, byteArray5, true);
            byteArrayOutputStream4.close();
            arrayList2.add(writableFileSection3);
            long size2 = 12 + ((long) (arrayList2.size() * 16));
            Encoding.e(byteArrayOutputStream, arrayList2.size(), 4);
            int i14 = 0;
            while (i14 < arrayList2.size()) {
                WritableFileSection writableFileSection4 = (WritableFileSection) arrayList2.get(i14);
                FileSectionType fileSectionType = writableFileSection4.a;
                byte[] bArr7 = writableFileSection4.b;
                Encoding.e(byteArrayOutputStream, fileSectionType.a, 4);
                Encoding.e(byteArrayOutputStream, size2, 4);
                if (writableFileSection4.c) {
                    long length5 = bArr7.length;
                    byte[] bArrA5 = Encoding.a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrA5);
                    Encoding.e(byteArrayOutputStream, bArrA5.length, 4);
                    Encoding.e(byteArrayOutputStream, length5, 4);
                    length = bArrA5.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    Encoding.e(byteArrayOutputStream, bArr7.length, 4);
                    Encoding.e(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i14++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i15));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static void j(ByteArrayOutputStream byteArrayOutputStream, DexProfileData dexProfileData, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        Encoding.f(byteArrayOutputStream, str.getBytes(charset).length);
        Encoding.f(byteArrayOutputStream, dexProfileData.e);
        Encoding.e(byteArrayOutputStream, dexProfileData.f, 4);
        Encoding.e(byteArrayOutputStream, dexProfileData.c, 4);
        Encoding.e(byteArrayOutputStream, dexProfileData.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void k(ByteArrayOutputStream byteArrayOutputStream, DexProfileData dexProfileData) throws IOException {
        byte[] bArr = new byte[(((dexProfileData.g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : dexProfileData.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i = iIntValue / 8;
                bArr[i] = (byte) (bArr[i] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i2 = iIntValue + dexProfileData.g;
                int i3 = i2 / 8;
                bArr[i3] = (byte) ((1 << (i2 % 8)) | bArr[i3]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void l(ByteArrayOutputStream byteArrayOutputStream, DexProfileData dexProfileData) throws IOException {
        int i = 0;
        for (Map.Entry entry : dexProfileData.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                Encoding.f(byteArrayOutputStream, iIntValue - i);
                Encoding.f(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }

    public static DexProfileData[] e(ByteArrayInputStream byteArrayInputStream, int i, DexProfileData[] dexProfileDataArr) {
        if (byteArrayInputStream.available() == 0) {
            return new DexProfileData[0];
        }
        if (i == dexProfileDataArr.length) {
            String[] strArr = new String[i];
            int[] iArr = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                int iD = (int) Encoding.d(2, byteArrayInputStream);
                iArr[i2] = (int) Encoding.d(2, byteArrayInputStream);
                strArr[i2] = new String(Encoding.b(iD, byteArrayInputStream), StandardCharsets.UTF_8);
            }
            for (int i3 = 0; i3 < i; i3++) {
                DexProfileData dexProfileData = dexProfileDataArr[i3];
                if (dexProfileData.b.equals(strArr[i3])) {
                    int i4 = iArr[i3];
                    dexProfileData.e = i4;
                    dexProfileData.h = c(byteArrayInputStream, i4);
                } else {
                    e32.i("Order of dexfiles in metadata did not match baseline");
                    return null;
                }
            }
            return dexProfileDataArr;
        }
        e32.i("Mismatched number of dex files found in metadata");
        return null;
    }

    public static DexProfileData[] f(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, DexProfileData[] dexProfileDataArr) throws IOException {
        String strSubstring;
        DexProfileData dexProfileData;
        if (byteArrayInputStream.available() == 0) {
            return new DexProfileData[0];
        }
        if (i == dexProfileDataArr.length) {
            for (int i2 = 0; i2 < i; i2++) {
                Encoding.d(2, byteArrayInputStream);
                String str = new String(Encoding.b((int) Encoding.d(2, byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8);
                long jD = Encoding.d(4, byteArrayInputStream);
                int iD = (int) Encoding.d(2, byteArrayInputStream);
                if (dexProfileDataArr.length <= 0) {
                    dexProfileData = null;
                    break;
                }
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                if (iIndexOf > 0) {
                    strSubstring = str.substring(iIndexOf + 1);
                } else {
                    strSubstring = str;
                }
                int i3 = 0;
                while (true) {
                    if (i3 >= dexProfileDataArr.length) {
                        dexProfileData = null;
                        break;
                    }
                    if (dexProfileDataArr[i3].b.equals(strSubstring)) {
                        dexProfileData = dexProfileDataArr[i3];
                        break;
                    }
                    i3++;
                }
                if (dexProfileData != null) {
                    dexProfileData.d = jD;
                    int[] iArrC = c(byteArrayInputStream, iD);
                    if (Arrays.equals(bArr, ProfileVersion.e)) {
                        dexProfileData.e = iD;
                        dexProfileData.h = iArrC;
                    }
                } else {
                    e32.i("Missing profile key: ".concat(str));
                    return null;
                }
            }
            return dexProfileDataArr;
        }
        e32.i("Mismatched number of dex files found in metadata");
        return null;
    }
}
