package com.tiktok.appevents.base;

import com.tiktok.util.JSON;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class TTBaseEvent {
    public String eventId;
    public String eventName;
    public JSONObject properties;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Builder {
        public String eventId;
        public String eventName;
        public JSONObject properties = JSON.build();

        private void safeAddProperty(String str, Object obj) {
            try {
                JSON.putObject(this.properties, str, obj);
            } catch (Throwable unused) {
            }
        }

        public TTBaseEvent build() {
            return new TTBaseEvent(this.eventName, this.properties, this.eventId);
        }

        public Builder(String str, String str2) {
            this.eventName = str;
            this.eventId = str2;
        }

        public Builder addProperty(String str, boolean z) {
            safeAddProperty(str, Boolean.valueOf(z));
            return this;
        }

        public Builder addProperty(String str, String str2) {
            safeAddProperty(str, str2);
            return this;
        }

        public Builder addProperty(String str, Object obj) {
            safeAddProperty(str, obj);
            return this;
        }

        public Builder addProperty(String str, double d) {
            safeAddProperty(str, Double.valueOf(d));
            return this;
        }

        public Builder addProperty(String str, int i) {
            safeAddProperty(str, Integer.valueOf(i));
            return this;
        }

        public Builder addProperty(String str, long j) {
            safeAddProperty(str, Long.valueOf(j));
            return this;
        }

        public Builder(String str) {
            this.eventName = str;
        }
    }

    public static Builder newBuilder(String str) {
        return new Builder(str);
    }

    public TTBaseEvent(String str, JSONObject jSONObject, String str2) {
        this.eventName = str;
        this.properties = jSONObject;
        this.eventId = str2;
    }

    public static Builder newBuilder(String str, String str2) {
        return new Builder(str, str2);
    }
}
