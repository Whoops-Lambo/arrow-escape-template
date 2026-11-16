package com.vungle.ads.fpd;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C5055x1;
import defpackage.aa2;
import defpackage.e80;
import defpackage.iw;
import defpackage.k71;
import defpackage.z92;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003B3\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0002\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u0018J\u0017\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u0018¨\u0006!"}, d2 = {"Lcom/vungle/ads/fpd/Demographic;", "", "<init>", "()V", "", "seen1", "ageRange", InneractiveMediationDefs.KEY_GENDER, "Laa2;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Laa2;)V", C5055x1.o, "Liw;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Laz2;", "write$Self", "(Lcom/vungle/ads/fpd/Demographic;Liw;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/vungle/ads/fpd/LiftoffGender;", "setGender", "(Lcom/vungle/ads/fpd/LiftoffGender;)Lcom/vungle/ads/fpd/Demographic;", "age", "setAgeRange", "(I)Lcom/vungle/ads/fpd/Demographic;", "lengthOfResidence", "setLengthOfResidence", "homeValue", "setMedianHomeValueUSD", "housingCost", "setMonthlyHousingCosts", "Companion", "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
@z92
public final class Demographic {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public Integer a;
    public Integer b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/fpd/Demographic$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/fpd/Demographic;", "serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        @NotNull
        public final KSerializer serializer() {
            return Demographic$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(e80 e80Var) {
            this();
        }

        public Companion() {
        }
    }

    @NotNull
    public final Demographic setLengthOfResidence(int lengthOfResidence) {
        return this;
    }

    @NotNull
    public final Demographic setMedianHomeValueUSD(int homeValue) {
        return this;
    }

    @NotNull
    public final Demographic setMonthlyHousingCosts(int housingCost) {
        return this;
    }

    @NotNull
    public final Demographic setAgeRange(int age) {
        this.a = Integer.valueOf(AgeRange.INSTANCE.fromAge$vungle_ads_release(age).getId());
        return this;
    }

    public /* synthetic */ Demographic(int i, Integer num, Integer num2, aa2 aa2Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
    }

    public static final void write$Self(@NotNull Demographic self, @NotNull iw output, @NotNull SerialDescriptor serialDesc) {
        self.getClass();
        output.getClass();
        serialDesc.getClass();
        if (output.B(serialDesc) || self.a != null) {
            output.h(serialDesc, 0, k71.a, self.a);
        }
        if (output.B(serialDesc) || self.b != null) {
            output.h(serialDesc, 1, k71.a, self.b);
        }
    }

    @NotNull
    public final Demographic setGender(@NotNull LiftoffGender gender) {
        gender.getClass();
        this.b = Integer.valueOf(gender.getValue());
        return this;
    }

    public Demographic() {
    }
}
