package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class tk extends l90 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tk(int i, int i2) {
        super(i);
        this.f = i2;
    }

    @Override // defpackage.l90
    public Object b(Object obj) {
        int i = 0;
        switch (this.f) {
            case 2:
                vw0 vw0Var = (vw0) obj;
                ArrayList arrayList = vw0Var.a;
                int size = arrayList.size();
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    sy0.a.E((int[]) obj2);
                }
                arrayList.clear();
                return vw0Var;
            case 3:
                int[] iArr = (int[]) obj;
                Arrays.fill(iArr, 0, iArr.length, -1);
                return iArr;
            default:
                return obj;
        }
    }

    @Override // defpackage.l90
    public final Object d() {
        switch (this.f) {
            case 0:
                return new byte[4096];
            case 1:
                return new char[2048];
            case 2:
                vw0 vw0Var = new vw0();
                vw0Var.a = new ArrayList();
                return vw0Var;
            default:
                int[] iArr = new int[768];
                for (int i = 0; i < 768; i++) {
                    iArr[i] = -1;
                }
                return iArr;
        }
    }
}
