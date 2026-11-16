package com.bytedance.adsdk.kgy.ahm.rz.kgy;

import defpackage.d;
import java.util.Deque;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class gf extends noq {
    @Override // com.bytedance.adsdk.kgy.ahm.rz.kgy.noq
    public int kgy(String str, int i, Deque<com.bytedance.adsdk.kgy.ahm.ahm.kgy> deque, com.bytedance.adsdk.kgy.ahm.rz.kgy kgyVar) {
        com.bytedance.adsdk.kgy.ahm.ahm.kgy kgyVarPollFirst;
        if (')' != kgy(i, str)) {
            return kgyVar.kgy(str, i, deque);
        }
        LinkedList<com.bytedance.adsdk.kgy.ahm.ahm.kgy> linkedList = new LinkedList();
        while (true) {
            kgyVarPollFirst = deque.pollFirst();
            if (kgyVarPollFirst == null || kgyVarPollFirst.kgy() == com.bytedance.adsdk.kgy.ahm.uq.uq.LEFT_PAREN || ((kgyVarPollFirst instanceof com.bytedance.adsdk.kgy.ahm.ahm.kgy.ra) && kgyVarPollFirst.kgy() == com.bytedance.adsdk.kgy.ahm.uq.ahm.METHOD && !((com.bytedance.adsdk.kgy.ahm.ahm.kgy.ra) kgyVarPollFirst).rz())) {
                break;
            }
            linkedList.addFirst(kgyVarPollFirst);
        }
        if (kgyVarPollFirst == null) {
            d.r(str.substring(0, i));
            return 0;
        }
        if (kgyVarPollFirst.kgy() != com.bytedance.adsdk.kgy.ahm.uq.ahm.METHOD) {
            deque.push(com.bytedance.adsdk.kgy.ahm.ct.ahm.kgy(linkedList, str, i));
            return i + 1;
        }
        com.bytedance.adsdk.kgy.ahm.ahm.kgy.ra raVar = (com.bytedance.adsdk.kgy.ahm.ahm.kgy.ra) kgyVarPollFirst;
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        for (com.bytedance.adsdk.kgy.ahm.ahm.kgy kgyVar2 : linkedList) {
            if (kgyVar2.kgy() == com.bytedance.adsdk.kgy.ahm.uq.uq.COMMA) {
                linkedList2.add(com.bytedance.adsdk.kgy.ahm.ct.ahm.kgy(linkedList3, str, i));
                linkedList3.clear();
            } else {
                linkedList3.addLast(kgyVar2);
            }
        }
        if (!linkedList3.isEmpty()) {
            linkedList2.add(com.bytedance.adsdk.kgy.ahm.ct.ahm.kgy(linkedList3, str, i));
        }
        raVar.kgy((com.bytedance.adsdk.kgy.ahm.ahm.kgy[]) linkedList2.toArray(new com.bytedance.adsdk.kgy.ahm.ahm.kgy[linkedList2.size()]));
        raVar.kgy(true);
        int i2 = i + 1;
        deque.push(raVar);
        return i2;
    }
}
