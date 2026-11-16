package com.bytedance.sdk.openadsdk.uq;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class ahm {
    public static final String kgy = com.bytedance.sdk.openadsdk.uq.rz.kgy.InterfaceC0292kgy.kgy;
    public static final String ahm = com.bytedance.sdk.openadsdk.uq.rz.kgy.InterfaceC0292kgy.ahm;
    public static final String rz = com.bytedance.sdk.openadsdk.uq.rz.kgy.InterfaceC0292kgy.rz;
    public static final String uq = com.bytedance.sdk.openadsdk.uq.rz.kgy.InterfaceC0292kgy.uq;
    public static final String ct = com.bytedance.sdk.openadsdk.uq.rz.kgy.InterfaceC0292kgy.ct;
    public static final String noq = com.bytedance.sdk.openadsdk.uq.rz.kgy.InterfaceC0292kgy.noq;
    public static final Set<String> yo = new HashSet(Arrays.asList("click", "show", "insight_log"));

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.uq.ahm$ahm, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class C0285ahm {
        public static String ahm = "openAdLandPageLinks";
        public static String kgy = "openDetailPage";
        public static String rz = "direct";
        public static String uq = "saLandingPageLinks";
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        public static String ahm = "download_app_ad";
        public static String ct = "clickEvent";
        public static String fi = "ugen3.0";
        public static String gf = "LPV";
        public static String kgy = "openAdLandPageLinks";
        public static String noq = "downloadStart";
        public static String nu = "adNavigate";
        public static String ra = "native";
        public static String rz = "commonConvert";
        public static String uq = "multiOpenCovert";
        public static String yo = "ndr2.0";
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class rz {
        public static int ahm = 2;
        public static int kgy = 1;
        public static int rz = 100;
    }

    public static boolean kgy(String str) {
        return "embeded_ad".equals(str) || "banner_ad".equals(str) || "interaction".equals(str) || "slide_banner_ad".equals(str);
    }
}
