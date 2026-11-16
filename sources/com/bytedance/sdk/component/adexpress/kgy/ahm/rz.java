package com.bytedance.sdk.component.adexpress.kgy.ahm;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.component.utils.vg;
import com.ironsource.G5;
import com.safedk.android.internal.partials.PangleFilesBridge;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.n30;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class rz {
    public static boolean rz(com.bytedance.sdk.component.adexpress.kgy.rz.kgy kgyVar, com.bytedance.sdk.component.adexpress.kgy.rz.kgy kgyVar2) {
        if (kgyVar != null) {
            try {
                if (!TextUtils.isEmpty(kgyVar.rz())) {
                    if (kgyVar2 == null) {
                        return false;
                    }
                    String strYo = kgyVar.yo();
                    String strYo2 = kgyVar2.yo();
                    if ((!TextUtils.isEmpty(strYo2) && !strYo2.equals(strYo)) || kgy(kgyVar.rz(), kgyVar2.rz())) {
                        return true;
                    }
                    Map<String, com.bytedance.sdk.component.adexpress.kgy.rz.kgy> mapKgy = kgyVar.kgy();
                    Map<String, com.bytedance.sdk.component.adexpress.kgy.rz.kgy> mapKgy2 = kgyVar2.kgy();
                    if (mapKgy.isEmpty()) {
                        return !mapKgy2.isEmpty();
                    }
                    if (mapKgy2.isEmpty()) {
                        return false;
                    }
                    return kgy(mapKgy, mapKgy2);
                }
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJsyYdD2VjCEqErU+s=", "b+sghQ+9fcKjS9RViTOhO17PPZw=", "VesokS6pZdOJb9lahR+lHUvqLIEG", 474);
                th.getMessage();
                return false;
            }
        }
        return true;
    }

    public abstract File kgy();

    public List<com.bytedance.sdk.component.adexpress.kgy.rz.kgy.C0205kgy> ahm(com.bytedance.sdk.component.adexpress.kgy.rz.kgy kgyVar, com.bytedance.sdk.component.adexpress.kgy.rz.kgy kgyVar2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<com.bytedance.sdk.component.adexpress.kgy.rz.kgy.C0205kgy> arrayList3 = new ArrayList<>();
        if (kgyVar2 == null || kgyVar2.noq().isEmpty()) {
            arrayList2.addAll(kgyVar.noq());
        } else if (kgyVar.noq().isEmpty()) {
            arrayList.addAll(kgyVar2.noq());
        } else {
            for (com.bytedance.sdk.component.adexpress.kgy.rz.kgy.C0205kgy c0205kgy : kgyVar.noq()) {
                if (!kgyVar2.noq().contains(c0205kgy) && c0205kgy != null && c0205kgy.kgy() != null && c0205kgy.ahm() != null) {
                    arrayList2.add(c0205kgy);
                }
            }
            for (com.bytedance.sdk.component.adexpress.kgy.rz.kgy.C0205kgy c0205kgy2 : kgyVar2.noq()) {
                if (!kgyVar.noq().contains(c0205kgy2)) {
                    arrayList.add(c0205kgy2);
                }
            }
        }
        if (kgy(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    public List<com.bytedance.sdk.component.adexpress.kgy.rz.kgy.C0205kgy> kgy(com.bytedance.sdk.component.adexpress.kgy.rz.kgy kgyVar, com.bytedance.sdk.component.adexpress.kgy.rz.kgy kgyVar2) {
        Map<String, com.bytedance.sdk.component.adexpress.kgy.rz.kgy> mapKgy = kgyVar.kgy();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<com.bytedance.sdk.component.adexpress.kgy.rz.kgy.C0205kgy> arrayList3 = new ArrayList<>();
        if (mapKgy.size() == 0) {
            if (kgyVar2 != null && kgyVar2.kgy().size() != 0) {
                Map<String, com.bytedance.sdk.component.adexpress.kgy.rz.kgy> mapKgy2 = kgyVar2.kgy();
                Iterator<String> it = mapKgy2.keySet().iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.kgy.rz.kgy kgyVar3 = mapKgy2.get(it.next());
                    if (kgyVar3 != null) {
                        arrayList.addAll(kgyVar3.noq());
                    }
                }
            }
        } else if (kgyVar2 != null && kgyVar2.kgy().size() != 0) {
            Map<String, com.bytedance.sdk.component.adexpress.kgy.rz.kgy> mapKgy3 = kgyVar2.kgy();
            for (String str : mapKgy.keySet()) {
                com.bytedance.sdk.component.adexpress.kgy.rz.kgy kgyVar4 = mapKgy.get(str);
                com.bytedance.sdk.component.adexpress.kgy.rz.kgy kgyVar5 = mapKgy3.get(str);
                if (kgyVar5 == null && kgyVar4 != null) {
                    arrayList2.addAll(kgyVar4.noq());
                } else if (kgyVar4 == null && kgyVar5 != null) {
                    arrayList.addAll(kgyVar5.noq());
                } else if (kgyVar4 != null) {
                    for (com.bytedance.sdk.component.adexpress.kgy.rz.kgy.C0205kgy c0205kgy : kgyVar4.noq()) {
                        if (c0205kgy != null && !kgyVar5.noq().contains(c0205kgy) && c0205kgy.ahm() != null && c0205kgy.kgy() != null) {
                            arrayList2.add(c0205kgy);
                        }
                    }
                    for (com.bytedance.sdk.component.adexpress.kgy.rz.kgy.C0205kgy c0205kgy2 : kgyVar5.noq()) {
                        if (c0205kgy2 != null && !kgyVar4.noq().contains(c0205kgy2)) {
                            arrayList.add(c0205kgy2);
                        }
                    }
                }
            }
        } else if (mapKgy.size() != 0) {
            Iterator<String> it2 = mapKgy.keySet().iterator();
            while (it2.hasNext()) {
                com.bytedance.sdk.component.adexpress.kgy.rz.kgy kgyVar6 = mapKgy.get(it2.next());
                if (kgyVar6 != null) {
                    arrayList2.addAll(kgyVar6.noq());
                }
            }
        }
        if (!kgy(arrayList2, arrayList3)) {
            return null;
        }
        return arrayList;
    }

    public void rz(List<com.bytedance.sdk.component.adexpress.kgy.rz.kgy.C0205kgy> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.kgy.rz.kgy.C0205kgy> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(kgy(), com.bytedance.sdk.component.utils.ct.kgy(it.next().kgy()));
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJsyYdD2VjCEqErU+s=", "b+sghQ+9fcKjS9RViTOhO17PPZw=", "X+shkBe5Xs+FRPNSmx+sJ1rqCIcRs3s=", 347);
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable th2) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th2, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJsyYdD2VjCEqErU+s=", "b+sghQ+9fcKjS9RViTOhO17PPZw=", "X+shkBe5Xs+FRPNSmx+sJ1rqCIcRs3s=", 353);
                }
            }
        }
    }

    public void ahm(List<com.bytedance.sdk.component.adexpress.kgy.rz.kgy.C0205kgy> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.kgy.rz.kgy.C0205kgy> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(kgy(), com.bytedance.sdk.component.utils.ct.kgy(it.next().kgy()));
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJsyYdD2VjCEqErU+s=", "b+sghQ+9fcKjS9RViTOhO17PPZw=", "X+EJkA+5fcI=", 291);
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable th2) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th2, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJsyYdD2VjCEqErU+s=", "b+sghQ+9fcKjS9RViTOhO17PPZw=", "X+EJkA+5fcI=", 297);
                }
            }
        }
    }

    public static void ahm(File file, com.bytedance.sdk.component.adexpress.kgy.rz.kgy kgyVar, String str) {
        if (kgyVar == null || file == null) {
            return;
        }
        try {
            new File(file, str).delete();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJsyYdD2VjCEqErU+s=", "b+sghQ+9fcKjS9RViTOhO17PPZw=", "WOIolBE=", 578);
        }
        if (kgyVar.noq() != null) {
            Iterator<com.bytedance.sdk.component.adexpress.kgy.rz.kgy.C0205kgy> it = kgyVar.noq().iterator();
            while (it.hasNext()) {
                try {
                    new File(file, com.bytedance.sdk.component.utils.ct.kgy(it.next().kgy())).delete();
                } catch (Throwable th2) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th2, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJsyYdD2VjCEqErU+s=", "b+sghQ+9fcKjS9RViTOhO17PPZw=", "WOIolBE=", 589);
                }
            }
        }
    }

    public boolean kgy(Map<String, com.bytedance.sdk.component.adexpress.kgy.rz.kgy> map) {
        if (map == null || map.size() == 0) {
            return false;
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            com.bytedance.sdk.component.adexpress.kgy.rz.kgy kgyVar = map.get(it.next());
            if (kgyVar != null && !kgy(kgyVar.noq())) {
                return false;
            }
        }
        return true;
    }

    public boolean kgy(List<com.bytedance.sdk.component.adexpress.kgy.rz.kgy.C0205kgy> list) {
        if (list == null || list.size() <= 0 || kgy() == null) {
            return false;
        }
        for (com.bytedance.sdk.component.adexpress.kgy.rz.kgy.C0205kgy c0205kgy : list) {
            String strKgy = com.bytedance.sdk.component.utils.ct.kgy(c0205kgy.kgy());
            if (TextUtils.isEmpty(strKgy)) {
                return false;
            }
            File file = new File(kgy(), strKgy);
            String strKgy2 = com.bytedance.sdk.component.utils.ct.kgy(file);
            if (!file.exists() || !file.isFile() || c0205kgy.ahm() == null || !c0205kgy.ahm().equals(strKgy2)) {
                return false;
            }
        }
        return true;
    }

    public boolean kgy(com.bytedance.sdk.component.adexpress.kgy.rz.kgy.ahm ahmVar) {
        if (ahmVar == null || kgy() == null) {
            return false;
        }
        List<Pair<String, String>> listAhm = ahmVar.ahm();
        if (listAhm == null || listAhm.size() <= 0) {
            return true;
        }
        Iterator<Pair<String, String>> it = listAhm.iterator();
        while (it.hasNext()) {
            File file = new File(kgy(), (String) it.next().first);
            if (!file.exists() || !file.isFile()) {
                return false;
            }
        }
        return true;
    }

    private boolean kgy(List<com.bytedance.sdk.component.adexpress.kgy.rz.kgy.C0205kgy> list, List<com.bytedance.sdk.component.adexpress.kgy.rz.kgy.C0205kgy> list2) {
        for (com.bytedance.sdk.component.adexpress.kgy.rz.kgy.C0205kgy c0205kgy : list) {
            String strKgy = c0205kgy.kgy();
            String strKgy2 = com.bytedance.sdk.component.utils.ct.kgy(strKgy);
            File file = new File(kgy(), strKgy2);
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJsyYdD2VjCEqErU+s=", "b+sghQ+9fcKjS9RViTOhO17PPZw=", "SessmQ+lTcikRcBTgB6hLA==", 210);
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable th2) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th2, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJsyYdD2VjCEqErU+s=", "b+sghQ+9fcKjS9RViTOhO17PPZw=", "SessmQ+lTcikRcBTgB6hLA==", Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE);
                }
            }
            com.bytedance.sdk.component.fi.ahm.kgy kgyVarNoq = com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().rz().noq();
            kgyVarNoq.rz(strKgy);
            kgyVarNoq.kgy(kgy().getAbsolutePath(), strKgy2);
            com.bytedance.sdk.component.fi.ahm ahmVarCt = kgyVarNoq.ct();
            list2.add(c0205kgy);
            if (ahmVarCt == null || !ahmVarCt.noq() || ahmVarCt.ct() == null || !ahmVarCt.ct().exists()) {
                rz(list2);
                return false;
            }
        }
        return true;
    }

    public boolean kgy(String str) {
        File file = new File(kgy().getAbsoluteFile(), n30.m(com.bytedance.sdk.component.utils.ct.kgy(str), ".zip"));
        com.bytedance.sdk.component.fi.ahm.kgy kgyVarNoq = com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().rz().noq();
        kgyVarNoq.rz(str);
        kgyVarNoq.kgy(file.getParent(), file.getName());
        com.bytedance.sdk.component.fi.ahm ahmVarCt = kgyVarNoq.ct();
        if (ahmVarCt.noq() && ahmVarCt.ct() != null && ahmVarCt.ct().exists()) {
            File fileCt = ahmVarCt.ct();
            try {
                vg.kgy(fileCt.getAbsolutePath(), file.getParent());
                if (!fileCt.exists()) {
                    return true;
                }
                fileCt.delete();
                return true;
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJsyYdD2VjCEqErU+s=", "b+sghQ+9fcKjS9RViTOhO17PPZw=", "X+E6mw+zaMOyT8R8nhKoIU3r", Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR_VALUE);
            }
        }
        return false;
    }

    public void kgy(int i) {
        if (com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().uq() != null) {
            com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().uq().kgy(i);
        }
    }

    public static void kgy(File file, com.bytedance.sdk.component.adexpress.kgy.rz.kgy kgyVar, String str) {
        if (kgyVar == null) {
            return;
        }
        String strRa = kgyVar.ra();
        if (TextUtils.isEmpty(strRa)) {
            return;
        }
        File file2 = new File(file, str);
        File file3 = new File(file2 + ".tmp");
        if (file3.exists()) {
            file3.delete();
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStreamFileOutputStreamCtor = PangleFilesBridge.fileOutputStreamCtor(file3);
                try {
                    fileOutputStreamFileOutputStreamCtor.write(strRa.getBytes(G5.O));
                    if (file2.exists()) {
                        file2.delete();
                    }
                    file3.renameTo(file2);
                    fileOutputStreamFileOutputStreamCtor.close();
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                    try {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJsyYdD2VjCEqErU+s=", "b+sghQ+9fcKjS9RViTOhO17PPZw=", "SO87kDO3buqPTtJR", 393);
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                    } catch (Throwable th2) {
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e) {
                                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJsyYdD2VjCEqErU+s=", "b+sghQ+9fcKjS9RViTOhO17PPZw=", "SO87kDO3buqPTtJR", 399);
                            }
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e2) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e2, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJsyYdD2VjCEqErU+s=", "b+sghQ+9fcKjS9RViTOhO17PPZw=", "SO87kDO3buqPTtJR", 399);
        }
    }

    private static boolean kgy(Map<String, com.bytedance.sdk.component.adexpress.kgy.rz.kgy> map, Map<String, com.bytedance.sdk.component.adexpress.kgy.rz.kgy> map2) {
        if (map.size() != map2.size()) {
            return true;
        }
        for (String str : map2.keySet()) {
            com.bytedance.sdk.component.adexpress.kgy.rz.kgy kgyVar = map.get(str);
            if (kgyVar == null) {
                return true;
            }
            com.bytedance.sdk.component.adexpress.kgy.rz.kgy kgyVar2 = map2.get(str);
            if (kgyVar2 == null) {
                return false;
            }
            if (kgy(kgyVar.rz(), kgyVar2.rz())) {
                return true;
            }
        }
        return false;
    }

    public static boolean kgy(String str, String str2) {
        String[] strArrSplit = str2.split("\\.");
        String[] strArrSplit2 = str.split("\\.");
        int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
        for (int i = 0; i < iMin; i++) {
            int length = strArrSplit[i].length() - strArrSplit2[i].length();
            if (length == 0) {
                int iCompareTo = strArrSplit[i].compareTo(strArrSplit2[i]);
                if (iCompareTo > 0) {
                    return true;
                }
                if (iCompareTo < 0) {
                    return false;
                }
                if (i == iMin - 1) {
                    return strArrSplit.length > strArrSplit2.length;
                }
            } else if (length > 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean kgy(com.bytedance.sdk.component.adexpress.kgy.rz.kgy kgyVar, String str) {
        if (kgyVar == null) {
            return true;
        }
        try {
            if (TextUtils.isEmpty(kgyVar.rz())) {
                return true;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return kgy(kgyVar.rz(), str);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJsyYdD2VjCEqErU+s=", "b+sghQ+9fcKjS9RViTOhO17PPZw=", "VesokTasbcaUTw==", 558);
            return false;
        }
    }
}
