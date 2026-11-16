package com.bytedance.adsdk.kgy;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class lqi {
    public static dg kgy(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.getClass();
        switch (str) {
            case "toNumber":
                return new gm();
            case "toString":
                return new ay();
            case "formatDecimal":
                return new nu();
            case "feature":
                return new fi();
            case "modArray":
                return new xh();
            case "find":
                return new gf();
            case "join":
                return new vs();
            case "size":
                return new um();
            case "includes":
                return new at();
            case "chunk":
                return new kgy();
            case "exist":
                return new yo();
            case "slice":
                return new fpp();
            case "split":
                return new sx();
            case "dateFormat":
                return new rz();
            case "decodeUrl":
                return new uq();
            case "formatCurrency":
                return new ra();
            case "translate":
                return new ioy();
            case "compactFormatCurrency":
                return new ahm();
            case "encodeUrl":
                return new noq();
            case "isDigit":
                return new twf();
            case "isEmpty":
                return new kus();
            default:
                return null;
        }
    }

    public static Object kgy(com.bytedance.adsdk.kgy.ahm.kgy.kgy kgyVar) {
        dg dgVarKgy;
        if (kgyVar == null || (dgVarKgy = kgy(kgyVar.kgy())) == null) {
            return null;
        }
        return dgVarKgy.kgy(null, kgyVar.ahm());
    }
}
