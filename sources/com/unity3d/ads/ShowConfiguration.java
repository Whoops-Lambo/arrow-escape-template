package com.unity3d.ads;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.e80;
import defpackage.hg0;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\fB+\b\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/ShowConfiguration;", "", "customRewardString", "", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getCustomRewardString", "()Ljava/lang/String;", "getExtras", "()Ljava/util/Map;", "Builder", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ShowConfiguration {

    @Nullable
    private final String customRewardString;

    @NotNull
    private final Map<String, String> extras;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u001a\u0010\t\u001a\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007J\u0006\u0010\n\u001a\u00020\u000bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/ShowConfiguration$Builder;", "", "<init>", "()V", "customRewardString", "", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", "withCustomRewardString", "withExtras", "build", "Lcom/unity3d/ads/ShowConfiguration;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        @Nullable
        private String customRewardString;

        @NotNull
        private Map<String, String> extras = hg0.a;

        @NotNull
        public final ShowConfiguration build() {
            return new ShowConfiguration(this.customRewardString, this.extras, null);
        }

        @NotNull
        public final Builder withCustomRewardString(@NotNull String customRewardString) {
            customRewardString.getClass();
            this.customRewardString = customRewardString;
            return this;
        }

        @NotNull
        public final Builder withExtras(@NotNull Map<String, String> extras) {
            extras.getClass();
            this.extras = extras;
            return this;
        }
    }

    public /* synthetic */ ShowConfiguration(String str, Map map, int i, e80 e80Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? hg0.a : map);
    }

    @Nullable
    public final String getCustomRewardString() {
        return this.customRewardString;
    }

    @NotNull
    public final Map<String, String> getExtras() {
        return this.extras;
    }

    private ShowConfiguration(String str, Map<String, String> map) {
        this.customRewardString = str;
        this.extras = map;
    }

    public /* synthetic */ ShowConfiguration(String str, Map map, e80 e80Var) {
        this(str, map);
    }
}
