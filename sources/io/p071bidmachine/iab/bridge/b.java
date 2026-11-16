package io.p071bidmachine.iab.bridge;

import io.p071bidmachine.iab.mraid.r;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class b implements r {
    public static final List a = Arrays.asList("readFile", "writeFile", "readDefaults", "writeDefaults");

    @Override // io.p071bidmachine.iab.mraid.r
    public final String e(String str) {
        return str.substring(16);
    }

    @Override // io.p071bidmachine.iab.mraid.r
    public final boolean i(String str) {
        return a.contains(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x004f A[RETURN] */
    @Override // io.p071bidmachine.iab.mraid.r
    public final boolean d(String str, Map map) {
        switch (str) {
            case "writeFile":
            case "writeDefaults":
                if (!map.containsKey("path") || !map.containsKey("data")) {
                    return false;
                }
                return true;
            case "readFile":
            case "readDefaults":
                return map.containsKey("path");
            default:
                return true;
        }
    }
}
