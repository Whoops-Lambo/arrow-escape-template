package com.vungle.ads.internal.network;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public enum g {
    GET,
    POST;


    @NotNull
    public static final f Companion = new Object() { // from class: com.vungle.ads.internal.network.f
        @NotNull
        public final KSerializer serializer() {
            return e.a;
        }
    };
}
