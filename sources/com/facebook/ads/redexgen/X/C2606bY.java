package com.facebook.ads.redexgen.X;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C2606bY {
    public static String[] A08 = {"9L1w1wV8uajUNZnJ4CsOiYfBiqoiZfeA", "bzRqQYl6PZHe7cfIHZtstW", "iY6zgtiE4PSYe0KB82pLH9ipKgaa2WMA", "EFWNwk268AsnZ5dtWGIGOBNrPqtnFZY6", "TcLUNR3L8Jh6JezAs", "nVl3z02gaD8dKggnIOCH8XoSTId1zgut", "g04dyTW3dZEIDdz5", "CGmG3KdGn75Yn1mGp9OkuGqxGyDJVKW2"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final List<C2605bX> A06 = new ArrayList();
    public final List<SpannableString> A07 = new ArrayList();
    public final StringBuilder A05 = new StringBuilder();

    public C2606bY(int i, int i2) {
        A0C(i);
        this.A01 = i2;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f6  */
    private SpannableString A04() {
        int i;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A05);
        int length = spannableStringBuilder.length();
        int color = -1;
        int colorStartPosition = -1;
        int italicStartPosition = 0;
        int underlineStartPosition = -1;
        boolean z = false;
        int i2 = -1;
        for (int nextPosition = 0; nextPosition < this.A06.size(); nextPosition++) {
            C2605bX c2605bX = this.A06.get(nextPosition);
            boolean z2 = c2605bX.A02;
            int i3 = c2605bX.A01;
            if (i3 != 8) {
                if (A08[4].length() == 17) {
                    A08[5] = "1HQDujgXs2rhggsqxpROWa3BmQDKwZWY";
                    z = i3 == 7;
                    if (A08[3].charAt(11) != 'A') {
                        String[] strArr = A08;
                        strArr[6] = "iZLhIZWcPoahXagK";
                        strArr[1] = "cZIJ5G220c5SYRAi6VHfsR";
                        if (i3 != 7) {
                            i2 = AnonymousClass48.A0Q[i3];
                        }
                    }
                }
                throw new RuntimeException();
            }
            int i4 = c2605bX.A00;
            if (nextPosition + 1 < this.A06.size()) {
                i = this.A06.get(nextPosition + 1).A00;
            } else {
                i = length;
            }
            if (i4 != i) {
                if (color != -1 && !z2) {
                    A06(spannableStringBuilder, color, i4);
                    color = -1;
                } else if (A08[3].charAt(11) != 'A') {
                    String[] strArr2 = A08;
                    strArr2[6] = "tJjIxZh52Hon8r4F";
                    strArr2[1] = "ND4XgMSJMSSQlPzUtCMwPe";
                    if (color == -1 && z2) {
                        color = i4;
                    }
                } else {
                    throw new RuntimeException();
                }
                if (colorStartPosition != -1 && !z) {
                    A05(spannableStringBuilder, colorStartPosition, i4);
                    colorStartPosition = -1;
                } else if (colorStartPosition == -1 && z) {
                    colorStartPosition = i4;
                }
                if (i2 != underlineStartPosition) {
                    A07(spannableStringBuilder, italicStartPosition, i4, underlineStartPosition);
                    underlineStartPosition = i2;
                    italicStartPosition = i4;
                }
            }
        }
        if (A08[0].charAt(6) != 'V') {
            A08[5] = "uyNco8zRFQWxcg6vklYZpTh4k0kuVlEV";
            if (color != -1) {
                if (color != length) {
                    A06(spannableStringBuilder, color, length);
                }
            }
        } else {
            A08[5] = "ALGmKM0I29d69g2LjYJnhb5NsKmkABjL";
            if (color != -1) {
                if (color != length) {
                    A06(spannableStringBuilder, color, length);
                }
            }
        }
        if (colorStartPosition != -1 && colorStartPosition != length) {
            A05(spannableStringBuilder, colorStartPosition, length);
        }
        if (italicStartPosition != length) {
            A07(spannableStringBuilder, italicStartPosition, length, underlineStartPosition);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public static void A05(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
    }

    public static void A06(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
    }

    public static void A07(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        if (i3 == -1) {
            return;
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00db  */
    public final C2348Th A08(int i) {
        int startPadding;
        float f;
        int maxTextLength;
        int i2 = this.A02 + this.A04;
        int i3 = 32 - i2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int maxTextLength2 = 0; maxTextLength2 < startPadding; maxTextLength2++) {
            spannableStringBuilder.append(N1.A0e(this.A07.get(maxTextLength2), i3));
            spannableStringBuilder.append('\n');
        }
        spannableStringBuilder.append(N1.A0e(A04(), i3));
        int startPadding2 = spannableStringBuilder.length();
        if (startPadding2 == 0) {
            return null;
        }
        int startPadding3 = spannableStringBuilder.length();
        int i4 = (32 - i2) - startPadding3;
        int startEndPaddingDelta = i2 - i4;
        if (i == Integer.MIN_VALUE) {
            int startPadding4 = this.A00;
            if (startPadding4 == 2) {
                int maxTextLength3 = Math.abs(startEndPaddingDelta);
                if (maxTextLength3 < 3 || i4 < 0) {
                    i = 1;
                } else {
                    startPadding = this.A00;
                    if (startPadding != 2 && startEndPaddingDelta > 0) {
                        i = 2;
                    } else {
                        i = 0;
                    }
                }
            } else {
                startPadding = this.A00;
                if (startPadding != 2) {
                    i = 0;
                } else {
                    i = 0;
                }
            }
        }
        switch (i) {
            case 1:
                f = 0.5f;
                break;
            case 2:
                int startPadding5 = 32 - i4;
                float f2 = 0.8f * (startPadding5 / 32.0f);
                String[] strArr = A08;
                String str = strArr[2];
                String str2 = strArr[7];
                int maxTextLength4 = str.charAt(11);
                int startPadding6 = str2.charAt(11);
                if (maxTextLength4 != startPadding6) {
                    throw new RuntimeException();
                }
                A08[0] = "5EQwUuVt08LvSMecayfpTwcmlaUcj8gt";
                f = f2 + 0.1f;
                break;
                break;
            default:
                f = (0.8f * (i2 / 32.0f)) + 0.1f;
                break;
        }
        int maxTextLength5 = this.A03;
        if (maxTextLength5 > 7) {
            int startPadding7 = this.A03;
            maxTextLength = (startPadding7 - 15) - 2;
        } else {
            int startPadding8 = this.A00;
            if (startPadding8 == 1) {
                int maxTextLength6 = this.A03;
                int startPadding9 = this.A01;
                maxTextLength = maxTextLength6 - (startPadding9 - 1);
            } else {
                maxTextLength = this.A03;
            }
        }
        return new C2149Ld().A0G(spannableStringBuilder).A0F(Layout.Alignment.ALIGN_NORMAL).A07(maxTextLength, 1).A04(f).A0A(i).A0H();
    }

    public final void A09() {
        int length = this.A05.length();
        if (length > 0) {
            int length2 = length - 1;
            this.A05.delete(length2, length);
            int length3 = this.A06.size();
            for (int i = length3 - 1; i >= 0; i--) {
                C2605bX c2605bX = this.A06.get(i);
                int length4 = c2605bX.A00;
                if (length4 == length) {
                    int length5 = c2605bX.A00;
                    c2605bX.A00 = length5 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final void A0A() {
        this.A07.add(A04());
        this.A05.setLength(0);
        this.A06.clear();
        int iMin = Math.min(this.A01, this.A03);
        while (numRows >= iMin) {
            List<SpannableString> list = this.A07;
            if (A08[4].length() != 17) {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[2] = "wHJCFsjRLmJYmOGCiYb2btDMgDXd1Srk";
            strArr[7] = "2mSpReiYVVDYMy0V4w8ODhLzaW3OOfiX";
            list.remove(0);
        }
    }

    public final void A0B(char c) {
        if (this.A05.length() < 32) {
            this.A05.append(c);
        }
    }

    public final void A0C(int i) {
        this.A00 = i;
        this.A06.clear();
        this.A07.clear();
        this.A05.setLength(0);
        this.A03 = 15;
        this.A02 = 0;
        this.A04 = 0;
    }

    public final void A0D(int i) {
        this.A00 = i;
    }

    public final void A0E(int i) {
        this.A01 = i;
    }

    public final void A0F(int i, boolean z) {
        this.A06.add(new C2605bX(i, z, this.A05.length()));
    }

    public final boolean A0G() {
        if (this.A06.isEmpty() && this.A07.isEmpty()) {
            StringBuilder sb = this.A05;
            String[] strArr = A08;
            if (strArr[2].charAt(11) != strArr[7].charAt(11)) {
                throw new RuntimeException();
            }
            A08[5] = "ZUB0lQjssyACEg1ILMogw129NIO2tx51";
            if (sb.length() == 0) {
                return true;
            }
        }
        return false;
    }
}
