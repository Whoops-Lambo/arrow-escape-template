package io.p071bidmachine.rendering.model;

import io.p071bidmachine.util.g;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public enum l implements g {
    /* JADX INFO: Fake field, exist only in values array */
    ColorHistogram("color_histogram"),
    /* JADX INFO: Fake field, exist only in values array */
    BrightnessVariance("brightness_variance"),
    /* JADX INFO: Fake field, exist only in values array */
    EdgeDetection("edge_detection");

    public final String a;

    @Override // io.p071bidmachine.util.g
    public final String getKey() {
        return this.a;
    }

    l(String str) {
        this.a = str;
    }
}
