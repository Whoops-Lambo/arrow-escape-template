package com.usercentrics.sdk.services.deviceStorage.models;

import defpackage.eu;
import defpackage.f23;
import defpackage.gd1;
import defpackage.pd1;
import defpackage.z92;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0081\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;", "", "Companion", "$serializer", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@z92
public final class StorageConsentAction {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final gd1 a;
    public static final StorageConsentAction b;
    public static final StorageConsentAction c;
    public static final StorageConsentAction d;
    public static final StorageConsentAction e;
    public static final StorageConsentAction f;
    public static final StorageConsentAction g;
    public static final StorageConsentAction h;
    public static final StorageConsentAction i;
    public static final /* synthetic */ StorageConsentAction[] j;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;", "serializer", "()Lkotlinx/serialization/KSerializer;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) StorageConsentAction.a.getValue();
        }

        public static StorageConsentAction a(f23 f23Var) {
            f23Var.getClass();
            switch (f23Var) {
                case ACCEPT_ALL_SERVICES:
                    return StorageConsentAction.b;
                case DENY_ALL_SERVICES:
                    return StorageConsentAction.c;
                case ESSENTIAL_CHANGE:
                    return StorageConsentAction.d;
                case INITIAL_PAGE_LOAD:
                    return StorageConsentAction.e;
                case NON_EU_REGION:
                    return StorageConsentAction.f;
                case SESSION_RESTORED:
                    return StorageConsentAction.g;
                case TCF_STRING_CHANGE:
                    return StorageConsentAction.h;
                case UPDATE_SERVICES:
                    return StorageConsentAction.i;
                default:
                    e.b();
                    return null;
            }
        }
    }

    static {
        StorageConsentAction storageConsentAction = new StorageConsentAction("ACCEPT_ALL_SERVICES", 0);
        b = storageConsentAction;
        StorageConsentAction storageConsentAction2 = new StorageConsentAction("DENY_ALL_SERVICES", 1);
        c = storageConsentAction2;
        StorageConsentAction storageConsentAction3 = new StorageConsentAction("ESSENTIAL_CHANGE", 2);
        d = storageConsentAction3;
        StorageConsentAction storageConsentAction4 = new StorageConsentAction("INITIAL_PAGE_LOAD", 3);
        e = storageConsentAction4;
        StorageConsentAction storageConsentAction5 = new StorageConsentAction("NON_EU_REGION", 4);
        f = storageConsentAction5;
        StorageConsentAction storageConsentAction6 = new StorageConsentAction("SESSION_RESTORED", 5);
        g = storageConsentAction6;
        StorageConsentAction storageConsentAction7 = new StorageConsentAction("TCF_STRING_CHANGE", 6);
        h = storageConsentAction7;
        StorageConsentAction storageConsentAction8 = new StorageConsentAction("UPDATE_SERVICES", 7);
        i = storageConsentAction8;
        j = new StorageConsentAction[]{storageConsentAction, storageConsentAction2, storageConsentAction3, storageConsentAction4, storageConsentAction5, storageConsentAction6, storageConsentAction7, storageConsentAction8};
        INSTANCE = new Companion();
        a = eu.v(pd1.b, a.i);
    }

    public static StorageConsentAction valueOf(String str) {
        return (StorageConsentAction) Enum.valueOf(StorageConsentAction.class, str);
    }

    public static StorageConsentAction[] values() {
        return (StorageConsentAction[]) j.clone();
    }
}
