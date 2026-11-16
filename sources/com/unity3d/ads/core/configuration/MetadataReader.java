package com.unity3d.ads.core.configuration;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C4664b4;
import com.unity3d.services.core.misc.JsonStorage;
import defpackage.d;
import defpackage.s71;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\r\u001a\u0004\u0018\u0001H\u0001\"\u0006\b\u0001\u0010\u0001\u0018\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u0001H\u0001H\u0086\b¢\u0006\u0002\u0010\u000fJ$\u0010\u0010\u001a\u0004\u0018\u0001H\u0001\"\u0006\b\u0001\u0010\u0001\u0018\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u0001H\u0001H\u0086\b¢\u0006\u0002\u0010\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/configuration/MetadataReader;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "jsonStorage", "Lcom/unity3d/services/core/misc/JsonStorage;", C4664b4.i.W, "", "<init>", "(Lcom/unity3d/services/core/misc/JsonStorage;Ljava/lang/String;)V", "getJsonStorage", "()Lcom/unity3d/services/core/misc/JsonStorage;", "getKey", "()Ljava/lang/String;", "read", "defaultValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "readAndDelete", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class MetadataReader<T> {

    @NotNull
    private final JsonStorage jsonStorage;

    @NotNull
    private final String key;

    public static Object read$default(MetadataReader metadataReader, Object obj, int i, Object obj2) {
        if (obj2 != null) {
            d.u("Super calls with default arguments not supported in this target, function: read");
            return null;
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if (metadataReader.getJsonStorage().get(metadataReader.getKey()) == null) {
            return obj;
        }
        s71.C();
        throw null;
    }

    public static Object readAndDelete$default(MetadataReader metadataReader, Object obj, int i, Object obj2) {
        if (obj2 != null) {
            d.u("Super calls with default arguments not supported in this target, function: readAndDelete");
            return null;
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if (metadataReader.getJsonStorage().get(metadataReader.getKey()) != null) {
            s71.C();
            throw null;
        }
        if (metadataReader.getJsonStorage().get(metadataReader.getKey()) != null) {
            metadataReader.getJsonStorage().delete(metadataReader.getKey());
        }
        return obj;
    }

    @NotNull
    public final JsonStorage getJsonStorage() {
        return this.jsonStorage;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public MetadataReader(@NotNull JsonStorage jsonStorage, @NotNull String str) {
        jsonStorage.getClass();
        str.getClass();
        this.jsonStorage = jsonStorage;
        this.key = str;
    }

    public final <T> T read(T defaultValue) {
        if (getJsonStorage().get(getKey()) == null) {
            return defaultValue;
        }
        s71.C();
        throw null;
    }

    public final <T> T readAndDelete(T defaultValue) {
        if (getJsonStorage().get(getKey()) == null) {
            if (getJsonStorage().get(getKey()) != null) {
                getJsonStorage().delete(getKey());
            }
            return defaultValue;
        }
        s71.C();
        throw null;
    }
}
