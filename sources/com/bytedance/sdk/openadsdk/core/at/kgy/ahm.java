package com.bytedance.sdk.openadsdk.core.at.kgy;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.ra;
import com.bytedance.sdk.openadsdk.core.xh;
import com.bytedance.sdk.openadsdk.utils.mw;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.h50;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class ahm {
    private static volatile ahm kgy;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface kgy {
        void kgy(int i, String str, String str2);

        void kgy(JSONObject jSONObject, String str);
    }

    public void kgy(com.bytedance.sdk.openadsdk.core.at.fi.kgy kgyVar, String str) {
        if (kgyVar == null || TextUtils.isEmpty(kgyVar.kgy())) {
            return;
        }
        StringBuilder sbQ = h50.q(str, "_");
        sbQ.append(kgyVar.kgy());
        final String string = sbQ.toString();
        final String strRz = kgyVar.rz();
        final String strAhm = kgyVar.ahm();
        final String strUq = kgyVar.uq();
        String strCt = kgyVar.ct();
        if (TextUtils.isEmpty(strCt)) {
            if (str.equals("ad")) {
                strCt = ra.ahm().uq();
            } else if (str.equals("adv3")) {
                strCt = ra.ahm().uq() + "_v3";
            }
        }
        final String str2 = strCt;
        mw.kgy(new com.bytedance.sdk.component.gf.ahm.rz("saveUGenTemplate") { // from class: com.bytedance.sdk.openadsdk.core.at.kgy.ahm.1
            @Override // java.lang.Runnable
            public void run() {
                ahm.this.kgy(string, strRz, strAhm, strUq, str2);
            }
        }, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ahm() {
        int iCt = xh.uq().ct();
        if (iCt <= 0) {
            iCt = 100;
        }
        List<com.bytedance.sdk.openadsdk.core.at.kgy.kgy> listAhm = rz.kgy().ahm();
        if (listAhm != null && !listAhm.isEmpty() && iCt < listAhm.size()) {
            int size = (int) (listAhm.size() - (iCt * 0.75f));
            if (size <= 0) {
                return;
            }
            TreeMap treeMap = new TreeMap();
            for (com.bytedance.sdk.openadsdk.core.at.kgy.kgy kgyVar : listAhm) {
                treeMap.put(kgyVar.uq(), kgyVar);
            }
            HashSet hashSet = new HashSet();
            int i = 0;
            for (Map.Entry entry : treeMap.entrySet()) {
                if (entry != null && i < size) {
                    i++;
                    com.bytedance.sdk.openadsdk.core.at.kgy.kgy kgyVar2 = (com.bytedance.sdk.openadsdk.core.at.kgy.kgy) entry.getValue();
                    if (kgyVar2 != null) {
                        hashSet.add(kgyVar2.kgy());
                    }
                }
            }
            kgy(hashSet);
            return;
        }
        if (listAhm != null) {
            listAhm.size();
        }
    }

    public static ahm kgy() {
        if (kgy == null) {
            synchronized (ahm.class) {
                try {
                    if (kgy == null) {
                        kgy = new ahm();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kgy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kgy(String str, String str2, String str3, String str4, String str5) {
        if (kgy(str, str3) != null) {
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                return;
            }
            ahm(str2, str3, str5, str4, str);
            return;
        }
        if (TextUtils.isEmpty(str4)) {
            kgy(str2, str, str3, str5, (kgy) null);
        } else {
            ahm(str2, str3, str5, str4, str);
        }
    }

    public void kgy(String str, String str2, String str3, String str4, String str5, final kgy kgyVar) {
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            if (kgyVar != null) {
                kgyVar.kgy(1, "id  or md5 is empty", "net");
                return;
            }
            return;
        }
        String strI = h50.i(str, "_", str3);
        com.bytedance.sdk.openadsdk.core.at.kgy.kgy kgyVarKgy = kgy(strI, str4);
        if (kgyVarKgy != null && !TextUtils.isEmpty(kgyVarKgy.ct())) {
            kgy(kgyVarKgy);
            if (kgyVar != null) {
                try {
                    kgyVar.kgy(PangleNetworkBridge.jsonObjectInit(kgyVarKgy.ct()), "local");
                    return;
                } catch (JSONException e) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+yqQDfJqxoNC0g==", "bskomze5ZNeMS8NYoRCuKVzrPw==", "Wu08gAqubPOFR8dRjQWlAVXoIg==", Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE);
                    kgyVar.kgy(2, "parse json exception data is " + kgyVarKgy.ct(), "local");
                    return;
                }
            }
            return;
        }
        kgy(str2, strI, str4, str5, new kgy() { // from class: com.bytedance.sdk.openadsdk.core.at.kgy.ahm.2
            @Override // com.bytedance.sdk.openadsdk.core.at.kgy.ahm.kgy
            public void kgy(JSONObject jSONObject, String str6) {
                kgy kgyVar2 = kgyVar;
                if (kgyVar2 != null) {
                    kgyVar2.kgy(jSONObject, str6);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.at.kgy.ahm.kgy
            public void kgy(int i, String str6, String str7) {
                kgy kgyVar2 = kgyVar;
                if (kgyVar2 != null) {
                    kgyVar2.kgy(i, str6, str7);
                }
            }
        });
    }

    private void ahm(String str, String str2, String str3, String str4, String str5) {
        com.bytedance.sdk.openadsdk.core.at.kgy.kgy kgyVar = new com.bytedance.sdk.openadsdk.core.at.kgy.kgy();
        kgyVar.rz(str).ct(str3).uq(str4).ahm(str2).kgy(str5).kgy(Long.valueOf(System.currentTimeMillis()));
        rz.kgy().kgy(kgyVar);
        ahm();
    }

    private void kgy(final String str, final String str2, final String str3, final String str4, final kgy kgyVar) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            if (kgyVar != null) {
                kgyVar.kgy(1, "template url or id  or md5 is empty", "net");
            }
        } else {
            com.bytedance.sdk.component.fi.ahm.ahm ahmVarRz = com.bytedance.sdk.openadsdk.sx.ahm.ahm().rz().rz();
            ahmVarRz.rz(str);
            ahmVarRz.kgy(7);
            ahmVarRz.ahm("load_ug_t");
            ahmVarRz.ahm(new com.bytedance.sdk.component.fi.kgy.kgy() { // from class: com.bytedance.sdk.openadsdk.core.at.kgy.ahm.3
                @Override // com.bytedance.sdk.component.fi.kgy.kgy
                public void kgy(com.bytedance.sdk.component.fi.ahm.rz rzVar, com.bytedance.sdk.component.fi.ahm ahmVar) {
                    if (ahmVar == null) {
                        return;
                    }
                    if (!ahmVar.noq()) {
                        kgy kgyVar2 = kgyVar;
                        if (kgyVar2 != null) {
                            kgyVar2.kgy(3, "net code error code is " + ahmVar.kgy() + " message is " + ahmVar.ahm(), "net");
                            return;
                        }
                        return;
                    }
                    String strUq = ahmVar.uq();
                    if (TextUtils.isEmpty(strUq)) {
                        kgy kgyVar3 = kgyVar;
                        if (kgyVar3 != null) {
                            kgyVar3.kgy(3, "net data is null", "net");
                            return;
                        }
                        return;
                    }
                    rz.kgy().kgy(new com.bytedance.sdk.openadsdk.core.at.kgy.kgy().kgy(str2).ahm(str3).rz(str).ct(str4).uq(strUq).kgy(Long.valueOf(System.currentTimeMillis())));
                    ahm.this.ahm();
                    if (kgyVar != null) {
                        try {
                            kgyVar.kgy(PangleNetworkBridge.jsonObjectInit(strUq), "net");
                        } catch (JSONException e) {
                            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+yqQDfJqxoNC0g==", "bskomze5ZNeMS8NYoRCuKVzrP9FQ", "VOAfkBCsZsmTTw==", 180);
                            kgyVar.kgy(2, "parse json exception data is".concat(String.valueOf(strUq)), "net");
                        }
                    }
                }

                @Override // com.bytedance.sdk.component.fi.kgy.kgy
                public void kgy(com.bytedance.sdk.component.fi.ahm.rz rzVar, IOException iOException) {
                    kgy kgyVar2 = kgyVar;
                    if (kgyVar2 != null) {
                        kgyVar2.kgy(3, "net error " + iOException.getMessage(), "net");
                    }
                }
            });
        }
    }

    public Set<com.bytedance.sdk.openadsdk.core.at.kgy.kgy> kgy(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return rz.kgy().kgy(str);
    }

    public String kgy(String str, String str2, String str3) {
        com.bytedance.sdk.openadsdk.core.at.kgy.kgy kgyVarKgy = kgy(h50.i(str, "_", str2), str3);
        if (kgyVarKgy == null) {
            return null;
        }
        kgy(kgyVarKgy);
        return kgyVarKgy.ct();
    }

    private com.bytedance.sdk.openadsdk.core.at.kgy.kgy kgy(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return rz.kgy().kgy(str, str2);
    }

    private void kgy(final com.bytedance.sdk.openadsdk.core.at.kgy.kgy kgyVar) {
        kgyVar.kgy(Long.valueOf(System.currentTimeMillis()));
        mw.kgy(new com.bytedance.sdk.component.gf.ahm.rz("updateTmplTime") { // from class: com.bytedance.sdk.openadsdk.core.at.kgy.ahm.4
            @Override // java.lang.Runnable
            public void run() {
                rz.kgy().kgy(kgyVar);
            }
        }, 10);
    }

    public void kgy(Set<String> set) {
        try {
            rz.kgy().kgy(set);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+yqQDfJqxoNC0g==", "bskomze5ZNeMS8NYoRCuKVzrPw==", "X+shkBe5R8i2S9tUiCWlJUviLIEGmnvIjWPT", 297);
            th.getMessage();
        }
    }
}
