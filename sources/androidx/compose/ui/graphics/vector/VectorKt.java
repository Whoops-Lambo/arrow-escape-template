package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Color;
import defpackage.dr0;
import defpackage.e32;
import defpackage.gg0;
import defpackage.s71;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class VectorKt {
    public static final /* synthetic */ int a = 0;

    static {
        int i = Color.j;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    public static final List a(String str) {
        char c;
        int i;
        float[] fArr;
        char c2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (str == null) {
            return gg0.a;
        }
        PathParser pathParser = new PathParser();
        ArrayList arrayList = pathParser.a;
        arrayList.clear();
        boolean z7 = false;
        int i2 = 0;
        int i3 = 1;
        while (i3 < str.length()) {
            while (i3 < str.length()) {
                char cCharAt = str.charAt(i3);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        break;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i3++;
            }
            String strSubstring = str.substring(i2, i3);
            int length = strSubstring.length() - 1;
            int i4 = z7 ? 1 : 0;
            boolean z8 = i4 == true ? 1 : 0;
            while (true) {
                c = ' ';
                if (i4 > length) {
                    break;
                }
                boolean z9 = s71.h(strSubstring.charAt(!z8 ? i4 : length), 32) <= 0 ? true : z7 ? 1 : 0;
                if (z8) {
                    if (!z9) {
                        break;
                    }
                    length--;
                } else if (z9) {
                    i4++;
                } else {
                    z8 = true;
                }
            }
            String string = strSubstring.subSequence(i4, length + 1).toString();
            if (string.length() > 0) {
                if (string.charAt(z7 ? 1 : 0) == 'z' || string.charAt(z7 ? 1 : 0) == 'Z') {
                    i = z7 ? 1 : 0;
                    fArr = new float[i];
                } else {
                    int length2 = string.length();
                    float[] fArr2 = new float[length2];
                    PathParser.ExtractFloatResult extractFloatResult = new PathParser.ExtractFloatResult();
                    extractFloatResult.a = z7 ? 1 : 0;
                    extractFloatResult.b = z7;
                    int length3 = string.length();
                    int i5 = z7 ? 1 : 0;
                    int i6 = 1;
                    while (i6 < length3) {
                        extractFloatResult.b = z7;
                        boolean z10 = z7;
                        boolean z11 = z10 ? 1 : 0;
                        boolean z12 = z11 ? 1 : 0;
                        int i7 = i6;
                        boolean z13 = z11;
                        while (true) {
                            if (i7 >= string.length()) {
                                c2 = 'E';
                                break;
                            }
                            char cCharAt2 = string.charAt(i7);
                            if (cCharAt2 == c || cCharAt2 == ',') {
                                z = true;
                                z6 = z13;
                                c2 = 'E';
                                z5 = z6;
                                z4 = z;
                                z10 = false;
                                z3 = z5;
                                z2 = z4;
                            } else if (cCharAt2 == '-') {
                                if (i7 != i6 && !z10) {
                                    extractFloatResult.b = true;
                                    z = true;
                                    z6 = z13;
                                }
                                c2 = 'E';
                                z5 = z6;
                                z4 = z;
                                z10 = false;
                                z3 = z5;
                                z2 = z4;
                            } else if (cCharAt2 == '.') {
                                if (z13) {
                                    extractFloatResult.b = true;
                                    z = true;
                                    z6 = z13;
                                } else {
                                    z6 = true;
                                    z = z12;
                                }
                                c2 = 'E';
                                z5 = z6;
                                z4 = z;
                                z10 = false;
                                z3 = z5;
                                z2 = z4;
                            } else {
                                c2 = 'E';
                                if (cCharAt2 == 'e' || cCharAt2 == 'E') {
                                    z6 = z13;
                                    z6 = z13;
                                    z = z12;
                                    z = z12;
                                    z5 = z13;
                                    z4 = z12;
                                    z10 = true;
                                    z3 = z13;
                                    z2 = z12;
                                } else {
                                    z10 = false;
                                    z3 = z5;
                                    z2 = z4;
                                }
                            }
                            if (z2) {
                                break;
                            }
                            i7++;
                            c = ' ';
                            z13 = z3;
                            z12 = z2;
                        }
                        extractFloatResult.a = i7;
                        if (i6 < i7) {
                            fArr2[i5] = Float.parseFloat(string.substring(i6, i7));
                            i5++;
                        }
                        i6 = extractFloatResult.b ? i7 : i7 + 1;
                        z7 = false;
                        c = ' ';
                    }
                    if (i5 < 0) {
                        e32.a();
                        return null;
                    }
                    if (length2 < 0) {
                        dr0.b();
                        return null;
                    }
                    int iMin = Math.min(i5, length2);
                    fArr = new float[i5];
                    i = 0;
                    System.arraycopy(fArr2, 0, fArr, 0, iMin);
                }
                pathParser.a(string.charAt(i), fArr);
            }
            i2 = i3;
            i3++;
            z7 = false;
        }
        if (i3 - i2 == 1 && i2 < str.length()) {
            pathParser.a(str.charAt(i2), new float[0]);
        }
        return arrayList;
    }
}
