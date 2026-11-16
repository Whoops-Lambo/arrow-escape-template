package com.usercentrics.sdk.models.api;

import defpackage.qt0;
import defpackage.rc1;
import defpackage.sr0;
import defpackage.wz2;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.EnumDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class a extends rc1 implements sr0 {
    public static final a i = new a(0);

    @Override // defpackage.sr0
    public final Object invoke() {
        return new qt0() { // from class: com.usercentrics.sdk.models.api.ApiSettingsVersion$$serializer
            private static final /* synthetic */ EnumDescriptor descriptor;

            @Override // defpackage.qt0
            @NotNull
            public KSerializer[] childSerializers() {
                return new KSerializer[0];
            }

            static {
                EnumDescriptor enumDescriptor = new EnumDescriptor("com.usercentrics.sdk.models.api.ApiSettingsVersion", 3);
                enumDescriptor.j("major", false);
                enumDescriptor.j("minor", false);
                enumDescriptor.j("patch", false);
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

            @Override // kotlinx.serialization.KSerializer
            @NotNull
            public ApiSettingsVersion deserialize(@NotNull Decoder decoder) {
                decoder.getClass();
                return ApiSettingsVersion.values()[decoder.p(getDescriptor())];
            }

            @Override // kotlinx.serialization.KSerializer
            public void serialize(@NotNull Encoder encoder, @NotNull ApiSettingsVersion value) {
                encoder.getClass();
                value.getClass();
                encoder.i(getDescriptor(), value.ordinal());
            }
        };
    }
}
