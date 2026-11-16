package com.usercentrics.sdk.v2.settings.data;

import defpackage.jc1;
import defpackage.nj;
import defpackage.z92;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/usercentrics/sdk/v2/settings/data/UspV1Settings;", "", "Companion", "$serializer", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@z92
public final /* data */ class UspV1Settings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final int a;
    public final int b;
    public final int c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/usercentrics/sdk/v2/settings/data/UspV1Settings$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/v2/settings/data/UspV1Settings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer serializer() {
            return UspV1Settings$$serializer.INSTANCE;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UspV1Settings)) {
            return false;
        }
        UspV1Settings uspV1Settings = (UspV1Settings) obj;
        return this.a == uspV1Settings.a && this.b == uspV1Settings.b && this.c == uspV1Settings.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + jc1.d(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return nj.l(this.c, ")", jc1.t("UspV1Settings(notice=", this.a, ", optOutSale=", this.b, ", lspaCovered="));
    }

    public /* synthetic */ UspV1Settings(int i, int i2, int i3, int i4) {
        if ((i & 1) == 0) {
            this.a = 0;
        } else {
            this.a = i2;
        }
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i3;
        }
        if ((i & 4) == 0) {
            this.c = 0;
        } else {
            this.c = i4;
        }
    }
}
