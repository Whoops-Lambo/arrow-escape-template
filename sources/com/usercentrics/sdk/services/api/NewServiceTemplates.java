package com.usercentrics.sdk.services.api;

import com.usercentrics.sdk.v2.settings.data.UsercentricsService$$serializer;
import defpackage.gg0;
import defpackage.j8;
import defpackage.z92;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/usercentrics/sdk/services/api/NewServiceTemplates;", "", "Companion", "$serializer", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@z92
public final class NewServiceTemplates {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final KSerializer[] b = {new j8(UsercentricsService$$serializer.INSTANCE, 0)};
    public final List a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/usercentrics/sdk/services/api/NewServiceTemplates$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/services/api/NewServiceTemplates;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer serializer() {
            return NewServiceTemplates$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NewServiceTemplates(int i, List list) {
        if ((i & 1) == 0) {
            this.a = gg0.a;
        } else {
            this.a = list;
        }
    }
}
