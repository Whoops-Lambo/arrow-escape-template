package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class r8 {
    public final char a;
    public final List b;
    public final ArrayList c;

    /* JADX WARN: Multi-variable type inference failed */
    public r8(char c, List list, ArrayList arrayList) {
        this.a = c;
        this.b = list;
        this.c = arrayList;
        r8[] r8VarArr = new r8[256];
        for (int i = 0; i < 256; i++) {
            ArrayList arrayList2 = this.c;
            int size = arrayList2.size();
            Object obj = null;
            boolean z = false;
            int i2 = 0;
            Object obj2 = null;
            while (true) {
                if (i2 < size) {
                    Object obj3 = arrayList2.get(i2);
                    i2++;
                    if (((r8) obj3).a == i) {
                        if (z) {
                            break;
                        }
                        z = true;
                        obj2 = obj3;
                    }
                } else {
                    if (!z) {
                        break;
                    }
                    obj = obj2;
                    break;
                }
            }
            r8VarArr[i] = obj;
        }
    }
}
