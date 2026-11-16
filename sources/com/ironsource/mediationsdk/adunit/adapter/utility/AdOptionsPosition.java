package com.ironsource.mediationsdk.adunit.adapter.utility;

import defpackage.e80;
import defpackage.ek2;
import defpackage.jh0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public enum AdOptionsPosition {
    TOP_LEFT,
    TOP_RIGHT,
    BOTTOM_LEFT,
    BOTTOM_RIGHT;

    private static final /* synthetic */ jh0 $ENTRIES = ek2.m(values());

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static String AD_OPTIONS_POSITION_KEY = "adOptionsPos";

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Companion {
        public /* synthetic */ Companion(e80 e80Var) {
            this();
        }

        private Companion() {
        }
    }

    @NotNull
    public static jh0 getEntries() {
        return $ENTRIES;
    }
}
