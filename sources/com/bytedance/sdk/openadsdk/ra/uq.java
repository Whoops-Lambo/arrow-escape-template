package com.bytedance.sdk.openadsdk.ra;

import android.content.Context;
import com.bytedance.sdk.component.ahm.kgy.at;
import com.bytedance.sdk.component.ahm.kgy.kus;
import com.bytedance.sdk.component.ahm.kgy.noq;
import com.bytedance.sdk.component.ahm.kgy.nu;
import com.bytedance.sdk.component.noq.gm;
import com.bytedance.sdk.component.noq.sx;
import com.bytedance.sdk.component.noq.vs;
import com.bytedance.sdk.component.utils.ra;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.um;
import com.bytedance.sdk.openadsdk.core.xh;
import com.bytedance.sdk.openadsdk.utils.gbb;
import com.bytedance.sdk.openadsdk.utils.mw;
import com.bytedance.sdk.openadsdk.utils.vrj;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class uq {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class kgy {
        private static final vs ahm = kgy(xh.kgy());
        private static int rz = 10;
        private static int uq = 15;
        private static int ct = 30;
        public static boolean kgy = false;

        /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ra.uq$kgy$kgy, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static class C0282kgy implements com.bytedance.sdk.component.noq.uq {
            private C0282kgy() {
            }

            private Map<String, String> kgy(com.bytedance.sdk.component.noq.ct ctVar, kus kusVar) {
                if (ctVar.ahm()) {
                    noq noqVarYo = kusVar.yo();
                    HashMap map = new HashMap();
                    int iKgy = noqVarYo.kgy();
                    for (int i = 0; i < iKgy; i++) {
                        String strKgy = noqVarYo.kgy(i);
                        String strAhm = noqVarYo.ahm(i);
                        if (strKgy != null) {
                            map.put(strKgy, strAhm);
                        }
                    }
                    return map;
                }
                return null;
            }

            @Override // com.bytedance.sdk.component.noq.uq
            /* JADX INFO: renamed from: ahm, reason: merged with bridge method [inline-methods] */
            public com.bytedance.sdk.component.noq.kgy.rz kgy(com.bytedance.sdk.component.noq.ct ctVar) {
                com.bytedance.sdk.component.noq.kgy.uq uqVar;
                nu nuVarFi = com.bytedance.sdk.openadsdk.sx.ahm.ahm().rz().fi();
                at atVarAhm = new at.kgy().ahm(ctVar.kgy()).kgy().ahm();
                if (ctVar.rz()) {
                    uqVar = new com.bytedance.sdk.component.noq.kgy.uq();
                } else {
                    uqVar = null;
                }
                if (uqVar != null) {
                    uqVar.kgy(System.currentTimeMillis());
                }
                try {
                    kus kusVarAhm = nuVarFi.kgy(atVarAhm).ahm();
                    if (uqVar != null) {
                        uqVar.ahm(System.currentTimeMillis());
                    }
                    Map<String, String> mapKgy = kgy(ctVar, kusVarAhm);
                    com.bytedance.sdk.component.ahm.kgy.vs vsVarNoq = kusVarAhm.noq();
                    if (vsVarNoq == null) {
                        com.bytedance.sdk.component.noq.kgy.rz rzVarKgy = kgy(uqVar, new RuntimeException("net response body is null"));
                        ra.kgy(kusVarAhm);
                        return rzVarKgy;
                    }
                    com.bytedance.sdk.component.noq.kgy.rz rzVar = new com.bytedance.sdk.component.noq.kgy.rz(kusVarAhm.rz(), vsVarNoq.uq(), "", mapKgy);
                    ra.kgy(kusVarAhm);
                    return rzVar;
                } catch (Throwable th) {
                    try {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4Ucpw==", "cuMskgaQZsaET8VqnhCwOF78abwOvW7CrEXWWYkDlzpa/j2QEZRmy4RPxRmlHKEvXsY5gROfZc6FRMM=", "WO8hmQ==", TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173);
                        return kgy(uqVar, th);
                    } finally {
                        ra.kgy(null);
                    }
                }
            }

            private com.bytedance.sdk.component.noq.kgy.rz kgy(com.bytedance.sdk.component.noq.kgy.uq uqVar, Throwable th) {
                th.getMessage();
                if (uqVar != null) {
                    uqVar.rz(System.currentTimeMillis());
                }
                com.bytedance.sdk.component.noq.kgy.rz rzVar = new com.bytedance.sdk.component.noq.kgy.rz(98765, th, "net failed");
                rzVar.kgy(uqVar);
                return rzVar;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.bytedance.sdk.component.noq.ra ahm(um umVar) {
            return kgy(ahm.kgy(umVar.kgy()).kgy(umVar.ahm()).ahm(umVar.rz()).ct(gbb.noq(xh.kgy())).uq(gbb.uq(xh.kgy())).kgy(umVar.yo()));
        }

        private static vs kgy(Context context) {
            kgy();
            return com.bytedance.sdk.component.noq.ahm.rz.ahm.kgy(context, new com.bytedance.sdk.component.noq.ahm.rz.ct.kgy().kgy(new com.bytedance.sdk.component.noq.ahm.rz.kgy.ahm(0, rz, uq, ct, new File(CacheDirFactory.getImageCacheDir("image_p")))).kgy(kgy).kgy(new sx() { // from class: com.bytedance.sdk.openadsdk.ra.uq.kgy.2
                @Override // com.bytedance.sdk.component.noq.sx
                public ExecutorService ahm() {
                    return mw.rz();
                }

                @Override // com.bytedance.sdk.component.noq.sx
                public ExecutorService kgy() {
                    return mw.ahm();
                }
            }).kgy(new gm() { // from class: com.bytedance.sdk.openadsdk.ra.uq.kgy.1
                @Override // com.bytedance.sdk.component.noq.gm
                public void kgy(int i, String str) {
                    com.bytedance.sdk.openadsdk.dg.uq.kgy(str, true);
                }
            }).kgy(new C0282kgy()).kgy());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.bytedance.sdk.component.noq.ra ahm(String str) {
            return kgy(ahm.kgy(str).ct(gbb.noq(xh.kgy())).uq(gbb.uq(xh.kgy())));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static InputStream ahm(String str, String str2) {
            return ahm.kgy(str, str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean ahm(String str, String str2, String str3) {
            return ahm.kgy(str, str2, str3);
        }

        public static void kgy() {
            rz = com.bytedance.sdk.openadsdk.lqi.ct.kgy("image_config", "bitmap_cache_count", 10);
            uq = com.bytedance.sdk.openadsdk.lqi.ct.kgy("image_config", "data_cache_count", 15);
            ct = com.bytedance.sdk.openadsdk.lqi.ct.kgy("image_config", "disk_cache_count", 30);
            kgy = com.bytedance.sdk.openadsdk.lqi.ct.kgy("img_need_scale", 0) == 1;
        }

        private static com.bytedance.sdk.component.noq.ra kgy(com.bytedance.sdk.component.noq.ra raVar) {
            return vrj.kgy() ? raVar.kgy(new ct()) : raVar;
        }
    }

    public static boolean ahm() {
        return kgy.kgy;
    }

    public static com.bytedance.sdk.component.noq.ra kgy(String str) {
        return kgy.ahm(str);
    }

    public static com.bytedance.sdk.component.noq.ra kgy(um umVar) {
        return kgy.ahm(umVar);
    }

    public static InputStream kgy(String str, String str2) {
        return kgy.ahm(str, str2);
    }

    public static boolean kgy(String str, String str2, String str3) {
        return kgy.ahm(str, str2, str3);
    }

    public static vs kgy() {
        return kgy.ahm;
    }
}
