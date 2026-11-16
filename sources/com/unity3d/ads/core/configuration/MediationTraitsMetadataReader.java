package com.unity3d.ads.core.configuration;

import com.ironsource.C4664b4;
import com.unity3d.services.core.misc.JsonStorage;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\nJ\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/configuration/MediationTraitsMetadataReader;", "Lcom/unity3d/ads/core/configuration/MetadataReader;", "Lorg/json/JSONObject;", "jsonStorage", "Lcom/unity3d/services/core/misc/JsonStorage;", "<init>", "(Lcom/unity3d/services/core/misc/JsonStorage;)V", "getBooleanTrait", "", C4664b4.i.W, "", "(Ljava/lang/String;)Ljava/lang/Boolean;", "getStringTrait", "getLongTrait", "", "(Ljava/lang/String;)Ljava/lang/Long;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MediationTraitsMetadataReader extends MetadataReader<JSONObject> {

    @NotNull
    public static final String BOLD_SDK_ENABLED = "boldSdkEnabled";

    @NotNull
    public static final String HTTP_CLIENT_FETCH_TIMEOUT_MS = "httpClientFetchTimeoutMs";

    @NotNull
    public static final String MEDIATION_TRAITS = "mediation.traits.value";

    @NotNull
    public static final String USE_HTTP_CLIENT = "useHttpClient";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediationTraitsMetadataReader(@NotNull JsonStorage jsonStorage) {
        super(jsonStorage, MEDIATION_TRAITS);
        jsonStorage.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    @Nullable
    public final Boolean getBooleanTrait(@NotNull String key) {
        key.getClass();
        Object obj = getJsonStorage().get(getKey());
        if (obj != null) {
            if (!(obj instanceof JSONObject)) {
                obj = null;
            }
            if (obj == null) {
                obj = null;
            }
        } else {
            obj = null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject != null) {
            if (!jSONObject.has(key)) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                return Boolean.valueOf(jSONObject.optBoolean(key));
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    @Nullable
    public final Long getLongTrait(@NotNull String key) {
        key.getClass();
        Object obj = getJsonStorage().get(getKey());
        if (obj != null) {
            if (!(obj instanceof JSONObject)) {
                obj = null;
            }
            if (obj == null) {
                obj = null;
            }
        } else {
            obj = null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject != null) {
            if (!jSONObject.has(key)) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                return Long.valueOf(jSONObject.optLong(key));
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    @Nullable
    public final String getStringTrait(@NotNull String key) {
        key.getClass();
        Object obj = getJsonStorage().get(getKey());
        if (obj != null) {
            if (!(obj instanceof JSONObject)) {
                obj = null;
            }
            if (obj == null) {
                obj = null;
            }
        } else {
            obj = null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject != null) {
            if (!jSONObject.has(key)) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                return jSONObject.optString(key);
            }
        }
        return null;
    }
}
