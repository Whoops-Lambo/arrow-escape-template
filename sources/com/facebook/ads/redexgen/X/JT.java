package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class JT implements InterfaceC2929go {
    private C2930gp A00(InterfaceC2928gn interfaceC2928gn) {
        return (C2930gp) interfaceC2928gn.A7o();
    }

    public final void A01(InterfaceC2928gn interfaceC2928gn) {
        if (!interfaceC2928gn.AA4()) {
            interfaceC2928gn.AL3(0, 0, 0, 0);
            return;
        }
        float fA94 = A94(interfaceC2928gn);
        float fA9U = A9U(interfaceC2928gn);
        float elevation = AbstractC2932gr.A00(fA94, fA9U, interfaceC2928gn.A9T());
        int vPadding = (int) Math.ceil(elevation);
        float elevation2 = AbstractC2932gr.A01(fA94, fA9U, interfaceC2928gn.A9T());
        int iCeil = (int) Math.ceil(elevation2);
        interfaceC2928gn.AL3(vPadding, iCeil, vPadding, iCeil);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2929go
    public final ColorStateList A7b(InterfaceC2928gn interfaceC2928gn) {
        return A00(interfaceC2928gn).A05();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2929go
    public final float A8W(InterfaceC2928gn interfaceC2928gn) {
        return interfaceC2928gn.A7p().getElevation();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2929go
    public final float A94(InterfaceC2928gn interfaceC2928gn) {
        return A00(interfaceC2928gn).A03();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2929go
    public final float A9A(InterfaceC2928gn interfaceC2928gn) {
        return A9U(interfaceC2928gn) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2929go
    public final float A9B(InterfaceC2928gn interfaceC2928gn) {
        return A9U(interfaceC2928gn) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2929go
    public final float A9U(InterfaceC2928gn interfaceC2928gn) {
        return A00(interfaceC2928gn).A04();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2929go
    public final void AAs() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2929go
    public final void AAu(InterfaceC2928gn interfaceC2928gn, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C2930gp background = new C2930gp(colorStateList, f);
        interfaceC2928gn.AKc(background);
        View view = interfaceC2928gn.A7p();
        view.setClipToOutline(true);
        view.setElevation(f2);
        AKp(interfaceC2928gn, f3);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2929go
    public final void AEQ(InterfaceC2928gn interfaceC2928gn) {
        AKp(interfaceC2928gn, A94(interfaceC2928gn));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2929go
    public final void AGY(InterfaceC2928gn interfaceC2928gn) {
        AKp(interfaceC2928gn, A94(interfaceC2928gn));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2929go
    public final void AKb(InterfaceC2928gn interfaceC2928gn, ColorStateList colorStateList) {
        A00(interfaceC2928gn).A08(colorStateList);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2929go
    public final void AKh(InterfaceC2928gn interfaceC2928gn, float f) {
        interfaceC2928gn.A7p().setElevation(f);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2929go
    public final void AKp(InterfaceC2928gn interfaceC2928gn, float f) {
        A00(interfaceC2928gn).A07(f, interfaceC2928gn.AA4(), interfaceC2928gn.A9T());
        A01(interfaceC2928gn);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2929go
    public final void AL1(InterfaceC2928gn interfaceC2928gn, float f) {
        A00(interfaceC2928gn).A06(f);
    }
}
