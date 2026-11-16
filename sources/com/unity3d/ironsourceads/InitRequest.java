package com.unity3d.ironsourceads;

import defpackage.e80;
import defpackage.gg0;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class InitRequest {

    @NotNull
    private final String a;

    @NotNull
    private final List<IronSourceAds.AdFormat> b;

    @NotNull
    private final LogLevel c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder {

        @NotNull
        private final String a;

        @Nullable
        private List<? extends IronSourceAds.AdFormat> b;

        @Nullable
        private LogLevel c;

        @NotNull
        public final InitRequest build() {
            String str = this.a;
            List list = this.b;
            if (list == null) {
                list = gg0.a;
            }
            LogLevel logLevel = this.c;
            if (logLevel == null) {
                logLevel = LogLevel.NONE;
            }
            return new InitRequest(str, list, logLevel, null);
        }

        @NotNull
        public final String getAppKey() {
            return this.a;
        }

        public Builder(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        @NotNull
        public final Builder withLegacyAdFormats(@NotNull List<? extends IronSourceAds.AdFormat> list) {
            list.getClass();
            this.b = list;
            return this;
        }

        @NotNull
        public final Builder withLogLevel(@NotNull LogLevel logLevel) {
            logLevel.getClass();
            this.c = logLevel;
            return this;
        }
    }

    @NotNull
    public final String getAppKey() {
        return this.a;
    }

    @NotNull
    public final List<IronSourceAds.AdFormat> getLegacyAdFormats() {
        return this.b;
    }

    @NotNull
    public final LogLevel getLogLevel() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InitRequest(String str, List<? extends IronSourceAds.AdFormat> list, LogLevel logLevel) {
        this.a = str;
        this.b = list;
        this.c = logLevel;
    }

    public /* synthetic */ InitRequest(String str, List list, LogLevel logLevel, e80 e80Var) {
        this(str, list, logLevel);
    }
}
