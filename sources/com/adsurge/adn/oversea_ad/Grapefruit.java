package com.adsurge.adn.oversea_ad;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class Grapefruit {
    public static final j a = new j();
    public static final Object b = new Object();

    public static List a() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(CanisMinor.a(CanisMinor.n)));
            try {
                ArrayList arrayList = new ArrayList(512);
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
                        Octans.a(bufferedReader);
                        return listUnmodifiableList;
                    }
                    arrayList.add(line);
                }
            } catch (Throwable unused) {
                try {
                    return Collections.EMPTY_LIST;
                } finally {
                    Octans.a(bufferedReader);
                }
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
        }
    }

    public static List b() {
        j jVar = a;
        List list = (List) jVar.a();
        if (list != null) {
            return list;
        }
        synchronized (b) {
            try {
                List list2 = (List) jVar.a();
                if (list2 != null) {
                    return list2;
                }
                List listA = a();
                if (!listA.isEmpty()) {
                    jVar.a(listA, 3000L);
                }
                return listA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
