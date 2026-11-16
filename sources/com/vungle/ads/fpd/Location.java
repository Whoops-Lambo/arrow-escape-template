package com.vungle.ads.fpd;

import com.ironsource.C5055x1;
import defpackage.aa2;
import defpackage.e80;
import defpackage.iw;
import defpackage.z92;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001b\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fHÇ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/vungle/ads/fpd/Location;", "", "<init>", "()V", "", "seen1", "Laa2;", "serializationConstructorMarker", "(ILaa2;)V", C5055x1.o, "Liw;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Laz2;", "write$Self", "(Lcom/vungle/ads/fpd/Location;Liw;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "country", "setCountry", "(Ljava/lang/String;)Lcom/vungle/ads/fpd/Location;", "regionState", "setRegionState", "dma", "setDma", "(I)Lcom/vungle/ads/fpd/Location;", "Companion", "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@z92
public final class Location {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/fpd/Location$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/fpd/Location;", "serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        @NotNull
        public final KSerializer serializer() {
            return Location$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(e80 e80Var) {
            this();
        }

        public Companion() {
        }
    }

    @NotNull
    public final Location setDma(int dma) {
        return this;
    }

    public Location() {
    }

    public static final void write$Self(@NotNull Location self, @NotNull iw output, @NotNull SerialDescriptor serialDesc) {
        self.getClass();
        output.getClass();
        serialDesc.getClass();
    }

    @NotNull
    public final Location setCountry(@NotNull String country) {
        country.getClass();
        return this;
    }

    @NotNull
    public final Location setRegionState(@NotNull String regionState) {
        regionState.getClass();
        return this;
    }

    public /* synthetic */ Location(int i, aa2 aa2Var) {
    }
}
