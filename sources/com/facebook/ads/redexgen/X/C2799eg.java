package com.facebook.ads.redexgen.X;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.explorestack.protobuf.openrtb.LossReason;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C2799eg {
    public static byte[] A00;
    public static String[] A01 = {"88AoqknPZ4rnlocmRSd1iIvU160OI6Up", "Xa", "c0t0ITAkOrWkNbi2AOUUle7x7Lv9c02n", "B7XNNyfmW5R2wceLmJkXAkDES3fZG3Pt", "MUV", "NALjFYAH0tlSEiNw3RaQSfKZY5jyxbRm", "XF7p93xq3OHri6co5HggQunfVTz3vEaG", "n2FdIZz9zx79PfKUryB9rXi8CBHMM9xX"};
    public static final String A02;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 33);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{111, 84, 91, 88, 86, 95, 26, 78, 85, 26, 74, 91, 72, 73, 95, 26, 80, 73, 85, 84, 26, 94, 91, 78, 91, 26, 83, 84, 26, 123, 94, 123, 89, 78, 83, 85, 84, 124, 91, 89, 78, 85, 72, 67, 20, 19, 22, 3, 22, 82, 83, 78, 84, 73, 88, 65, 94, 75, 64, 113, 66, 71, 64, 69, 98, 115, 96, 97, 123, 124, 117, 27, 10, 24, 24, 31, 3, 25, 4, 30, 12, 3, 39, 32, 59, 38, 49, 40, 47, 52, 41, 62, 4, 46, 41, 55, 4, 44, 62, 57, 4, 61, 58, 55, 55, 57, 58, 56, 48, 49, 55, 48, 32, 123, 100, 105, 104, 98, 82, 120, 127, 97};
    }

    static {
        A03();
        A02 = C2799eg.class.getSimpleName();
    }

    public static AbstractC2798ef A00(C2055Hi c2055Hi, InterfaceC3321nG interfaceC3321nG, String str, Uri uri, Map<String, String> map, C2847fT c2847fT) {
        return A01(c2055Hi, interfaceC3321nG, str, uri, map, true, false, c2847fT);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00af  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:44:0x010c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0112 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0114  */
    /* JADX WARN: Code duplicated, block: B:49:0x011a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0122 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x0123  */
    public static AbstractC2798ef A01(final C2055Hi c2055Hi, final InterfaceC3321nG interfaceC3321nG, final String action, final Uri uri, final Map<String, String> map, final boolean z, boolean z2, final C2847fT c2847fT) {
        final C2804em c2804emA00;
        byte b;
        if (uri == null || uri.getAuthority() == null) {
            return null;
        }
        String key = uri.getAuthority();
        String queryParameter = uri.getQueryParameter(A02(113, 9, 44));
        String queryParameter2 = uri.getQueryParameter(A02(45, 4, 86));
        if (queryParameter2 != null) {
            boolean zIsEmpty = TextUtils.isEmpty(queryParameter2);
            if (A01[2].charAt(25) != 'L') {
                throw new RuntimeException();
            }
            A01[2] = "ISDJ842CIGTTmPHzT0dMVnvZcLrwzpZ1";
            if (!zIsEmpty) {
                try {
                    JSONObject jSONObject = new JSONObject(queryParameter2);
                    Iterator<String> dataIterator = jSONObject.keys();
                    while (dataIterator.hasNext()) {
                        String next = dataIterator.next();
                        try {
                            map.put(next, jSONObject.getString(next));
                        } catch (JSONException e) {
                            e = e;
                            c2055Hi.A08().ABz(A02(64, 7, 51), AbstractC3223lf.A23, new C3224lg(e));
                            Log.w(A02, A02(0, 45, 27), e);
                            c2804emA00 = C2804em.A00(interfaceC3321nG, ActivityUtils.A00());
                            switch (key.hashCode()) {
                                case -1458789996:
                                    if (key.equals(A02(71, 11, 74))) {
                                        b = -1;
                                    } else {
                                        b = 2;
                                    }
                                    break;
                                case 109770977:
                                    if (key.equals(A02(82, 5, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE))) {
                                        b = -1;
                                    } else {
                                        b = 0;
                                    }
                                    break;
                                case 1546100943:
                                    if (key.equals(A02(55, 9, 15))) {
                                        b = -1;
                                    } else {
                                        b = 1;
                                    }
                                    break;
                                default:
                                    b = -1;
                                    break;
                            }
                            switch (b) {
                                case 0:
                                    if (queryParameter != null) {
                                        return null;
                                    }
                                    if (z2) {
                                    }
                                    break;
                                case 1:
                                    if (A02(109, 4, 100).equals(uri.getQueryParameter(A02(49, 6, 28)))) {
                                        return new MH(c2055Hi, interfaceC3321nG, action, uri, map, c2804emA00, z) { // from class: com.facebook.ads.redexgen.X.7t
                                            public static byte[] A02;
                                            public static final String A03;
                                            public final Uri A00;
                                            public final Map<String, String> A01;

                                            public static String A00(int i, int i2, int i3) {
                                                byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
                                                for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                                                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 79);
                                                }
                                                return new String(bArrCopyOfRange);
                                            }

                                            public static void A01() {
                                                A02 = new byte[]{122, 93, 85, 80, 89, 88, 28, 72, 83, 28, 83, 76, 89, 82, 28, 80, 85, 82, 87, 28, 73, 78, 80, 6, 28, 43, 46, 41, 44};
                                            }

                                            static {
                                                A01();
                                                A03 = C18247t.class.getSimpleName();
                                            }

                                            {
                                                this.A00 = uri;
                                                this.A01 = map;
                                            }

                                            @Override // com.facebook.ads.redexgen.X.MH
                                            public final EnumC2795ec A0J() {
                                                String queryParameter3;
                                                EnumC2795ec enumC2795ecA0O = EnumC2795ec.A08;
                                                if (((MH) this).A03) {
                                                    enumC2795ecA0O = A0O();
                                                    EnumC2795ec actionOutcome = EnumC2795ec.A03;
                                                    if (enumC2795ecA0O != actionOutcome && this.A01 != null && (queryParameter3 = this.A00.getQueryParameter(A00(25, 4, 8))) != null) {
                                                        try {
                                                            Uri uriA00 = AbstractC3448pP.A00(queryParameter3);
                                                            if (uriA00 != null) {
                                                                C3715ti c3715ti = new C3715ti(this.A01);
                                                                C2055Hi c2055Hi2 = ((AbstractC2798ef) this).A01;
                                                                String link = uriA00.toString();
                                                                c3715ti.A03(c2055Hi2, link);
                                                            }
                                                        } catch (Exception unused) {
                                                        }
                                                    }
                                                }
                                                A0L(this.A01, enumC2795ecA0O);
                                                return enumC2795ecA0O;
                                            }

                                            public final EnumC2795ec A0O() {
                                                EnumC2795ec enumC2795ec = EnumC2795ec.A08;
                                                try {
                                                    C3444pK.A0D(new C3444pK(), ((AbstractC2798ef) this).A01, AbstractC3448pP.A00(this.A00.getQueryParameter(A00(25, 4, 8))), ((AbstractC2798ef) this).A03);
                                                    return enumC2795ec;
                                                } catch (Exception unused) {
                                                    String str = A00(0, 25, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE) + this.A00.toString();
                                                    return EnumC2795ec.A03;
                                                }
                                            }
                                        };
                                    }
                                    return z2 ? new C18267v(c2055Hi, interfaceC3321nG, action, uri, map) : new MH(c2055Hi, interfaceC3321nG, action, uri, map, c2804emA00, z) { // from class: com.facebook.ads.redexgen.X.7u
                                        public static byte[] A02;
                                        public static String[] A03 = {"EO73VH", "Qgz5bq7vpM6wgaeZrwJ0N", "K0RixItTLV229tIQ9volfY9Fr2yfBG4Z", "0XJd0xzB9RaoqzSBbOWrwbmO5Qd7B1Hm", "", "cDFQfUnzrKwrnb1BC8KnyL9IHyRAK9fC", "Q7Q0M0vYffDRrtcuJmKxnq", "hygqtGcON2Cep"};
                                        public static final String A04;
                                        public final Uri A00;
                                        public final Map<String, String> A01;

                                        public static String A00(int i, int i2, int i3) {
                                            byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
                                            for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                                                bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 99);
                                            }
                                            return new String(bArrCopyOfRange);
                                        }

                                        public static void A01() {
                                            byte[] bArr = {14, 41, 49, 52, 45, 44, -24, 60, 55, -24, 55, 56, 45, 54, -24, 52, 49, 54, 51, -24, 61, 58, 52, 2, -24, -14, -17, -12, -15, 35, 28, 23, 36, 19, 32, 33, 15, 26, 13, 26, 23, 28, 25};
                                            if (A03[0].length() == 23) {
                                                throw new RuntimeException();
                                            }
                                            String[] strArr = A03;
                                            strArr[3] = "z2LBMWL3UZ6mgEOfq1wT6wdWGhdUBaxY";
                                            strArr[2] = "LNV6u0tAGiEAXpu6l5ZCQkq7c5KJBKxy";
                                            A02 = bArr;
                                        }

                                        static {
                                            A01();
                                            A04 = C18257u.class.getSimpleName();
                                        }

                                        {
                                            this.A00 = uri;
                                            this.A01 = map;
                                        }

                                        @Override // com.facebook.ads.redexgen.X.MH
                                        public final EnumC2795ec A0J() {
                                            EnumC2795ec enumC2795ecA0O = EnumC2795ec.A08;
                                            if (((MH) this).A03) {
                                                enumC2795ecA0O = A0O();
                                            }
                                            if (!AbstractC3523qc.A0j(((AbstractC2798ef) this).A01, enumC2795ecA0O, this.A01)) {
                                                A0L(this.A01, enumC2795ecA0O);
                                            }
                                            return enumC2795ecA0O;
                                        }

                                        public final EnumC2795ec A0O() {
                                            EnumC2795ec enumC2795ecA06;
                                            if (A0M(this.A00)) {
                                                String deeplink = this.A00.getQueryParameter(A00(29, 14, 75));
                                                if (this.A01 != null) {
                                                    new C3715ti(this.A01).A03(((AbstractC2798ef) this).A01, deeplink);
                                                }
                                                EnumC2795ec actionOutcome = EnumC2795ec.A09;
                                                return actionOutcome;
                                            }
                                            Uri uriA00 = null;
                                            try {
                                                uriA00 = AbstractC3448pP.A00(this.A00.getQueryParameter(A00(25, 4, 35)));
                                                enumC2795ecA06 = C3444pK.A06(new C3444pK(), ((AbstractC2798ef) this).A01, uriA00, ((AbstractC2798ef) this).A03, this.A01);
                                            } catch (Exception unused) {
                                                String str = A00(0, 25, 101) + this.A00.toString();
                                                enumC2795ecA06 = EnumC2795ec.A03;
                                            }
                                            EnumC2795ec actionOutcome2 = EnumC2795ec.A03;
                                            if (enumC2795ecA06 != actionOutcome2 && this.A01 != null && uriA00 != null) {
                                                new C3715ti(this.A01).A03(((AbstractC2798ef) this).A01, uriA00.toString());
                                            }
                                            return enumC2795ecA06;
                                        }
                                    };
                                case 2:
                                    return new MG(c2055Hi, interfaceC3321nG, action, uri, map);
                                default:
                                    return new MF(c2055Hi, interfaceC3321nG, action, uri);
                            }
                        }
                    }
                } catch (JSONException e2) {
                    e = e2;
                }
            }
        }
        c2804emA00 = C2804em.A00(interfaceC3321nG, ActivityUtils.A00());
        switch (key.hashCode()) {
            case -1458789996:
                if (key.equals(A02(71, 11, 74))) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 109770977:
                if (key.equals(A02(82, 5, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE))) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 1546100943:
                if (key.equals(A02(55, 9, 15))) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                if (queryParameter != null) {
                    return null;
                }
                return (z2 || TextUtils.isEmpty(uri.getQueryParameter(A02(87, 22, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE)))) ? new MH(c2055Hi, interfaceC3321nG, action, uri, map, c2804emA00, z, c2847fT) { // from class: com.facebook.ads.redexgen.X.7w
                    public static byte[] A04;
                    public static String[] A05 = {"eZwrQOnpnpQE2xbRo0zNjy7tlobdqdqH", "SFt7WwZUn", "NjRPf9lXQVcUlHZaPZ2tHyzwDKEOZm5m", "vsw9aGbGyLBdbL44W3z8tEYPUFR7w9", "bZApvv", "GYK1wV", "jBSwIULngy0dc0IzE6SbgF9ev3BAFzHy", "9HFC3JFq8"};
                    public static final String A06;
                    public String A00;
                    public final Uri A01;
                    public final C2847fT A02;
                    public final Map<String, String> A03;

                    public static String A04(int i, int i2, int i3) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
                        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                            int i5 = (bArrCopyOfRange[i4] - i3) - 27;
                            String[] strArr = A05;
                            if (strArr[6].charAt(23) == strArr[0].charAt(23)) {
                                throw new RuntimeException();
                            }
                            A05[3] = "uqLwDcTKX4SWJds2FMBMp5QNw2MnWtU";
                            bArrCopyOfRange[i4] = (byte) i5;
                        }
                        return new String(bArrCopyOfRange);
                    }

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    private final List<Intent> A06() {
                        List<C2803ek> listA05 = A05();
                        ArrayList arrayList = new ArrayList();
                        if (listA05 != null) {
                            Iterator<C2803ek> it = listA05.iterator();
                            while (it.hasNext()) {
                                Intent intentA00 = A00(it.next());
                                if (intentA00 != null) {
                                    arrayList.add(intentA00);
                                }
                            }
                        }
                        return arrayList;
                    }

                    public static void A07() {
                        A04 = new byte[]{106, -105, -105, -108, -105, 69, -107, -122, -105, -104, -114, -109, -116, 69, -122, -107, -107, -104, -114, -103, -118, -124, -119, -122, -103, -122, -124, -97, -89, -86, -93, -94, 94, -78, -83, 94, -83, -82, -93, -84, 94, -85, -97, -80, -87, -93, -78, 94, -77, -80, -86, 120, 94, -29, -27, -5, 8, -2, 12, 9, 3, -2, -108, -95, -105, -91, -94, -100, -105, 97, -100, -95, -89, -104, -95, -89, 97, -108, -106, -89, -100, -94, -95, 97, 119, 124, 116, 127, -94, -81, -91, -77, -80, -86, -91, 111, -86, -81, -75, -90, -81, -75, 111, -94, -92, -75, -86, -80, -81, 111, -105, -118, -122, -104, -8, 7, 7, 10, 0, 11, -4, -10, -5, -8, 11, -8, -3, -15, 2, -5, -11, 4, -54, -65, -65, -12, -11, 4, -15, -7, -4, 3, -49, -7, -12, -51, -75, 3, -26, -25, -36, -27, -36, -37, -42, -37, -36, -36, -25, -29, -32, -27, -30, -108, -107, -118, -109, -118, -119, -124, -104, -103, -108, -105, -118, -124, -117, -122, -111, -111, -121, -122, -120, -112, -124, -102, -105, -111, -38, -37, -48, -39, -48, -49, -54, -34, -33, -38, -35, -48, -54, -32, -35, -41, -70, -85, -68, -67, -77, -72, -79, -51, -50, -55, -52, -65, -71, -61, -66, -10, -9, -14, -11, -24, -30, -8, -11, -17, -96, -95, -100, -97, -110, -116, -94, -97, -103, -116, -92, -110, -113, -116, -109, -114, -103, -103, -113, -114, -112, -104, -90, -105, -98, 108, -72, -87, -80, -76, -74, -77, -79, -76, -72, 126, -61, -68, -73, -60, -77, -64, -63, -81, -70, -83, -70, -73, -68, -71};
                    }

                    static {
                        A07();
                        A06 = C18277w.class.getSimpleName();
                    }

                    {
                        this.A01 = uri;
                        this.A03 = map;
                        this.A02 = c2847fT;
                    }

                    /* JADX WARN: Code duplicated, block: B:53:0x011d  */
                    /* JADX WARN: Code duplicated, block: B:55:0x0125 A[RETURN] */
                    /* JADX WARN: Code duplicated, block: B:56:0x0126  */
                    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
                    
                        if (r4.startsWith(r0) != false) goto L16;
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    private android.content.Intent A00(com.facebook.ads.redexgen.X.C2803ek r10) {
                        /*
                            Method dump skipped, instruction units count: 302
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C18277w.A00(com.facebook.ads.redexgen.X.ek):android.content.Intent");
                    }

                    private Intent A01(C2803ek c2803ek) {
                        Intent intent = new Intent(A04(88, 26, 38));
                        intent.addFlags(268435456);
                        if (!TextUtils.isEmpty(c2803ek.A05()) && !TextUtils.isEmpty(c2803ek.A04())) {
                            intent.setComponent(new ComponentName(c2803ek.A05(), c2803ek.A04()));
                        }
                        if (!TextUtils.isEmpty(c2803ek.A03())) {
                            intent.setData(AbstractC3448pP.A00(c2803ek.A03()));
                        }
                        return intent;
                    }

                    private final Uri A02() {
                        String queryParameter3 = this.A01.getQueryParameter(A04(Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 9, 104));
                        if (!TextUtils.isEmpty(queryParameter3)) {
                            return AbstractC3448pP.A00(queryParameter3);
                        }
                        Uri uri2 = this.A01;
                        String storeUrl = A04(LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, 8, 63);
                        String storeId = uri2.getQueryParameter(storeUrl);
                        Locale locale = Locale.US;
                        Object[] objArr = {storeId};
                        String storeUrl2 = A04(126, 22, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
                        return AbstractC3448pP.A00(String.format(locale, storeUrl2, objArr));
                    }

                    private EnumC2795ec A03() throws C3432p6 {
                        this.A00 = null;
                        C3444pK c3444pK = new C3444pK();
                        try {
                            Uri uriA02 = A02();
                            EnumC2795ec enumC2795ecA06 = C3444pK.A06(c3444pK, ((AbstractC2798ef) this).A01, uriA02, ((AbstractC2798ef) this).A03, this.A03);
                            if (enumC2795ecA06 != EnumC2795ec.A08) {
                                this.A00 = uriA02 != null ? uriA02.toString() : null;
                            }
                            return enumC2795ecA06;
                        } catch (C3432p6 unused) {
                            String str = A04(26, 27, 35) + this.A01.toString();
                            String queryParameter3 = this.A01.getQueryParameter(A04(228, 22, 18));
                            if (queryParameter3 != null) {
                                int length = queryParameter3.length();
                                String[] strArr = A05;
                                if (strArr[5].length() != strArr[4].length()) {
                                    throw new RuntimeException();
                                }
                                A05[2] = "UmbMkLHRt7mU5WI1cGYqu3JtAtwRZWLm";
                                if (length > 0) {
                                    Uri uriA00 = AbstractC3448pP.A00(queryParameter3);
                                    C3444pK.A0E(c3444pK, ((AbstractC2798ef) this).A01, uriA00, ((AbstractC2798ef) this).A03);
                                    this.A00 = uriA00 != null ? uriA00.toString() : null;
                                }
                            }
                            return EnumC2795ec.A08;
                        }
                    }

                    private List<C2803ek> A05() {
                        String queryParameter3 = this.A01.getQueryParameter(A04(Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, 12, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE));
                        if (TextUtils.isEmpty(queryParameter3)) {
                            return null;
                        }
                        String appsiteDataString = A04(53, 2, 109);
                        if (appsiteDataString.equals(queryParameter3)) {
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        try {
                            JSONObject jSONObject2 = new JSONObject(queryParameter3);
                            String appsiteDataString2 = A04(55, 7, 127);
                            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray(appsiteDataString2);
                            if (jSONArrayOptJSONArray != null) {
                                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                                    C2803ek c2803ekA00 = C2803ek.A00(jSONArrayOptJSONArray.optJSONObject(i));
                                    if (c2803ekA00 != null) {
                                        arrayList.add(c2803ekA00);
                                    }
                                }
                            }
                        } catch (JSONException e3) {
                            InterfaceC3222le interfaceC3222leA08 = ((AbstractC2798ef) this).A01.A08();
                            int i2 = AbstractC3223lf.A24;
                            C3224lg c3224lg = new C3224lg(e3);
                            String appsiteDataString3 = A04(204, 7, 47);
                            interfaceC3222leA08.ABz(appsiteDataString3, i2, c3224lg);
                            String str = A06;
                            String appsiteDataString4 = A04(0, 26, 10);
                            Log.w(str, appsiteDataString4, e3);
                        }
                        return arrayList;
                    }

                    private boolean A08() {
                        List<Intent> appLaunchIntents = A06();
                        if (appLaunchIntents == null) {
                            return false;
                        }
                        Iterator<Intent> it = appLaunchIntents.iterator();
                        while (it.hasNext()) {
                            try {
                                if (C3434p8.A0F(((AbstractC2798ef) this).A01, it.next())) {
                                    return true;
                                }
                            } catch (Exception unused) {
                            }
                        }
                        return false;
                    }

                    public static boolean A09(C2055Hi c2055Hi2, String str) {
                        if (Build.VERSION.SDK_INT >= 30 && str != null) {
                            boolean zA29 = C3300mv.A29(c2055Hi2);
                            if (A05[3].length() == 13) {
                                throw new RuntimeException();
                            }
                            String[] strArr = A05;
                            strArr[7] = "1LqNNd92i";
                            strArr[1] = "QkgxMECyk";
                            if (zA29) {
                                return true;
                            }
                        }
                        return false;
                    }

                    @Override // com.facebook.ads.redexgen.X.MH
                    public final EnumC2795ec A0J() {
                        EnumC2795ec enumC2795ecA0O = EnumC2795ec.A08;
                        if (((MH) this).A03) {
                            enumC2795ecA0O = A0O();
                        } else {
                            this.A03.put(A04(188, 16, 80), String.valueOf(true));
                        }
                        A0L(this.A03, enumC2795ecA0O);
                        C2847fT.A06(this.A02, ((AbstractC2798ef) this).A01);
                        return enumC2795ecA0O;
                    }

                    public final EnumC2795ec A0O() {
                        EnumC2795ec enumC2795ecA03 = EnumC2795ec.A08;
                        String strA04 = A04(148, 15, 92);
                        String queryParameter3 = null;
                        boolean zA0M = A0M(this.A01);
                        if (!zA0M) {
                            zA0M = A08();
                        }
                        if (zA0M) {
                            Uri uri2 = this.A01;
                            String redirectionAction = A04(264, 14, 51);
                            queryParameter3 = uri2.getQueryParameter(redirectionAction);
                        } else {
                            try {
                                enumC2795ecA03 = A03();
                                strA04 = enumC2795ecA03 != EnumC2795ec.A08 ? A04(188, 16, 80) : A04(163, 25, 10);
                                queryParameter3 = this.A00;
                            } catch (Exception unused) {
                                enumC2795ecA03 = EnumC2795ec.A03;
                            }
                        }
                        Map<String, String> map2 = this.A03;
                        String redirectionAction2 = String.valueOf(true);
                        map2.put(strA04, redirectionAction2);
                        new C3715ti(this.A03).A03(((AbstractC2798ef) this).A01, queryParameter3);
                        return enumC2795ecA03;
                    }
                } : new C18267v(c2055Hi, interfaceC3321nG, action, uri, map);
            case 1:
                if (A02(109, 4, 100).equals(uri.getQueryParameter(A02(49, 6, 28)))) {
                    return new MH(c2055Hi, interfaceC3321nG, action, uri, map, c2804emA00, z) { // from class: com.facebook.ads.redexgen.X.7t
                        public static byte[] A02;
                        public static final String A03;
                        public final Uri A00;
                        public final Map<String, String> A01;

                        public static String A00(int i, int i2, int i3) {
                            byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
                            for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                                bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 79);
                            }
                            return new String(bArrCopyOfRange);
                        }

                        public static void A01() {
                            A02 = new byte[]{122, 93, 85, 80, 89, 88, 28, 72, 83, 28, 83, 76, 89, 82, 28, 80, 85, 82, 87, 28, 73, 78, 80, 6, 28, 43, 46, 41, 44};
                        }

                        static {
                            A01();
                            A03 = C18247t.class.getSimpleName();
                        }

                        {
                            this.A00 = uri;
                            this.A01 = map;
                        }

                        @Override // com.facebook.ads.redexgen.X.MH
                        public final EnumC2795ec A0J() {
                            String queryParameter3;
                            EnumC2795ec enumC2795ecA0O = EnumC2795ec.A08;
                            if (((MH) this).A03) {
                                enumC2795ecA0O = A0O();
                                EnumC2795ec actionOutcome = EnumC2795ec.A03;
                                if (enumC2795ecA0O != actionOutcome && this.A01 != null && (queryParameter3 = this.A00.getQueryParameter(A00(25, 4, 8))) != null) {
                                    try {
                                        Uri uriA00 = AbstractC3448pP.A00(queryParameter3);
                                        if (uriA00 != null) {
                                            C3715ti c3715ti = new C3715ti(this.A01);
                                            C2055Hi c2055Hi2 = ((AbstractC2798ef) this).A01;
                                            String link = uriA00.toString();
                                            c3715ti.A03(c2055Hi2, link);
                                        }
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            A0L(this.A01, enumC2795ecA0O);
                            return enumC2795ecA0O;
                        }

                        public final EnumC2795ec A0O() {
                            EnumC2795ec enumC2795ec = EnumC2795ec.A08;
                            try {
                                C3444pK.A0D(new C3444pK(), ((AbstractC2798ef) this).A01, AbstractC3448pP.A00(this.A00.getQueryParameter(A00(25, 4, 8))), ((AbstractC2798ef) this).A03);
                                return enumC2795ec;
                            } catch (Exception unused) {
                                String str = A00(0, 25, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE) + this.A00.toString();
                                return EnumC2795ec.A03;
                            }
                        }
                    };
                }
                if (z2) {
                }
            case 2:
                return new MG(c2055Hi, interfaceC3321nG, action, uri, map);
            default:
                return new MF(c2055Hi, interfaceC3321nG, action, uri);
        }
    }

    public static boolean A04(String str) {
        return A02(82, 5, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE).equalsIgnoreCase(str) || A02(55, 9, 15).equalsIgnoreCase(str);
    }
}
