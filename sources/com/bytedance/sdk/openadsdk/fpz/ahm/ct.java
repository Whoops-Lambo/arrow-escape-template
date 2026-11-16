package com.bytedance.sdk.openadsdk.fpz.ahm;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.ioy;
import com.bytedance.sdk.openadsdk.core.model.uf;
import com.bytedance.sdk.openadsdk.utils.ftg;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ct {
    private static final Map<Integer, ahm> kgy = new ConcurrentHashMap();

    private static boolean rz(ioy ioyVar) {
        if (ioyVar == null) {
            return false;
        }
        String strKgy = ftg.kgy(ioyVar);
        return ((!"open_ad".equals(strKgy) && !"fullscreen_interstitial_ad".equals(strKgy) && !"rewarded_video".equals(strKgy)) || uf.ahm(ioyVar) || ioyVar.naw() == 5 || !ioy.ct(ioyVar) || ioyVar.jw() == null) ? false : true;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        public int ahm = -1;
        public int kgy;

        public kgy(int i) {
            this.kgy = i;
        }
    }

    public static Integer ahm(ioy ioyVar) {
        return Integer.valueOf((ioyVar.wh() + ioyVar.wzd()).hashCode());
    }

    private static ahm kgy(View view, ioy ioyVar, boolean z, kgy kgyVar) {
        if (view == null || ioyVar == null || ioyVar.wzd() == null) {
            return null;
        }
        Integer numAhm = ahm(ioyVar);
        Map<Integer, ahm> map = kgy;
        if (!map.containsKey(numAhm)) {
            ahm ahmVarKgy = ahm.kgy(z, numAhm, view, ioyVar, kgyVar);
            map.put(numAhm, ahmVarKgy);
            return ahmVarKgy;
        }
        ahm ahmVar = map.get(numAhm);
        if (ahmVar != null) {
            ahmVar.kgy(view);
        }
        return ahmVar;
    }

    public static void ahm(Integer num) {
        kgy.remove(num);
    }

    public static void kgy(View view, ioy ioyVar, kgy kgyVar) {
        if (view == null || ioyVar == null || ioyVar.wo()) {
            return;
        }
        boolean zRz = rz(ioyVar);
        if (uf.ahm(ioyVar) && kgyVar != null) {
            kgyVar.kgy = -1;
        }
        kgy(kgy(view, ioyVar, zRz, kgyVar));
    }

    private static void kgy(ahm ahmVar) {
        if (ahmVar == null) {
            return;
        }
        ahmVar.kgy();
    }

    public static void kgy(ioy ioyVar, int i) {
        if (ioyVar == null || ioyVar.wzd() == null) {
            return;
        }
        kgy(kgy.get(ahm(ioyVar)), i);
    }

    public static void kgy(ahm ahmVar, int i) {
        if (ahmVar == null) {
            return;
        }
        ahmVar.kgy(i);
    }

    public static void kgy(ioy ioyVar) {
        if (ioyVar == null || ioyVar.wzd() == null) {
            return;
        }
        Integer numAhm = ahm(ioyVar);
        Map<Integer, ahm> map = kgy;
        ahm ahmVar = map.get(numAhm);
        if (ahmVar != null) {
            ahmVar.ra();
        }
        ahm(numAhm);
        if (map.size() <= 0) {
            yo.kgy();
        }
    }

    public static ahm kgy(Integer num) {
        return kgy.get(num);
    }
}
