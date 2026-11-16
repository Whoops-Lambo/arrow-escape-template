package defpackage;

import com.usercentrics.sdk.services.tcf.interfaces.TCFData;
import com.usercentrics.sdk.services.tcf.interfaces.TCFPurpose;
import com.usercentrics.sdk.services.tcf.interfaces.TCFSpecialFeature;
import com.usercentrics.sdk.v2.settings.data.UsercentricsCategory;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class e33 {
    public static ArrayList a(List list, List list2) {
        Object obj;
        list.getClass();
        list2.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!((UsercentricsCategory) obj2).e) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(eu.f(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj3 = arrayList.get(i2);
            i2++;
            UsercentricsCategory usercentricsCategory = (UsercentricsCategory) obj3;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj4 : list2) {
                if (((wd1) obj4).n.equals(usercentricsCategory.a)) {
                    arrayList3.add(obj4);
                }
            }
            f33.Companion.getClass();
            boolean z = true;
            if (!usercentricsCategory.d) {
                if (arrayList3.isEmpty()) {
                    z = false;
                    break;
                }
                int size2 = arrayList3.size();
                int i3 = 0;
                do {
                    if (i3 >= size2) {
                        z = false;
                        break;
                        break;
                    }
                    obj = arrayList3.get(i3);
                    i3++;
                } while (!((wd1) obj).p.b);
            }
            arrayList2.add(new fp(usercentricsCategory, z, arrayList3));
        }
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList2.size();
        while (i < size3) {
            Object obj5 = arrayList2.get(i);
            i++;
            if (!((fp) obj5).c.isEmpty()) {
                arrayList4.add(obj5);
            }
        }
        return arrayList4;
    }

    public static List b(TCFData tCFData) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        tCFData.getClass();
        List<TCFPurpose> listS0 = du.s0(tCFData.b, new zm(13));
        ArrayList arrayList = new ArrayList();
        for (TCFPurpose tCFPurpose : listS0) {
            Boolean bool = tCFPurpose.e;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            Boolean bool2 = tCFPurpose.g;
            if (bool2 != null) {
                zBooleanValue2 = bool2.booleanValue();
            } else {
                zBooleanValue2 = true;
            }
            arrayList.add(new b12(zBooleanValue, zBooleanValue2, tCFPurpose));
        }
        return du.z0(arrayList);
    }

    public static List c(TCFData tCFData) {
        boolean zBooleanValue;
        tCFData.getClass();
        List<TCFSpecialFeature> listS0 = du.s0(tCFData.c, new zm(14));
        ArrayList arrayList = new ArrayList();
        for (TCFSpecialFeature tCFSpecialFeature : listS0) {
            Boolean bool = tCFSpecialFeature.e;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            arrayList.add(new sh2(zBooleanValue, tCFSpecialFeature));
        }
        return du.z0(arrayList);
    }
}
