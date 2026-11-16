package com.bytedance.adsdk.kgy.ahm.rz.kgy;

import com.bytedance.adsdk.kgy.ahm.ahm.kgy.vs;
import defpackage.d;
import java.util.Deque;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class yo extends noq {
    @Override // com.bytedance.adsdk.kgy.ahm.rz.kgy.noq
    public int kgy(String str, int i, Deque<com.bytedance.adsdk.kgy.ahm.ahm.kgy> deque, com.bytedance.adsdk.kgy.ahm.rz.kgy kgyVar) {
        int i2;
        char cKgy;
        if (!kgy(str, i, deque)) {
            return kgyVar.kgy(str, i, deque);
        }
        if (kgy(i, str) == '-') {
            i2 = i + 1;
        } else {
            i2 = i;
        }
        boolean z = false;
        while (true) {
            cKgy = kgy(i2, str);
            if (!com.bytedance.adsdk.kgy.ahm.ct.kgy.rz(cKgy) && (z || cKgy != '.')) {
                break;
            }
            i2++;
            if (cKgy == '.') {
                z = true;
            }
        }
        if (cKgy != '.') {
            deque.push(new vs(str.substring(i, i2)));
            return i2;
        }
        d.r("Illegal negative number format, problem interval:".concat(str.substring(i, i2)));
        return 0;
    }

    private boolean kgy(String str, int i, Deque<com.bytedance.adsdk.kgy.ahm.ahm.kgy> deque) {
        if ('-' == kgy(i, str)) {
            if (deque.peek() != null && !com.bytedance.adsdk.kgy.ahm.uq.rz.kgy(deque.peek().kgy())) {
                return false;
            }
            if (com.bytedance.adsdk.kgy.ahm.ct.kgy.rz(kgy(i + 1, str))) {
                return true;
            }
            d.r("Unrecognized - symbol, not a negative number or operator, problem range:".concat(str.substring(0, i)));
            return false;
        }
        return com.bytedance.adsdk.kgy.ahm.ct.kgy.rz(kgy(i, str));
    }
}
