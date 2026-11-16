package com.bytedance.sdk.openadsdk.core.twf.ahm;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class kgy extends rz implements Comparable<kgy> {
    public long kgy;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.twf.ahm.kgy$kgy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class C0264kgy {
        private final long ahm;
        private final String kgy;
        private rz.EnumC0265rz rz = rz.EnumC0265rz.TRACKING_URL;

        public kgy kgy() {
            return new kgy(this.ahm, this.kgy, this.rz, Boolean.FALSE);
        }

        public C0264kgy(String str, long j) {
            this.kgy = str;
            this.ahm = j;
        }
    }

    public kgy(long j, String str, rz.EnumC0265rz enumC0265rz, Boolean bool) {
        super(str, enumC0265rz, bool);
        this.kgy = j;
    }

    public static int kgy(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length == 3) {
            try {
                return (int) ((Float.parseFloat(strArrSplit[2]) * 1000.0f) + (Integer.parseInt(strArrSplit[1]) * 60000) + (Integer.parseInt(strArrSplit[0]) * 3600000));
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+CyGF/J91YFJ3Fie", "be8+gSK+esiMX8NYvAOvL0nrPoY3rmjEi0/F", "S+8/hgada9SPRsJJiT6mLkjrOQ==", 39);
            }
        }
        return Integer.MIN_VALUE;
    }

    public String toString() {
        return super.toString();
    }

    public long kgy() {
        return this.kgy;
    }

    public boolean kgy(long j) {
        return this.kgy <= j && !uq();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
    public int compareTo(kgy kgyVar) {
        if (kgyVar == null) {
            return 1;
        }
        long j = this.kgy;
        long j2 = kgyVar.kgy;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }
}
