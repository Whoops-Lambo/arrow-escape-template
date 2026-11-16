package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public abstract class MH extends AbstractC2798ef {
    public static String A04;
    public static String A05;
    public static String A06;
    public static byte[] A07;
    public static String[] A08 = {"1", "OJ2IOsbUnCKybSqk53zM3JXcifahO", "e4RldewFXKwYCBzcZ5CwWZ5XjhlRHNiJ", "729G42gqUNiz5ZAUAxRhvFZ2YWMhTd0L", "J1Ql0tv9onNfDvsMKNTgjNyaDa6Pnzub", "9fBm", "mbPUpspz4Nj5AFGqwEe2w9x9WWs", "2uSYGuFAJgr"};
    public int A00;
    public final boolean A01;
    public final C2804em A02;
    public final boolean A03;

    public static String A0A(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 30);
            if (A08[3].charAt(0) != '7') {
                throw new RuntimeException();
            }
            A08[5] = "PWjD";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A07 = new byte[]{93, 114, 119, 125, 117, 62, 114, 113, 121, 121, 123, 122, 68, 75, 65, 87, 74, 76, 65, 11, 76, 75, 81, 64, 75, 81, 11, 68, 70, 81, 76, 74, 75, 11, 115, 108, 96, 114, 24, 27, 25, 17, 37, 14, 19, 23, 31, 46, 39, 35, 52, 39, 29, 54, 43, 47, 39, 11, 17, 16, 7, 11, 9, 1, 37, 35, 53, 53, 51, 37, 37, 76, 87, 80, 79, 92, 75, 74, 88, 85, 102, 85, 80, 87, 82, 89, 95, 73, 94, 115, 88, 94, 77, 79, 71, 73, 94, 115, 69, 95, 115, 66, 67, 88, 115, 66, 89, 64, 64, 73, 79, 89, 78, 95, 80, 85, 95, 87, 96, 118, 99, 116, 127, 72, 118, 121, 115, 72, 117, 101, 120, 96, 100, 114};
    }

    public abstract EnumC2795ec A0J();

    static {
        A0B();
        A04 = A0A(64, 7, 72);
        A05 = A0A(85, 24, 50);
        A06 = A0A(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 16, 9);
    }

    public MH(C2055Hi c2055Hi, InterfaceC3321nG interfaceC3321nG, String str, C2804em c2804em, boolean z) {
        this(c2055Hi, interfaceC3321nG, str, c2804em, z, false);
    }

    public MH(C2055Hi c2055Hi, InterfaceC3321nG interfaceC3321nG, String str, C2804em c2804em, boolean z, boolean z2) {
        super(c2055Hi, interfaceC3321nG, str);
        this.A00 = 0;
        this.A02 = c2804em;
        this.A03 = z;
        this.A01 = z2;
        if (this.A02 != null) {
            this.A02.A07(new InterfaceC2797ee() { // from class: com.facebook.ads.redexgen.X.MI
                @Override // com.facebook.ads.redexgen.X.InterfaceC2797ee
                public final void AGh() {
                    this.A00.A0K();
                }
            });
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC2798ef
    public final EnumC2795ec A0G(String str) {
        if (this.A02 != null) {
            this.A02.A08(super.A03);
        }
        if (C3741u8.A05(super.A01)) {
            EnumC2795ec enumC2795ec = EnumC2795ec.A05;
            if (A08[1].length() != 32) {
                A08[6] = "d9";
                return enumC2795ec;
            }
        } else {
            boolean zA0N = A0N(str);
            String[] strArr = A08;
            if (strArr[2].charAt(18) != strArr[4].charAt(18)) {
                A08[1] = "2xR5Lf7zvGoOc6k6N0KJGWYDjft65vIkC";
                if (zA0N) {
                    return EnumC2795ec.A05;
                }
                return A0J();
            }
        }
        throw new RuntimeException();
    }

    public final /* synthetic */ void A0K() {
        this.A00++;
        if (A0N(null) && super.A00 != null) {
            super.A00.ADg();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0082  */
    /* JADX WARN: Code duplicated, block: B:23:0x0091  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ae  */
    public final void A0L(Map<String, String> extraData, EnumC2795ec enumC2795ec) {
        C2804em c2804em;
        if (!TextUtils.isEmpty(super.A03)) {
            if (this instanceof C18277w) {
                super.A02.ACy(super.A03, extraData);
            } else {
                InterfaceC3321nG interfaceC3321nG = super.A02;
                String str = super.A03;
                if (A08[6].length() != 8) {
                    A08[5] = "D2ZF";
                    interfaceC3321nG.ACA(str, extraData);
                } else {
                    interfaceC3321nG.ACA(str, extraData);
                }
            }
            boolean zA02 = EnumC2795ec.A02(enumC2795ec);
            if (A08[1].length() == 32) {
                throw new RuntimeException();
            }
            A08[0] = "X";
            boolean z = this.A02 != null;
            boolean isError = C3300mv.A2W(super.A01);
            if (isError) {
                Map<String, String> navigationDataMap = new HashMap<>();
                boolean isError2 = !zA02;
                navigationDataMap.put(A04, Boolean.toString(isError2));
                navigationDataMap.put(A05, Boolean.toString(z));
                String str2 = A06;
                boolean isError3 = this.A01;
                navigationDataMap.put(str2, Boolean.toString(isError3));
                super.A02.ACb(super.A03, navigationDataMap);
            }
            if (this.A02 != null) {
                this.A02.A06(enumC2795ec);
                if (A08[6].length() != 8) {
                    A08[6] = "4hYdj7INWre5bef3R1byHGHBMmQCX";
                    if (zA02) {
                        c2804em = this.A02;
                        if (A08[6].length() != 8) {
                            String[] strArr = A08;
                            strArr[2] = "42brCgECckKxVuTsLxKp6fXlInYi7mUj";
                            strArr[4] = "SJ7s8Rg0tKhfkKPQamVQVBa2w2xrx0QV";
                            c2804em.A05();
                        } else {
                            c2804em.A05();
                        }
                    }
                } else {
                    A08[5] = "IMSq";
                    if (zA02) {
                        c2804em = this.A02;
                        if (A08[6].length() != 8) {
                            String[] strArr2 = A08;
                            strArr2[2] = "42brCgECckKxVuTsLxKp6fXlInYi7mUj";
                            strArr2[4] = "SJ7s8Rg0tKhfkKPQamVQVBa2w2xrx0QV";
                            c2804em.A05();
                        } else {
                            c2804em.A05();
                        }
                    }
                }
            } else {
                HashMap map = new HashMap();
                map.put(A0A(47, 10, 92), Long.toString(-1L));
                map.put(A0A(38, 9, 100), Long.toString(-1L));
                map.put(A0A(57, 7, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), EnumC2795ec.A04.name());
                super.A02.ACz(super.A03, map);
            }
        }
        AbstractC3455pW.A04(super.A01, A0A(0, 12, 0));
    }

    public final boolean A0M(Uri uri) {
        try {
            String queryParameter = uri.getQueryParameter(A0A(71, 14, 39));
            boolean redirectedToApp = TextUtils.isEmpty(queryParameter);
            if (redirectedToApp) {
                return false;
            }
            Intent intent = new Intent(A0A(12, 26, 59), AbstractC3448pP.A00(queryParameter));
            intent.addFlags(268435456);
            if (Build.VERSION.SDK_INT >= 30) {
                intent.addFlags(1024);
            }
            return C3434p8.A0F(super.A01, intent);
        } catch (C3432p6 unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002d  */
    public final boolean A0N(String str) {
        if (str != null) {
            String[] strArr = A08;
            if (strArr[2].charAt(18) == strArr[4].charAt(18)) {
                throw new RuntimeException();
            }
            A08[3] = "7G1cJQr0jIuGleknkY04jEhD0A31LjuP";
            if (!str.equals(A0A(109, 9, 34))) {
                if (this.A00 == 0 && this.A00 >= C3300mv.A0G(super.A01)) {
                    return true;
                }
            }
        } else if (this.A00 == 0) {
        }
        return false;
    }
}
