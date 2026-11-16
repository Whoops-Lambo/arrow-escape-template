package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class f12 {
    public static String a(e12 e12Var) throws Throwable {
        List listZ0;
        ArrayList arrayList;
        Map map;
        boolean z;
        e12Var.getClass();
        d71 d71Var = e71.Companion;
        Map map2 = e12Var.b;
        yj2 yj2Var = new yj2(map2.size());
        d71Var.getClass();
        String strB = d71.b(yj2Var, 12);
        it0 it0Var = e12Var.d;
        if (!map2.isEmpty() && it0Var != null) {
            ArrayList arrayListB = e12Var.b(null);
            int size = arrayListB.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListB.get(i);
                i++;
                d12 d12Var = (d12) obj;
                d71 d71Var2 = e71.Companion;
                Integer num = d12Var.a;
                num.getClass();
                yj2 yj2Var2 = new yj2(num.intValue());
                d71Var2.getClass();
                String str = ((Object) strB) + d71.b(yj2Var2, 6);
                String str2 = ((Object) str) + d71.b(new yj2(d12Var.b().a), 2);
                String strA = d12Var.a();
                if (map2.containsKey(strA)) {
                    Object obj2 = map2.get(strA);
                    obj2.getClass();
                    listZ0 = du.z0(((hh2) obj2).a);
                } else {
                    listZ0 = gg0.a;
                }
                int size2 = listZ0.size();
                String str3 = "";
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (i2 < size2) {
                    int iIntValue = ((Number) listZ0.get(i2)).intValue();
                    if (i4 == 0) {
                        i3++;
                        i4 = iIntValue;
                    }
                    int i5 = size2 - 1;
                    if (i2 != i5) {
                        int iIntValue2 = ((Number) listZ0.get(i2 + 1)).intValue();
                        int iIntValue3 = ((Number) listZ0.get(i5)).intValue();
                        int i6 = iIntValue + 1;
                        while (true) {
                            if (i6 > iIntValue3) {
                                arrayList = arrayListB;
                                map = map2;
                                z = true;
                                i6 = iIntValue;
                                break;
                            }
                            arrayList = arrayListB;
                            List list = it0Var.c;
                            map = map2;
                            if (list != null) {
                                z = true;
                                if (list.contains(Integer.valueOf(i6))) {
                                    break;
                                }
                            }
                            i6++;
                            arrayListB = arrayList;
                            map2 = map;
                        }
                        if (iIntValue2 > i6) {
                        }
                        i2++;
                        arrayListB = arrayList;
                        map2 = map;
                    } else {
                        arrayList = arrayListB;
                        map = map2;
                        z = true;
                    }
                    boolean z2 = iIntValue != i4 ? z : false;
                    qj.Companion.getClass();
                    String strConcat = str3.concat(pj.a(z2));
                    d71 d71Var3 = e71.Companion;
                    yj2 yj2Var3 = new yj2(i4);
                    d71Var3.getClass();
                    String strConcat2 = strConcat.concat(d71.b(yj2Var3, 16));
                    if (z2) {
                        strConcat2 = strConcat2.concat(d71.b(new yj2(iIntValue), 16));
                    }
                    str3 = strConcat2;
                    i4 = 0;
                    i2++;
                    arrayListB = arrayList;
                    map2 = map;
                }
                ArrayList arrayList2 = arrayListB;
                d71 d71Var4 = e71.Companion;
                yj2 yj2Var4 = new yj2(i3);
                d71Var4.getClass();
                strB = ((Object) (((Object) str2) + d71.b(yj2Var4, 12))) + str3;
                arrayListB = arrayList2;
                map2 = map2;
            }
        }
        return strB;
    }
}
