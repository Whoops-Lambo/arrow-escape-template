package com.bytedance.sdk.component.noq.ahm.ahm;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.noq.fpp;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class kgy<T> implements noq {
    @Override // com.bytedance.sdk.component.noq.ahm.ahm.noq
    public boolean kgy(com.bytedance.sdk.component.noq.ahm.rz.rz rzVar, fpp fppVar, com.bytedance.sdk.component.noq.ahm.rz.kgy kgyVar) {
        Bitmap bitmapKgy;
        String strFi = rzVar.fi();
        rzVar.kgy();
        com.bytedance.sdk.component.noq.ahm ahmVarXh = rzVar.xh();
        com.bytedance.sdk.component.noq.ahm.rz.noq noqVarDg = rzVar.dg();
        if (ahmVarXh != null && noqVarDg != null && ahmVarXh.ct() && kgy(rzVar) && (bitmapKgy = noqVarDg.kgy(ahmVarXh).kgy(strFi)) != null) {
            rzVar.kgy();
            kgyVar.kgy(new com.bytedance.sdk.component.noq.ahm.rz.uq().kgy(rzVar, bitmapKgy, null, false));
            return false;
        }
        return true;
    }

    private boolean kgy(com.bytedance.sdk.component.noq.ahm.rz.rz rzVar) {
        int iNu = rzVar.nu();
        return iNu == 1 || iNu == 2;
    }

    @Override // com.bytedance.sdk.component.noq.ahm.ahm.noq
    public String kgy() {
        return "bitmap_cache";
    }
}
