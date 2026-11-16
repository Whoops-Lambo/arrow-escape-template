package com.usercentrics.sdk.unreal.model;

import defpackage.s71;
import defpackage.z92;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/usercentrics/sdk/unreal/model/UnrealSecondLayerStyleSettings;", "", "Companion", "$serializer", "usercentrics-ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@z92
public final /* data */ class UnrealSecondLayerStyleSettings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final Boolean a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/usercentrics/sdk/unreal/model/UnrealSecondLayerStyleSettings$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/unreal/model/UnrealSecondLayerStyleSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics-ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer serializer() {
            return UnrealSecondLayerStyleSettings$$serializer.INSTANCE;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UnrealSecondLayerStyleSettings) && s71.b(this.a, ((UnrealSecondLayerStyleSettings) obj).a);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "UnrealSecondLayerStyleSettings(showCloseButton=" + this.a + ")";
    }

    public /* synthetic */ UnrealSecondLayerStyleSettings(int i, Boolean bool) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
    }
}
