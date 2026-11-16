package com.usercentrics.sdk.services.deviceStorage.models;

import defpackage.qt0;
import defpackage.wz2;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.EnumDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/usercentrics/sdk/services/deviceStorage/models/StorageConsentType.$serializer", "Lqt0;", "Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentType;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentType;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Laz2;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentType;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class StorageConsentType$$serializer implements qt0 {

    @NotNull
    public static final StorageConsentType$$serializer INSTANCE = new StorageConsentType$$serializer();
    private static final /* synthetic */ EnumDescriptor descriptor;

    @Override // defpackage.qt0
    @NotNull
    public KSerializer[] childSerializers() {
        return new KSerializer[0];
    }

    static {
        EnumDescriptor enumDescriptor = new EnumDescriptor("com.usercentrics.sdk.services.deviceStorage.models.StorageConsentType", 2);
        enumDescriptor.j("EXPLICIT", false);
        enumDescriptor.j("IMPLICIT", false);
        descriptor = enumDescriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.qt0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return wz2.d;
    }

    private StorageConsentType$$serializer() {
    }

    @Override // kotlinx.serialization.KSerializer
    @NotNull
    public StorageConsentType deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        return StorageConsentType.values()[decoder.p(getDescriptor())];
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(@NotNull Encoder encoder, @NotNull StorageConsentType value) {
        encoder.getClass();
        value.getClass();
        encoder.i(getDescriptor(), value.ordinal());
    }
}
