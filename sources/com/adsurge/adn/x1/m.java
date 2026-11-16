package com.adsurge.adn.x1;

import android.os.Build;
import com.adsurge.adn.X.y;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class m {
    public static com.adsurge.adn.Y0.d a() {
        String[] strArr = Build.SUPPORTED_ABIS;
        return new com.adsurge.adn.Y0.d().a("cpu_abi", strArr.length > 0 ? strArr[0] : "unknown").a("is_process_64", Integer.valueOf(y.c() ? 1 : 0));
    }

    public static void a(int i, int i2, int i3, String str, String str2) {
        com.adsurge.adn.w1.b.a(i, (com.adsurge.adn.Y0.c) null, Integer.valueOf(i2), Integer.valueOf(i3), a().a("throw", str).a("ver", str2));
    }

    public static void a(int i, int i2) {
        com.adsurge.adn.w1.b.a(i, (com.adsurge.adn.Y0.c) null, Integer.valueOf(i2), (Integer) null, a());
    }
}
