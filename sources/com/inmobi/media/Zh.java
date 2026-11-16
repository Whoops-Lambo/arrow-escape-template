package com.inmobi.media;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Zh {
    public static Yh a(String str, String str2) {
        str.getClass();
        str2.getClass();
        int iHashCode = str2.hashCode();
        if (iHashCode != -1084172778) {
            if (iHashCode != 3213227) {
                if (iHashCode == 1236050372 && str2.equals("htmlUrl")) {
                    return new C4567z8(str);
                }
            } else if (str2.equals(CreativeInfo.al)) {
                return new C4540y8(str);
            }
        } else if (str2.equals("inmobiJson")) {
            return new X9(str);
        }
        defpackage.d.r("Unsupported markup type: ".concat(str2));
        return null;
    }
}
