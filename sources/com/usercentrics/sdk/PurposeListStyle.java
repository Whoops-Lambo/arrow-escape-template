package com.usercentrics.sdk;

import defpackage.eu;
import defpackage.gd1;
import defpackage.pd1;
import defpackage.z92;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/usercentrics/sdk/PurposeListStyle;", "", "Companion", "$serializer", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@z92
public final class PurposeListStyle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final gd1 a;
    public static final PurposeListStyle b;
    public static final PurposeListStyle c;
    public static final /* synthetic */ PurposeListStyle[] d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/usercentrics/sdk/PurposeListStyle$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/PurposeListStyle;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) PurposeListStyle.a.getValue();
        }
    }

    static {
        PurposeListStyle purposeListStyle = new PurposeListStyle("BOXED", 0);
        b = purposeListStyle;
        PurposeListStyle purposeListStyle2 = new PurposeListStyle("FLAT", 1);
        c = purposeListStyle2;
        d = new PurposeListStyle[]{purposeListStyle, purposeListStyle2};
        INSTANCE = new Companion();
        a = eu.v(pd1.b, a.i);
    }

    public static PurposeListStyle valueOf(String str) {
        return (PurposeListStyle) Enum.valueOf(PurposeListStyle.class, str);
    }

    public static PurposeListStyle[] values() {
        return (PurposeListStyle[]) d.clone();
    }
}
