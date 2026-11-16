package com.usercentrics.sdk.services.deviceStorage.models;

import defpackage.eu;
import defpackage.gd1;
import defpackage.h23;
import defpackage.pd1;
import defpackage.z92;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0081\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentType;", "", "Companion", "$serializer", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@z92
public final class StorageConsentType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final gd1 a;
    public static final StorageConsentType b;
    public static final StorageConsentType c;
    public static final /* synthetic */ StorageConsentType[] d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) StorageConsentType.a.getValue();
        }

        public static StorageConsentType a(h23 h23Var) {
            h23Var.getClass();
            int iOrdinal = h23Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    return StorageConsentType.c;
                }
                e.b();
                return null;
            }
            return StorageConsentType.b;
        }
    }

    static {
        StorageConsentType storageConsentType = new StorageConsentType("EXPLICIT", 0);
        b = storageConsentType;
        StorageConsentType storageConsentType2 = new StorageConsentType("IMPLICIT", 1);
        c = storageConsentType2;
        d = new StorageConsentType[]{storageConsentType, storageConsentType2};
        INSTANCE = new Companion();
        a = eu.v(pd1.b, b.i);
    }

    public static StorageConsentType valueOf(String str) {
        return (StorageConsentType) Enum.valueOf(StorageConsentType.class, str);
    }

    public static StorageConsentType[] values() {
        return (StorageConsentType[]) d.clone();
    }
}
