package com.facebook.ads.redexgen.X;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A05' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class EnumC2856fc {
    public static byte[] A01;
    public static final /* synthetic */ EnumC2856fc[] A02;
    public static final EnumC2856fc A03;
    public static final EnumC2856fc A04;
    public static final EnumC2856fc A05;
    public final String A00;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{24, 23, 18, 27, 1, 14, 12, 27, 29, 31, 29, 22, 27, 3, 1, 28, 11, 10, 12, 3, 1, 22, 16, 18, 16, 27, 22, 119, 101, 98, 118, 105, 101, 119, 127, 112, 114, 101, 99, 97, 99, 104, 101};
    }

    static {
        A02();
        String strA01 = A01(27, 16, 0);
        A05 = new EnumC2856fc(strA01, 0, strA01);
        String strA02 = A01(13, 14, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE);
        A04 = new EnumC2856fc(strA02, 1, strA02);
        String strA03 = A01(0, 13, 126);
        A03 = new EnumC2856fc(strA03, 2, strA03);
        A02 = A03();
    }

    public EnumC2856fc(String str, int i, String str2) {
        super(str, i);
        this.A00 = str2;
    }

    public static EnumC2856fc A00(String str) {
        for (EnumC2856fc enumC2856fc : values()) {
            if (enumC2856fc.A00.equalsIgnoreCase(str)) {
                return enumC2856fc;
            }
        }
        return A03;
    }

    public static /* synthetic */ EnumC2856fc[] A03() {
        return new EnumC2856fc[]{A05, A04, A03};
    }

    public static EnumC2856fc valueOf(String str) {
        return (EnumC2856fc) Enum.valueOf(EnumC2856fc.class, str);
    }

    public static EnumC2856fc[] values() {
        return (EnumC2856fc[]) A02.clone();
    }
}
