package defpackage;

import java.util.ArrayList;
import kotlin.reflect.KType;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ia2 implements sr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ ia2(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.a;
        int i2 = 0;
        ArrayList arrayList = this.b;
        switch (i) {
            case 0:
                return ((KType) arrayList.get(0)).getClassifier();
            default:
                if (arrayList.isEmpty()) {
                    return gg0.a;
                }
                if (((CharSequence) du.a0(arrayList)).length() == 0 && arrayList.size() > 1) {
                    i2 = 1;
                }
                return arrayList.subList(i2, ((CharSequence) du.h0(arrayList)).length() == 0 ? arrayList.size() - 1 : arrayList.size());
        }
    }
}
