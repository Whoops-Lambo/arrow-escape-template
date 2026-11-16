package com.bytedance.sdk.openadsdk.uq.kgy.kgy;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import com.bytedance.sdk.component.utils.sx;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.ay;
import com.bytedance.sdk.openadsdk.core.xh;
import com.bytedance.sdk.openadsdk.utils.ft;
import com.bytedance.sdk.openadsdk.utils.mw;
import defpackage.n30;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class uq {
    private static final com.bytedance.sdk.openadsdk.uq.kgy.kgy ahm = com.bytedance.sdk.openadsdk.uq.kgy.kgy.kgy();
    public static ay<com.bytedance.sdk.openadsdk.uq.kgy> kgy;

    private static boolean ct(List<com.bytedance.sdk.openadsdk.uq.kgy> list) {
        JSONObject jSONObjectUq;
        if (list == null || list.isEmpty() || (jSONObjectUq = list.get(0).uq()) == null) {
            return true;
        }
        return TextUtils.isEmpty(jSONObjectUq.optString("app_log_url"));
    }

    public static void ahm(final ArrayList<nu> arrayList, @Nullable final com.bytedance.kgy.rz.ahm<nu> ahmVar) {
        if (arrayList == null || arrayList.isEmpty() || com.bytedance.sdk.openadsdk.core.ra.ahm.kgy().ct()) {
            return;
        }
        int i = 0;
        if (arrayList.get(0) == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.dg.rz.ahm()) {
            if (ahmVar != null) {
                ahmVar.kgy(arrayList, true);
                return;
            }
            return;
        }
        final ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i < size) {
            nu nuVar = arrayList.get(i);
            i++;
            nu nuVar2 = nuVar;
            arrayList2.add(new com.bytedance.sdk.openadsdk.dg.ahm.uq.kgy(nuVar2.noq(), nuVar2.rz()));
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        com.bytedance.sdk.openadsdk.um.rz.kgy(new com.bytedance.sdk.openadsdk.um.uq() { // from class: com.bytedance.sdk.openadsdk.uq.kgy.kgy.uq.2
            @Override // com.bytedance.sdk.openadsdk.um.uq
            public com.bytedance.sdk.openadsdk.um.ahm.kgy kgy() {
                return n30.e("stats_2");
            }
        });
        mw.ct(new com.bytedance.sdk.component.gf.ahm.rz("upload_stats_event", 6) { // from class: com.bytedance.sdk.openadsdk.uq.kgy.kgy.uq.3
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.uq.ct ctVarKgy = uq.kgy(arrayList2);
                if (ctVarKgy == null) {
                    ctVarKgy = new com.bytedance.sdk.openadsdk.uq.ct(false, C.PRIORITY_PROCESSING_FOREGROUND, "result is null", false);
                }
                if (ahmVar != null) {
                    ahmVar.kgy(arrayList, new com.bytedance.sdk.component.yo.kgy.ahm.ahm.ahm(ctVarKgy.kgy, ctVarKgy.ahm, ctVarKgy.rz, ctVarKgy.uq, "").kgy);
                    if (ctVarKgy.ahm == 200) {
                        com.bytedance.sdk.openadsdk.um.rz.ahm(new com.bytedance.sdk.openadsdk.um.uq() { // from class: com.bytedance.sdk.openadsdk.uq.kgy.kgy.uq.3.1
                            @Override // com.bytedance.sdk.openadsdk.um.uq
                            public com.bytedance.sdk.openadsdk.um.ahm.kgy kgy() {
                                return n30.e("stats_2");
                            }
                        });
                    } else if (ctVarKgy.uq) {
                        com.bytedance.sdk.openadsdk.um.rz.rz(new com.bytedance.sdk.openadsdk.um.uq() { // from class: com.bytedance.sdk.openadsdk.uq.kgy.kgy.uq.3.2
                            @Override // com.bytedance.sdk.openadsdk.um.uq
                            public com.bytedance.sdk.openadsdk.um.ahm.kgy kgy() {
                                return n30.e("stats_2");
                            }
                        });
                    } else {
                        com.bytedance.sdk.openadsdk.um.rz.rz(new com.bytedance.sdk.openadsdk.um.uq() { // from class: com.bytedance.sdk.openadsdk.uq.kgy.kgy.uq.3.3
                            @Override // com.bytedance.sdk.openadsdk.um.uq
                            public com.bytedance.sdk.openadsdk.um.ahm.kgy kgy() {
                                return n30.e("stats_2");
                            }
                        });
                    }
                }
            }
        });
    }

    public static com.bytedance.sdk.openadsdk.uq.ct kgy(List<com.bytedance.sdk.openadsdk.dg.ahm.uq.kgy> list) {
        if (kgy == null) {
            kgy = xh.rz();
        }
        if (kgy != null && list != null && !list.isEmpty() && com.bytedance.sdk.openadsdk.core.settings.yo.kgy()) {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<com.bytedance.sdk.openadsdk.dg.ahm.uq.kgy> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().ahm);
                }
                jSONObject.putOpt("stats_list", jSONArray);
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = jCurrentTimeMillis / 1000;
                jSONObject.putOpt("ts", Long.valueOf(j));
                jSONObject.putOpt("ts_ms", Long.valueOf(jCurrentTimeMillis));
                String strUq = com.bytedance.sdk.openadsdk.core.ra.ahm().uq();
                if (strUq == null) {
                    strUq = "";
                }
                StringBuilder sb = new StringBuilder(ft.kgy());
                sb.append("-");
                sb.append(jCurrentTimeMillis);
                jSONObject.putOpt("req_sign", com.bytedance.sdk.component.utils.ct.kgy(strUq + j + BuildConfig.VERSION_NAME));
                jSONObject.putOpt("req_uniq", com.bytedance.sdk.component.utils.ct.kgy(sb.toString()));
                return kgy.ahm(jSONObject);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.bytedance.sdk.openadsdk.uq.ct noq(List<com.bytedance.sdk.openadsdk.uq.kgy> list) {
        if (kgy == null) {
            kgy = xh.rz();
        }
        if (kgy == null) {
            return null;
        }
        int i = noq.kgy() != 3 ? -1 : 3;
        com.bytedance.sdk.openadsdk.uq.kgy.kgy kgyVar = ahm;
        return kgy.kgy(kgyVar.kgy(kgyVar.kgy(list, i), System.currentTimeMillis(), kgyVar.ahm()), kgyVar.kgy(list), kgyVar.ahm(list), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HashMap<String, ArrayList<gf>> uq(List<gf> list) {
        HashMap<String, ArrayList<gf>> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            gf gfVar = list.get(i);
            String strOptString = gfVar.rz().optString("app_log_url");
            ArrayList<gf> arrayList = map.get(strOptString);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                map.put(strOptString, arrayList);
            }
            arrayList.add(gfVar);
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean ahm(List<com.bytedance.sdk.openadsdk.uq.kgy> list, com.bytedance.sdk.openadsdk.uq.ct ctVar) {
        int i;
        return !ct(list) && (i = ctVar.ahm) >= 400 && i < 500;
    }

    public static void kgy(final ArrayList<gf> arrayList, final com.bytedance.kgy.rz.ahm<gf> ahmVar) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.ra.ahm.kgy().ct()) {
            if (ahmVar != null) {
                ahmVar.kgy(arrayList, false);
            }
        } else {
            gf gfVar = arrayList.get(0);
            if (gfVar == null) {
                return;
            }
            mw.ct(new com.bytedance.sdk.component.gf.ahm.rz("upload_ad_event", gfVar.ahm() == 1 ? 8 : 7) { // from class: com.bytedance.sdk.openadsdk.uq.kgy.kgy.uq.1
                @Override // java.lang.Runnable
                public void run() {
                    Iterator it;
                    try {
                        it = uq.uq(arrayList).entrySet().iterator();
                    } catch (Throwable th) {
                        sx.rz("EventUploadImpl", th.getMessage());
                        it = null;
                    }
                    Iterator it2 = it;
                    if (it2 == null) {
                        com.bytedance.kgy.rz.ahm ahmVar2 = ahmVar;
                        if (ahmVar2 != null) {
                            ahmVar2.kgy(arrayList, false);
                            return;
                        }
                        return;
                    }
                    while (it2.hasNext()) {
                        try {
                            com.bytedance.sdk.openadsdk.um.rz.kgy(new com.bytedance.sdk.openadsdk.um.uq() { // from class: com.bytedance.sdk.openadsdk.uq.kgy.kgy.uq.1.1
                                @Override // com.bytedance.sdk.openadsdk.um.uq
                                public com.bytedance.sdk.openadsdk.um.ahm.kgy kgy() {
                                    return n30.e("applog_2");
                                }
                            });
                            ArrayList arrayList2 = (ArrayList) ((Map.Entry) it2.next()).getValue();
                            ArrayList arrayList3 = new ArrayList();
                            int size = arrayList2.size();
                            boolean z = false;
                            boolean z2 = false;
                            int i = 0;
                            while (i < size) {
                                Object obj = arrayList2.get(i);
                                i++;
                                gf gfVar2 = (gf) obj;
                                com.bytedance.sdk.openadsdk.uq.kgy kgyVar = new com.bytedance.sdk.openadsdk.uq.kgy(gfVar2.noq(), gfVar2.rz(), gfVar2.ct());
                                String strNoq = kgyVar.noq();
                                if ("show".equals(strNoq)) {
                                    z = true;
                                } else if ("click".equals(strNoq)) {
                                    z2 = true;
                                }
                                arrayList3.add(kgyVar);
                            }
                            if (z && noq.kgy() == 2) {
                                com.bytedance.sdk.openadsdk.um.rz.kgy(new com.bytedance.sdk.openadsdk.um.uq() { // from class: com.bytedance.sdk.openadsdk.uq.kgy.kgy.uq.1.5
                                    @Override // com.bytedance.sdk.openadsdk.um.uq
                                    public com.bytedance.sdk.openadsdk.um.ahm.kgy kgy() {
                                        return n30.e("show");
                                    }
                                });
                            }
                            if (z2 && noq.kgy() == 2) {
                                com.bytedance.sdk.openadsdk.um.rz.kgy(new com.bytedance.sdk.openadsdk.um.uq() { // from class: com.bytedance.sdk.openadsdk.uq.kgy.kgy.uq.1.6
                                    @Override // com.bytedance.sdk.openadsdk.um.uq
                                    public com.bytedance.sdk.openadsdk.um.ahm.kgy kgy() {
                                        return n30.e("click");
                                    }
                                });
                            }
                            com.bytedance.sdk.openadsdk.uq.ct ctVarNoq = uq.noq(arrayList3);
                            if (ctVarNoq == null) {
                                ctVarNoq = new com.bytedance.sdk.openadsdk.uq.ct(false, C.PRIORITY_PROCESSING_FOREGROUND, "result is null", false);
                            }
                            if (ahmVar != null) {
                                boolean z3 = uq.ahm(arrayList3, ctVarNoq) ? true : ctVarNoq.uq;
                                ahmVar.kgy(arrayList2, new com.bytedance.sdk.component.yo.kgy.ahm.ahm.ahm(ctVarNoq.kgy, ctVarNoq.ahm, ctVarNoq.rz, z3, "").kgy);
                                if (ctVarNoq.ahm == 200) {
                                    com.bytedance.sdk.openadsdk.um.rz.ahm(new com.bytedance.sdk.openadsdk.um.uq() { // from class: com.bytedance.sdk.openadsdk.uq.kgy.kgy.uq.1.7
                                        @Override // com.bytedance.sdk.openadsdk.um.uq
                                        public com.bytedance.sdk.openadsdk.um.ahm.kgy kgy() {
                                            return n30.e("applog_2");
                                        }
                                    });
                                    if (z && noq.kgy() == 2) {
                                        com.bytedance.sdk.openadsdk.um.rz.ahm(new com.bytedance.sdk.openadsdk.um.uq() { // from class: com.bytedance.sdk.openadsdk.uq.kgy.kgy.uq.1.8
                                            @Override // com.bytedance.sdk.openadsdk.um.uq
                                            public com.bytedance.sdk.openadsdk.um.ahm.kgy kgy() {
                                                return n30.e("show");
                                            }
                                        });
                                    }
                                    if (z2 && noq.kgy() == 2) {
                                        com.bytedance.sdk.openadsdk.um.rz.ahm(new com.bytedance.sdk.openadsdk.um.uq() { // from class: com.bytedance.sdk.openadsdk.uq.kgy.kgy.uq.1.9
                                            @Override // com.bytedance.sdk.openadsdk.um.uq
                                            public com.bytedance.sdk.openadsdk.um.ahm.kgy kgy() {
                                                return n30.e("click");
                                            }
                                        });
                                    }
                                } else if (z3) {
                                    com.bytedance.sdk.openadsdk.um.rz.rz(new com.bytedance.sdk.openadsdk.um.uq() { // from class: com.bytedance.sdk.openadsdk.uq.kgy.kgy.uq.1.10
                                        @Override // com.bytedance.sdk.openadsdk.um.uq
                                        public com.bytedance.sdk.openadsdk.um.ahm.kgy kgy() {
                                            return n30.e("applog_2");
                                        }
                                    });
                                    if (z && noq.kgy() == 2) {
                                        com.bytedance.sdk.openadsdk.um.rz.rz(new com.bytedance.sdk.openadsdk.um.uq() { // from class: com.bytedance.sdk.openadsdk.uq.kgy.kgy.uq.1.11
                                            @Override // com.bytedance.sdk.openadsdk.um.uq
                                            public com.bytedance.sdk.openadsdk.um.ahm.kgy kgy() {
                                                return n30.e("show");
                                            }
                                        });
                                    }
                                    if (z2 && noq.kgy() == 2) {
                                        com.bytedance.sdk.openadsdk.um.rz.rz(new com.bytedance.sdk.openadsdk.um.uq() { // from class: com.bytedance.sdk.openadsdk.uq.kgy.kgy.uq.1.12
                                            @Override // com.bytedance.sdk.openadsdk.um.uq
                                            public com.bytedance.sdk.openadsdk.um.ahm.kgy kgy() {
                                                return n30.e("click");
                                            }
                                        });
                                    }
                                } else {
                                    com.bytedance.sdk.openadsdk.um.rz.rz(new com.bytedance.sdk.openadsdk.um.uq() { // from class: com.bytedance.sdk.openadsdk.uq.kgy.kgy.uq.1.2
                                        @Override // com.bytedance.sdk.openadsdk.um.uq
                                        public com.bytedance.sdk.openadsdk.um.ahm.kgy kgy() {
                                            return n30.e("applog_2");
                                        }
                                    });
                                    if (z && noq.kgy() == 2) {
                                        com.bytedance.sdk.openadsdk.um.rz.rz(new com.bytedance.sdk.openadsdk.um.uq() { // from class: com.bytedance.sdk.openadsdk.uq.kgy.kgy.uq.1.3
                                            @Override // com.bytedance.sdk.openadsdk.um.uq
                                            public com.bytedance.sdk.openadsdk.um.ahm.kgy kgy() {
                                                return n30.e("show");
                                            }
                                        });
                                    }
                                    if (z2 && noq.kgy() == 2) {
                                        com.bytedance.sdk.openadsdk.um.rz.rz(new com.bytedance.sdk.openadsdk.um.uq() { // from class: com.bytedance.sdk.openadsdk.uq.kgy.kgy.uq.1.4
                                            @Override // com.bytedance.sdk.openadsdk.um.uq
                                            public com.bytedance.sdk.openadsdk.um.ahm.kgy kgy() {
                                                return n30.e("click");
                                            }
                                        });
                                    }
                                }
                            }
                            if (noq.kgy() == 2) {
                                com.bytedance.sdk.openadsdk.uq.kgy.rz.kgy(arrayList3);
                            }
                        } catch (Throwable th2) {
                            sx.rz("EventUploadImpl", th2.getMessage());
                        }
                    }
                }
            });
        }
    }
}
