package io.p071bidmachine.ads.networks.gam_dynamic;

import io.p071bidmachine.protobuf.Waterfall;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class n {
    public static String a(Waterfall.Configuration.AdUnit adUnit) {
        return "adUnitId - " + adUnit.getAdUnitId() + ", price - " + adUnit.getPrice();
    }

    public static String b(Waterfall.Result.EstimatedPrice estimatedPrice) {
        if (estimatedPrice == null) {
            return "estimated price - null";
        }
        return "estimated price - " + estimatedPrice.getValue().getValue() + " " + estimatedPrice.getCurrency().getValue() + ", precision - " + estimatedPrice.getPrecision().getValue();
    }
}
