package com.adsurge.adn.oversea_ad;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.HashMap;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/* JADX INFO: renamed from: com.adsurge.adn.oversea_ad.implements, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class Cimplements {
    public static final String[] j = {"px", "dp", "sp", "pt", "in", "mm"};
    public Ctransient a;
    public final HashMap b = new HashMap();
    public byte[] c;
    public String[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public int i;

    public final Document a(InputStream inputStream) throws IOException {
        String strB;
        String str;
        String strB2;
        byte[] bArr;
        Ctransient ctransient = new Ctransient();
        this.a = ctransient;
        byte[] bArr2 = new byte[inputStream.available()];
        this.c = bArr2;
        inputStream.read(bArr2);
        inputStream.close();
        while (true) {
            int i = this.i;
            if (i >= this.c.length) {
                this.a.getClass();
                return ctransient.b;
            }
            int iA = a(i);
            if (iA == -1) {
                this.a.getClass();
            } else if (iA == 524291) {
                Ctransient ctransient2 = this.a;
                Document documentNewDocument = ctransient2.c.newDocument();
                ctransient2.b = documentNewDocument;
                ctransient2.a.push(documentNewDocument);
                this.i += 8;
            } else if (iA == 524672) {
                int iA2 = a(this.i + 4);
                int i2 = (iA2 / 4) - 2;
                this.h = i2;
                this.e = new int[i2];
                for (int i3 = 0; i3 < this.h; i3++) {
                    this.e[i3] = a(((i3 + 2) * 4) + this.i);
                }
                this.i += iA2;
            } else if (iA != 1835009) {
                switch (iA) {
                    case 1048832:
                        int iA3 = a(this.i + 16);
                        String strB3 = b(a(this.i + 20));
                        String strB4 = b(iA3);
                        this.a.getClass();
                        this.b.put(strB3, strB4);
                        this.i += 24;
                        break;
                    case 1048833:
                        int iA4 = a(this.i + 16);
                        String strB5 = b(a(this.i + 20));
                        b(iA4);
                        this.a.getClass();
                        this.b.remove(strB5);
                        this.i += 24;
                        break;
                    case 1048834:
                        int iA5 = a(this.i + 16);
                        int iA6 = a(this.i + 20);
                        int i4 = this.i;
                        byte[] bArr3 = this.c;
                        int i5 = (65280 & (bArr3[i4 + 29] << 8)) | (bArr3[i4 + 28] & 255);
                        String strB6 = b(iA6);
                        if (iA5 == -1) {
                            str = strB6;
                            strB = "";
                        } else {
                            strB = b(iA5);
                            str = this.b.containsKey(strB) ? ((String) this.b.get(strB)) + ':' + strB6 : strB6;
                        }
                        this.i += 36;
                        Cfinal[] cfinalArr = new Cfinal[i5];
                        for (int i6 = 0; i6 < i5; i6++) {
                            int iA7 = a(this.i);
                            int iA8 = a(this.i + 4);
                            int iA9 = a(this.i + 8);
                            int iA10 = a(this.i + 12);
                            int iA11 = a(this.i + 16);
                            Cfinal cfinal = new Cfinal();
                            cfinal.a = b(iA8);
                            if (iA7 == -1) {
                                cfinal.c = null;
                                cfinal.b = null;
                            } else {
                                String strB7 = b(iA7);
                                if (this.b.containsKey(strB7)) {
                                    cfinal.c = strB7;
                                    cfinal.b = (String) this.b.get(strB7);
                                }
                            }
                            if (iA9 == -1) {
                                switch (iA10) {
                                    case 16777224:
                                        strB2 = String.format("@id/0x%08X", Integer.valueOf(iA11));
                                        break;
                                    case 33554440:
                                        strB2 = String.format("?id/0x%08X", Integer.valueOf(iA11));
                                        break;
                                    case 50331656:
                                        strB2 = b(iA11);
                                        break;
                                    case 67108872:
                                        strB2 = Float.toString(Float.intBitsToFloat(iA11));
                                        break;
                                    case 83886088:
                                        strB2 = Integer.toString(iA11 >> 8) + j[iA11 & 255];
                                        break;
                                    case 100663304:
                                        strB2 = new DecimalFormat("#.##%").format(((double) iA11) / 2.147483647E9d);
                                        break;
                                    case 268435464:
                                    case 285212680:
                                        strB2 = Integer.toString(iA11);
                                        break;
                                    case 301989896:
                                        strB2 = Boolean.toString(iA11 != 0);
                                        break;
                                    case 469762056:
                                    case 486539272:
                                        strB2 = String.format("#%08X", Integer.valueOf(iA11));
                                        break;
                                    default:
                                        strB2 = String.format("%08X/0x%08X", Integer.valueOf(iA10), Integer.valueOf(iA11));
                                        break;
                                }
                                cfinal.d = strB2;
                            } else {
                                cfinal.d = b(iA9);
                            }
                            cfinalArr[i6] = cfinal;
                            this.i += 20;
                        }
                        Ctransient ctransient3 = this.a;
                        ctransient3.getClass();
                        Element elementCreateElement = (strB == null || "".equals(strB)) ? ctransient3.b.createElement(strB6) : ctransient3.b.createElementNS(strB, str);
                        for (int i7 = 0; i7 < i5; i7++) {
                            Cfinal cfinal2 = cfinalArr[i7];
                            String str2 = cfinal2.c;
                            if (str2 == null || "".equals(str2)) {
                                elementCreateElement.setAttribute(cfinal2.a, cfinal2.d);
                            } else {
                                elementCreateElement.setAttributeNS(cfinal2.c, cfinal2.b + ':' + cfinal2.a, cfinal2.d);
                            }
                        }
                        ((Node) ctransient3.a.peek()).appendChild(elementCreateElement);
                        ctransient3.a.push(elementCreateElement);
                        break;
                    case 1048835:
                        int iA12 = a(this.i + 16);
                        b(a(this.i + 20));
                        if (iA12 != -1) {
                            b(iA12);
                        }
                        this.a.a.pop();
                        this.i += 24;
                        break;
                    case 1048836:
                        String strB8 = b(a(this.i + 16));
                        Ctransient ctransient4 = this.a;
                        ((Node) ctransient4.a.peek()).appendChild(ctransient4.b.createCDATASection(strB8));
                        this.i += 28;
                        break;
                    default:
                        this.i += 4;
                        break;
                }
            } else {
                int iA13 = a(this.i + 4);
                this.f = a(this.i + 8);
                this.g = a(this.i + 12);
                int i8 = this.i;
                int iA14 = a(i8 + 20) + i8;
                int iA15 = a(this.i + 24);
                this.d = new String[this.f];
                for (int i9 = 0; i9 < this.f; i9++) {
                    int iA16 = a(((i9 + 7) * 4) + this.i) + iA14;
                    String[] strArr = this.d;
                    byte[] bArr4 = this.c;
                    int i10 = bArr4[iA16 + 1];
                    int i11 = bArr4[iA16];
                    if (i10 == i11) {
                        bArr = new byte[i11];
                        for (int i12 = 0; i12 < i11; i12++) {
                            bArr[i12] = this.c[iA16 + 2 + i12];
                        }
                    } else {
                        int i13 = (i11 & 255) | ((i10 << 8) & 65280);
                        bArr = new byte[i13];
                        for (int i14 = 0; i14 < i13; i14++) {
                            bArr[i14] = this.c[(i14 * 2) + iA16 + 2];
                        }
                    }
                    strArr[i9] = new String(bArr);
                }
                if (iA15 > 0) {
                    for (int i15 = 0; i15 < this.g; i15++) {
                    }
                }
                this.i += iA13;
            }
        }
    }

    public final String b(int i) {
        if (i < 0 || i >= this.f) {
            return null;
        }
        return this.d[i];
    }

    public final int a(int i) {
        byte[] bArr = this.c;
        return (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i + 3] << 24) & (-16777216)) | ((bArr[i + 2] << 16) & 16711680) | ((bArr[i + 1] << 8) & 65280);
    }
}
