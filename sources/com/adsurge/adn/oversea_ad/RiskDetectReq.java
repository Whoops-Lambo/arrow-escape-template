package com.adsurge.adn.oversea_ad;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class RiskDetectReq extends Nucleus {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder {
        public Builder cache(boolean z) {
            return this;
        }

        public Builder forceDowngrade() {
            return this;
        }

        public Builder inputParam(Map<Integer, String> map) {
            return this;
        }

        public Builder packTimeoutMillis(int i) {
            return this;
        }

        public Builder reqTimeoutMillis(int i) {
            return this;
        }

        public Builder sourceInfo(Map<String, String> map) {
            return this;
        }

        public RiskDetectReq build() {
            return new RiskDetectReq(this);
        }
    }

    public RiskDetectReq(Builder builder) {
    }
}
