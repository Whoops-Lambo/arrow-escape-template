package com.ironsource.adapters.ironsource;

import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.logger.IronLog;
import defpackage.e80;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public interface IronSourceLoadParameters {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Base implements IronSourceLoadParameters {

        @NotNull
        private final JSONObject loadConfig;

        @Nullable
        private final String serverData;

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        @NotNull
        public JSONObject config() {
            return this.loadConfig;
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public boolean demandOnly() {
            return this.loadConfig.optBoolean(Constants.DEMAND_ONLY, false);
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        @NotNull
        public HashMap<String, String> value() {
            HashMap<String, String> map = new HashMap<>();
            map.put("isOneFlow", String.valueOf(this.loadConfig.optBoolean("isOneFlow")));
            if (this.serverData != null) {
                map.put("adm", d.b().a(this.serverData));
                map.putAll(d.b().b(this.serverData));
            }
            return map;
        }

        public Base(@NotNull JSONObject jSONObject, @Nullable String str) {
            jSONObject.getClass();
            this.loadConfig = jSONObject;
            this.serverData = str;
        }

        public /* synthetic */ Base(JSONObject jSONObject, String str, int i, e80 e80Var) {
            this(jSONObject, (i & 2) != 0 ? null : str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class WithLog implements IronSourceLoadParameters {

        @NotNull
        private final IronSourceLoadParameters loadParameters;

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        @NotNull
        public JSONObject config() {
            return this.loadParameters.config();
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        public boolean demandOnly() {
            return this.loadParameters.demandOnly();
        }

        @Override // com.ironsource.adapters.ironsource.IronSourceLoadParameters
        @NotNull
        public HashMap<String, String> value() {
            HashMap<String, String> mapValue = this.loadParameters.value();
            if (!mapValue.isEmpty()) {
                IronLog.ADAPTER_API.verbose("instance extra params:");
                for (String str : mapValue.keySet()) {
                    str.getClass();
                    String str2 = str;
                    IronLog.ADAPTER_API.verbose(str2 + "=" + ((Object) mapValue.get(str2)));
                }
            }
            return mapValue;
        }

        public WithLog(@NotNull IronSourceLoadParameters ironSourceLoadParameters) {
            ironSourceLoadParameters.getClass();
            this.loadParameters = ironSourceLoadParameters;
        }
    }

    @NotNull
    JSONObject config();

    boolean demandOnly();

    @NotNull
    HashMap<String, String> value();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Constants {

        @NotNull
        public static final String ADM_KEY = "adm";

        @NotNull
        public static final String DEMAND_ONLY = "demandOnly";

        @NotNull
        public static final Constants INSTANCE = new Constants();

        @NotNull
        public static final String ONE_FLOW_KEY = "isOneFlow";

        private Constants() {
        }
    }
}
