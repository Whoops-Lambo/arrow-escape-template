package com.ironsource;

import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.tc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C4994tc {

    /* JADX INFO: renamed from: com.ironsource.tc$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {

        @NotNull
        public static final a a = new a();

        @NotNull
        public static final String b = "SDKPluginType";

        @NotNull
        public static final String c = "sessionid";

        private a() {
        }
    }

    @NotNull
    public final Map<String, String> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String pluginType = ConfigFile.getConfigFile().getPluginType();
        if (pluginType != null) {
            linkedHashMap.put(a.b, pluginType);
        }
        String strD = IronSourceUtils.d();
        if (strD != null) {
            linkedHashMap.put("sessionid", strD);
        }
        return linkedHashMap;
    }
}
