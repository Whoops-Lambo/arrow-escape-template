package androidx.compose.ui.platform;

import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class AndroidComposeView_androidKt {
    public static final wr0 a = null;

    public static final float b(int i, float[] fArr, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3] * fArr2[i2]);
    }

    public static final void a(float[] fArr, float[] fArr2) {
        float fB = b(0, fArr2, fArr, 0);
        float fB2 = b(0, fArr2, fArr, 1);
        float fB3 = b(0, fArr2, fArr, 2);
        float fB4 = b(0, fArr2, fArr, 3);
        float fB5 = b(1, fArr2, fArr, 0);
        float fB6 = b(1, fArr2, fArr, 1);
        float fB7 = b(1, fArr2, fArr, 2);
        float fB8 = b(1, fArr2, fArr, 3);
        float fB9 = b(2, fArr2, fArr, 0);
        float fB10 = b(2, fArr2, fArr, 1);
        float fB11 = b(2, fArr2, fArr, 2);
        float fB12 = b(2, fArr2, fArr, 3);
        float fB13 = b(3, fArr2, fArr, 0);
        float fB14 = b(3, fArr2, fArr, 1);
        float fB15 = b(3, fArr2, fArr, 2);
        float fB16 = b(3, fArr2, fArr, 3);
        fArr[0] = fB;
        fArr[1] = fB2;
        fArr[2] = fB3;
        fArr[3] = fB4;
        fArr[4] = fB5;
        fArr[5] = fB6;
        fArr[6] = fB7;
        fArr[7] = fB8;
        fArr[8] = fB9;
        fArr[9] = fB10;
        fArr[10] = fB11;
        fArr[11] = fB12;
        fArr[12] = fB13;
        fArr[13] = fB14;
        fArr[14] = fB15;
        fArr[15] = fB16;
    }
}
