package com.unity3d.mediation;

import defpackage.e80;
import defpackage.gg0;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class LevelPlayInitRequest {

    @NotNull
    private final String a;

    @Nullable
    private final String b;

    @NotNull
    private final List<LevelPlay.AdFormat> c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder {

        @NotNull
        private final String a;

        @Nullable
        private String b;

        @NotNull
        public final LevelPlayInitRequest build() {
            return new LevelPlayInitRequest(this.a, this.b, null, 4, null);
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
        public final Builder withUserId(@NotNull String str) {
            str.getClass();
            this.b = str;
            return this;
        }
    }

    @NotNull
    public final String getAppKey() {
        return this.a;
    }

    @NotNull
    public final List<LevelPlay.AdFormat> getLegacyAdFormats() {
        return this.c;
    }

    @Nullable
    public final String getUserId() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LevelPlayInitRequest(String str, String str2, List<? extends LevelPlay.AdFormat> list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public /* synthetic */ LevelPlayInitRequest(String str, String str2, List list, int i, e80 e80Var) {
        this(str, str2, (i & 4) != 0 ? gg0.a : list);
    }
}
