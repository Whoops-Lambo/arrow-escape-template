package com.bytedance.sdk.component.adexpress.kgy.ahm;

import android.text.TextUtils;
import android.util.Pair;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.adexpress.uq.gf;
import com.ironsource.G5;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class ahm {
    static Object kgy = new Object();

    public static kgy kgy(String str, gf.kgy kgyVar, String str2, String str3) {
        File fileNoq;
        kgy kgyVar2 = new kgy();
        if (TextUtils.isEmpty(str3)) {
            fileNoq = null;
        } else {
            fileNoq = ahm(str3, str);
            if (fileNoq != null) {
                kgyVar2.kgy(1);
            }
        }
        if (fileNoq == null && (fileNoq = yo(str)) != null) {
            kgyVar2.kgy(3);
        }
        if (fileNoq == null && (fileNoq = noq(str)) != null) {
            kgyVar2.kgy(2);
        }
        if (TextUtils.isEmpty(str3)) {
            if (!ct(str)) {
                kgyVar2.kgy(6);
            }
        } else if (!kgy(str, str3)) {
            kgyVar2.kgy(4);
        }
        kgyVar2.ahm();
        if (fileNoq != null) {
            try {
                kgyVar2.kgy(new WebResourceResponse(kgyVar.kgy(), G5.O, new FileInputStream(fileNoq)));
                return kgyVar2;
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJsyYdD2VjCEqErU+s=", "b9oJjA29ZM6D", "WPwolBe5TMmHQ9lY", 261);
            }
        }
        return kgyVar2;
    }

    private static File ahm(String str, String str2) {
        com.bytedance.sdk.component.adexpress.kgy.rz.kgy kgyVar;
        com.bytedance.sdk.component.adexpress.kgy.rz.kgy kgyVarUq = uq();
        if (kgyVarUq != null && ct()) {
            Map<String, com.bytedance.sdk.component.adexpress.kgy.rz.kgy> mapKgy = kgyVarUq.kgy();
            if (mapKgy.size() != 0 && (kgyVar = mapKgy.get(str)) != null) {
                for (com.bytedance.sdk.component.adexpress.kgy.rz.kgy.C0205kgy c0205kgy : kgyVar.noq()) {
                    if (c0205kgy.kgy() != null && c0205kgy.kgy().equals(str2)) {
                        File file = new File(ct.fi(), com.bytedance.sdk.component.utils.ct.kgy(c0205kgy.kgy()));
                        String strKgy = com.bytedance.sdk.component.utils.ct.kgy(file);
                        if (c0205kgy.ahm() == null || !c0205kgy.ahm().equals(strKgy)) {
                            break;
                        }
                        return file;
                    }
                }
            }
        }
        return null;
    }

    private static boolean ct(String str) {
        com.bytedance.sdk.component.adexpress.kgy.rz.kgy kgyVarUq;
        List<com.bytedance.sdk.component.adexpress.kgy.rz.kgy.C0205kgy> listNoq;
        if (ct() && (kgyVarUq = uq()) != null && (listNoq = kgyVarUq.noq()) != null) {
            for (com.bytedance.sdk.component.adexpress.kgy.rz.kgy.C0205kgy c0205kgy : listNoq) {
                if (c0205kgy != null && TextUtils.equals(str, c0205kgy.kgy())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private static File noq(String str) {
        if (ct()) {
            for (com.bytedance.sdk.component.adexpress.kgy.rz.kgy.C0205kgy c0205kgy : uq().noq()) {
                if (c0205kgy.kgy() != null && c0205kgy.kgy().equals(str)) {
                    File file = new File(ct.fi(), com.bytedance.sdk.component.utils.ct.kgy(c0205kgy.kgy()));
                    String strKgy = com.bytedance.sdk.component.utils.ct.kgy(file);
                    if (c0205kgy.ahm() == null || !c0205kgy.ahm().equals(strKgy)) {
                        break;
                    }
                    return file;
                }
            }
        }
        return null;
    }

    public static com.bytedance.sdk.component.adexpress.kgy.rz.ahm rz(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.kgy.rz.ahm ahmVarKgy = yo.kgy().kgy(str);
        if (ahmVarKgy != null) {
            ahmVarKgy.kgy(Long.valueOf(System.currentTimeMillis()));
            kgy(ahmVarKgy);
        }
        return ahmVarKgy;
    }

    public static String uq(String str) {
        com.bytedance.sdk.component.adexpress.kgy.rz.kgy kgyVar;
        com.bytedance.sdk.component.adexpress.kgy.rz.kgy kgyVarUq = uq();
        if (kgyVarUq == null) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            Map<String, com.bytedance.sdk.component.adexpress.kgy.rz.kgy> mapKgy = kgyVarUq.kgy();
            if (mapKgy == null || mapKgy.size() <= 0 || (kgyVar = mapKgy.get(str)) == null) {
                return null;
            }
            return kgyVar.uq();
        }
        return noq();
    }

    private static File yo(String str) {
        List<Pair<String, String>> listAhm;
        com.bytedance.sdk.component.adexpress.kgy.rz.kgy.ahm ahmVarCt = uq().ct();
        if (ahmVarCt != null && (listAhm = ahmVarCt.ahm()) != null && listAhm.size() > 0) {
            for (Pair<String, String> pair : listAhm) {
                Object obj = pair.second;
                if (obj != null && ((String) obj).equals(str)) {
                    return new File(ct.fi(), (String) pair.first);
                }
            }
        }
        return null;
    }

    public static String rz() {
        return noq.rz();
    }

    public static com.bytedance.sdk.component.adexpress.kgy.rz.kgy uq() {
        return ct.ahm().noq();
    }

    public static boolean ct() {
        return ct.ahm().ct();
    }

    private static String noq() {
        com.bytedance.sdk.component.adexpress.kgy.rz.kgy kgyVarUq = uq();
        if (kgyVarUq == null) {
            return null;
        }
        return kgyVarUq.uq();
    }

    public static Set<String> ahm(String str) {
        return yo.kgy().ahm(str);
    }

    public static void ahm() {
        try {
            fi.uq();
            File fileFi = ct.fi();
            if (fileFi == null || !fileFi.exists()) {
                return;
            }
            if (fileFi.getParentFile() != null) {
                com.bytedance.sdk.component.utils.yo.rz(fileFi.getParentFile());
            } else {
                com.bytedance.sdk.component.utils.yo.rz(fileFi);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJsyYdD2VjCEqErU+s=", "b9oJjA29ZM6D", "WOIolBGdZcujS9RViQ==", 51);
        }
    }

    public static com.bytedance.sdk.component.adexpress.kgy.rz.ahm kgy(String str) {
        return yo.kgy().kgy(str);
    }

    public static void kgy(com.bytedance.sdk.component.adexpress.kgy.rz.uq uqVar) {
        yo.kgy().kgy(uqVar, uqVar.noq);
    }

    private static void kgy(final com.bytedance.sdk.component.adexpress.kgy.rz.ahm ahmVar) {
        com.bytedance.sdk.component.adexpress.uq.uq.kgy(new com.bytedance.sdk.component.gf.ahm.rz("updateTmplTime") { // from class: com.bytedance.sdk.component.adexpress.kgy.ahm.ahm.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (ahm.kgy) {
                    noq.kgy().kgy(ahmVar, true);
                }
            }
        }, 10);
    }

    public static void kgy() {
        ct.ahm();
    }

    private static boolean kgy(String str, String str2) {
        com.bytedance.sdk.component.adexpress.kgy.rz.kgy kgyVarUq;
        com.bytedance.sdk.component.adexpress.kgy.rz.kgy kgyVar;
        if (!ct() || (kgyVarUq = uq()) == null) {
            return false;
        }
        Map<String, com.bytedance.sdk.component.adexpress.kgy.rz.kgy> mapKgy = kgyVarUq.kgy();
        if (mapKgy.size() == 0 || (kgyVar = mapKgy.get(str2)) == null) {
            return false;
        }
        for (com.bytedance.sdk.component.adexpress.kgy.rz.kgy.C0205kgy c0205kgy : kgyVar.noq()) {
            if (c0205kgy != null && TextUtils.equals(str, c0205kgy.kgy())) {
                return true;
            }
        }
        return false;
    }

    public static boolean ahm(JSONObject jSONObject) {
        Object objOpt;
        return (jSONObject == null || (objOpt = jSONObject.opt("xTemplate")) == null || TextUtils.isEmpty(objOpt.toString())) ? false : true;
    }

    public static boolean kgy(JSONObject jSONObject) {
        Object objOpt;
        return (jSONObject == null || (objOpt = jSONObject.opt("template_Plugin")) == null || TextUtils.isEmpty(objOpt.toString())) ? false : true;
    }
}
