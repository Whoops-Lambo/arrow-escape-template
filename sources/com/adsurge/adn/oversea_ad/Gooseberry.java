package com.adsurge.adn.oversea_ad;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Gooseberry {
    public static final ArrayList a = new ArrayList();

    public static String a(HashSet hashSet) {
        StringBuilder sb = new StringBuilder();
        try {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (sb.length() > 0) {
                    sb.append(com.safedk.android.analytics.brandsafety.m.ad);
                }
                sb.append(str);
            }
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    public static synchronized ArrayList a(ITuringPkgProvider iTuringPkgProvider) {
        List<String> pkgs;
        ArrayList arrayList = a;
        if (!arrayList.isEmpty() || iTuringPkgProvider == null || (pkgs = iTuringPkgProvider.getPkgs()) == null || pkgs.isEmpty()) {
            return arrayList;
        }
        arrayList.addAll(pkgs);
        return arrayList;
    }
}
