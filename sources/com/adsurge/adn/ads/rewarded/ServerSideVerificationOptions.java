package com.adsurge.adn.ads.rewarded;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class ServerSideVerificationOptions {
    public static final String ACTION = "rewardAction";
    public static final String TRANS_ID = "transId";
    public String a;
    public String b;
    public final JSONObject c = new JSONObject();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Builder {
        public String a;
        public String b;

        public ServerSideVerificationOptions build() {
            return new ServerSideVerificationOptions(this);
        }

        public Builder setCustomData(String str) {
            this.a = str;
            return this;
        }

        public Builder setUserId(String str) {
            this.b = str;
            return this;
        }
    }

    public String getCustomData() {
        return this.a;
    }

    public JSONObject getOptions() {
        return this.c;
    }

    public String getUserId() {
        return this.b;
    }

    public ServerSideVerificationOptions(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
    }
}
