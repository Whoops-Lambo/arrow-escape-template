package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ϝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0533 {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static final Set f1282;

    static {
        StringFog.decrypt("wyRu/xgShp/9InPPEw==\n", "okAfoHF87+s=\n");
        StringFog.decrypt("uFLGh4VhKoO+Ws2ahWYgm6hd\n", "zTOi9NoST/A=\n");
        StringFog.decrypt("rJCS2U+YeKW3kqPfU5RTiqaYktBUmg==\n", "xff8tj39J9U=\n");
        f1282 = Collections.unmodifiableSet(new HashSet(Arrays.asList(StringFog.decrypt("lMu2RxeDGmmqzat3HA==\n", "9a/HGH7tcx0=\n"), StringFog.decrypt("Ic1eKiePbJYnxVU3J4hmjjHC\n", "VKw6WXj8CeU=\n"))));
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m516(AbstractMap abstractMap, String str) {
        if (abstractMap.containsKey(str)) {
            return false;
        }
        int size = abstractMap.size();
        Iterator it = f1282.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (abstractMap.containsKey((String) it.next())) {
                i++;
            }
        }
        if (size < i + 5) {
            return false;
        }
        return true;
    }
}
