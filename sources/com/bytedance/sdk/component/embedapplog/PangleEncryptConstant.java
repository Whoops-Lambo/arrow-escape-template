package com.bytedance.sdk.component.embedapplog;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class PangleEncryptConstant {
    public static final int DECRYPT = 2;
    public static final int ENCRYPT = 1;
    public static final int REASON_BASE64 = 3;
    public static final int REASON_CRYPT = 2;
    public static final int REASON_GZIP = 1;
    public static final int REASON_PARAMS_ERROR = 4;
    public static final int REASON_SO_LOAD_FAIL = 6;
    public static final int UNKNOWN = 0;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum CryptDataScene {
        UNKNOWN(0),
        SETTINGS(1),
        GET_ADS(2),
        APP_LOG(3),
        STATS_LOG(4),
        REWARD_VERIFY(5),
        DISLIKE(6),
        BIDDING_TOKEN(7),
        DUAL_EVENT(8),
        STRATEGY(9),
        REGISTER_STATUS(10),
        COMPLIANCE_STATUS(11),
        JSB_REQUEST(12);

        private final int value;

        public int value() {
            return this.value;
        }

        CryptDataScene(int i) {
            this.value = i;
        }
    }
}
