package io.p071bidmachine;

import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import com.ironsource.C4664b4;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0007\u0010\nJ\u001f\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0007\u0010\fJ\u001f\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0007\u0010\u000eJ\u001f\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0007\u0010\u0010J#\u0010\u0013\u001a\u00020\u00002\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lio/bidmachine/CustomParams;", "", "<init>", "()V", "", C4664b4.i.W, "value", "addParam", "(Ljava/lang/String;Ljava/lang/String;)Lio/bidmachine/CustomParams;", "", "(Ljava/lang/String;I)Lio/bidmachine/CustomParams;", "", "(Ljava/lang/String;F)Lio/bidmachine/CustomParams;", "", "(Ljava/lang/String;D)Lio/bidmachine/CustomParams;", "", "(Ljava/lang/String;Z)Lio/bidmachine/CustomParams;", "", "params", "addParams", "(Ljava/util/Map;)Lio/bidmachine/CustomParams;", "Lcom/explorestack/protobuf/Struct$Builder;", "builder", "Laz2;", "fillStructBuilder", "(Lcom/explorestack/protobuf/Struct$Builder;)V", "", "customMap", "Ljava/util/Map;", "bidmachine-android-sdk_ba_3_8_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CustomParams {

    @NotNull
    private final Map<String, Object> customMap = new LinkedHashMap();

    @NotNull
    /* JADX INFO: renamed from: addParam, reason: merged with bridge method [inline-methods] */
    public CustomParams m1141addParam(@NotNull String key, int value) {
        key.getClass();
        this.customMap.put(key, Integer.valueOf(value));
        return this;
    }

    @NotNull
    public CustomParams addParams(@NotNull Map<String, String> params) {
        params.getClass();
        this.customMap.putAll(params);
        return this;
    }

    public final void fillStructBuilder(@NotNull Struct.Builder builder) {
        builder.getClass();
        Map<String, Object> map = this.customMap;
        map.getClass();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                builder.putFields(key, Value.newBuilder().setStringValue((String) value).build());
            } else if (value instanceof Boolean) {
                builder.putFields(key, Value.newBuilder().setBoolValue(((Boolean) value).booleanValue()).build());
            } else if (value instanceof Number) {
                builder.putFields(key, Value.newBuilder().setNumberValue(((Number) value).doubleValue()).build());
            }
        }
    }

    /* JADX INFO: renamed from: addParams, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m1144addParams(Map map) {
        return addParams((Map<String, String>) map);
    }

    @NotNull
    /* JADX INFO: renamed from: addParam, reason: merged with bridge method [inline-methods] */
    public CustomParams m1142addParam(@NotNull String key, @NotNull String value) {
        key.getClass();
        value.getClass();
        this.customMap.put(key, value);
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: addParam, reason: merged with bridge method [inline-methods] */
    public CustomParams m1140addParam(@NotNull String key, float value) {
        key.getClass();
        this.customMap.put(key, Float.valueOf(value));
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: addParam, reason: merged with bridge method [inline-methods] */
    public CustomParams m1139addParam(@NotNull String key, double value) {
        key.getClass();
        this.customMap.put(key, Double.valueOf(value));
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: addParam, reason: merged with bridge method [inline-methods] */
    public CustomParams m1143addParam(@NotNull String key, boolean value) {
        key.getClass();
        this.customMap.put(key, Boolean.valueOf(value));
        return this;
    }
}
