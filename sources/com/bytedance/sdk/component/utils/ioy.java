package com.bytedance.sdk.component.utils;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class ioy {
    private static ahm kgy;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface ahm {
        void kgy(String str, boolean z, kgy kgyVar);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class kgy {
        public abstract JSONObject kgy();

        public final String ahm() {
            try {
                return kgy().toString();
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "aMoGuQy7bsKSDvZfnwWyKVj6HZQRvWTUp0/ZWJ4QtCdJ", "XOs5sBW5Z9OwS8VcgQI=", 30);
                return "";
            }
        }
    }

    public static void kgy(String str, kgy kgyVar) {
        ahm ahmVar = kgy;
        if (ahmVar == null) {
            return;
        }
        ahmVar.kgy(str, false, kgyVar);
    }

    public static void kgy(ahm ahmVar) {
        kgy = ahmVar;
    }
}
