package io.p071bidmachine;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class PriceFloorParams {
    private final Map<String, Double> priceFloorsMap = new HashMap();

    @NonNull
    public Map<String, Double> getPriceFloors() {
        return this.priceFloorsMap;
    }

    /* JADX INFO: renamed from: addPriceFloor, reason: merged with bridge method [inline-methods] */
    public PriceFloorParams m1145addPriceFloor(double d) {
        m1146addPriceFloor(UUID.randomUUID().toString(), d);
        return this;
    }

    /* JADX INFO: renamed from: addPriceFloor, reason: merged with bridge method [inline-methods] */
    public PriceFloorParams m1146addPriceFloor(@NonNull String str, double d) {
        this.priceFloorsMap.put(str, Double.valueOf(d));
        return this;
    }
}
