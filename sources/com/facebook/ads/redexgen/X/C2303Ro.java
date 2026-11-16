package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ro, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C2303Ro implements VF {
    public static String[] A03 = {"hCZczwbChjUsCUwxRw6prGp4a38eJSZM", "lUxYycgrJvFaPUBvx4GBEhYiK4m9kyuX", "K7biVkji8c2abFRUzoZE35M16Nr30sHx", "hTaSJqeXWqACDI8Tl6AegleljrjoWV5D", "4GC", "suRSw9BBhIrTo6orh3wdvsggGiK", "dvp9xbjmJkXWLC3W6qrOil1Xu4dhPnSh", "oqp"};
    public boolean A00;
    public final VF A01;
    public final /* synthetic */ C8t A02;

    public C2303Ro(C8t c8t, VF vf) {
        this.A02 = c8t;
        this.A01 = vf;
    }

    public final void A00() {
        this.A00 = false;
    }

    @Override // com.facebook.ads.redexgen.X.VF
    public final boolean ABM() {
        return !this.A02.A03() && this.A01.ABM();
    }

    @Override // com.facebook.ads.redexgen.X.VF
    public final void ADI() throws IOException {
        this.A01.ADI();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0061  */
    /* JADX WARN: Instruction removed from duplicated block: B:15:0x002f, please report this as an issue */
    @Override // com.facebook.ads.redexgen.X.VF
    public final int AIc(C2237Oo c2237Oo, T2 t2, int i) {
        int i2;
        int encoderPadding;
        int length;
        int result;
        if (this.A02.A03()) {
            return -3;
        }
        if (this.A00) {
            t2.A02(4);
            return -4;
        }
        int iAIc = this.A01.AIc(c2237Oo, t2, i);
        if (iAIc != -5) {
            if (this.A02.A00 != Long.MIN_VALUE && ((iAIc == -4 && t2.A01 >= this.A02.A00) || (iAIc == -3 && this.A02.A7i() == Long.MIN_VALUE && !t2.A04))) {
                t2.A0A();
                t2.A02(4);
                this.A00 = true;
                String[] strArr = A03;
                String str = strArr[4];
                String str2 = strArr[7];
                int length2 = str.length();
                int result2 = str2.length();
                if (length2 != result2) {
                    A03[5] = "E04rMJY30HIlU2cAr5Aw7XTbX1n";
                    return -4;
                }
                String[] strArr2 = A03;
                strArr2[2] = "yIpeBBrJ1qAZRfAnlHEP2FJkUi25hvbC";
                strArr2[1] = "1ozWe3aBUM1ISpzViZAE5MteBltu21sg";
                return -4;
            }
            return iAIc;
        }
        VC vc = (VC) AbstractC2159Ln.A01(c2237Oo.A00);
        int result3 = vc.A08;
        if (result3 == 0) {
            int result4 = vc.A09;
            if (result4 != 0) {
                if (this.A02.A01 != 0) {
                    i2 = 0;
                } else {
                    i2 = vc.A08;
                }
                encoderPadding = this.A02.A00 == Long.MIN_VALUE ? vc.A09 : 0;
                String[] strArr3 = A03;
                String str3 = strArr3[4];
                String str4 = strArr3[7];
                length = str3.length();
                result = str4.length();
                if (length != result) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A03;
                strArr4[0] = "WpZbgUFarAhkaO4qnIOIScSSR6ujkzkK";
                strArr4[6] = "iA8VkZH4E7gleQVLcFVju57gueYFZ33h";
                c2237Oo.A00 = vc.A07().A0d(i2).A0e(encoderPadding).A14();
            }
        } else {
            if (this.A02.A01 != 0) {
                i2 = 0;
            } else {
                i2 = vc.A08;
            }
            if (this.A02.A00 == Long.MIN_VALUE) {
            }
            String[] strArr5 = A03;
            String str5 = strArr5[4];
            String str6 = strArr5[7];
            length = str5.length();
            result = str6.length();
            if (length != result) {
                throw new RuntimeException();
            }
            String[] strArr6 = A03;
            strArr6[0] = "WpZbgUFarAhkaO4qnIOIScSSR6ujkzkK";
            strArr6[6] = "iA8VkZH4E7gleQVLcFVju57gueYFZ33h";
            c2237Oo.A00 = vc.A07().A0d(i2).A0e(encoderPadding).A14();
        }
        return -5;
    }

    @Override // com.facebook.ads.redexgen.X.VF
    public final int ALK(long j) {
        if (this.A02.A03()) {
            return -3;
        }
        return this.A01.ALK(j);
    }
}
