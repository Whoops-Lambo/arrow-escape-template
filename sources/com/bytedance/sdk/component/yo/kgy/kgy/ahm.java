package com.bytedance.sdk.component.yo.kgy.kgy;

import android.text.TextUtils;
import com.bytedance.sdk.component.yo.kgy.yo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class ahm extends kgy {
    private final rz ahm;
    private final uq kgy;
    private final Queue<String> rz;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.yo.kgy.kgy.uq
    public synchronized List<com.bytedance.sdk.component.yo.kgy.uq.kgy> kgy(int i, int i2, List<String> list) {
        List list2;
        try {
            List<com.bytedance.sdk.component.yo.kgy.uq.kgy> listKgy = this.kgy.kgy(i, i2, list);
            int i3 = 0;
            if (listKgy == null || listKgy.size() == 0) {
                ArrayList arrayList = new ArrayList(this.rz);
                if (list != null && !list.isEmpty()) {
                    arrayList.addAll(list);
                }
                List<com.bytedance.sdk.component.yo.kgy.uq.kgy> listKgy2 = this.ahm.kgy(i, i2, arrayList);
                if (listKgy2 != null && listKgy2.size() != 0) {
                    HashMap map = new HashMap();
                    for (com.bytedance.sdk.component.yo.kgy.uq.kgy kgyVar : listKgy2) {
                        map.put(kgyVar.rz(), kgyVar);
                    }
                    arrayList.size();
                    if (arrayList.size() != 0) {
                        int size = arrayList.size();
                        while (i3 < size) {
                            Object obj = arrayList.get(i3);
                            i3++;
                            String str = (String) obj;
                            if (map.get(str) != null) {
                                map.remove(str);
                            }
                        }
                    }
                    listKgy2.clear();
                    Iterator it = map.keySet().iterator();
                    while (it.hasNext()) {
                        listKgy2.add(map.get((String) it.next()));
                    }
                }
                list2 = listKgy2;
            } else {
                listKgy.size();
                if (i == 1 || i == 2) {
                    list2 = listKgy;
                    List<com.bytedance.sdk.component.yo.kgy.uq.kgy> listAhm = this.ahm.ahm((com.bytedance.sdk.component.yo.kgy.uq.kgy) listKgy.get(0), listKgy.size());
                    list2 = listKgy;
                    if (listAhm != null && listAhm.size() != 0) {
                        list2 = listKgy;
                        listAhm.size();
                        HashMap map2 = new HashMap();
                        for (com.bytedance.sdk.component.yo.kgy.uq.kgy kgyVar2 : listAhm) {
                            map2.put(kgyVar2.rz(), kgyVar2);
                        }
                        ArrayList arrayList2 = new ArrayList(this.rz);
                        for (com.bytedance.sdk.component.yo.kgy.uq.kgy kgyVar3 : listAhm) {
                            int size2 = arrayList2.size();
                            int i4 = 0;
                            while (i4 < size2) {
                                Object obj2 = arrayList2.get(i4);
                                i4++;
                                if (TextUtils.equals(kgyVar3.rz(), (String) obj2)) {
                                    map2.remove(kgyVar3.rz());
                                    break;
                                }
                            }
                        }
                        for (com.bytedance.sdk.component.yo.kgy.uq.kgy kgyVar4 : listKgy) {
                            map2.put(kgyVar4.rz(), kgyVar4);
                        }
                        listKgy.clear();
                        Iterator it2 = map2.keySet().iterator();
                        while (it2.hasNext()) {
                            listKgy.add(map2.get((String) it2.next()));
                        }
                        listAhm.clear();
                        list2 = listKgy;
                    }
                }
            }
            if (list2 != null && !list2.isEmpty()) {
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    this.rz.offer(((com.bytedance.sdk.component.yo.kgy.uq.kgy) it3.next()).rz());
                }
                return list2;
            }
            return new ArrayList();
        } catch (Throwable th) {
            throw th;
        }
    }

    public ahm() {
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        this.rz = concurrentLinkedQueue;
        this.kgy = new noq(concurrentLinkedQueue);
        this.ahm = new rz();
    }

    @Override // com.bytedance.sdk.component.yo.kgy.kgy.uq
    public synchronized void kgy(int i, List<com.bytedance.sdk.component.yo.kgy.uq.kgy> list) {
        try {
            Iterator<com.bytedance.sdk.component.yo.kgy.uq.kgy> it = list.iterator();
            while (it.hasNext()) {
                this.rz.remove(it.next().rz());
            }
            uq uqVar = this.kgy;
            if (uqVar != null) {
                uqVar.kgy(i, list);
            }
            rz rzVar = this.ahm;
            if (rzVar != null) {
                rzVar.kgy(i, list);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bytedance.sdk.component.yo.kgy.kgy.uq
    public synchronized void kgy(com.bytedance.sdk.component.yo.kgy.uq.kgy kgyVar, int i) {
        uq uqVar;
        if (i != 5) {
            try {
                if (yo.noq().vs().kgy(yo.noq().ct()) && (uqVar = this.kgy) != null && kgyVar != null) {
                    uqVar.kgy(kgyVar, i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        rz rzVar = this.ahm;
        if (rzVar != null && kgyVar != null) {
            rzVar.kgy(kgyVar, i);
        }
    }

    @Override // com.bytedance.sdk.component.yo.kgy.kgy.uq
    public synchronized boolean kgy(int i, boolean z) {
        if (this.kgy.kgy(i, z)) {
            com.bytedance.sdk.component.yo.kgy.rz.ahm.kgy(com.bytedance.sdk.component.yo.kgy.ahm.uq.uq.bmz(), 1);
            return true;
        }
        if ((i != 1 && i != 2) || !this.ahm.kgy(i, z)) {
            return false;
        }
        com.bytedance.sdk.component.yo.kgy.rz.ahm.kgy(com.bytedance.sdk.component.yo.kgy.ahm.uq.uq.ikw(), 1);
        return true;
    }

    @Override // com.bytedance.sdk.component.yo.kgy.kgy.uq
    public void kgy(int i, long j) {
        this.ahm.kgy(i, j);
        this.kgy.kgy(i, j);
    }
}
