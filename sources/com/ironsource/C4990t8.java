package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.t8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class C4990t8 {

    /* JADX INFO: renamed from: com.ironsource.t8$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum a {
        None,
        Device,
        Controller
    }

    /* JADX INFO: renamed from: com.ironsource.t8$b */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum b {
        None,
        Loading,
        Loaded,
        Ready,
        Failed
    }

    /* JADX INFO: renamed from: com.ironsource.t8$c */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum c {
        Web,
        Native,
        None
    }

    /* JADX INFO: renamed from: com.ironsource.t8$d */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum d {
        MODE_0(0),
        MODE_1(1),
        MODE_2(2),
        MODE_3(3);

        private int a;

        public int b() {
            return this.a;
        }

        d(int i) {
            this.a = i;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.t8$e */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum e {
        Banner,
        Interstitial,
        RewardedVideo,
        NativeAd,
        None
    }
}
