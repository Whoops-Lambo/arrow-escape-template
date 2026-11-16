package com.adsurge.adn.oversea_ad;

import android.os.Process;
import defpackage.h50;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class m {
    public static String a() {
        StringBuilder sb = new StringBuilder();
        int iMyPid = Process.myPid();
        Guava guavaB = Haw.b(iMyPid);
        if (guavaB == null) {
            return sb.toString();
        }
        int i = guavaB.e;
        if (i == 0) {
            return sb.toString();
        }
        if (i == iMyPid) {
            return sb.toString();
        }
        sb.append(iMyPid);
        sb.append(",");
        sb.append(guavaB.b);
        sb.append(",");
        h50.s(guavaB.c, i, ",", ",", sb);
        Guava guavaB2 = Haw.b(i);
        if (guavaB2 != null) {
            sb.append(guavaB2.d);
            sb.append(",");
            sb.append(guavaB2.c);
            sb.append(",");
            sb.append(guavaB2.b);
        }
        return sb.toString();
    }
}
