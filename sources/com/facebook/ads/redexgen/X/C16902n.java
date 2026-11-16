package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C16902n<ModelType, StateType> {
    public final ModelType A03;
    public final StateType A04;
    public final String A05;
    public final String A06;
    public List<InterfaceC16962t<ModelType, StateType>> A01 = null;
    public C16882l<?, ?> A00 = C16882l.A0C;
    public boolean A02 = false;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2n != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public C16902n(ModelType model, StateType state, String str) {
        this.A03 = model;
        this.A04 = state;
        this.A06 = str;
        this.A05 = str;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2n != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2t != com.instagram.common.viewpoint.core.ViewpointAction<ModelType, StateType> */
    public final C16902n<ModelType, StateType> A06(InterfaceC16962t<ModelType, StateType> interfaceC16962t) {
        if (this.A01 == null) {
            this.A01 = new ArrayList();
        }
        this.A01.add(interfaceC16962t);
        return this;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2n != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public final C16882l<ModelType, StateType> A07() {
        return new C16882l<>(this);
    }
}
