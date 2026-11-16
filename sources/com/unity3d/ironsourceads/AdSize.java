package com.unity3d.ironsourceads;

import com.ironsource.mediationsdk.j;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.e80;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class AdSize {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final int a;
    private final int b;

    @NotNull
    private final String c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Companion {
        @NotNull
        public final AdSize banner() {
            return new AdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50, "BANNER", null);
        }

        @NotNull
        public final AdSize large() {
            return new AdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 90, j.b, null);
        }

        @NotNull
        public final AdSize leaderboard() {
            return new AdSize(728, 90, j.d, null);
        }

        @NotNull
        public final AdSize mediumRectangle() {
            return new AdSize(300, 250, "MEDIUM_RECTANGLE", null);
        }

        public /* synthetic */ Companion(e80 e80Var) {
            this();
        }

        private Companion() {
        }
    }

    @NotNull
    public static final AdSize banner() {
        return Companion.banner();
    }

    @NotNull
    public static final AdSize large() {
        return Companion.large();
    }

    @NotNull
    public static final AdSize leaderboard() {
        return Companion.leaderboard();
    }

    @NotNull
    public static final AdSize mediumRectangle() {
        return Companion.mediumRectangle();
    }

    public final int getHeight() {
        return this.b;
    }

    @NotNull
    public final String getSizeDescription() {
        return this.c;
    }

    public final int getWidth() {
        return this.a;
    }

    private AdSize(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public /* synthetic */ AdSize(int i, int i2, String str, e80 e80Var) {
        this(i, i2, str);
    }
}
