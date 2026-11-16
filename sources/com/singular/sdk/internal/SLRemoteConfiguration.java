package com.singular.sdk.internal;

import defpackage.h50;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class SLRemoteConfiguration implements SLJsonSerializable {
    private static final SingularLog logger = SingularLog.getLogger("SLRemoteConfiguration");
    private AdmonBatching admonBatching;
    private boolean isSetSdidEnabled;
    private Resolve resolve;
    private boolean shouldReportErrors;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class AdmonBatching implements SLJsonSerializable {
        private int admonMinIntervalSeconds;
        private boolean aggregateAdmonEvents;
        private boolean debug;

        public int getAdmonMinIntervalSeconds() {
            return this.admonMinIntervalSeconds;
        }

        public boolean isAggregateAdmonEvents() {
            return this.aggregateAdmonEvents;
        }

        public boolean isDebug() {
            return this.debug;
        }

        @Override // com.singular.sdk.internal.SLJsonSerializable
        public JSONObject toJson() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Constants.AGGREGATE_ADMON_EVENTS_JSON_KEY, this.aggregateAdmonEvents);
                jSONObject.put("debug", this.debug);
                jSONObject.put(Constants.AGGREGATE_ADMON_MIN_INTERVAL_SECONDS_JSON_KEY, this.admonMinIntervalSeconds);
                return jSONObject;
            } catch (Throwable th) {
                SLRemoteConfiguration.logger.error("failed to create json object with error: " + Utils.formatException(th));
                return new JSONObject();
            }
        }

        public AdmonBatching(JSONObject jSONObject) {
            this.aggregateAdmonEvents = false;
            this.debug = false;
            this.admonMinIntervalSeconds = 0;
            try {
                this.aggregateAdmonEvents = jSONObject.optBoolean(Constants.AGGREGATE_ADMON_EVENTS_JSON_KEY, false);
                this.debug = jSONObject.optBoolean("debug", false);
                this.admonMinIntervalSeconds = Math.max(0, jSONObject.optInt(Constants.AGGREGATE_ADMON_MIN_INTERVAL_SECONDS_JSON_KEY, 0));
            } catch (Throwable th) {
                h50.A(th, new StringBuilder("failed parsing admon batching json with error: "), SLRemoteConfiguration.logger);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface Constants {
        public static final String ADMON_BATCHING_JSON_KEY = "admon_batching";
        public static final String AGGREGATE_ADMON_EVENTS_JSON_KEY = "AggregateAdmonEvents";
        public static final String AGGREGATE_ADMON_MIN_INTERVAL_SECONDS_JSON_KEY = "AggregateAdmonMinIntervalSeconds";
        public static final String DEBUG_JSON_KEY = "debug";
        public static final String RESOLVE_JSON_KEY = "resolve";
        public static final String SDID_JSON_KEY = "sdid";
        public static final String SET_SDID_ENABLED_JSON_KEY = "set_sdid_enabled";
        public static final String SHOULD_REPORT_ERRORS_JSON_KEY = "shouldReportErrors";
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Resolve implements SLJsonSerializable {
        private String sdid;

        public Resolve(JSONObject jSONObject) {
            try {
                if (jSONObject.has("sdid")) {
                    this.sdid = jSONObject.getString("sdid");
                }
            } catch (Throwable th) {
                h50.A(th, new StringBuilder("failed parsing identifiers json with error: "), SLRemoteConfiguration.logger);
            }
        }

        public String getSdid() {
            return this.sdid;
        }

        @Override // com.singular.sdk.internal.SLJsonSerializable
        public JSONObject toJson() {
            try {
                JSONObject jSONObject = new JSONObject();
                if (!Utils.isEmptyOrNull(this.sdid)) {
                    jSONObject.put("sdid", this.sdid);
                }
                return jSONObject;
            } catch (Throwable th) {
                SLRemoteConfiguration.logger.error("failed to create json object with error: " + Utils.formatException(th));
                return new JSONObject();
            }
        }
    }

    public SLRemoteConfiguration(JSONObject jSONObject) {
        this.isSetSdidEnabled = false;
        this.shouldReportErrors = false;
        try {
            if (jSONObject.has(Constants.ADMON_BATCHING_JSON_KEY)) {
                this.admonBatching = new AdmonBatching(jSONObject.getJSONObject(Constants.ADMON_BATCHING_JSON_KEY));
            } else {
                this.admonBatching = new AdmonBatching(new JSONObject());
            }
            if (jSONObject.has(Constants.SET_SDID_ENABLED_JSON_KEY)) {
                this.isSetSdidEnabled = jSONObject.getBoolean(Constants.SET_SDID_ENABLED_JSON_KEY);
            }
            this.shouldReportErrors = jSONObject.optBoolean(Constants.SHOULD_REPORT_ERRORS_JSON_KEY, false);
            if (jSONObject.has(Constants.RESOLVE_JSON_KEY)) {
                this.resolve = new Resolve(jSONObject.getJSONObject(Constants.RESOLVE_JSON_KEY));
            } else {
                this.resolve = new Resolve(new JSONObject());
            }
        } catch (Throwable th) {
            h50.A(th, new StringBuilder("failed parsing remote configuration json with error: "), logger);
        }
    }

    public static SLRemoteConfiguration defaultConfig() {
        return new SLRemoteConfiguration(new JSONObject());
    }

    public int getAdmonMinIntervalSeconds() {
        AdmonBatching admonBatching = this.admonBatching;
        return admonBatching == null ? defaultConfig().getAdmonMinIntervalSeconds() : admonBatching.getAdmonMinIntervalSeconds();
    }

    public String getSdid() {
        Resolve resolve = this.resolve;
        return resolve == null ? defaultConfig().getSdid() : resolve.getSdid();
    }

    public boolean isAdmonEventsDebug() {
        AdmonBatching admonBatching = this.admonBatching;
        return admonBatching == null ? defaultConfig().isAdmonEventsDebug() : admonBatching.isDebug();
    }

    public boolean isAggregateAdmonEvents() {
        AdmonBatching admonBatching = this.admonBatching;
        return admonBatching == null ? defaultConfig().isAggregateAdmonEvents() : admonBatching.isAggregateAdmonEvents();
    }

    public boolean isSetSdidEnabled() {
        return this.isSetSdidEnabled;
    }

    public boolean shouldReportErrors() {
        return this.shouldReportErrors;
    }

    @Override // com.singular.sdk.internal.SLJsonSerializable
    public JSONObject toJson() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.SET_SDID_ENABLED_JSON_KEY, this.isSetSdidEnabled);
            jSONObject.put(Constants.SHOULD_REPORT_ERRORS_JSON_KEY, this.shouldReportErrors);
            AdmonBatching admonBatching = this.admonBatching;
            if (admonBatching != null) {
                jSONObject.put(Constants.ADMON_BATCHING_JSON_KEY, admonBatching.toJson());
            }
            Resolve resolve = this.resolve;
            if (resolve != null) {
                jSONObject.put(Constants.RESOLVE_JSON_KEY, resolve.toJson());
            }
            return jSONObject;
        } catch (Throwable th) {
            logger.error("failed to create json object with error: " + Utils.formatException(th));
            return new JSONObject();
        }
    }
}
