package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.vungle.ads.internal.protos.Sdk;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
@MetaExoPlayerCustomization
public final class C2787eU {
    public static byte[] A06;
    public static String[] A07 = {"uCLNqHbvUbwpkTMVOdq8Ax", "5gQ54", "yhjbU1", "eNcf7", "T0VlcLw5DR5PRhsfdvDAVu3stwC9yT9n", "4MdHmKt40ylS0JNbgRQnV7YVt1eOrGpS", "QCD5gpimh1JgBoNbXFIs8WNpeJpo1ZES", "jW155fMl75uIKo88X2q8iVtfsWToKp6t"};
    public InterfaceC2786eT A00;
    public InterfaceC2786eT A01;
    public final SparseArray<String> A02;
    public final SparseBooleanArray A03;
    public final SparseBooleanArray A04;
    public final HashMap<String, C2785eS> A05;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A07;
            if (strArr[5].charAt(20) != strArr[4].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[5] = "MgLVgui2fPxNExckRiC5VXYbEawkpgwZ";
            strArr2[4] = "qGMfynRLhhDVceSncoRPVQigUZh8yRBE";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 65);
            i4++;
        }
    }

    public static void A07() {
        A06 = new byte[]{-31, -27, -13, -49, -29, -30, -29, -49, -16, -21, -29, -13, -43, -16, -31, -28, -28, -23, -18, -25, -118, -117, -16, 21, 29, 8, 19, 16, 11, -57, 29, 8, 19, 28, 12, -57, 26, 16, 33, 12, -31, -57, 23, 21, 23, 28, 25, 24, 19, 23, 35, 34, 40, 25, 34, 40, 19, 29, 34, 24, 25, 44, -30, 25, 44, 29};
    }

    static {
        A07();
    }

    public C2787eU(ND nd, File file, byte[] bArr, boolean z, boolean z2) {
        AbstractC2159Ln.A08((nd == null && file == null) ? false : true);
        this.A05 = new HashMap<>();
        this.A02 = new SparseArray<>();
        this.A04 = new SparseBooleanArray();
        this.A03 = new SparseBooleanArray();
        C2178Mh c2178Mh = nd != null ? new C2178Mh(nd) : null;
        InterfaceC2786eT databaseStorage = file != null ? new C2177Mg(new File(file, A04(42, 24, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE)), bArr, z) : null;
        if (c2178Mh == null || (databaseStorage != null && z2)) {
            InterfaceC2786eT legacyStorage = (InterfaceC2786eT) N1.A0f(databaseStorage);
            this.A01 = legacyStorage;
            this.A00 = c2178Mh;
        } else {
            this.A01 = c2178Mh;
            this.A00 = databaseStorage;
        }
    }

    public static int A00(SparseArray<String> idToKey) {
        int id;
        int size = idToKey.size();
        if (size == 0) {
            id = 0;
        } else {
            int size2 = size - 1;
            id = idToKey.keyAt(size2) + 1;
        }
        if (id < 0) {
            id = 0;
            while (id < size) {
                int size3 = idToKey.keyAt(id);
                if (id != size3) {
                    break;
                }
                id++;
            }
        }
        return id;
    }

    private C2785eS A01(String str) {
        int iA00 = A00(this.A02);
        C2785eS c2785eS = new C2785eS(iA00, str);
        this.A05.put(str, c2785eS);
        this.A02.put(iA00, str);
        this.A03.put(iA00, true);
        this.A01.AHU(c2785eS);
        return c2785eS;
    }

    public static C2176Mf A02(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int nextBytesToRead = 0; nextBytesToRead < i; nextBytesToRead++) {
            String utf = dataInputStream.readUTF();
            int bytesRead = dataInputStream.readInt();
            if (bytesRead >= 0) {
                int valueSize = 0;
                int i2 = Math.min(bytesRead, 10485760);
                byte[] bArrCopyOf = N1.A07;
                while (valueSize != bytesRead) {
                    int size = valueSize + i2;
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    dataInputStream.readFully(bArrCopyOf, valueSize, i2);
                    valueSize += i2;
                    int size2 = bytesRead - valueSize;
                    i2 = Math.min(size2, 10485760);
                }
                map.put(utf, bArrCopyOf);
            } else {
                throw new IOException(A04(22, 20, 102) + bytesRead);
            }
        }
        return new C2176Mf(map);
    }

    public static Cipher A05() throws NoSuchPaddingException, NoSuchAlgorithmException {
        int i = N1.A02;
        String strA04 = A04(0, 20, 95);
        if (i == 18) {
            try {
                return Cipher.getInstance(strA04, A04(20, 2, 7));
            } catch (Throwable unused) {
            }
        }
        return Cipher.getInstance(strA04);
    }

    public static void A08(C2176Mf c2176Mf, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> setA06 = c2176Mf.A06();
        dataOutputStream.writeInt(setA06.size());
        for (Map.Entry<String, byte[]> entry : setA06) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    public static boolean A0A(String str) {
        return str.startsWith(A04(42, 24, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE));
    }

    public final int A0B(String str) {
        return A0D(str).A01;
    }

    public final C2785eS A0C(String str) {
        return this.A05.get(str);
    }

    public final C2785eS A0D(String str) {
        C2785eS cachedContent = this.A05.get(str);
        return cachedContent == null ? A01(str) : cachedContent;
    }

    public final C2176Mf A0E(String str) {
        C2785eS cachedContent = A0C(str);
        return cachedContent != null ? cachedContent.A03() : C2176Mf.A03;
    }

    public final String A0F(int i) {
        return this.A02.get(i);
    }

    public final Collection<C2785eS> A0G() {
        return Collections.unmodifiableCollection(this.A05.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0H() {
        VV vvA0N = AbstractC18509k.A07(this.A05.keySet()).A0N();
        while (vvA0N.hasNext()) {
            A0K((String) vvA0N.next());
        }
    }

    public final void A0I() throws IOException {
        this.A01.ALc(this.A05);
        int size = this.A04.size();
        for (int i = 0; i < size; i++) {
            SparseArray<String> sparseArray = this.A02;
            int removedIdCount = this.A04.keyAt(i);
            sparseArray.remove(removedIdCount);
        }
        this.A04.clear();
        this.A03.clear();
    }

    public final void A0J(long j) throws IOException {
        this.A01.AAt(j);
        if (this.A00 != null) {
            this.A00.AAt(j);
        }
        if (!this.A01.A71() && this.A00 != null && this.A00.A71()) {
            InterfaceC2786eT interfaceC2786eT = this.A00;
            String[] strArr = A07;
            if (strArr[3].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[3] = "RJ3xR";
            strArr2[1] = "XYRnk";
            interfaceC2786eT.ABa(this.A05, this.A02);
            this.A01.ALb(this.A05);
        } else {
            this.A01.ABa(this.A05, this.A02);
        }
        if (this.A00 != null) {
            this.A00.A6O();
            this.A00 = null;
        }
    }

    public final void A0K(String str) {
        C2785eS c2785eS = this.A05.get(str);
        if (c2785eS != null && c2785eS.A09() && c2785eS.A0A()) {
            this.A05.remove(str);
            int i = c2785eS.A01;
            boolean z = this.A03.get(i);
            this.A01.AGk(c2785eS, z);
            if (z) {
                this.A02.remove(i);
                this.A03.delete(i);
            } else {
                this.A02.put(i, null);
                this.A04.put(i, true);
            }
        }
    }

    public final void A0L(String str, C2790eX c2790eX) {
        C2785eS c2785eSA0D = A0D(str);
        if (c2785eSA0D.A0E(c2790eX)) {
            this.A01.AHU(c2785eSA0D);
        }
    }
}
