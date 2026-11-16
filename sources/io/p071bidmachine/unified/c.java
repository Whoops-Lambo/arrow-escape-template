package io.p071bidmachine.unified;

import io.p071bidmachine.AdProcessCallback;
import io.p071bidmachine.iab.mraid.m;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface c {
    default void onAdClicked() {
        ((AdProcessCallback) ((m) this).a).processClicked(null, null);
    }
}
